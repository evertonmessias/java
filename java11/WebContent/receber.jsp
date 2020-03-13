<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculo da Média => RESPOSTA</title>
<link rel="stylesheet" type="text/css" href="estilo.css">
</head>
<body>
	<div id="site">
		<fieldset>
			<legend>Resposta</legend>
			<%@page errorPage="erro.jsp" %>
			<%
				String resposta = "";
				float nota1 = Float.parseFloat(request.getParameter("n1"));
				float nota2 = Float.parseFloat(request.getParameter("n2"));
				float calculomedia = (nota1 + nota2) / 2;
				String media = String.valueOf(calculomedia);

				if (calculomedia < 7) {
					resposta = "reprovado, média: " + media;
				} else {
					resposta = "aprovado, média: " + media;
				}
				out.print(session.getAttribute("nome"));
				out.print("<br>" + resposta);
				session.setAttribute("media", media);
				out.print("<br><br><a href='index.jsp'><b>Voltar</b></a>");
				//response.sendRedirect("index.jsp"); // Redirecionamento
			%>
		</fieldset>
	</div>
</body>
</html>