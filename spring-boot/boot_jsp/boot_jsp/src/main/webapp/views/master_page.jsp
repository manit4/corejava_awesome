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
	
<jsp:include page="header.jsp"></jsp:include>
	<div style="margin-top: 30px">

		<div class="d-flex flex-column flex-shrink-0 p-3 bg-light"
			style="width: 280px;">
			<ul class="nav nav-pills flex-column mb-auto">
				
				<li><a href="#" class="nav-link link-dark"> <svg
							class="bi me-2" width="16" height="16">
							<use xlink:href="#speedometer2" /></svg> Employee
				</a></li>
				<li><a href="#" class="nav-link link-dark"> <svg
							class="bi me-2" width="16" height="16">
							<use xlink:href="#table" /></svg> Customers
				</a></li>
				<li><a href="#" class="nav-link link-dark"> <svg
							class="bi me-2" width="16" height="16">
							<use xlink:href="#grid" /></svg> Product
				</a></li>
				<li><a href="#" class="nav-link link-dark"> <svg
							class="bi me-2" width="16" height="16">
							<use xlink:href="#people-circle" /></svg> Category
				</a></li>
			</ul>
			

		</div>

	</div>

</body>
</html>