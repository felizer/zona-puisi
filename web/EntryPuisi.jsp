<%-- 
    Document   : EntryPuisi
    Created on : Jun 8, 2015, 12:03:52 PM
    Author     : Rayzzy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ZONA PUISI</title>
    </head>

    <body style="background-image: url('Background.png');">
        <div class="upper" style="background-color: whitesmoke; margin: auto 500px;">
            <h1 class="gtext" style="color: red;text-align: center; size:50px;">ZONA PUISI</h1>
            <div id="menu">
                <ul class="nav nav-tabs nav-justified" id="myTab">
                    <li class="active"><a href="http://localhost:8080/ZonaPuisi/index.jsp" >HOME</a></li>
                    <li><a href="http://localhost:8080/ZonaPuisi/Login.jsp">LOGIN</a></li>
                </ul>
            </div>
        </div>
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
    </body>
</html>
