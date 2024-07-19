<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, com.example.model.User"%>
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
	<link rel="stylesheet" href="styles/a.css">
</head>
<body>

	<%
	//this is scriptlet tag and is not part of a response but we use it to process data in java code
	List<User> users = (List<User>) request.getAttribute("users");
	%>



	<jsp:include page="header.jsp"></jsp:include>
	<div id = "body">
		<div id="sidebar">

			<div class="d-flex flex-column flex-shrink-0 p-3 bg-light"
				style="width: 280px;">
				<ul class="nav nav-pills flex-column mb-auto">

					<li><a href="#" class="nav-link link-dark"> <svg
								class="bi me-2" width="16" height="16">
							<use xlink:href="#speedometer2" /></svg> User
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

		<div id="main">

			<table class="table" style="float: right;">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">Username</th>
						<th scope="col">Complete Name</th>
						<th scope="col">Email</th>
					</tr>
				</thead>
				<tbody>

					<%
					for (int i = 0; i < users.size(); i++) {
					%>
					<tr>
						<th scope="row"><%=i + 1%></th>
						<td><%=users.get(i).getUsername()%></td>
						<!-- this is Expression tag and is part of a response after processing 
										the java code in it...-->
						<td><%=users.get(i).getCName()%></td>
						<td><%=users.get(i).getEmail()%></td>
					</tr>
					<%
					}
					%>

				</tbody>
			</table>

		</div>
	</div>
</body>
</html>