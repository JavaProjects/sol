
package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

import siena.*;

public class RESTfulServicesController  extends Controller {

public static void hubs() {
		
		List<Hub> hubs = Hub.all().fetch(100);
		renderJSON(hubs);
	}

}