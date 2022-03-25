<!doctype html>
<%@page import="springbasic.Entity.Teacher"%>
<%@page import="org.springframework.ui.Model"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
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

<title>LIST OF USERS</title>
</head>
<body>

	<div class="container">
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
					List<Teacher> tlist = (List<Teacher>) request.getAttribute("tlist");
					for (Teacher t : tlist) {
					%>
					<tr>
						<th scope="row"><%=t.getId()%></th>
						<td><%=t.getName()%></td>
						<td><%=t.getEmail()%></td>
						<td>DATE</td>
						<td><a class="btn btn-primary" href="update/<%=t.getId()%>"
							role="button">UPDATE</a> | <a class="btn btn-primary"
							href="delete/<%=t.getId()%>" role="button">DELETE</a></td>
					</tr>
					<%
					}
					%>
				</tbody>
			</table>
			<div class="col-lg ">
				<div class="col-md">
					<button class="btn btn-primary" id="clickme">INSERT DATA</button>
				</div>
			</div>
		</div>
	</div>

	<div class="container1">
		<h1 id="ajax">HEY ITS FOR TESTING AJAX</h1>
		<button id="btn">Click For Ajax</button>
	</div>


	<div class="container2">
		<h1 id="ajaxsetup">HEY ITS FOR TESTING AJAX</h1>
		<button id="btn-setup">Click For Ajax</button>
	</div>

	<hr>
	<div class="container2">
	<h1 align="center">GET</h1>
		<input type="text" name="tid" value="1" id="mytext">
		<h1 id="ajaxget">HEY ITS FOR TESTING AJAX GET</h1>
		<button id="btn-get">Click For Ajax</button>
	</div>
	
	<hr>
	<div class="container2">
	<h1 align="center">POST</h1>
		<input type="text" name="tname" id="myname">
		<input type="text" name="temail" id="myemail">
		<h1 id="ajaxpost">HEY ITS FOR TESTING AJAX POST</h1>
		<button id="btn-post">Click For Ajax</button>
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

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
	
</script>
<script>
	$(document).ready(function() {

		//PAGE LOADING USING LOAD()
		$("#clickme").click(function() {
			$(".container").load("insertdata");
			$("#clickme").hide();
		});

		//AJAX() to load page
		$("#btn").click(function() {
			$.ajax({
				url : "asach",
				async : false,
				success : function(result) {
					$("#ajax").html(result);
					$("#btn").hide();
				}
			});
		});

		//AJAXCOMPLETE
		$(document).ajaxComplete(function() {
			alert(" AJAX request completes.");
		});

		//AJAX ERROR
		$(document).ajaxError(function() {
			alert("GOT THE ERROR ITS OF AJAX...");
		});

		//AJAX SEND 
		$(document).ajaxSend(function() {
			alert("SENDING THE AJAX REQUEST TO SERVER");
		});

		//AJAX SETUP
		$("#btn-setup").click(function() {
			$.ajaxSetup({
				url : "asach",
				success : function(result) {
					$("#ajaxsetup").html(result + "using ajax setup");
				}
			});
			$.ajax();
		});

		//AJAX START
		$(document).ajaxStart(function() {
			console.log("AJAX REQUEST START");
		});

		//AJAX STOP
		$(document).ajaxStop(function() {
			console.log("AJAX REQUEST STOP");
		});

		//AJAX SUCCESS
		$(document).ajaxSuccess(function() {
			console.log("AJAX SUCCESS METHOD");
		});

		//AJAX GET USING REQUEST PARAMETER
		$("#btn-get").click(function() {
			let myid = $("#mytext").val();
			$.get("getData", {
				tid : myid
			}, function(data) {
				$("#mytext").val(data);
			});
		});
		
		//AJAX GET USING PATH VARIABLE
		$("#btn-get").click(function() {
			let myid = $("#mytext").val();
			$.get("getData/"+myid, function(data) {
				$("#mytext").val(data);
			});
		});
		
		//AJAX POST
		$("#btn-post").click(function(){
			var tn = $("#myname").val();
			var te = $("#myemail").val();
			$.post("postData" , 
					{ tname : tn ,
				      temail : te ,
				      },
				      function(data , status){
				    	 $("#ajaxpost").html(data);
				      });
		});
	});
</script>

</html>