<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int x = 99;
response.getWriter().print(x);
%>

<h1>${requestScope.x}</h1>
</body>
</html>