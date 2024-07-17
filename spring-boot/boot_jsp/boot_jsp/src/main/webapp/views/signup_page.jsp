<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div style="margin-left: 280px; font-size: 50px; color: red;">Welcome
		To ECommerce Application</div>
	<div style="margin-left: 400px; font-size: 30px; color: blue;">Provide your Details for Registration</div>
	<div style="margin-left: 500px; margin-right: 500px">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Username</label>
			<input type="text" class="form-control" id="exampleFormControlInput1"
				placeholder="Provide your Username">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Password</label>
			<input type="text" class="form-control" id="exampleFormControlInput1"
				placeholder="Provide your Password">
		</div>
		
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Complete Name</label>
			<input type="text" class="form-control" id="exampleFormControlInput1"
				placeholder="Provide your Complete Name">
		</div>
		
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Email Address</label>
			<input type="text" class="form-control" id="exampleFormControlInput1"
				placeholder="Provide your Email Address">
		</div>

		<button style="margin-left: 100px" type="button"
			class="btn btn-primary">Register</button>
		<br>
		<br> <a style="margin-left: 50px" href="/">Back to Index Page!!</a>

	</div>
</body>
</html>