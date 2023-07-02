<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body style="background-color:silver;">
	<h1 style="table-layout: fixed; text-align: center;">Student Data
		Management</h1>
	<h2 style="table-layout: fixed; text-align: left;">Update Student
		Data</h2>
	<form action="update1" method="get">
		<table>
			<tr>
				<td>Student ID:</td><td><input type="text" name="id"
					value="${stud.id } " readonly="readonly"> <br>
				</td>
			</tr>
			<tr>
				<td>Student Name:</td><td> <input type="text" name="fname"
					value="${stud.fName }"><br></td>
			</tr>
			<tr>
				<td>Student Marks: </td><td><input type="text" name="lname"
					value="${stud.lName }"> <br>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="UPDATE"></td>
			</tr>
		</table>
	</form>
</body>
</html>