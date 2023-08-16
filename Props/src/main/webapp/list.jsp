<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Propriedades</title>
</head>
<body>

	<%
	@SuppressWarnings("unchecked")
	Map<String, String> props = (Map<String, String>) request.getAttribute("props");
	%>
	
	<div style="text-align: center;"><h1>Propriedades</h1></div>
	
	<a href="edit">Criar nova propriedade</a>
	<br><br>
	<table border="1" width="100%">
		<tr>
			<td style="text-align: center;"><strong>Propriedade</strong></td>
			<td style="text-align: center;"><strong>Valor</strong></td>
			<td style="column-span: 2"></td>			
		</tr>

	<% for(Map.Entry<String, String> entry : props.entrySet()) {%>
		<tr>
			<td style="text-align: center;"><%=entry.getKey() %></td>
			<td style="text-align: center;"><%=entry.getValue() %></td>	
			<td style="text-align: center;"><a href="edit?key=<%=entry.getKey() %>">Editar</a></td>	
			<td style="text-align: center;"><a href="delete?key=<%=entry.getKey() %>">Excluir</a></td>		
		</tr>
	<% } %>
	</table>
</body>
</html>