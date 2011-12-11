package japidviews.MainController;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import japidviews._tags.*;
import controllers.*;
import play.mvc.Http.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/MainController/index.html
// Change to this file will be lost next time the template file is compiled.
//

public class index extends masterLayout
{
	public static final String sourceTemplate = "japidviews/MainController/index.html";
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
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(
			validation);
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
	public static final String[] argNames = new String[] {/* args of the template*/
			"s", "i", };
	public static final String[] argTypes = new String[] {/* arg types of the template*/
			"String", "int", };
	public static final Object[] argDefaults = new Object[] { null, null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.MainController.index.class);

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

	public cn.bran.japid.template.RenderResult render(String s, int i) {
		this.s = s;
		this.i = i;
		long t = -1;
		try {
			super.layout("myname", 3456);
		} catch (RuntimeException e) {
			super.handleException(e);
		}
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(),
				getOut(), t, actionRunners);
	}

	@Override
	protected void doLayout() {
		//------
		p(" \n");// line 1
		p("<div class=\"page-header\">\n"
				+
				"    <h1>\n"
				+
				"        Home Page <small>Application Startup Page</small>\n"
				+
				"    </h1>\n"
				+
				"</div>\n"
				+
				"<div class=\"row\">\n"
				+
				"    <div class=\"span10\">\n"
				+
				"        \n"
				+
				"        <div class=\"well\">\n"
				+
				"        <a href=\"HeadOfficeAdminController/index\" class=\"btn large primary\">Head Office Admin Interface</a>\n"
				+
				"      </div>\n"
				+
				"      <div class=\"well\">\n"
				+
				"        <a href=\"#\" class=\"btn large primary\">Hub Coordinator Interface</a>\n"
				+
				"      </div>\n" +
				"        \n" +
				"        \n" +
				"    </div>\n" +
				"    <div class=\"span4\">\n" +
				"        <h3>Secondary content</h3>\n" +
				"        \n" +
				"    </div>\n" +
				"</div>\n");// line 3

	}

}
