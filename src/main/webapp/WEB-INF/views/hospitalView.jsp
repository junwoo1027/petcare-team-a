<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>병원 보기</title>
</head>
<body>

<div>
	<h1>동물병원 목록</h1>
	<form method="get" action="hospitalsearch">
		<select>
		  <option value="name">병원 이름</option>
		  <option value="address">병원 주소</option>
		</select>
		<input type="text" name="text" placeholder="검색"><br>
		  <input type="checkbox" name="choice1" value="nightcare">야간진료
		  <input type="checkbox" name="choice2" value="emergency">응급실
		  <input type="checkbox" name="choice3" value="special">특수동물
		  <input type="checkbox" name="choice4" value="operation">수술전문
		<input type="submit" value="검색">
	</form>
	
	<ul>
		<c:forEach items="${list}" var="hospital">
			${hospital.hospitalid }<br>
			${hospital.hospitalnum }<br>
			${hospital.opentime }<br>
			${hospital.closetime }<br>
			${hospital.address }<br>
			<c:forEach items="${boolean}">
				${boolean.nightcare }<br>
				${boolean.emergency }<br>
				${boolean.special }<br>
				${boolean.operation }<br>
			</c:forEach>
		</c:forEach>
	</ul>
	
</div>

</body>
</html>