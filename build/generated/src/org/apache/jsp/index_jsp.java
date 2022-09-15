package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/headerIndex.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/assets/owl.carousel.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/assets/owl.theme.default.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\"/>\n");
      out.write("        <!-- -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.seat-charts.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"header_content \">\n");
      out.write("                  Bus Ticketing System\n");
      out.write("                </div>\n");
      out.write("                <div class=\"main_nav\">\n");
      out.write("                    <ul class=\"nav nav-pills pull-left\">\n");
      out.write("\n");
      out.write("                       <li ><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                \n");
      out.write("                                <li><a href=\"index.jsp\">Login</a></li>\n");
      out.write("                                <li><a href=\"Registration.jsp\">Sign Up</a></li>\n");
      out.write("                                <li ><a href=\"about.jsp\">About</a></li>\n");
      out.write("                                <li><a href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("                                <li><a href=\"adminLogin.jsp\">Admin</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <section class=\"main_contents\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"main_contents_inner\" >\n");
      out.write("\n");
      out.write("<div class=\"signpage\">\n");
      out.write("\t<form class=\"register_form form_login\" action=\"LoginController\" method=\"post\">\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-8\">\n");
      out.write("\t\t\t<div class=\"owl-carousel home_page_slider\">\n");
      out.write("\t\t\t  <div class=\"item\">\n");
      out.write("\t\t\t  \t<div class=\"rs_single_slide\" style=\"background-image:url(images/bus1.jpg)\">\n");
      out.write("\t\t\t  \t</div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div  class=\"item\">\n");
      out.write("\t\t\t  \t<div class=\"rs_single_slide\" style=\"background-image:url(images/bus2.jpg)\">\n");
      out.write("\t\t\t  \t</div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div  class=\"item\">\n");
      out.write("\t\t\t  \t<div class=\"rs_single_slide\" style=\"background-image:url(images/bus4.jpg)\">\n");
      out.write("\t\t\t  \t</div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div  class=\"item\">\n");
      out.write("\t\t\t  \t<div class=\"rs_single_slide\" style=\"background-image:url(images/bus5.jpg)\">\n");
      out.write("\t\t\t  \t</div>\n");
      out.write("\t\t\t  \t\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-4\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"alert alert-danger\"><p></p></div>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t<div class=\"rs_form_box\">\n");
      out.write("\t\t\t\t\t<h3 class=\"form_section_title\">\n");
      out.write("\t\t\t\t\t\tLogin Here \n");
      out.write("\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<label>Username</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"username\" class=\"form-controller\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<label>Password</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"password\" class=\"form-controller\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t\t<div class=\"rs_btn_group\">\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-default\" name=\"submit\" type=\"submit\">Login</button>\n");
      out.write("\t\t\t\t\t\t<a href=\"Registration.jsp\" class=\"btn btn-default\">Register</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("<br>\n");
      out.write("<footer class=\"footer_section\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("                <div class=\"footer_inner\" style=\"text-align: center\">\n");
      out.write("                    Developed by ::<br>\n");
      out.write("                    ............. . . . .   Imty@z . . . . .................. \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("</footer>\n");
      out.write("<!-- Optional JavaScript -->\n");
      out.write("<!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("<script src=\"js/jquery-3.3.1.min.js\" ></script>\n");
      out.write("<script src=\"js/popper.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
