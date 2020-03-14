<jsp:useBean id="calcula" class="beans.Eq2grau" type="beans.Eq2grau"
	scope="page" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculo Eq. 2º Grau => RESPOSTA</title>
<link rel="stylesheet" type="text/css" href="estilo.css">
</head>
<body>
	<div id="site">
		<fieldset>
			<legend>Equação do 2º Grau</legend>
			<%@page errorPage="erro.jsp"%>
			<%
				out.print("Bem vindo " + session.getAttribute("nome"));
				out.print("<br>");
				String resposta = "";
				float a = Float.parseFloat(request.getParameter("v1"));
				float b = Float.parseFloat(request.getParameter("v2"));
				float c = Float.parseFloat(request.getParameter("v3"));

				calcula.valorA = a;
				calcula.valorB = b;
				calcula.valorC = c;

				float[] equacao = calcula.calcular();

				//Com Beans não precisa instanciar
				//Eq2grau equac = new Eq2grau(Float.parseFloat(a),Float.parseFloat(b),Float.parseFloat(c));

				out.print("<br><b>" + calcula.resposta((int)equacao[3]) + "</b><br>");
				out.print("<br>Delta: " + equacao[0]);
				out.print("<br>X1 :" + equacao[1]);
				out.print("<br>X2 :" + equacao[2]);				

				session.setAttribute("equacao", calcula.escrever());

				out.print("<br><br><a href='index.jsp'><b>Voltar</b></a>");
				//response.sendRedirect("index.jsp"); // Redirecionamento
			%>
		</fieldset>
	</div>
</body>
</html>