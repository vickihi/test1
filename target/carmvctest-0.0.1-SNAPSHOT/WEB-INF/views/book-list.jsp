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

			<c:forEach var="book" items="${bookList}">
				<tr>
					<td><c:out value="${book.BookName}"></c:out></td>
					<td><c:out value="${book.Author}"></c:out></td>
					<td><c:out value="${book.Year}"></c:out></td>
				</tr>
			</c:forEach>

		</table>


	</div>
</body>
</html>