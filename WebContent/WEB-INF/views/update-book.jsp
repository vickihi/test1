<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>updating a book</title>
</head>

<body>
<div align="center">
		<form:form action="updatebook" method="post" 
			modelAttribute="editedbook">
			<table>
					<form:hidden path="id" />
				
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
					<td colspan="2"><input type="submit" value="update book"></td>
				</tr>
			</table>

		</form:form>
	</div>
</body>
</html>