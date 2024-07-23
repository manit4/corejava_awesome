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

</head>
<body>

	<%
	//this is scriptlet tag and is not part of a response but we use it to process data in java code
	List<User> users = (List<User>) request.getAttribute("users");
	String updateMessage = (String) request.getAttribute("updateMsg");
	%>

	<jsp:include page="header.jsp"></jsp:include>

	<div style="font-size: 30px; color: blue; margin-left: 300px">
		${loggedInUser.getCName()}, Welcome To Ecommerce Application...</div>
	<%
	if (updateMessage != null) {
	%>
	<div>Record is Updated</div>
	<%
	}
	%>
	<div class="container" style="margin-top: 30px">
		<div class="row">
			<div class="col-md-3" style="margin-right: 20px">

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

			<div class="col-md-8">
				<div
					style="color: blue; font-size: 30px; margin-left: 180px; font-weight: bold;">Below
					are the Users available</div>
				<%
				if (users.size() > 0) {
				%>

				<table class="table" style="float: right;">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">Username</th>
							<th scope="col">Complete Name</th>
							<th scope="col">Email</th>
							<th scope="col">Operation</th>
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
							<td><a href="/delete/<%=users.get(i).getUsername()%>">Delete</a>&nbsp;&nbsp;&nbsp;&nbsp;<a
								href="/update_page/<%=users.get(i).getUsername()%>">Update</a></td>
						</tr>
						<%
						}
						%>

					</tbody>
				</table>
				<%
				} else {
				%>
				No Record Found
				<%
				}
				%>

			</div>
		</div>
	</div>
</body>
</html>