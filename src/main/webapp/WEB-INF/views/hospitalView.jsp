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
<!-- 지도 -->
<!-- 예약하기, 즐겨찾기 버튼 -->
<!-- 리뷰 붙이기 -->
	<ul>
		<c:forEach items="${view}" var="list">
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
	</ul>
</body>
</html>