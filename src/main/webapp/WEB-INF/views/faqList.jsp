<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<ul>
	<li>
		<c:choose>
			<c:when test="${not empty sessionScope.username}">
				${sessionScope.username}
					<a href="/logout" class="template-btn">logout</a>
			</c:when>
        	<c:otherwise>
                    <a href="/loginForm" class="login">log in</a>
                    <a href="#">sign up</a>
        	</c:otherwise>
        </c:choose>
    </li>
</ul>

<c:choose>
    <c:when test="${not empty sessionScope.username}">
       <h1>${sessionScope.username} 님 환영합니다.</h1>
    </c:when>
    <c:otherwise>
        <h1>로그인해주세요.</h1>
    </c:otherwise>
</c:choose>

<h1>FQA</h1>

<div style="clear: both; width: 100%; margin: auto;">
	<table>
		<tr>
			<td>번호</td>
			<td>아이디</td>
			<td>날짜</td>
			<td>제목</td>
			<td>내용</td>
			<td>삭제</td>		
		<tr>
		<c:forEach items="${faqList}" var="faq">
		<tr>
			<td>${faq.bno}</td>
			<td>${faq.username}</td>
			<td>${faq.regdate}</td>
			<td>
				<a href="view?code=${faq.bno}">${faq.title}</a>
			</td>
			<td>${faq.content}</td>
			<td><a href="delete?code=${faq.bno}">X</a></td>
		<tr>
		</c:forEach>
	</table>
	<a href="faqForm">글작성</a>
</div>
</body>
</html>