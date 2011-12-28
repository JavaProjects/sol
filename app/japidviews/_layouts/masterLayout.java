package japidviews._layouts;
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
// NOTE: This file was generated from: japidviews/_layouts/masterLayout.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public abstract class masterLayout extends cn.bran.play.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/_layouts/masterLayout.html";
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


	public masterLayout() {
		super(null);
	}
	public masterLayout(StringBuilder out) {
		super(out);
	}
	private String name;
	private int number;
	 public void layout(String name,int number) {
		this.name = name;
		this.number = number;
		;// line 1
		p("<!DOCTYPE html>\n" + 
"<html lang=\"en\">\n" + 
"<head>\n" + 
"<meta charset=\"utf-8\">\n" + 
"<title>Seniors Online</title>\n" + 
"<meta name=\"description\" content=\"\">\n" + 
"<meta name=\"author\" content=\"\">\n" + 
"<!-- Le HTML5 shim, for IE6-8 support of HTML elements -->\n" + 
"<!--[if lt IE 9]>\n" + 
"      <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n" + 
"    <![endif]-->\n" + 
"<!-- Le styles -->\n" + 
"<link href=\"/public/stylesheets/tbootstrap/bootstrap.css\" rel=\"stylesheet\">\n" + 
"<style type=\"text/css\">\n" + 
"/* Override some defaults */\n" + 
"html,body {\n" + 
"	background-color: #E0FCBD;\n" + 
"}\n" + 
"\n" + 
"body {\n" + 
"	padding-top: 40px;\n" + 
"	/* 40px to make the container go all the way to the bottom of the topbar */\n" + 
"}\n" + 
"\n" + 
".container>footer p {\n" + 
"	text-align: center; /* center align it with the container */\n" + 
"}\n" + 
"\n" + 
".container {\n" + 
"	width: 820px;\n" + 
"	/* downsize our container to make the content feel a bit tighter and more cohesive. NOTE: this removes two full columns from the grid, meaning you only go to 14 columns and not 16. */\n" + 
"}\n" + 
"\n" + 
"/* The white background content wrapper */\n" + 
".content {\n" + 
"	background-color: #fff;\n" + 
"	padding: 20px;\n" + 
"	margin: 0 -20px;\n" + 
"	/* negative indent the amount of the padding to maintain the grid system */\n" + 
"	-webkit-border-radius: 0 0 6px 6px;\n" + 
"	-moz-border-radius: 0 0 6px 6px;\n" + 
"	border-radius: 0 0 6px 6px;\n" + 
"	-webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .15);\n" + 
"	-moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .15);\n" + 
"	box-shadow: 0 1px 2px rgba(0, 0, 0, .15);\n" + 
"}\n" + 
"\n" + 
"/* Page header tweaks */\n" + 
".page-header {\n" + 
"	background-color: #F7F3DC;\n" + 
"	padding: 20px 20px 10px;\n" + 
"	margin: -20px -20px 20px;\n" + 
"}\n" + 
"\n" + 
"/* Styles you shouldn't keep as they are for displaying this base example only */\n" + 
".content .span10,.content .span4 {\n" + 
"	min-height: 500px;\n" + 
"}\n" + 
"/* Give a quick and non-cross-browser friendly divider */\n" + 
".content .span4 {\n" + 
"	margin-left: 0;\n" + 
"	padding-left: 19px;\n" + 
"	border-left: 1px solid #eee;\n" + 
"}\n" + 
"\n" + 
".topbar .btn {\n" + 
"	border: 0;\n" + 
"}\n" + 
"</style>\n" + 
"\n" + 
"\n" + 
"<!-- Le fav and touch icons -->\n" + 
"<link rel=\"shortcut icon\" href=\"/public/images/favicon.png\">\n" + 
"\n" + 
"</head>\n" + 
"<body>\n" + 
"    <div class=\"topbar\">\n" + 
"        <div class=\"fill\">\n" + 
"            <div class=\"container\">\n" + 
"                <a class=\"brand\" href=\"#\">Welcome to Seniors Online! </a>\n" + 
"                <ul class=\"nav\">\n" + 
"                    <li class=\"active\"><a href=\"/\">Home</a></li>\n" + 
"                    <li><a href=\"#about\">About</a></li>\n" + 
"                    <li><a href=\"#contact\">Contact</a></li>\n" + 
"                </ul>\n" + 
"                <form action=\"\" class=\"pull-right\">\n" + 
"                    <input class=\"input-small\" type=\"text\" placeholder=\"Username\"> <input class=\"input-small\" type=\"password\" placeholder=\"Password\">\n" + 
"                    <button class=\"btn\" type=\"submit\">Sign in</button>\n" + 
"                </form>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"    </div>\n" + 
"    <div class=\"container\">\n" + 
"        <div class=\"content\">\n" + 
"            ");// line 1
		doLayout();// line 96
		p("        </div>\n" + 
"        <footer>\n" + 
"         \n" + 
"            <p>&copy; Seniors Online 2011</p>\n" + 
"        </footer>\n" + 
"        <script type=\"text/javascript\" src=\"/public/javascripts/jquery-1.5.2.min.js\"></script>\n" + 
"        \n" + 
"    </div>  <!-- /container -->\n" + 
"</body>\n" + 
"</html>\n");// line 96
			}

	protected abstract void doLayout();
}