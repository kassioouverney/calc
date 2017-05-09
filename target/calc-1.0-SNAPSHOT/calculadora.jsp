<%-- 
    Document   : calculadora
    Created on : 14/03/2017, 16:05:29
    Author     : daves
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE HTML>
<!--
	Identity by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>Calculadora Web</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="assets/js/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
	</head>
	<body>

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Main -->
					<section id="main">
						<header>
							<span class="avatar"><img src="images/avatar3.png" alt="" /></span>
							<h1>3 commit GIT de netbeans</h1>
						</header>
						<footer>
                                                    <form action="calcula" method="POST">
                                                        Valor 1: <input type="text" name="cpValor1" value="" placeholder="0" /><br />
                                                        Valor 2: <input type="text" name="cpValor2" value="" placeholder="0"/><br />
                                                        <input type="submit" value="+" name="btn" />
                                                        <input type="submit" value="-" name="btn" />
                                                        <input type="submit" value="x" name="btn" />
                                                        <input type="submit" value="/" name="btn" />
                                                        <input type="submit" value="%" name="btn" />
                                                    </form>
                                                    <hr />
                                                    <%
                                                    String r = "";    
                                                    if (request.getAttribute("resultado") != null){
                                                        r = (String)(request.getAttribute("resultado")+"");
                                                    }
                                                    %>
                                                    <input type="text" name="cpResultado" value="<%= r %>" readonly="readonly" />
                                                    
                                                    
						</footer>
					</section>


			</div>


	</body>
</html>


