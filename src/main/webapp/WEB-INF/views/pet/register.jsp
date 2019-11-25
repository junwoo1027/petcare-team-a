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
<form:form action="/pet/register" method="post" modelAttribute="pet">
	<div>
		이름 <form:input path="petName" name="petName"/>
			<form:errors path="petName"/>
	</div>

	<div>
		성별 
		<select name="petGender">
			<option value="수컷">수컷</option>
			<option value="암컷">암컷</option>
		</select> 
	</div>
	
	<div>
		중성화 여부 
		<select name="petNeuter">
			<option value="실시">실시</option>
			<option value="미실시">안했음</option>
		</select> 
	</div>
	
	<div>
		몸무게 <form:input path="petWeight" name="petWeight"/>
			  <form:errors path="petWeight"/>
	</div>
	
	<div>
		종류 <form:input path="petSpecies"/>
			<form:errors path="petSpecies"/>
	</div>

	<div>
		종류 <form:input path="petBreed"/>
			<form:errors path="petBreed"/>
	</div>	
	
	<div>
		나이 <form:input path="petAge"/>
			<form:errors path="petAge"/>
	</div>
	
	<div>
		<input type="hidden" name="userId" value="${login.id}">
	</div>
	
	<div>
	<button type="submit">등록</button>
	<button type="button" onclick="self.location='/pet/list'">취소</button>
	</div>
</form:form>
</body>
</html>