<%@page import="com.login.LoginDao, com.login.ApplicantLogin" %>
<%@page import="java.io.*, java.sql.*, java.util.*" %>
<%@page import="javax.servlet.http.*, javax.servlet.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <jsp:useBean id="obj" class="com.login.ApplicantLogin"/>
  <jsp:setProperty property="*" name="obj"/>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<%
//ApplicantLogin obj = new ApplicantLogin();
boolean status=LoginDao.validate(obj);  
if(status){  
	out.println("You are successfully logged in");  
	session.setAttribute("session","TRUE");  
}  
else {
	out.print("Sorry, aadhar number or password error");
	session.setAttribute("session", "FALSE");
}
%>
</body>
</html>
