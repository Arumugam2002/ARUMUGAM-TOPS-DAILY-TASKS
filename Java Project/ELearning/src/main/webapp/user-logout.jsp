<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@include file = "user-header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

session.removeAttribute("data");
session.invalidate();
response.sendRedirect("user-login.jsp");

%>


<%@include file="user-footer.jsp" %>
</body>
</html>