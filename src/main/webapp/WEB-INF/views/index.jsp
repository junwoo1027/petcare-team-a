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
</body>
</html>