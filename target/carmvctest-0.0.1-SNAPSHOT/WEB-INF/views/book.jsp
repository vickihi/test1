<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Info</title>
</head>
<body>
	<c:out value="${BookName}"></c:out>
	<c:out value="${Author}"></c:out>
	<c:out value="${Year}"></c:out>
</body>
</html>