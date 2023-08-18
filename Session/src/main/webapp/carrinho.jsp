<%@page import="java.util.List"%>
<%@page import="model.Produto"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Carrinho</title>
</head>
<body>
	<h1>Carrinho</h1>
	
	<%
		List<Produto> produtos = (List<Produto>) request.getAttribute("produtos");
	%>
	
	<table style="border: 1; width: 100%;">
		<tr>
			<td style="text-align: center;"><strong>Produto</strong></td>
			<td style="text-align: center;"><strong>Valor</strong></td>
		</tr>
		<% for (Produto p : produtos) { %>
		<tr>
			<td style="text-align: center;"><%= p.getNome() %></td>
			<td style="text-align: center;"><%= p.getValor() %></td>
		</tr>
		
		<% } %>
	</table>
</body>
</html>