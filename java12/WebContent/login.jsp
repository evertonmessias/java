<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<fieldset class="login">
		<legend>Login</legend>
		<br><br>
		<form>
			<input type="text" id="usuario" placeholder="Usuario" /><br> <input
				type="password" id="senha" placeholder="Senha" /><br> <br>
			<button type="button" id="botaologin" class="btn btn-success">Entrar</button>
			<br> <br>
		</form>
	</fieldset>
</body>
</html>