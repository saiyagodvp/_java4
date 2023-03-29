<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<header>
		<jsp:include page="template/_header.jsp">
			<jsp:param name="phone" value="+84987654"/>
		</jsp:include>
	</header>

	
	
	<p>full name ${fName}</p>
	<p>xin chao ${student.id} ${student.name}</p>
	
	<footer>
		<jsp:include page="template/_footer.jsp"/>
	</footer>
	
</body>
</html>