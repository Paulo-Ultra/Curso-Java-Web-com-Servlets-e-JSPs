<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário</title>
</head>
<body>

	<%
		Cookie[] cookies = request.getCookies();
		String nome = "";
		
		if(cookies != null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("nomeUsu")) {
					nome = cookie.getValue();
					break;
				}
			}
		}
	%>

	<form action="Salvar" method="get">
	
	Nome do usuário: <input type="text" name="nome" value="<%= nome %>"><br>
	<input type="submit" value="Processar"><br>
	</form>
	
</body>
</html>