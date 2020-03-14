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
<script src=""></script>
</head>
<body>
	<br>
	<fieldset class="login"><legend>Login</legend>
	<br><br>
		<form action="LoginServlet" method="post">
		<input type="text" name="login" placeholder="Login"/><br>
		<input type="password" name="senha" placeholder="Senha"/><br><br>
		<button type="submit" class="btn btn-success">Entrar</button><br><br>
		</form>
	</fieldset>
</body>
</html>