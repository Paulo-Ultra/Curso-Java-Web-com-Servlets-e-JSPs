<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P�gina inicial</title>
</head>
<body>
	
	<%-- Em tempo de compila��o usando a diretiva include --%>
	<%--@include file="header.jsp" --%>
	
	<%-- Segunda forma de incluir outro conte�do de jsp, o conte�do s� � inclu�do na hora que � mostrado na tela --%>
	<%-- � a forma mais usada --%>
	<jsp:include page="header.jsp"></jsp:include>

	Conte�do da p�gina inicial
	
</body>
</html>