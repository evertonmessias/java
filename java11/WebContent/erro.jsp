<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ERRO</title>
<link rel="stylesheet" type="text/css" href="estilo.css">
</head>
<body>
<div id="site">
		<fieldset>
			<legend>ERRO !!!</legend>
<%@page isErrorPage="true" %>
<%
out.print("<b>Digite os Dados Corretamente !!!</b><br>código: <span>"+exception+"</span>");
out.print("<br><br><a href='index.jsp'><b>Voltar</b></a>");%>
</fieldset></div>
</body>
</html>