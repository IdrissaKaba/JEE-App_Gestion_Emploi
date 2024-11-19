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
	<h1>List of products</h1>
	<h3> Category : ${cat.categorie}</h3>
	<p><a href="PreAjout">add a product</a></p>
	<table border="1">
		<c:forEach items="${prod}" var="p">
			   <tr>
				 <td> ${p.id} </td>
				 <td> ${p.titre} </td>
				 <td> ${p.prix} </td>
				 <td><a href="DeleteProd?idDel=${p.id}">Delete Product</a></td>
			   </tr>
		</c:forEach>
	</table>

</body>
</html>