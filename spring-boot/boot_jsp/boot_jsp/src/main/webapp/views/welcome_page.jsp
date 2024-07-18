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
	<div style="font-size: 30px; color: blue; margin-left: 300px">
		${loggedInUser.getCName()}, Welcome To Ecommerce Application...</div>
<jsp:include page="header.jsp"></jsp:include>
	<div style="margin-left: 100px; margin-right: 500px; margin-top: 50px">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Username</th>
					<th scope="col">Complete Name</th>
					<th scope="col">Email</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>${loggedInUser.getUsername() }</td>
					<td>${loggedInUser.getCName() }</td>
					<td>${loggedInUser.getEmail() }</td>
				</tr>

			</tbody>
		</table>
	</div>
</body>
</html>