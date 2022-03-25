<!doctype html>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@page isELIgnored="false"%>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
<h2>Hello World!</h2>
	<h2>HEY ITS THE SECURITY START</h2>
	<a href="${pageContext.request.contextPath}/">GO to Index</a>
	<br>
	<sec:authorize  access='hasAuthority("Admin")'>
	<a href="${pageContext.request.contextPath}/adminpage"><button>ADMIN PAGE</button></a>
	</sec:authorize>
	&nbsp;
	<sec:authorize  access='hasAuthority("User")'>
	<a href="${pageContext.request.contextPath}/userpage"><button>USER PAGE</button></a>
	</sec:authorize>
	<br>
	<a href="${pageContext.request.contextPath}/delete/${username}"><button>DELETE</button></a>
</body>
</html>
	
