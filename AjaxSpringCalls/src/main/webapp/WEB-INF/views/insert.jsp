<!doctype html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="org.springframework.ui.Model"%>
<%@page import="java.util.List"%>
<%@page isELIgnored="false"%>

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

<title>UPDATE USER</title>
</head>
<body>

	<div class="container ">
		<div class="col-lg">
			<h2 class="text-center text-primary pt-5">INSERT USER</h2>
		</div>

		<form action="inserted" method="post">

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Name</label> <input
					type="text" class="form-control" id="exampleInputEmail1"
					name="name" aria-describedby="emailHelp">

			</div>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email
					address</label> <input type="email" class="form-control"
					id="exampleInputEmail1" name="email" aria-describedby="emailHelp">

			</div>


			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
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