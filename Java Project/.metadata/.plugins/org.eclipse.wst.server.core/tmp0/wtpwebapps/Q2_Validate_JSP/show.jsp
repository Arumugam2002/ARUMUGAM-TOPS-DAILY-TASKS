<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="dao.StudentDao" %>
<%@page import="model.StudentModel" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

	List<StudentModel> list = StudentDao.getAllData();

%>


<table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Email</th>
      <th scope="col">Contact</th>
      <th scope="col">Edit</th>
      <th scope="col">Delete</th>
    </tr>
  </thead>
  <tbody>
  
  <%
  	for(StudentModel s1:list)
  	{
  
  %>
    <tr>
      
      <td><%=s1.getId() %></td>
      <td><%=s1.getFname() %></td>
      <td><%=s1.getLname() %></td>
      <td><%=s1.getEmail() %></td>
      <td><%=s1.getContact() %></td>
      
      <td>
      
      <form action = "StudentController" method="post" name="edit">
      
      <input type="hidden" name="id" value="<%=s1.getId()%>">
      <input type="submit" name="action" value="edit">
      
      </form>
      </td>
      <td>
      
       <form action = "StudentController" method="post" name="delete">
      
      <input type="hidden" name="id" value="<%=s1.getId()%>">
      <input type="submit" name="action" value="delete">
      
      </form>
      
      </td>
      
    </tr>
   <%
  	}
   %>
  </tbody>
</table>
</body>
</html>