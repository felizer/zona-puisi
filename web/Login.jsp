<%-- 
    Document   : Login
    Created on : Jun 1, 2015, 6:38:04 AM
    Author     : Rayzzy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap.css" />
    </head>
    <body style="background-image: url('Background.png');">
        <div class="upper" style="background-color: whitesmoke; margin: auto 500px;">
            <h1 class="gtext" style="color: red;text-align: center; size:50px;">ZONA PUISI</h1>
            <div id="menu">
                <ul class="nav nav-tabs nav-justified" id="myTab">
                    <li><a href="http://localhost:8080/ZonaPuisi/index.jsp" >HOME</a></li>
                    <li class="active"><a href="http://localhost:8080/ZonaPuisi/Login.jsp">LOGIN</a></li>
                </ul>
            </div>
        </div>
        <br/>
        <div id="wadah" style="background-color: whitesmoke; padding: 50px; margin: auto 150px;">
            <div class="col-lg-8 borderform">
             <h2>REGISTER ACCOUNT</h2>
        <form action="register.jsp" method="post">
	<p>
		<label>Nama</label>
                <input type="text" name="nama" />
	</p>
	<p>
		<label>Kelamin</label>
		<input type="radio" name="jk" value="Laki-laki"/> Laki-laki
		<input type="radio" name="jk" value="Perempuan"/> Perempuan
	</p>
	<p>
		<label>Alamat</label>
		<input type="text" name="alamat"/>
	</p>
	<p>
		<label>Email</label>
		<input type="email" name="email"/>
	</p>
	<p>
		<label>Phone</label>
		<input type="phone" name="phone"/>
	</p>
	<p>
		<label>Username</label>
		<input type="text" name="username"/>
	</p>
	<p>
		<label>Password</label>
		<input type="password" name="password"/>
	</p>
	<p>
		<label></label>
		<input type="submit" name="submit" Value="Daftar"/>
	</p>
	</form>
        </div>
        <div class="col-lg-4 borderform">
            <h2>LOGIN ACCOUNT</h2>
            <form action="logProses.jsp" method="post">
            <div class="form-group">
                <label for="username" class="col-lg-4">Username :</label>
                <div class="col-lg-8">
                    <input type="text" name="username" id="username" class="form-control"/>
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="col-lg-4">Password :</label>
                <div class="col-lg-8">
                    <input type="password" name="password" id="password" class="form-control"/>
                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-3 col-lg-offset-9">
                    <button type="submit" class="btn btn-default btn-block" name="submitlogin">LOGIN</button>
                </div>
            </div>
        </form>
        </div>
        </div>
    </body>
</html>
