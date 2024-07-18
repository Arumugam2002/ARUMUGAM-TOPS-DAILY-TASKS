<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@include file = "seller-header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container-fluid contact py-5">
            <div class="container py-5">
                <div class="p-5 bg-light rounded">
                    <div class="row g-4">
                       
                       <h1>Seller Profile</h1>
                      
                                      
                        <div class="col-lg-7">
                            <form action="SellerController" class="" method="post">
                            
                            <input type="hidden" name ="id" class="w-100 form-control border-0 py-3 mb-4" value = <%= s.getId() %>>
                            
                            
                                <input type="text" name ="name" class="w-100 form-control border-0 py-3 mb-4" placeholder="Enter your Name" value = <%= s.getName() %>>
                                <input type="number" name ="contact" class="w-100 form-control border-0 py-3 mb-4" placeholder="Enter your mobile number" value = <%= s.getContact()%>>
                                <input type="email" name ="email" class="w-100 form-control border-0 py-3 mb-4" placeholder="Enter Your Email" value = <%= s.getEmail()%>>
                                <input name ="address" class="w-100 form-control border-0 mb-4"  placeholder="Enter your Address" value = <%= s.getAddress()%>>

                                <button class="w-100 btn form-control border-secondary py-3 bg-white text-primary " name="action" value ="update" type="submit">Update</button>
                                
                            </form>
                        </div>
                        <div class="col-lg-5">
                            
                            
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>


</body>
</html>