<!doctype html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page isELIgnored="false"%>

<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<h1>INDEX PAGE IS HERE...    USER LOGGED IS :- ${username}  </h1>
	<h4>AUTHORITIES ARE :- ${authorities}</h4>
	<a href="${pageContext.request.contextPath}/home">GO to home</a>
	<div>
		<form:form action="logout" method="POST">
			<input type="submit" value="Logout">
		</form:form>
	</div>
</body>
</html>