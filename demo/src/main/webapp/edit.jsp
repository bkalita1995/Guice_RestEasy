
<%@ page import = "com.demo.db.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>editJsp</title>
</head>
<body>
	<h2>Edit Form</h2>
		<% 
			Student s = (Student) request.getAttribute("StudentObj");
		%>
		
		<form action="<%= request.getContextPath()%>/student/update" method="POST" name="student">
			Student RollNo :<% out.print(" " + s.getRoll_no());%><br> <br>
			<INPUT TYPE="hidden" NAME="roll_no" VALUE="<%=s.getRoll_no()%>"> 
			Name: <input type="text" name="name" value="<%=s.getName()%>">
				<input type="submit" value="SUBMIT">
		</form>

</body>
</html>