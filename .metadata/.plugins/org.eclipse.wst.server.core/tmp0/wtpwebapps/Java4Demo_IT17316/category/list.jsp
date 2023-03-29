<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<c:forEach items="${list}" var="category">
			<tr>
				<td>${category.categoryId}</td>
				<td>${category.categoryName}</td>
				<td>
					<a href="${pageContext.request.contextPath}/category/delete?id=${category.categoryId}">Delete</a>
					<a href="">Edit</a>
				</td>
			</tr>
		</c:forEach>
	</table>
		

</body>
</html>