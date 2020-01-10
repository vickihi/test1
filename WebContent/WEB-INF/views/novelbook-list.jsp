<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

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

			<c:forEach var="novelbook" items="${novelbookList}">
				<tr>
					<td><c:out value="${novelbook.bookName}"></c:out></td>
					<td><c:out value="${novelbook.author}"></c:out></td>
					<td><c:out value="${novelbook.year}"></c:out></td>
					<td><a href="editbook?bookId=${novelbook.id}">update me!</a></td>
					<td><a href="deletebook?bookId=${novelbook.id}">delete me!</a></td>
				</tr>
			</c:forEach>
		</table>
		
		<div>
			<br></br> <br></br>
		</div>

		<div align="left">
			<form:form action="saveBook" method="post" modelAttribute="book">
				<table>
					<tr>
						<td>Book Name</td>
						<td><form:input path="bookName" /></td>
					</tr>

					<tr>
						<td>Author</td>
						<td><form:input path="author" /></td>
					</tr>

					<tr>
						<td>Year</td>
						<td><form:input path="year" /></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="Save"></td>
					</tr>
				</table>
			</form:form>
		</div>


	</div>
</body>
</html>