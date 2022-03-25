<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Custom Login</title>
</head>
<body>
<h1>LOGIN FORM....</h1>

<c:if test="${param.error != null }">
<i style="color : red;">INVALID CREDENTIALS!!!!</i>
</c:if>

<c:if test="${param.logout != null }">
<i style="color : blue;">USER LOGGED OUT.SIGN IN AGAIN...</i>
</c:if>
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

</body>
</html>