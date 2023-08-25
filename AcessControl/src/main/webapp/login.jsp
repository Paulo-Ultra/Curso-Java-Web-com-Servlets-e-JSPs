<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<form action="LoginServlet" method="POST">
		<table>
			<tr>
				<td>Usuário:<td>
				<td><input type="text" name="user"><td>
			</tr>
			
			<tr>
				<td>Senha:<td>
				<td><input type="text" name="password"><td>
			</tr>
			
			<tr>
				<td style="column-span:2"><input type="submit" value="OK"><td>		
			</tr>		
		</table>
	</form>
</body>
</html>