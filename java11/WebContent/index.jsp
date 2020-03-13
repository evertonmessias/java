<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculo da Média</title>
<link rel="stylesheet" type="text/css" href="estilo.css">
</head>
<body>
	<div id="site">
		<h2>CALCULO DA MÉDIA</h2>
		<%@page import="java.util.Date"%>		
		<%
			Date data = new Date();
			out.print("<b>Data: </b>" + data);
			out.print("<br><b>Arquivo:</b> " + request.getContextPath()); // objetos implícitos; path 
			session.setAttribute("nome", "Everton"); //sessão
			out.print("<br><b>Ultimo Cálculo:</b> " + session.getAttribute("media"));
			out.print("<br><br>");
		%>
		<fieldset>
			<legend>Calculo da Média</legend>
			<form action="receber.jsp" method="get">
				<input type="number" name="n1" placeholder="Digite nota 1" /><br>
				<input type="number" name="n2" placeholder="Digite nota 2" /><br>
				<br> <input type="submit" value="Calcular" /><br> <br>
			</form>
		</fieldset>
	</div>
</body>
</html>