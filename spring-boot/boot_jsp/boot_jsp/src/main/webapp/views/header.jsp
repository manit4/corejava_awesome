<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	User loggedInUser = (User) session.getAttribute("loggedInUser");
	%>
	<div>
		<nav class="navbar navbar-expand-lg bg-body-tertiary">
			<div class="container-fluid"
				style="margin-left: 100px; margin-right: 100px">

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li style="margin-right: 50px" class="nav-item"><a
							class="nav-link active" aria-current="page" href="#">Home</a></li>
						<%
						if (loggedInUser != null) {

							if (loggedInUser.getRole().equals("Admin")) {
						%>
						<li style="margin-right: 50px" class="nav-item"><a
							class="nav-link active" aria-current="page" href="/master">Master</a></li>
						<%
						}
						}
						%>
						<li style="margin-right: 50px" class="nav-item"><a
							class="nav-link active" aria-current="page" href="#">TimeSheet</a></li>
						<li style="margin-right: 50px" class="nav-item"><a
							class="nav-link active" aria-current="page" href="#">HR</a></li>
						<li style="margin-right: 50px" class="nav-item"><a
							class="nav-link active" aria-current="page" href="#">Logout</a></li>
					</ul>

				</div>
			</div>
		</nav>
	</div>
</body>
</html>