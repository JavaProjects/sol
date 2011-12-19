package controllers;

import java.util.List;

import play.cache.Cache;

import services.GoogleMapService;

import cn.bran.play.JapidController;

// make sure you have 
// 	module.japid=${play.path}/modules/japid-head
// in your application.conf file, and "play eclipsify"
// if you notice the JapidController is not found.

public class HeadOfficeAdminController extends JapidController {

	public static void index() {

		Boolean dataLoaded = Cache.get("dataLoaded", Boolean.class);
		if (dataLoaded == null) {
			//GoogleMapService.hubSetup();
		}

		renderJapid("Hello world!", 123);
	}

	public static void index2() {
		renderJapid("Hello world!", 123);
	}

}