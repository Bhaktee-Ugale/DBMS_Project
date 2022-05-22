<%@page import="com.vaccine_Registration.VaccineRegistration"%>
<%@page import="java.io.*, java.sql.*, java.util.*" %>
<%@page import="javax.servlet.http.*, javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <jsp:useBean id="obj" class="com.vaccine_Registration.Applicant"/>
 <jsp:setProperty property="*" name="obj"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<%
boolean status=VaccineRegistration.register(obj);
if(status) out.println("You have successfully registered!");
%>

<button name="button" type="button" onclick="booking_page()">Booking for Vaccine</button>
<script>
function booking_page(){
	window.location.replace("BookingVaccine.html");
	window.location.href = "BookingVaccine.html";
};
</script>


</body>
</html>