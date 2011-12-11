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
// NOTE: This file was generated from: japidviews/HeadOfficeAdminController/index2.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class index2 extends cn.bran.play.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/HeadOfficeAdminController/index2.html";
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


	public index2() {
		super(null);
	}
	public index2(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
public static final String[] argNames = new String[] {/* args of the template*/"s", "i",  };
public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "int",  };
public static final Object[] argDefaults= new Object[] {null,null, };
public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.HeadOfficeAdminController.index2.class);

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
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);}
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
//------
;// line 1
		p(" \n");// line 1
		p("<!DOCTYPE html>\n" + 
"<html lang=\"en\">\n" + 
"<head>\n" + 
"<meta charset=\"utf-8\">\n" + 
"<title>Seniors Online</title>\n" + 
"<meta name=\"description\" content=\"\">\n" + 
"<meta name=\"author\" content=\"\">\n" + 
"<style type=\"text/css\">\n" + 
"html,body {\n" + 
"	height: 100%;\n" + 
"	margin: 0;\n" + 
"	padding: 0;\n" + 
"}\n" + 
"\n" + 
"#map_canvas {\n" + 
"	height: 100%;\n" + 
"}\n" + 
"\n" + 
"@media print {\n" + 
"	html,body {\n" + 
"		height: auto;\n" + 
"	}\n" + 
"	#map_canvas {\n" + 
"		height: 650px;\n" + 
"	}\n" + 
"}\n" + 
"</style>\n" + 
"<script type=\"text/javascript\">\n" + 
"	function initialize() {\n" + 
"		var myOptions = {\n" + 
"			zoom : 8,\n" + 
"			center : new google.maps.LatLng(-34.397, 150.644),\n" + 
"			mapTypeId : google.maps.MapTypeId.ROADMAP\n" + 
"		};\n" + 
"\n" + 
"		var map = new google.maps.Map(document.getElementById('map_canvas'), myOptions);\n" + 
"	}\n" + 
"\n" + 
"	function loadScript() {\n" + 
"		var script = document.createElement('script');\n" + 
"		script.type = 'text/javascript';\n" + 
"		script.src = 'http://maps.googleapis.com/maps/api/js?sensor=false&' + 'callback=initialize';\n" + 
"		document.body.appendChild(script);\n" + 
"	}\n" + 
"\n" + 
"	window.onload = loadScript;\n" + 
"\n" + 
"	function getLocation(location) {\n" + 
"		if (!geocoder) {\n" + 
"			geocoder = new google.maps.Geocoder();\n" + 
"		}\n" + 
"		var geocoderRequest = {\n" + 
"			address : location\n" + 
"		}\n" + 
"		geocoder.geocode(geocoderRequest, function(results, status) {\n" + 
"			if (status == google.maps.GeocoderStatus.OK) {\n" + 
"				map.setCenter(results[0].geometry.location);\n" + 
"				if (!marker) {\n" + 
"					marker = new google.maps.Marker({\n" + 
"						map : map\n" + 
"					});\n" + 
"				}\n" + 
"				marker.setPosition(results[0].geometry.location);\n" + 
"				if (!infowindow) {\n" + 
"					infowindow = new google.maps.InfoWindow();\n" + 
"				}\n" + 
"				var content = '<strong>' + results[0].formatted_address + '</strong>';\n" + 
"				infowindow.setContent(content);\n" + 
"				infowindow.open(map, marker);\n" + 
"			}\n" + 
"		});\n" + 
"	}\n" + 
"</script>\n" + 
"</head>\n" + 
"<body>\n" + 
"    <div id=\"map_canvas\"></div>\n" + 
"</body>\n" + 
"</html>\n");// line 2
		
	}

}