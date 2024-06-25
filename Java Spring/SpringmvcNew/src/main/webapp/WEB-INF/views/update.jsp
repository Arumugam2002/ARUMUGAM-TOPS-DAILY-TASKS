<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

<h2>Update Your Details Here</h2>
<form action="${pageContext.request.contextPath}/create">


  <div class="form-group">
    
    <input type="text" class="form-control" name="id" id="exampleInputEmail1"  aria-describedby="emailHelp" value="${user.id }">
    
  </div>
   <label> Name:- </label>
  <div class="form-group">
    
    <input type="text" class="form-control" name="name" id="exampleInputEmail1" aria-describedby="emailHelp" value="${user.name }">
    
  </div>
  
  <div class="form-group">
   <label> Contact No:- </label>
    
    <input type="text" class="form-control" name="contact" id="exampleInputEmail1"  aria-describedby="emailHelp"  value="${user.contact}">
    
  </div>
  
  <div class="form-group">
    <label>Address:- </label>
    <input type="text" class="form-control" name="address" id="exampleInputEmail1"  aria-describedby="emailHelp" value="${user.address}">
    
  </div>
  
  <div class="form-group">
    <label>Email:- </label>
    <input type="text" class="form-control" name="email" id="exampleInputEmail1"  aria-describedby="emailHelp" value="${user.email}">
    
  </div>
  
  <div class="form-group">
    <label>Password:- </label>
    <input type="text" class="form-control" name="password" id="exampleInputEmail1"  aria-describedby="emailHelp" value="${user.password}">
    
  </div>
  
  <div class="form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary">Update</button>
  
 
</form>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>