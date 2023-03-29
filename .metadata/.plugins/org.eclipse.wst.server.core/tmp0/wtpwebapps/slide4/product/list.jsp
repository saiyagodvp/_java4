<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="java.util.List"%>
<%@page import="model.Product "%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.8.3/angular.min.js"
	integrity="sha512-KZmyTq3PLx9EZl0RHShHQuXtrvdJ+m35tuOiwlcZfs/rE7NZv29ygNA8SFCkMXTnYZQK2OX0Gm2qKGfvWEtRXA=="
	crossorigin="anonymous" referrerpolicy="no-referrer">
	
</script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.8.3/angular.min.js"
	integrity="sha512-KZmyTq3PLx9EZl0RHShHQuXtrvdJ+m35tuOiwlcZfs/rE7NZv29ygNA8SFCkMXTnYZQK2OX0Gm2qKGfvWEtRXA=="
	crossorigin="anonymous" referrerpolicy="no-referrer">
	
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">
	<%-- <%
		List<Product> products = (List<Product>) request.getAttribute("listproducts");
		for (Product p : products){
			response.getWriter().print(p.getName());
		}
	%> --%>

	<!-- &nbsp -->

	<div class="container">
		<table class="table table-hover  table-striped ">
			<thead>
				<td><h2>ID</h2></td>
				<td><h2>Name</h2></td>
				<td><h2>Description</h2></td>
				<td><h2>Createdate</h2></td>
			</thead>
			<tbody>
				<c:forEach items="${listProducts}" var="p">
					<tr>
						<td class="table-primary">${p.id}</td>
						<td class="table-success">${p.name}</td>
						<td class="table-danger">${p.description}</td>
						<td class="table-warning">
						<fmt:formatDate value="${p.createdate}" pattern="dd-MM-yyyy"/>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>