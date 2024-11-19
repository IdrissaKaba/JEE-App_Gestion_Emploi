<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib    prefix = "c"    uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add a Product</h1>
	<form method="POST" action="AddProduct">
		<p> Product : <input type="text" name="titre"></p>
		<p> Price : <input type="text" name="prix"></p>
		<p> Category : 	<select name="cat">
							<c:forEach items="${cats}" var="c">
								<option value="${c.id}">${c.categorie}</option>
							</c:forEach>
						</select>
		</p>
		<p><input type="submit"></p>
	</form>
</body>
</html>