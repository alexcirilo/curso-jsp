<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Curso JSP</title>
</head>
<body>

	<form action="LoginServlet" method="post">
		<p>Login:</p>
		<input type="text" name="login">
		<p>Senha:</p>
		<input type="text" name="senha"> <input type="submit"
			value="enviar">
	</form>
</body>
</html>