<%@page import="model.StudentModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	StudentModel s1 = (StudentModel) request.getAttribute("s1");
	%>

	<form action="StudentController" method="post">
		<h1>Update your Information</h1>

		<table>

		<tr>
			
			<td><input type="hidden" name="id" value=  <%=s1.getId() %>></td>
		</tr>
		<tr>
			<td>First Name</td>
			<td><input type = "text" name ="fname" value ="<%= s1.getFname() %>"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type = "text" name ="lname" value ="<%=s1.getLname()%>"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type = "text" name ="email" value ="<%=s1.getEmail()%>"></td>
		</tr>
		<tr>
			<td>Contact</td>
			<td><input type = "text" name ="contact" value ="<%=s1.getContact()%>"></td>
		</tr>
		<tr>
			<td><input type = "submit" name ="action" value ="update"></td>
		</tr>

		</table>

	</form>
</body>
</html>