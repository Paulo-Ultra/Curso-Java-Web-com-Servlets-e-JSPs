<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página inicial</title>
</head>
<body>
	
	<%-- Em tempo de compilação usando a diretiva include --%>
	<%--@include file="header.jsp" --%>
	
	<%-- Segunda forma de incluir outro conteúdo de jsp, o conteúdo só é incluído na hora que é mostrado na tela --%>
	<%-- É a forma mais usada --%>
	<jsp:include page="header.jsp"></jsp:include>

	Conteúdo da página inicial
	
</body>
</html>