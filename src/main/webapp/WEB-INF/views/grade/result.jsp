<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>성적표</h1>
	국어 :${gradeVO.kor}<br>
	영어 :${gradeVO.eng}<br>
	수학 :${gradeVO.math}<br>
	총점 :${gradeVO.getTotal()}<br>
	평점 :${gradeVO.avg}<br>
	학점 :${gradeVO.grade}<br>
</body>
</html>