<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar</title>
</head>
<body>

	<%
	String key = (String) request.getAttribute("key");
	if (key == null) {
		key = "";
	}

	String value = (String) request.getAttribute("value");
	if (value == null) {
		value = "";
	}
	%>

	<div style="text-align: center;">
		<h1>Editar</h1>
	</div>

	<form action="save" method="post">
		<table>
			<tr>
				<td>Chave:</td>
				<td><input type="text" name="key" value="<%=key%>"></td>
			</tr>

			<tr>
				<td>Valor:</td>
				<td><input type="text" name="value" value="<%=value%>"></td>
			</tr>

			<tr>
				<td style="column-span: 2; text-align: right;"><input
					type="submit" value="Salvar"></td>
			</tr>
		</table>
	</form>

</body>
</html>