<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>HOME</title>
</head>
<body>
	<sec:csrfMetaTags />
	<h1>WELCOME TO MY HOME PAGE ${username}</h1>
	<h2>${authority}</h2>
	<div align="center">
		<form:form action="logout_perform" method="POST">
			<input type="submit" value="Logout">
		</form:form>
	</div>
	<br>
	<button id="load">LOAD PAGE</button>
	<div id="loadhere"></div>


	<div class="container2">
		<div id="container3">
			<h1 align="center">POST</h1>
		</div>

		<form id="xxx">
			<input type="text" name="name" id="myname"> <input
				type="password" name="password" id="myemail">
			<button id="btn-post">Click For Ajax</button>
		</form>
	</div>
	<p id="fff">HEY FEDFEFEFEFEFEF</p>
	
	
	
	<hr>
	<input type="text" value="SHUBHAM" name="name" id="nnn">
	<button id="getreq">GET REQUEST</button>
	<h1 id="getres">HEY HERE IS THE RESPONSE</h1>
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

<script type="text/javascript">
	$(document).ready(function() {

		var token = $("meta[name='_csrf']").attr("content");
		var header = $("meta[name='_csrf_header']").attr("content");

		$(document).ajaxSend(function(e, xhr, options) {
			xhr.setRequestHeader(header, token);
		});

		$("#btn-post").click(function() {
			$("#xxx").click(function(event) {
				event.preventDefault();
			});
			var tn = $("#myname").val();
			var te = $("#myemail").val();
			$.post("postData", {
				name : tn,
				password : te,
			}, function(data, status) {
				$("#fff").html(data);
			});
		});
		
		
		$("#getreq").click(function(){
			$.get("getdata/"+$("#nnn").val() , function(data){
				$("#getres").html(data);
			})
		})
	});
</script>
</html>