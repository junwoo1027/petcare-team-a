<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유저 개인정보</title>
<link href='<spring:url value="/resources/css/custom.css"/>' rel="stylesheet" />
</head>
<body>
<div>
	<div class="page-title">
		<div>
			<strong>유저 개인정보</strong>
		</div>
	</div>
</div>
<div class="container">
	<div class="col-lg-2"></div>
	<div class="col-lg-8">
		<div class="jumbotron" style="padding-top: 20px;">
			<form method="post" action="">
				<div class="form-group">
					<label>아이디</label>
					<input type="text" class="form-control" readonly="readonly" value="${list.userId}">
				</div>
				<div class="form-group">
					<label>비밀번호</label>
					<input type="password" class="form-control" value="${list.userPw}">
				</div>
				<div class="form-group">
					<label>이름</label>
					<input type="text" class="form-control" readonly="readonly" value="${list.userName}">
				</div>
				<div class="form-group">
					<label>이메일</label>
					<input type="email" class="form-control" value="${list.userEmail}">
				</div>
				<div class="form-group">
					<label>전화번호</label>
					<input type="text" class="form-control"  value="${list.userPhone}">
				</div>
				<div class="form-group">
					<label>주소</label>
					<input type="text" class="form-control" value="${list.userAddress}">
				</div>				
				<div class="col text-center">
					<input type="submit" class="btn btn-primary" value="수정">
				</div>
			</form>													
		</div>
	</div>
	<div class="col-lg-2"></div>
</div>
<!--validate JQuery  -->
<script src='<spring:url value="/resources/js/jquery.validate.js"/>'></script>
</body>
</html>