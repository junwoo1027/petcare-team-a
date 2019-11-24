<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>반려 동물 등록</h1>
<form:form action="/animal/register" method="post" modelAttribute="animal">
	<div>
		이름 <form:input path="name" name="name"/>
			<form:errors path="name"/>
	</div>

	<div>
		성별 
		<select name="gender">
			<option value="수컷">수컷</option>
			<option value="암컷">암컷</option>
			<option value="중성">중성</option>
		</select> 
	</div>
	
	<div>
		몸무게 <form:input path="weight" name="weight"/>
			  <form:errors path="weight"/>
	</div>
	
	<div>
		종류 <form:input path="type"/>
			<form:errors path="type"/>
	</div>
	
	<div>
		나이 <form:input path="age"/>
			<form:errors path="age"/>
	</div>
	
	<div>
		<input type="hidden" name="owner" value="${login.id}">
	</div>
	
	<div>
	<button type="submit">등록</button>
	<button type="button" onclick="self.location='/animal/list'">취소</button>
	</div>
</form:form>
</body>
</html>