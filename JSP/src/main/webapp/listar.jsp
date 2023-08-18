<%@page import="java.util.Set"%>
<%@page import="java.util.Properties"%>
<%@page import="java.io.InputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem do Arquivo props.txt</title>
</head>
<body>

	<%--Declarations -> O properties será um atributo dentro do declaration e não mais somente uma variável declarada --%>
	
	<%!
		Properties props = new Properties();
	%>
	
	<%--Scriptlets --%>
	<%
		InputStream is = application.getResourceAsStream("WEB-INF/props.txt");
		props.load(is);
		is.close();
		
		Set<Object> keys = props.keySet();
	%>
	
	<table style="border: 1; width:100%;">
		<tr>
			<td><strong>Nome</strong></td>
			<td><strong>Valor</strong></td>
		</tr>
		<% for(Object k : keys) { %>
		<tr>
			<td><%= k %></td>
			<td><%= props.getProperty((String) k) %></td>
		</tr>
		<% } %>
	</table>
	
</body>
</html>