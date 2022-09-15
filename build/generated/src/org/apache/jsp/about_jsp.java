package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("    <h3 class='Red XCN'>About us</h3><p class='western'> \n");
      out.write("        redBus is India?s largest online bus ticketing platform that has transformed bus travel in the country by bringing ease and convenience to millions of Indians who travel using buses. Founded in 2006, redBus is part of India?s leading online travel company MakeMyTrip Limited (NASDAQ: MMYT). By providing widest choice, superior customer service, lowest prices and unmatched benefits, redBus has served over 8 million customers. redBus has a global presence with operations across Indonesia, Singapore, Malaysia, Colombia and Peru apart from India. </p><h3 id='BirdsEye' class='Red XCN'>Management Team</h3><div class='clearfix'><div class='fl w-20'><div ' style'text-align: left;margin-right: 50px;'><img src='https://s3.rdbuz.com/Images/profile/Prakash.png' style='width:138px;height:138px' /></div></div><div class='fl w-80 '><h6 id='Ourstory' class='Red TextBold XCN' style='margin:0;padding:0;font-size:16px;'>Prakash Sangam, CEO</h6><p class='western'> Prakash Sangam has been Chief Executive Officer of redBus since June 2014. Prior to redBus. He served as an Executive Vice President of Info Edge India (Naukri group), heading two group businesses namely Shiksha.com and Jeevansathi.com. He?s also worked as General Manager of Marketing and Innovation at Airtel and has also had multiple roles across Marketing, Brand Management and Sales at Hindustan Unilever. Prakash has completed his MBA from IIM Calcutta and also holds an Honours degree in Production Engineering from Mumbai University.</p></div></div><div class='clearfix' style='margin:30px 0'><div class='fl w-20'><div ' style='text-align: left;margin-right: 50px;'><img src='https://s3.rdbuz.com/Images/profile/Anoop.png' style='width:138px;height:138px'/></div></div><div class='fl w-80'><h6 id='OurChannel' class='Red TextBold XCN' style='margin:0;padding:0;font-size:16px;'>Anoop Menon, CTO</h6><p class='western'> Anoop Menon serves as Chief Technology Officer at redBus. Anoop plays an integral role in setting the company?s strategic direction, development and future growth. At redBus, he leads effective delivery of scalable systems to the customers, agents and bus operators by incorporating the latest technology. A tech enthusiast, Anoop comes with over 18 years of extensive experience in building scalable and high-performing products across telecom, internet and mobile ecommerce domains. Anoop strongly believes that hard work and commitment can overcome the barriers to success. He completed BE in Mechanical Engineering from Madras University and loves sports, movies, TV and music. </P></div></div>\n");
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
