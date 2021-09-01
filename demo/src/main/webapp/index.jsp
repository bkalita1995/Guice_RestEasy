<%@page import ="com.demo.db.Student" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

	<h1>Hello demo Page</h1>
		<form action="<%= request.getContextPath()%>/student/insert" method="post" name="student">
			Enter Name: <input type="text" name="name"><br><br>
							<input type="submit" value="SUBMIT">
		</form>
		
		
	<br><br>
		<table border="1">
			<tr>
				<th>Student ID</th>
				<th>Student Name</th>
				<th>Student Email Address</th>
				<th>Action Edit</th>
				<th>Action Delete</th>
			</tr>
			
			
			<c:forEach items="${studentlist }" var="student">
			<tr>
				<td>${student.roll_no}</td>
				<td>${student.name}</td>
				<td><a href="<%=request.getContextPath()%>/student/get/${student.roll_no}">Update</a></td>
				<td><a href= "<%= request.getContextPath()%>/student/delete/${student.roll_no}" onclick="return window.confirm('Are You Sure?')">Delete</a></td>
			</tr>
			
			</c:forEach>
	</table>
	
	<a href="<%=request.getContextPath()%>/student/get/">ListAllStudent</a>
</body>
</html>