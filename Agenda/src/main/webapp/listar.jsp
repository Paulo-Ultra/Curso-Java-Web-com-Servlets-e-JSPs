<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Contato" %>
<%@ page import="java.util.Set" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contatos</title>
</head>
<body>

	<c:url var="novoContatoUrl" value="/editar" />
	
	<a href="${ novoContatoUrl }">Criar Contato</a><br><br>
	
	<table border="" style="width: 100%; border: 1px solid black;">
		<tr>
			<td style="text-align:center;"><strong>Nome</strong></td>
			<td style="text-align:center;"><strong>Telefone</strong></td>
			<td></td>
		</tr>
		
		<c:choose>
			<c:when test="${ empty(contatos) }">
				<td style="column-span: 3; text-align: center">Nenhum contato cadastrado</td>
			</c:when>
			<c:otherwise>
				<c:forEach var="c" items="${ contatos }">
				<tr>
					<c:url var="editarContatoUrl" value="/editar">
						<c:param name="id">${c.id}</c:param>
					</c:url>
					
					<c:url var="excluirContatoUrl" value="/excluir">
						<c:param name="id">${c.id}</c:param>
					</c:url>
					
					<td style="text-align: center;"><a href="${ editarContatoUrl }">${c.nome}</a></td>
					<td style="text-align: center;">${c.telefone}</td>
					<td style="text-align: center;"><a href="${ excluirContatoUrl }">Excluir</a></td>
				</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table> 
</body>
</html>