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
"</style>\n" + 
"\n" + 
"<script type=\"text/javascript\">\n" + 
"\n" + 
"	\n" + 
"\n" + 
"      function initialize() {\n" + 
"    	  \n" + 
"    	  \n" + 
"    	  \n" + 
"    	  \n" + 
"    	   var geo = new google.maps.Geocoder();\n" + 
"  		//var grq = new google.maps.GeocoderRequest({address: \"2300 E Harvard Ave Denver, CO 80210\"}); \n" + 
"  		//Debugger;\n" + 
"  		 var geocoderRequest = {\n" + 
"  				address : \"2300 E Harvard Ave Denver, CO 80210\"\n" + 
"  			};\n" + 
"  		//var latLng;\n" + 
"  		geo.geocode(geocoderRequest,   function(array, status) {\n" + 
"  			//debugger;\n" + 
"  			if ( status == google.maps.GeocoderStatus.OK) {\n" + 
"  				var latLng = array[0].geometry.location;\n" + 
"  				/* for (i=0; i < array.length; i++) {\n" + 
"  					// GeoCoderResult object array[i]\n" + 
"  					var geometry = array[i].geometry; // google.maps.GeocoderGeometry object\n" + 
"  					latLng = geometry.location;\n" + 
"  					var tt = \"gg\";\n" + 
"  					\n" + 
"  				} */\n" + 
"  				\n" + 
"  				var ss = \"ddd\";\n" + 
"  		        var myOptions = {\n" + 
"  		          zoom: 8,\n" + 
"  		          center: latLng, //new google.maps.LatLng(-34.397, 150.644),\n" + 
"  		          mapTypeId: google.maps.MapTypeId.ROADMAP\n" + 
"  		        };\n" + 
"\n" + 
"  		        var map = new google.maps.Map(document.getElementById('map_canvas'),\n" + 
"  		            myOptions);\n" + 
"  				\n" + 
"  			}\n" + 
"  			\n" + 
"  			\n" + 
"  		});  \n" + 
"    	  \n" + 
"    	\n" + 
"      }\n" + 
"\n" + 
"      function loadScript() {\n" + 
"        var script = document.createElement('script');\n" + 
"        script.type = 'text/javascript';\n" + 
"        script.src = 'http://maps.googleapis.com/maps/api/js?sensor=false&' +\n" + 
"            'callback=initialize';\n" + 
"        document.body.appendChild(script);\n" + 
"      }\n" + 
"\n" + 
"      window.onload = loadScript;\n" + 
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
"        \n" + 
"    <form>\n" + 
"        <fieldset>\n" + 
"          <legend>Learner's Details</legend>\n" + 
"          <div class=\"clearfix\">\n" + 
"            <label for=\"title\">Title</label>\n" + 
"            <div class=\"input\">\n" + 
"              <input type=\"text\" size=\"30\" name=\"title\" id=\"title\" class=\"xlarge\">\n" + 
"            </div>\n" + 
"          </div><!-- /clearfix -->\n" + 
"          \n" + 
"          <div class=\"clearfix\">\n" + 
"            <label for=\"firstName\">First Name</label>\n" + 
"            <div class=\"input\">\n" + 
"              <input type=\"text\" size=\"30\" name=\"firstName\" id=\"firstName\" class=\"xlarge\">\n" + 
"            </div>\n" + 
"          </div><!-- /clearfix -->\n" + 
"          \n" + 
"          <div class=\"clearfix\">\n" + 
"            <label for=\"lastName\">Last Name</label>\n" + 
"            <div class=\"input\">\n" + 
"              <input type=\"text\" size=\"30\" name=\"lastName\" id=\"lastName\" class=\"xlarge\">\n" + 
"            </div>\n" + 
"          </div><!-- /clearfix -->\n" + 
"          \n" + 
"            \n" + 
"          <div class=\"clearfix\">\n" + 
"            <label for=\"email\">Email</label>\n" + 
"            <div class=\"input\">\n" + 
"              <input type=\"text\" size=\"30\" name=\"email\" id=\"email\" class=\"xlarge\">\n" + 
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
"           <select class=\"small\" id=\"birthdayDay\" name=\"birthdayDay\"><option value=\"-1\">Day:</option><option value=\"1\">1</option><option value=\"2\">2</option><option value=\"3\">3</option><option value=\"4\">4</option><option value=\"5\">5</option><option value=\"6\">6</option><option value=\"7\">7</option><option value=\"8\">8</option><option value=\"9\">9</option><option value=\"10\">10</option><option value=\"11\">11</option><option value=\"12\">12</option><option value=\"13\">13</option><option value=\"14\">14</option><option value=\"15\">15</option><option value=\"16\">16</option><option value=\"17\">17</option><option value=\"18\">18</option><option value=\"19\">19</option><option value=\"20\">20</option><option value=\"21\">21</option><option value=\"22\">22</option><option value=\"23\">23</option><option value=\"24\">24</option><option value=\"25\">25</option><option value=\"26\">26</option><option value=\"27\">27</option><option value=\"28\">28</option><option value=\"29\">29</option><option value=\"30\">30</option><option value=\"31\">31</option></select>\n" + 
"           \n" + 
"           <select class=\"small\" id=\"birthdayMonth\" name=\"birthdayMonth\"><option value=\"-1\">Month:</option><option value=\"1\">Jan</option><option value=\"2\">Feb</option><option value=\"3\">Mar</option><option value=\"4\">Apr</option><option value=\"5\">May</option><option value=\"6\">Jun</option><option value=\"7\">Jul</option><option value=\"8\">Aug</option><option value=\"9\">Sep</option><option value=\"10\">Oct</option><option value=\"11\">Nov</option><option value=\"12\">Dec</option></select> \n" + 
"          \n" + 
"          <select class=\"small\" id=\"birthdayYear\" name=\"birthdayYear\"><option value=\"-1\">Year:</option>\n" + 
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
"          \n" + 
"          </div>\n" + 
"          </div><!-- /clearfix -->\n" + 
"          \n" + 
"          <div class=\"clearfix\">\n" + 
"            <label for=\"address\">Address</label>\n" + 
"            <div class=\"input\">\n" + 
"              <input type=\"text\" size=\"30\" name=\"address\" id=\"address\" class=\"xlarge\">\n" + 
"            </div>\n" + 
"          </div><!-- /clearfix -->\n" + 
"\n" + 
"        <fieldset>\n" + 
"          <legend>Hubs</legend>\n" + 
"          \n" + 
"          \n" + 
"          <div id=\"map_canvas\"> </div>\n" + 
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
"</div>\n");// line 3
		
	}

}