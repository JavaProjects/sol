package services;

import java.util.List;

import javax.ws.rs.core.MultivaluedMap;

import models.Hub;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;

import play.cache.Cache;
import play.modules.siena.SienaFixtures;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

/**
 * 
 * @author revo
 * 
 * Uses Jersey implementation of JAX-RS spec for consuming  JSON RESTful Google Maps geocoding Web Service 
 *
 */

public class GoogleMapService {

	public static void hubSetup() {
		// Check if the database is empty

		Boolean dataLoaded = Cache.get("dataLoaded", Boolean.class);
		if (dataLoaded == null) {
			SienaFixtures.deleteDatabase();
			SienaFixtures.loadModels("startup-data.yml");
			Cache.set("dataLoaded", true);
		}

		Client client = Client.create();

		WebResource webResource = client.resource("http://maps.googleapis.com/maps/api/geocode/json");

		MultivaluedMap<String, String> params = new MultivaluedMapImpl();

		List<Hub> hubs = Hub.all().fetch(10);

		params.add("sensor", "false");
		params.add("laguage", "en-AU");
		params.add("region", "au");

		ObjectMapper m = new ObjectMapper();

		for (Hub hub : hubs) {

			String address = hub.address;
			params.putSingle("address", address);

			// get method here maps to RESTful HTTP GET verb
			ClientResponse response = webResource.queryParams(params).get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			String json = response.getEntity(String.class);

			try {

				JsonNode rootNode = m.readValue(json, JsonNode.class);

				String status = rootNode.get("status").asText();

				if (status.equals("OK")) {

					// this returns JsonArray because the value of "results" key
					// is  array
					JsonNode results = rootNode.get("results");

					JsonNode first = results.get(0);

					String fAddress = first.get("formatted_address").asText();

					JsonNode geometry = first.get("geometry");

					JsonNode location = geometry.get("location");

					Double lat = location.get("lat").asDouble();
					Double lng = location.get("lng").asDouble();

					hub.latitude = lat;
					hub.longitude = lng;
					// change to formatted address as returned by Google Map API
					//hub.address = fAddress;
					hub.save();
				}
				else {
					// handle invalid address entry in yaml data file
				}

			} catch (Exception e) {

			}

			System.out.println(json);
		}
		// Cache.set(user.uname, user)

	}

}
