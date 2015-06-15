<%-- 
    Document   : welcome
    Created on : Jun 15, 2015, 10:46:10 AM
    Author     : Rayzzy
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>guyon ra lucu</title>
    </head>
    <body>
        <h1>Hello User</h1>
        <p>Welcome ${user} to The System</p>
        <a href="<c:url value="j_spring_security_logout" />">Logout</a>
    </body>
</html>
