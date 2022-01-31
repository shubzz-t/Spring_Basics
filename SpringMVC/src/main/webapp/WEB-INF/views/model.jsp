<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Model</title>
</head>
<body>
<h1>CHECKING MODEL WORKING</h1>
	<h1>${name}</h1>
	
	<hr>
	
	<%
	String name = (String) request.getAttribute("name");
	%>
	
	<h1>This is using request.getAttribute <%=name %></h1>
</body>
</html>