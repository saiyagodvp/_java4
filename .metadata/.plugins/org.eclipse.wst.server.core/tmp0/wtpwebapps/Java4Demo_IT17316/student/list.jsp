<%@page import="com.vn.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach items="${studentList}" var="st">
		<p>${st.name}</p>
	</c:forEach>

</body>
</html>