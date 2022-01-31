<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>

<h1>FORM TESTING USING RequestParam ATTRIBUTE</h1>
<form method="post" action="using_req_param">
<input type="text" name="name">
<input type="Submit" value="SUBMIT">
</form>

<br>
<br>

<hr>

<h1>FORM TESTING USING MODEL ATTRIBUTE</h1>

<form method="post" action="using_model_attr">
<input type="text" name="name">
<input type="email" name="email">
<input type="Submit" value="SUBMIT">
</form>

</body>
</html>