<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Model Attribute</title>
</head>
<body>
<h1>THIS DATA IS PROCESSED USING THE Model Attribute</h1>
<h1>NAME :- ${user.getName() }</h1>
<h1>EMAIL :- ${user.getEmail() }</h1>
</body>
</html>