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
<div>
	<div>
	<h3>검색 결과</h3>
		<c:forEach items="${view}" var="list">
			이름: ${list.hospital_name}<br>
			주소: ${list.hospital_address}<br>
			전화번호: ${list.hospital_phone}<br>
			이메일: ${list.hospital_email}<br>
			영업시작: ${list.hospital_open}<br>
			영업마감: ${list.hospital_close}<br>
			야간진료: ${list.hospital_nightcare}<br>
			응급실: ${list.hospital_emergency}<br>
			특수동물: ${list.hospital_special}<br>
			애견호텔: ${list.hospital_hotel}<br>
			종류: ${list.hospital_species}<br>
			사진: ${list.hospital_photo}<br>
			소개: ${list.hospital_intro}<br><br><br>
		</c:forEach>
	</div>
</div>
</body>
</html>