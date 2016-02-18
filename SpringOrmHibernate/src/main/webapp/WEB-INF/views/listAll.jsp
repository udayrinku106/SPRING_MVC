<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="register">Register</a>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>EMAIL</th>
		</tr>
	<c:forEach var="student" items="${students}">
		<tr>
			<td>${student.id}</td>
			<td>${student.name}</td>
			<td>${student.email}</td>
		</tr>
	</c:forEach>
	</table>
	
</body>
</html>