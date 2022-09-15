package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("    <div>\n");
      out.write("            <table cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" border=\"0\">\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                                <img src=\"https://s3.rdbuz.com/Images/webplatform/Common/Contact_Us_IN.png\" class=\"contactUs-Image\" />\n");
      out.write("\n");
      out.write("                            <div class=\"imageContactText\">\n");
      out.write("                                <h1>Contact us</h1>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <div class=\"contact-main\">\n");
      out.write("\n");
      out.write("                                    <br />\n");
      out.write("                                    <heading class=\"CorporateOfficeHeader\">Corporate Head Office-Bangalore</heading>\n");
      out.write("\n");
      out.write("                                <div class=\"contact  main-body\">\n");
      out.write("                                    <div class=\"contact-wrapper\">\n");
      out.write("                                                <div class=\"w-30 fl\">\n");
      out.write("                                                    <div class=\"contact-header\">\n");
      out.write("                                                        BANGALORE\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <ul>\n");
      out.write("\n");
      out.write("                                                            <li>ibibo Group Pvt. Ltd</li>\n");
      out.write("                                                            <li>Indiqube Leela Galleria,</li>\n");
      out.write("                                                            <li>5th Floor, #No 23, Old Airport Road,</li>\n");
      out.write("                                                            <li>HAL 2nd Stage, Kodihalli Village,</li>\n");
      out.write("                                                            <li>Varthur Hobli, Ward No: 74,</li>\n");
      out.write("                                                            <li>Bengaluru, Karnataka - 560008.</li>\n");
      out.write("                                                    </ul>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"w-30 fl\">\n");
      out.write("                                                    <div class=\"contact-header\">\n");
      out.write("                                                        BANGALORE\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <ul>\n");
      out.write("\n");
      out.write("                                                            <li>ibibo Group Pvt. Ltd</li>\n");
      out.write("                                                            <li>B1 Golden Enclave,</li>\n");
      out.write("                                                            <li>Ground Floor,</li>\n");
      out.write("                                                            <li>Old Airport Road,</li>\n");
      out.write("                                                            <li>Kodihalli, Bangalore,</li>\n");
      out.write("                                                            <li>Karnataka - 560017.</li>\n");
      out.write("                                                    </ul>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"w-30 fl\">\n");
      out.write("                                                    <div class=\"contact-header\">\n");
      out.write("                                                        \n");
      out.write("                                                    </div>\n");
      out.write("                                                    <ul>\n");
      out.write("\n");
      out.write("                                                            <li><br/></li>\n");
      out.write("                                                            <li>Ph: +919945600000</li>\n");
      out.write("                                                            <li>For any Support or Complaints: <a href=\"https://www.redbus.in/info/redcare/\" target=\"_blank\" style=\"color: #5279d0;\">Click Here</a></li>\n");
      out.write("                                                            <li>Call Centre Time : 24*7</li>\n");
      out.write("                                                            <li><br/></li>\n");
      out.write("                                                            <li>Hotels Hotline</li>\n");
      out.write("                                                            <li>Ph: +919945600000</li>\n");
      out.write("                                                            <li>Call Centre Time: 8am to 11:45pm</li>\n");
      out.write("                                                            <li><br/></li>\n");
      out.write("                                                            <li>For Press enquiries, please send email to <b>press@redbus.com</b></li>\n");
      out.write("                                                            <li><br/></li>\n");
      out.write("                                                    </ul>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                             </tr>\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("\n");
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
