<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body style="background-color:silver; ">
<h1 style="table-layout: fixed;text-align: center;">Student Data Management</h1>
<h2 style="table-layout: fixed;text-align: left;">All Student Data</h2>
	<form:form>
		<table border="1">
			<tr>
				<th>ID</th>
				<th>FIRST NAME</th>
				<th>LAST NAME</th>
				<th>ACTIONS</th>
			</tr>
			<c:forEach var="stud" items="${list}">
				<tr>
					<td>${stud.id}</td>
					<td>${stud.fName}</td>
					<td>${stud.lName}</td>
					<td><a href="delete?id=${stud.id}">DELETE</a></td>
					<td><a href="updateform?id=${stud.id}">UPDATE</a></td>
				</tr>
			</c:forEach>

		</table>
		
		<b>
	
	<a href="form">ADD MORE STUDENT</a>
	</b>
		
	</form:form>
</body>
</html>