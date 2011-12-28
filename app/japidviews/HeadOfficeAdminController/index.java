package japidviews.HeadOfficeAdminController;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/HeadOfficeAdminController/index.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class index extends masterLayout
{	public static final String sourceTemplate = "japidviews/HeadOfficeAdminController/index.html";
{
putHeader("Content-Type", "text/html; charset=utf-8");
}

// - add implicit fields with Play

	final Request request = Request.current(); 
	final Response response = Response.current(); 
	final Session session = Session.current();
	final RenderArgs renderArgs = RenderArgs.current();
	final Params params = Params.current();
	final Validation validation = Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public index() {
		super(null);
	}
	public index(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
public static final String[] argNames = new String[] {/* args of the template*/"s", "i",  };
public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "int",  };
public static final Object[] argDefaults= new Object[] {null,null, };
public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.HeadOfficeAdminController.index.class);

{
	setRenderMethod(renderMethod);
	setArgNames(argNames);
	setArgTypes(argTypes);
	setArgDefaults(argDefaults);
	setSourceTemplate(sourceTemplate);

}
////// end of named args stuff

	private String s;
	private int i;
	public cn.bran.japid.template.RenderResult render(String s,int i) {
		this.s = s;
		this.i = i;
		long t = -1;
		try {super.layout("myname",3456);} catch (RuntimeException e) { super.handleException(e);}
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
//------
;// line 1
		p(" \n");// line 1
p("<style type=\"text/css\">\n" + 
"#map_canvas {\n" + 
"  height: 100%;\n" + 
"  height: 650px;\n" + 
"}\n" + 
".error {\n" + 
"color: red;\n" + 
"\n" + 
"}\n" + 
"</style>\n" + 
"\n" + 
"<script type=\"text/javascript\">\n" + 
"\n" + 
"	 var selectedHubId;\n" + 
"	 function checkAddress() {\n" + 
"		 \n" + 
"		 var address = $(\"#address\")[0].value;\n" + 
"		 map.setZoom(12);\n" + 
"		 \n" + 
"		 var geo = new google.maps.Geocoder();\n" + 
"	  	 var geocoderRequest = { address : address 	};\n" + 
"	  	 geo.geocode(geocoderRequest,   function(array, status) {\n" + 
"  			if ( status == google.maps.GeocoderStatus.OK) {\n" + 
"  				var latLng = array[0].geometry.location;\n" + 
"  				map.setCenter(latLng);\n" + 
"  				\n" + 
"  				var marker = new google.maps.Marker({\n" + 
"  	    	        position: latLng,\n" + 
"  	    	        map: map,\n" + 
"  	    	    });\n" + 
"  				\n" + 
"  			}\n" + 
"  		}); \n" + 
"		 \n" + 
"		 return false;\n" + 
"	 }\n" + 
"	 \n" + 
"	 function selectHub(id) {\n" + 
"		 selectedHubId = id;\n" + 
"		 $('#hubId').val(id);\n" + 
"		 return false;\n" + 
"		 \n" + 
"	 }\n" + 
"\n" + 
"      function loadScript() {\n" + 
"        var script = document.createElement('script');\n" + 
"        script.type = 'text/javascript';\n" + 
"        // supported languages https://spreadsheets.google.com/pub?key=p9pdwsai2hDMsLkXsoM05KQ&gid=1 \n" + 
"        script.src = 'http://maps.googleapis.com/maps/api/js?sensor=false&' +\n" + 
"            'callback=initialize&language=en-AU&region=au';\n" + 
"        document.body.appendChild(script);\n" + 
"      }\n" + 
"\n" + 
"      window.onload = loadScript;\n" + 
"      \n" + 
"      var infowindow = null;\n" + 
"      var markers = [];\n" + 
"      \n" + 
"      var hubs = [];\n" + 
"      \n" + 
"      var map;\n" + 
"      \n" + 
"      function initialize() {\n" + 
"    	  infowindow = new google.maps.InfoWindow({content: \"some content\"});\n" + 
"    	  var myOptions = {\n" + 
"    	    zoom: 4,\n" + 
"    	    center: new google.maps.LatLng(-23.70021, 133.88061),      // (-33.9, 151.2),\n" + 
"    	    mapTypeId: google.maps.MapTypeId.ROADMAP\n" + 
"    	  }\n" + 
"    	  // this will display the map\n" + 
"    	  map = new google.maps.Map(document.getElementById(\"map_canvas\"),\n" + 
"    	                                myOptions);\n" + 
"    	  \n" + 
"    	  //$.getJSON('http://localhost:9000/webservices/hubs', function(jsonObj) {\n" + 
"    	  $.getJSON('/webservices/hubs', function(jsonObj) {\n" + 
"    		  var items = [];\n" + 
"              var zIndex = 1; \n" + 
"    		  $.each(jsonObj, function() {\n" + 
"    		    hubs.push([this.address, this.latitude, this.longitude, zIndex, this.id]);\n" + 
"    		    zIndex++;\n" + 
"    		  });\n" + 
"    		  \n" + 
"    		  setMarkers(map, hubs);\n" + 
"    		  \n" + 
"    		});\n" + 
"    	}\n" + 
"\n" + 
"    	/**\n" + 
"    	 * Data for the markers consisting of a name, a LatLng and a zIndex for\n" + 
"    	 * the order in which these markers should display on top of each\n" + 
"    	 * other.\n" + 
"    	 */\n" + 
"    	var beaches = [\n" + 
"    	  ['Hub Address: Bondi Beach', -33.890542, 151.274856, 4],\n" + 
"    	  ['Hub Address: Coogee Beach', -33.923036, 151.259052, 5],\n" + 
"    	  ['Hub Address: Cronulla Beach', -34.028249, 151.157507, 3],\n" + 
"    	  ['Hub Address: Manly Beach', -33.80010128657071, 151.28747820854187, 2],\n" + 
"    	  ['Hub Address: Maroubra Beach', -33.950198, 151.259302, 1]\n" + 
"    	];\n" + 
"    	\n" + 
"    	\n" + 
"    	var infowindows = [];\n" + 
"    	\n" + 
"\n" + 
"    	function setMarkers(map, locations) {\n" + 
"    	  // Add markers to the map\n" + 
"\n" + 
"    	  // Marker sizes are expressed as a Size of X,Y\n" + 
"    	  // where the origin of the image (0,0) is located\n" + 
"    	  // in the top left of the image.\n" + 
"\n" + 
"    	  // Origins, anchor positions and coordinates of the marker\n" + 
"    	  // increase in the X direction to the right and in\n" + 
"    	  // the Y direction down.\n" + 
"    	  var image = new google.maps.MarkerImage('/public/images/beachflag.png',\n" + 
"    	      // This marker is 20 pixels wide by 32 pixels tall.\n" + 
"    	      new google.maps.Size(20, 32),\n" + 
"    	      // The origin for this image is 0,0.\n" + 
"    	      new google.maps.Point(0,0),\n" + 
"    	      // The anchor for this image is the base of the flagpole at 0,32.\n" + 
"    	      new google.maps.Point(0, 32));\n" + 
"    	  var shadow = new google.maps.MarkerImage('/public/images/beachflag_shadow.png',\n" + 
"    	      // The shadow image is larger in the horizontal dimension\n" + 
"    	      // while the position and offset are the same as for the main image.\n" + 
"    	      new google.maps.Size(37, 32),\n" + 
"    	      new google.maps.Point(0,0),\n" + 
"    	      new google.maps.Point(0, 32));\n" + 
"    	      // Shapes define the clickable region of the icon.\n" + 
"    	      // The type defines an HTML &lt;area&gt; element 'poly' which\n" + 
"    	      // traces out a polygon as a series of X,Y points. The final\n" + 
"    	      // coordinate closes the poly by connecting to the first\n" + 
"    	      // coordinate.\n" + 
"    	  var shape = {\n" + 
"    	      coord: [1, 1, 1, 20, 18, 20, 18 , 1],\n" + 
"    	      type: 'poly'\n" + 
"    	  };\n" + 
"    	  for (var i = 0; i < locations.length; i++) {\n" + 
"    	    var beach = locations[i];\n" + 
"    	    var myLatLng = new google.maps.LatLng(beach[1], beach[2]);\n" + 
"    	    var marker = new google.maps.Marker({\n" + 
"    	        position: myLatLng,\n" + 
"    	        map: map,\n" + 
"    	        shadow: shadow,\n" + 
"    	        icon: image,\n" + 
"    	        shape: shape,\n" + 
"    	        title: beach[0],  // this is tooltip content that shows up when hovering over the marker\n" + 
"    	        zIndex: beach[3]\n" + 
"    	    });\n" + 
"    	    \n" + 
"    	    // define content for overlay (infowindow) window\n" + 
"    	    // this is used below in addListener\n" + 
"    	    marker.html = '<div class=\"marker-address block-message warning\"> <p>' + beach[0] + '</p>' +\n" + 
"	        '<div class=\"alert-actions\"><button class=\"btn small primary\" onclick=\"return selectHub(' + beach[4] + ');\">Select This Hub</button> </div>' +\n" + 
"	        \n" + 
"	        '</div>' ; \n" + 
"    	    \n" + 
"    	    markers.push(marker);\n" + 
"    	    \n" + 
"    	    //var infowindow = new google.maps.InfoWindow({    content: beach[0]});\n" + 
"    	    //infowindows[i] = new google.maps.InfoWindow({    content: beach[0]});\n" + 
"    	    //markers[i] = marker;\n" + 
"    	    \n" + 
"    	    //google.maps.event.addListener(marker, 'click', function() {  infowindow.open(map,marker);});\n" + 
"    	    \n" + 
"    	  }\n" + 
"    	  \n" + 
"    	  for (var i = 0; i < markers.length; i++) {\n" + 
"    		  var marker = markers[i];\n" + 
"    		  google.maps.event.addListener(marker, 'click', function() { \n" + 
"    			  infowindow.setContent(this.html);\n" + 
"    			  infowindow.open(map,this);\n" + 
"    			  \n" + 
"    		  });\n" + 
"    	  }\n" + 
"    	  \n" + 
"    	  \n" + 
"    	  \n" + 
"    	}\n" + 
"      \n" + 
"    </script>\n" + 
"\n" + 
"<div class=\"page-header\">\n" + 
"    <h1>\n" + 
"        Head Office Administration \n" + 
"    </h1>\n" + 
"    \n" + 
"</div>\n" + 
"<div class=\"row\">\n" + 
"    <div class=\"span10\">\n" + 
"    \n" + 
"    \n" + 
"    <form method=\"post\" action=\"/HeadOfficeAdminController/handleLearnerInfo\" > \n" + 
"        <fieldset>\n" + 
"          <legend>Learner's Details</legend>\n" + 
"          <div class=\"clearfix\">\n" + 
"            <label for=\"title\">Title</label>\n" + 
"            <div class=\"input\">\n" + 
"              <input type=\"text\" size=\"30\" name=\"title\" id=\"title\" class=\"xlarge\" value='");// line 3
		p(flash("title"));// line 202
		p("'>\n" + 
"              <span class=\"error\">");// line 202
		p(error("title"));// line 203
		p("</span>\n" + 
"            </div>\n" + 
"          </div><!-- /clearfix -->\n" + 
"          \n" + 
"          <div class=\"clearfix\">\n" + 
"            <label for=\"firstName\">First Name</label>\n" + 
"            <div class=\"input\">\n" + 
"              <input type=\"text\" size=\"30\" name=\"firstName\" id=\"firstName\" class=\"xlarge\" value='");// line 203
		p(flash("firstName"));// line 210
		p("'>\n" + 
"              <span class=\"error\">");// line 210
		p(error("firstName"));// line 211
		p("</span>\n" + 
"            </div>\n" + 
"          </div><!-- /clearfix -->\n" + 
"          \n" + 
"          <div class=\"clearfix\">\n" + 
"            <label for=\"lastName\">Last Name</label>\n" + 
"            <div class=\"input\">\n" + 
"              <input type=\"text\" size=\"30\" name=\"lastName\" id=\"lastName\" class=\"xlarge\" value='");// line 211
		p(flash("lastName"));// line 218
		p("' >\n" + 
"              <span class=\"error\">");// line 218
		p(error("lastName"));// line 219
		p("</span>\n" + 
"            </div>\n" + 
"          </div><!-- /clearfix -->\n" + 
"          \n" + 
"            \n" + 
"          <div class=\"clearfix\">\n" + 
"            <label for=\"email\">Email</label>\n" + 
"            <div class=\"input\">\n" + 
"              <input type=\"text\" size=\"30\" name=\"email\" id=\"email\" class=\"xlarge\" value='");// line 219
		p(flash("email"));// line 227
		p("'>\n" + 
"              <span class=\"error\">");// line 227
		p(error("email"));// line 228
		p("</span>\n" + 
"            </div>\n" + 
"          </div><!-- /clearfix -->\n" + 
"          \n" + 
"          \n" + 
"          \n" + 
"          \n" + 
"           <div class=\"clearfix\">\n" + 
"            <label for=\"dob\">Date Of Birth </label>\n" + 
"            <div class=\"input\">\n" + 
"          \n" + 
"           <select class=\"small\" id=\"birthdayDay\" name=\"birthdayDay\"><option value=\"\">Day:</option><option value=\"1\">1</option><option value=\"2\">2</option><option value=\"3\">3</option><option value=\"4\">4</option><option value=\"5\">5</option><option value=\"6\">6</option><option value=\"7\">7</option><option value=\"8\">8</option><option value=\"9\">9</option><option value=\"10\">10</option><option value=\"11\">11</option><option value=\"12\">12</option><option value=\"13\">13</option><option value=\"14\">14</option><option value=\"15\">15</option><option value=\"16\">16</option><option value=\"17\">17</option><option value=\"18\">18</option><option value=\"19\">19</option><option value=\"20\">20</option><option value=\"21\">21</option><option value=\"22\">22</option><option value=\"23\">23</option><option value=\"24\">24</option><option value=\"25\">25</option><option value=\"26\">26</option><option value=\"27\">27</option><option value=\"28\">28</option><option value=\"29\">29</option><option value=\"30\">30</option><option value=\"31\">31</option></select>\n" + 
"           \n" + 
"           <select class=\"small\" id=\"birthdayMonth\" name=\"birthdayMonth\"><option value=\"\">Month:</option><option value=\"1\">Jan</option><option value=\"2\">Feb</option><option value=\"3\">Mar</option><option value=\"4\">Apr</option><option value=\"5\">May</option><option value=\"6\">Jun</option><option value=\"7\">Jul</option><option value=\"8\">Aug</option><option value=\"9\">Sep</option><option value=\"10\">Oct</option><option value=\"11\">Nov</option><option value=\"12\">Dec</option></select> \n" + 
"          \n" + 
"          <select class=\"small\" id=\"birthdayYear\" name=\"birthdayYear\"><option value=\"\">Year:</option>\n" + 
"          <option value=\"1950\">1950</option><option value=\"1949\">1949</option><option value=\"1948\">1948</option><option value=\"1947\">1947</option><option value=\"1946\">1946</option><option value=\"1945\">1945</option><option value=\"1944\">1944</option><option value=\"1943\">1943</option><option value=\"1942\">1942</option><option value=\"1941\">1941</option><option value=\"1940\">1940</option><option value=\"1939\">1939</option><option value=\"1938\">1938</option><option value=\"1937\">1937</option><option value=\"1936\">1936</option><option value=\"1935\">1935</option><option value=\"1934\">1934</option><option value=\"1933\">1933</option><option value=\"1932\">1932</option><option value=\"1931\">1931</option><option value=\"1930\">1930</option><option value=\"1929\">1929</option><option value=\"1928\">1928</option><option value=\"1927\">1927</option><option value=\"1926\">1926</option><option value=\"1925\">1925</option><option value=\"1924\">1924</option><option value=\"1923\">1923</option><option value=\"1922\">1922</option><option value=\"1921\">1921</option><option value=\"1920\">1920</option><option value=\"1919\">1919</option><option value=\"1918\">1918</option><option value=\"1917\">1917</option><option value=\"1916\">1916</option><option value=\"1915\">1915</option><option value=\"1914\">1914</option><option value=\"1913\">1913</option><option value=\"1912\">1912</option><option value=\"1911\">1911</option><option value=\"1910\">1910</option><option value=\"1909\">1909</option><option value=\"1908\">1908</option><option value=\"1907\">1907</option><option value=\"1906\">1906</option><option value=\"1905\">1905</option>\n" + 
"          <option value=\"1905\">1904</option>\n" + 
"          <option value=\"1905\">1903</option>\n" + 
"          <option value=\"1905\">1902</option>\n" + 
"          <option value=\"1905\">1901</option>\n" + 
"          <option value=\"1905\">1900</option>\n" + 
"          <option value=\"1905\">1899</option>\n" + 
"          <option value=\"1905\">1898</option>\n" + 
"          <option value=\"1905\">1897</option>\n" + 
"          \n" + 
"          </select>\n" + 
"          ");// line 228
		if (validation.hasError("birthdayDay") || validation.hasError("birthdayMonth") || validation.hasError("birthdayYear") ) {// line 255
		p("          <span class=\"error\">Required</span>\n" + 
"          ");// line 255
		}// line 257
		p("          \n" + 
"          </div>\n" + 
"          </div><!-- /clearfix -->\n" + 
"          \n" + 
"          <div class=\"clearfix\">\n" + 
"            <label for=\"address\">Address</label>\n" + 
"            <div class=\"input\">\n" + 
"              <input type=\"text\" size=\"30\" name=\"address\" id=\"address\" class=\"xlarge\" value='");// line 257
		p(flash("address"));// line 265
		p("'><button class=\"btn info\" onclick=\"return checkAddress();\">Check Address</button>\n" + 
"              <span class=\"error\">");// line 265
		p(error("address"));// line 266
		p("</span>\n" + 
"            </div>\n" + 
"          </div><!-- /clearfix -->\n" + 
"\n" + 
"        <fieldset>\n" + 
"          <legend>Hubs</legend>\n" + 
"          \n" + 
"          ");// line 266
		if (validation.hasError("hubId")) {// line 273
		p("            <div class=\"error\" >No Hub was selected. Hub selection is required.</div>\n" + 
"          \n" + 
"          ");// line 273
		}// line 276
		p("          <div id=\"map_canvas\"> </div>\n" + 
"          \n" + 
"          <input type=\"hidden\" id=\"hubId\" name=\"hubId\" value=\"\" />\n" + 
"          \n" + 
"          \n" + 
"          <div class=\"actions\">\n" + 
"            <input type=\"submit\" value=\"Submit\" class=\"btn primary\">&nbsp;&nbsp;&nbsp;&nbsp;<button class=\"btn danger\" type=\"reset\">Clear All Fields</button>\n" + 
"          </div>\n" + 
"        </fieldset>\n" + 
"      </form>\n" + 
"      \n" + 
"     \n" + 
"     \n" + 
"        \n" + 
"    </div>\n" + 
"    \n" + 
"    \n" + 
"    \n" + 
"    <div class=\"span4\">\n" + 
"        <h3>Secondary content</h3>\n" + 
"        User Story: Head Office Admin takes phone call from a new learner\n" + 
"    and enters the information below. The map shows all the hubs (TODO). \n" + 
"    As the address is entered, it is checked (TODO) and shown as a marker\n" + 
"    in the map (TODO). Admin selects a hub that is closest to learner's\n" + 
"    location or based on learner's preferences (TODO).\n" + 
"        \n" + 
"        \n" + 
"        \n" + 
"        \n" + 
"    </div>\n" + 
"</div>\n");// line 276
		
	}

}