<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link href='<spring:url value="/resources/css/custom.css"/>' rel="stylesheet" />
</head>
<body>
<div>
	<div class="page-title">
		<div>
			<strong>회원가입</strong>
		</div>
	</div>
</div>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="row">
				<div class="col-md-1"></div>
				<div class="col-md-5">
					<div class="classWithPad">
						<a href="/member/normal">
							<img width="300" height="300" src='<spring:url value="/resources/images/join1.png"/>'>
						</a>
					</div>
				</div>
				<div class="col-md-5">
					<div class="classWithPad">
						<a href="/member/hospital">
							<img width="300" height="300" src='<spring:url value="/resources/images/join2.png"/>'>
						</a>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-2"></div>
	</div>
</div>
</body>
</html>