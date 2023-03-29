<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/register" class="form" method="POST">
		
		<div class="form-group">
			<label>Username</label>
			<input name="username" class="form-control">
		</div>
	
		<div class="form-group">
			<label>Password</label>
			<input name="password" class="form-control">
		</div>
		
		<div class="form-group">
			<label>Full Name</label>
			<input name="fullName" class="form-control">
		</div>
		
		<div class="form-group">
			<label>Hobbies</label>
			<input type="checkbox" name="hobbies" value="Music">Music
			<input type="checkbox" name="hobbies" value="Reading">Reading Book
		</div>
		
		<div class="form-group">
			<input type="submit" value="Register">
		</div>
		
	</form>
</body>
</html>