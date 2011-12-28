package controllers;

import java.util.Date;

import models.Hub;
import models.Learner;
import models.Member;
import play.cache.Cache;
import services.GoogleMapService;
import siena.Model;
import cn.bran.play.JapidController;

// make sure you have 
// 	module.japid=${play.path}/modules/japid-head
// in your application.conf file, and "play eclipsify"
// if you notice the JapidController is not found.

public class HeadOfficeAdminController extends JapidController {

	public static void index() {

		Boolean dataLoaded = Cache.get("dataLoaded", Boolean.class);
		if (dataLoaded == null) {
			GoogleMapService.hubSetup();
		}
		//params.flash();

		renderJapid("Hello world!", 123);
	}
	
	public static void handleLearnerInfo() {
		validation.required("title", params.get("title"));
		validation.required("firstName", params.get("firstName"));
		validation.required("lastName", params.get("lastName"));
		validation.required("email", params.get("email"));
		
		validation.required("birthdayDay", params.get("birthdayDay"));
		validation.required("birthdayMonth", params.get("birthdayMonth"));
		validation.required("birthdayYear", params.get("birthdayYear"));
		
		validation.required("address", params.get("address"));
		
		validation.required("hubId", params.get("hubId"));
		
		if(validation.hasErrors()) {
	          params.flash(); // add http parameters to the flash scope
	          validation.keep(); // keep the errors for the next request
	          index();
	      }
		
		Learner learner = new Learner();
		Date dob = new Date(Integer.parseInt(params.get("birthdayYear")),    Integer.parseInt(params.get("birthdayMonth")),     Integer.parseInt(params.get("birthdayDay")));
		Member member = new Member(params.get("title"), params.get("firstName"), params.get("lastName"), params.get("email"), dob, params.get("address"));
		
		learner.member = member;
		
		Hub  hub = Model.getByKey(Hub.class, Long.parseLong(params.get("hubId")));
		
		learner.hub = hub;
		
		learner.save();
		
		renderJapid();
		
		
	}

	public static void index2() {
		renderJapid("Hello world!", 123);
	}

}