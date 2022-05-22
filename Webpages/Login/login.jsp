<%@page import="com.login.LoginDao" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="obj" class=com.login.ApplicantLogin/>
<jsp:setProperty property="*" name="obj"/>
  
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<%  
boolean status=LoginDao.validate(obj);  
if(status){  
out.println("You are successfully logged in");  
session.setAttribute("session","TRUE");  
}  
else  
{  
out.print("Sorry, email or password error"); 
}
%>
</body>
</html>