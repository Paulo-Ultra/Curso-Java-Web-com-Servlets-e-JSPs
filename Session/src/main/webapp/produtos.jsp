<%@page import="model.Produto"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Produtos</title>
</head>
<body>
	<h1>Lista de Produtos</h1>
	
	<%
		Collection<Produto> produtos = (Collection<Produto>) request.getAttribute("produtos");
	%>
	
	<table style="border: 1; width: 100%;">
		<tr>
			<td style="text-align: center;"><strong>Produto</strong></td>
			<td style="text-align: center;"><strong>Valor</strong></td>
			<td style="text-align: center;"></td>
		</tr>
		<% for (Produto p : produtos) { %>
		<tr>
			<td style="text-align: center;"><%= p.getNome() %></td>
			<td style="text-align: center;"><%= p.getValor() %></td>
			<td style="text-align: center;"><a href="adicionar?id=<%=p.getId()%>">Adicionar</a></td>
		</tr>
		
		<% } %>
	</table>
</body>
</html>