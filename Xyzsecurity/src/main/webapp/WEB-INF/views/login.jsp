<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN PAGE</title>
</head>
<body>
	<h1>MY LOGIN PAGE</h1>
	<div align="center">
		<div>
			<c:if test="${param.error != null }">
				<i style="color: red;">WRONG USERNAME OR PASSWORD...</i>
			</c:if>
			<c:if test="${param.logout != null }">
				<i style="color: red;">USER LOGGED OUT OF THE SITE.......LOGIN
					AGAIN....</i>
			</c:if>
		</div>
		<form:form>
			<table>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>