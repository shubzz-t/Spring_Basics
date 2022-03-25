<!doctype html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="org.springframework.ui.Model"%>
<%@page import="com.spring.project.entity.Users"%>
<%@page import="java.util.List"%>

<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>LIST OF USERS</title>
</head>
<body>

	<div class="container ">
		<div class="col-lg">
			<h2 class="text-center text-primary pt-5">LIST OF USERS</h2>
		</div>
		<div class="col-md">

			<table class="table table-dark table-hover">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">EMAIL</th>
						<th scope="col">NAME</th>
						<th scope="col">DATE</th>
						<th scope="col">OPERATIONS</th>
					</tr>
				</thead>
				<tbody>
					<%
					List<Users> list = (List<Users>) request.getAttribute("list");
					for (Users u : list) {
					%>
					<tr>
						<th scope="row"><%=u.getId()%></th>
						<td><%=u.getName()%></td>
						<td><%=u.getEmail()%></td>
						<td><%=u.getDate()%></td>
						<td><a class="btn btn-primary" href="update/<%=u.getId()%>"
							role="button">UPDATE</a> | <a class="btn btn-primary"
							href="delete/<%=u.getId()%>" role="button">DELETE</a></td>
					</tr>
					<%
					}
					%>
				</tbody>
			</table>
			<a class="btn btn-primary" href="insertdata">INSERT DATA</a>
		</div>
	</div>

</body>

<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
	integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
	integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
	crossorigin="anonymous"></script>

</html>