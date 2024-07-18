<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class = "container">

<table class="table">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Contact</th>
      <th scope="col">Address</th>
      <th scope="col">Email</th>
      <th scope="col">Password</th>
      <th scope="col">Edit</th>
      <th scope="col">Delete</th>
    </tr>
  </thead>
  
  <tbody>
  
  
    <tr>
    
    <c:forEach items = "${list }" var = "u">
      <th scope="row">${u.id }</th>
      <td>${u.name }</td>
      <td>${u.contact }</td>
      <td>${u.address }</td>
      <td>${u.email }</td>
       <td>${u.password }</td>
      
      <td><a href="edit/${u.id }">Edit</a></td>
      <td><a href="delete/${u.id }">Delete</a></td>
    </tr>
    
    </c:forEach>
   
  </tbody>
</table>

</div>
</body>
</html>