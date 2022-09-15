package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.Passenger;
import java.util.List;
import org.hibernate.Session;
import controller.SessionFactoo;

public final class mybookings_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                                <li ><a href=\"about.html\">About</a></li>\n");
      out.write("                                <li><a href=\"mybookings.html\">My Booking</a></li>\n");
      out.write("                                <li><a href=\"print.html\">Print Ticket</a></li>\n");
      out.write("                                <li><a href=\"print.html\">Payment</a></li>\n");
      out.write("                                <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("                                <li><a href=\"LogoutController\">LogOut</a></li>\n");
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
      out.write("\n");
      out.write("\n");

    String user = (String) request.getAttribute("user");
    SessionFactoo sf = new SessionFactoo();
    Session s = SessionFactoo.getSessionFactoo().openSession();

    List<Passenger> bokList = s.createSQLQuery("SELECT * FROM Passenger where user='" + user + "'").addEntity(Passenger.class).list();



      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h2 class=\"title\">  <span>My Booked Ticket ::</span></h2>\n");
      out.write("<table class=\"table rs_shadow\">\n");
      out.write("    <tr>\n");
      out.write("        <th>Serial</th>\n");
      out.write("        <th>Passenger Name</th>\n");
      out.write("        <th>Bus Name</th>\n");
      out.write("        <th>Journey Date</th>\n");
      out.write("        <th>Journey From</th>\n");
      out.write("        <th>Payment</th>\n");
      out.write("        <th>Selection</th>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
        
        for (Passenger p : bokList) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(p.getPname());
      out.write("</td>\n");
      out.write("             <td></td>\n");
      out.write("             <td></td>\n");
      out.write("             <td></td>\n");
      out.write("             <td></td> \n");
      out.write("             <td></td>\n");
      out.write("           </tr>\n");
      out.write("            ");

        }
    
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("<footer class=\"footer_section\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"footer_inner text-center\">\n");
      out.write("            Developed by Imty@z.............................................................\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
