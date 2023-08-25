<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.StringWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Erro desconhecido</title>
</head>
<body>

	<h1>Erro interno da aplicação</h1>
	<br>
	
	<h2>Mensagem: <%= exception.getMessage() %></h2>
	<br>
	
	<%
		StringWriter sw = new StringWriter();
	
		exception.printStackTrace(new PrintWriter(sw));
		
	%>

	<!--  o jsp chama internamente o toString();-->
	<%= sw %>

</body>
</html>