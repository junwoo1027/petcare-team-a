<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- 부트스트랩 CSS 추가하기 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- nevigator 영역 -->
<nav class="navbar navbar-expand-sm navbar-dark" style="background-color: #199EB8">
	<div id="logo" class="pull-left">
		<a class="navbar-brand" href="/index">zalbazo</a>
	</div>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    	<span class="navbar-toggler-icon"></span>
  	</button>
	<div class="collapse navbar-collapse" id="collapsibleNavbar" style="font-weight: bold;">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/member/login" style="color: #ffc107;">login</a></li>
			<li class="nav-item"><a class="nav-link" href="/member/select" style="color: #ffc107;">sign</a></li>
		</ul>
	</div>
</nav>