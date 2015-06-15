<%-- 
    Document   : register
    Created on : Jun 3, 2015, 6:28:28 AM
    Author     : Rayzzy
--%>

<%@page import="com.logic.admin.HibernateAdminDao"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.logic.admin.adminDao"%>
<%@page import="com.model.admin.Admin" %>
<%@page import="java.util.GregorianCalendar" %>
<%@page import="java.util.List" %>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>

<%
    String nama = request.getParameter("nama");
    String jk = request.getParameter("jk");
    String alamat = request.getParameter("alamat");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (nama != null && jk != null && alamat != null && email != null && phone != null && username != null && password !=null) {
        
    Admin admin = new Admin();
    
    admin.setNama(nama);
    admin.setJk(jk);
    admin.setAlamat(alamat);
    admin.setEmail(email);
    admin.setPhone(phone);
    admin.setUsername(username);
    admin.setPassword(password);
    

    System.out.println("hai " + admin.getNama()+" id kamu telah terdaftar");

    %>
 <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sekses register</title>
    </head>
    <body>
        Registration is Successful.
        <button <a href="http://localhost:8080/ZonaPuisi/Login.jsp">Go to Login</a></button>
    </body>
</html>
       <%
    } else {
        response.sendRedirect("index.jsp");
    }
%>