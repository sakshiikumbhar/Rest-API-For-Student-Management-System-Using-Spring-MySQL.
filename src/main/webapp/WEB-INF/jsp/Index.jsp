<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:silver; ">
<h1 style="table-layout: fixed;text-align: center;">Student Data Management</h1>
<h2 style="table-layout: fixed;text-align: left;">Add Student Details</h2>
	<form:form action="save" modelAttribute="stud">
		<table>
			<tr>
				<td>Id:</td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td>First Name:</td>
				<td><form:input path="fName" /></td>
			</tr>

			<tr>
				<td>Last Name:</td>
				<td><form:input path="lName" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="OK">
				<td>
			</tr>
			<tr>
			</tr>
			</table>
			</form:form>
		<form:form action="read" method="get">
		<table>
		<tr><td><input type="submit" value="Show List"></tr>
		</table>
		</form:form>

	

</body>
</html>