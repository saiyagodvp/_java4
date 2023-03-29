<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF8">
<title>Login Forms</title>
</head>
<body>

	<form action="${pageContext.request.contextPath}/login" method="post">
		<span>${error_acc}</span>
		<div>
			<label>Username</label>
			<input name="username">
			<span>${error_username}</span>
		</div>
		
		<div>
			<label>Password</label>
			<input type="password" name="password">
			<span>${error_pass}</span>
		</div>
		
		<div>
			<label>Choose System</label>
			<input name="system" type="checkbox" value="HN"> Hà Nội
			<input name="system" type="checkbox" value="HCM"> Hồ chí minh
			<input name="system" type="checkbox" value="DN"> Đà nẵng
		</div>
		
		<div>
			<input type="submit" value="Login">
		</div>
	
	</form>

</body>
</html>