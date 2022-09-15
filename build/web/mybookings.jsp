
<%@page import="bean.Bus"%>
<%@page import="bean.Passenger"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Session"%>
<%@page import="controller.SessionFactoo"%>
<%@ include file="header2.jsp" %>


<%

    HttpSession ses = (HttpSession) request.getSession();

    String user = (String) ses.getAttribute("app_user");
    SessionFactoo sf = new SessionFactoo();
    Session s = SessionFactoo.getSessionFactoo().openSession();

    List<Passenger> bokList = s.createSQLQuery("SELECT * FROM Passenger where user='" + user + "'").addEntity(Passenger.class).list();
     
    System.out.println(bokList.toString());


%>






<h2 class="title">  <span>My Booked Ticket ::</span></h2>
<table class="table rs_shadow">
    <tr>
        <th>Serial</th>
        <th>Passenger Name</th>
        <th>Bus Name</th>
        <th>Journey Date</th>
        <th>Journey From</th>
        <th>Payment</th>
<!--        <th>Selection</th>-->
    </tr>


    <%  int i=0;      
        for (Passenger p : bokList) {
        i++;
    %>
    <tr>
        <td><%=i%></td>
        <td><%=p.getPname()%></td>
        <td><%=p.getBusname()%></td> 
        <td><%=p.getJdate()%></td>
        <td><%=p.getTfrom()%></td>
        <td><%=p.getTotalpayment()%></td>
    </tr>
    <%
        }
    %>


</table>

<%@ include file="footer.jsp" %>


