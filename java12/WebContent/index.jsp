<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.ArrayList"%>
<%
	if (session.getAttribute("usuario") == null) {
		response.sendRedirect("login.jsp"); // Redirecionamento
	}
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Sitema Java JSP</title>
<meta charset="UTF-8" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="css/estilo.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script src="funcoes.js"></script>
</head>
<body><div id="quadro"><div id="mensagem"></div></div><br>
	<fieldset>
		<legend class="sitename">Sistema JAVA JSP</legend>
		<button type="button" onclick="window.location.href='?p=inserir'"
			class="btn btn-success">Inserir</button>
		&ensp;
		<button type="button" onclick="window.location.href='?p=apagar'"
			class="btn btn-danger">Apagar</button>
		&ensp;
		<button type="button" onclick="window.location.href='?p=alterar'"
			class="btn btn-warning">Alterar</button>
		&ensp;
		<button type="button" onclick="window.location.href='?p=contatos'"
			class="btn btn-secondary">Contatos</button>
		&ensp;
		<button type="button" onclick="window.location.href='?p=sair'"
			class="btn btn-dark">Sair</button>
		<br> <br>
	</fieldset>
	<div id="conteudo">
		<fieldset>		
			<jsp:useBean id="clientes" scope="application"
				class="banco.Consultar" />

			<%@page errorPage="app/erro.jsp"%>
			<%
				String pagina = request.getParameter("p");
				if (pagina == null) {
			%><%@include file="app/home.jsp"%>
			<%
				} else if (pagina.equals("alterar")) {
			%><%@include file="app/alterar.jsp"%>
			<%
				} else if (pagina.equals("apagar")) {
			%><%@include file="app/apagar.jsp"%>
			<%
				} else if (pagina.equals("contatos")) {
			%><%@include file="app/contatos.jsp"%>
			<%
				} else if (pagina.equals("inserir")) {
			%><%@include file="app/inserir.jsp"%>
			<%
				} else if (pagina.equals("sair")) {
			%><%@include file="app/sair.jsp"%>
			<%
				} else {
			%><%@include file="app/erro.jsp"%>
			<%
				}
			%>
		</fieldset>
	</div>
	<footer></footer>
</body>
</html>