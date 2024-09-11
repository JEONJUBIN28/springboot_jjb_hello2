<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사각형 넓이</h1>
	<form action="/shape/recArea" method="get">
		<input type="text" name="width"><br>
		<input type="text"name="height"><br> 
		<input type="submit" value="전송">
	</form>
	
	<h1>삼각형 넓이</h1>
	<form action="/shape/triArea" method="post">
		<input type="text" name="width"><br> 
		<input type="text" name="height"><br> 
		<input type="submit" value="전송">
	</form>
	
	<h1> 원 넓이 </h1>
	<form action="/shape/circleArea" method="post">
		<input type="text" name="rediuse"><br>
		<input type="submit" value="전송">		
	</form>
	
</body>
</html>