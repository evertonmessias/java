<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculo da M�dia</title>
<link rel="stylesheet" type="text/css" href="estilo.css">
</head>
<body>
	<div id="site">
		<h2>EQUA��O DO 2� GRAU</h2>
		<%@page import="java.util.Date"%>		
		<%
			Date data = new Date();
			out.print("<b>Data: </b>" + data);
			out.print("<br><b>Arquivo:</b> " + request.getContextPath()); // objetos impl�citos; path 
			session.setAttribute("nome", "Everton"); //sess�o
			out.print("<br><b>Ultimo C�lculo:</b> " + session.getAttribute("equacao"));
			out.print("<br><br>");
		%>
		<fieldset>
			<legend>Calculo da M�dia</legend>
			<form action="receber.jsp" method="get">
				<input type="number" name="v1" placeholder="Digite termo A" /><br>
				<input type="number" name="v2" placeholder="Digite termo B" /><br>
				<input type="number" name="v3" placeholder="Digite termo C" /><br>
				<br> <input type="submit" value="Calcular" /><br> <br>
			</form>
		</fieldset>
	</div>
</body>
</html>