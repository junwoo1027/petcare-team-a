<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유저 회원가입</title>
<link href='<spring:url value="/resources/css/custom.css"/>' rel="stylesheet" />
<script src='<spring:url value="/resources/js/jquery-3.1.1.js"/>'></script>
<script src='<spring:url value="/resources/js/userJoin.js"/>'></script>
</head>
<body>
<div>
	<div class="page-title">
		<div>
			<strong>회원가입</strong>
			<p>회원정보를 입력하여주세요.</p>
		</div>
	</div>
</div>
<div class="row">
	<div class="col-2"></div>
	<form id="userJoin" action="/member/user" method="post" class="col-8">
		<div class="form-group">
		아이디 <input type="text" name="userId" id="userId" placeholder="아이디를 입력하세요." class="form-control"/>
		</div>
		<div class="form-group">
		비밀번호 <input type="password" name="password" id="password" placeholder="비밀번호를 입력하세요." class="form-control"/>
		</div>
		<div class="form-group">
		비밀번호 확인 <input type="password" name="password2" id="password2" placeholder="비밀번호 확인을 입력하세요." class="form-control"/>
		</div>
		<div class="form-group">
		이름<input type="text" name="userName" id="userName" placeholder="이름을 입력하세요." class="form-control" />
		</div>
		<div class="form-group">
		이메일 <input type="email" name="email" id="email" placeholder="이메일을 입력하세요." class="form-control"/>
		</div>
		<div class="form-group">
		전화번호 <input type="text" name="phone" id="phone" placeholder="전화번호를 입력하세요." class="form-control"/>
		</div>
		<div class="form-group">
		주소  <input type="text" name="address" id="address" placeholder="주소를 입력하세요." class="form-control"/>
		</div>
		<div class="col text-center">
			<input type="submit" class="btn btn-primary" value="가입">
		</div>
	</form>
	<div class="col-2"></div>
</div>
</body>
</html>