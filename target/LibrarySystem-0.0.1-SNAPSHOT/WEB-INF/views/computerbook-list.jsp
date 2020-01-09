<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book List</title>
</head>
<body>

	<div align="center">
		Book List
		<table border="1">
			<tr>
				<th>Book name</th>
				<th>Author</th>
				<th>Year</th>
			</tr>

			<c:forEach var="computerbook" items="${computerbookList}">
				<tr>
					<td><c:out value="${computerbook.bookName}"></c:out></td>
					<td><c:out value="${computerbook.author}"></c:out></td>
					<td><c:out value="${computerbook.year}"></c:out></td>
					<td><a href="updatebook?bookId=${computerbook.id}">update me</a></td>
					<td><a href="deletebook?bookId=${computerbook.id}">delete me</a></td>
				</tr>
			</c:forEach>

		</table>


	</div>
</body>
</html>
