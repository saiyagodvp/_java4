<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/Lab2_Remake/tam-giac" method="post">
		<input name="a" value = "${a}"/> <br>
		 <input name="b" value = "${b}"/> <br>
		  <input name="c" value = "${c}"/> <br>
			<button formaction="/Lab2_Remake/dien-tich">Diện Tích</button>
			<button formaction="/Lab2_Remake/chu-vi">Chu Vi</button>
			<button formaction="/Lab2_Remake/2in1">2in1</button>
		<h2>${message}</h2>
		
	</form>
</body>
</html>