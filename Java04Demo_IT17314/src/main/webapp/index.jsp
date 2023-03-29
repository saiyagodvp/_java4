<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">  
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>
	<title>Insert title here</title>
</head>
<body>

	<header>
		<jsp:include page="template/_header.jsp">
			<jsp:param name="name" value="Hang"/>
		</jsp:include>
	</header>

	<a href="login">Login</a>
	
	<span>Xin chao ${ student.name }</span>
	
	<footer>
		<jsp:include page="template/_footer.jsp"/>
	</footer>
</body>
</html>