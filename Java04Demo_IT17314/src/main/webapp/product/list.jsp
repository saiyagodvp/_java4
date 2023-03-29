<%@page import="com.vn.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%-- <% 
		List<Product> products = (List<Product>) request.getAttribute("listProducts");
		for(Product product : products) {
			response.getWriter().print(product.getName());
		}
	%> --%>
	
	<table>
			<thead>
				<th>Id</th>
				<th>name</th>
				<th>Description</th>
				<th>CreateDate</th>
				<th>Action</th>
			</thead>
			<tbody>
				<c:forEach items="${listProducts}" var="product">
					<tr>
						<td>${product.id}</td>
						<td>${product.name}</td>
						<td>${product.description}</td>
						<td>
							<fmt:formatDate value="${product.createDate}" pattern="dd/MM/yyyy"/>
						</td>
						<td>
							<a href="${pageContext.request.contextPath}/product/edit?id=${product.id}">Edit</a>
							<a href="${pageContext.request.contextPath}/product/delete?id=${product.id}">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
	</table>


</body>
</html>