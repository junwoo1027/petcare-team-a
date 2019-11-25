<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>병원 검색</title>
</head>
<body>
<!-- 검색창 상단, 결과 하단 -->
<!-- Ajax 통신 -->
<div>
	<div>
	<h3>동물병원 목록</h3>
	<form method="get" action="/hospital/search">
		<select>
		  <option value="hospitalName">병원 이름</option>
		  <option value="hospitalAddress">병원 주소</option>
		</select>
		<input type="text" name="text" placeholder="검색어를 입력하세요"><br>
		  <input type="checkbox" name="choice1" value="hospitalNightcare">야간진료
		  <input type="checkbox" name="choice2" value="hospitalEmergency">응급실
		  <input type="checkbox" name="choice3" value="hospitalSpecial">특수동물
		  <input type="checkbox" name="choice4" value="hospitalHotel">애견호텔
		<input type="submit" value="검색">
	</form>
	</div>
	<div>
	<h3>검색 결과</h3>
		<c:forEach items="${list}" var="list">
			${list.hospitalName}<br>
			${list.hospitalAddress}<br>
			${list.hospitalPhone}<br>
			${list.hospitalEmail}<br>
			${list.hospitalOpen}<br>
			${list.hospitalClose}<br>
			${list.hospitalNightcare}<br>
			${list.hospitalEmergency}<br>
			${list.hospitalSpecial}<br>
			${list.hospitalHotel}<br>
			${list.hospitalSpecies}<br>
			${list.hospitalPhoto}<br>
			${list.hospitalIntro}<br>
		</c:forEach>
	</div>
</div>

</body>
</html>