<%-- 
    Document   : home
    Created on : Feb 14, 2014, 1:20:59 PM
    Author     : ghazali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>home</title>
    </head>
    <body>
        <%
        if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
        %>
            You are not logged in<br/>
            <a href="index.jsp">Please Login</a>
        <%} else {
        %>
            Welcome <%=session.getAttribute("userid")%>
            <a href='logout.jsp'>Log out</a
            <div class="upper" style="background-color: whitesmoke; margin: auto 500px;">
            <h1 class="gtext" style="color: red;text-align: center; size:50px;">ZONA PUISI</h1>
        <br/>
        <div id="wadah" style="background-color: whitesmoke; padding: 50px; margin: auto 150px;">
            <h2>PUISI BARU</h2>
            <form action="" method="post">
                <p>
		<label>Judul Puisi</label>
		<input type="judul" name="judul"/>
	</p>
        <p>
		<label>Jenis Puisi</label>
		<input type="phone" name="jp"/>
	</p>
        <p>
		<label>Puisi</label>
		<input type="text-area" name="puisi"/>
	</p>
            </form>
            
        </div>
        <%
        }
        %>
    </body>
</html>
