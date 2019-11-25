<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유저 회원가입</title>
<link href='<spring:url value="/resources/css/custom.css"/>' rel="stylesheet" />
<script src='<spring:url value="/resources/js/user/userJoin.js"/>'></script>
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
<div class="container">
	<div class="col-lg-2"></div>
	<div class="col-lg-8">
		<div class="jumbotron" style="padding-top: 20px;">
			<form id="userJoin" action="/member/user" method="post" class="col-8">
				<div class="form-group">
				아이디 <input type="text" name="userId" id="userId" placeholder="아이디를 입력하세요." class="form-control"/>
				</div>
				<div class="form-group">
				비밀번호 <input type="password" name="userPw" id="userPw" placeholder="비밀번호를 입력하세요." class="form-control"/>
				</div>
				<div class="form-group">
				비밀번호 확인 <input type="password" name="password2" id="password2" placeholder="비밀번호 확인을 입력하세요." class="form-control"/>
				</div>
				<div class="form-group">
				이름<input type="text" name="userName" id="userName" placeholder="이름을 입력하세요." class="form-control" />
				</div>
				<div class="form-group">
				이메일 <input type="email" name="userEmail" id="userEmail" placeholder="이메일을 입력하세요." class="form-control"/>
				</div>
				<div class="form-group">
				전화번호 <input type="text" name="userPhone" id="userPhone" placeholder="전화번호를 입력하세요." class="form-control"/>
				</div>
				<div class="form-group">
				주소  <input type="text" name="userAddress" id="userAddress" placeholder="주소를 입력하세요." class="form-control"/>
				</div>
				<div class="col text-center">
					<input type="submit" class="btn btn-primary" value="가입">
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