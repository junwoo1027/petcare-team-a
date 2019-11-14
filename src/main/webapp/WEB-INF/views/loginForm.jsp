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
					<a href="/logout">logout</a>
			</c:when>
        	<c:otherwise>
                    <a href="/loginForm" class="login">log in</a>
                    <a href="#">sign up</a>
        	</c:otherwise>
        </c:choose>
    </li>
</ul>

<section class="container">
    <div class="row">
        <form:form modelAttribute="member" method="post" action="/loginProcess">
            아이디 : <form:input path="username"/>
            비밀번호 : <form:input path="password"/>
            <button type="submit">로그인</button>
        </form:form>
    </div>
</section>

</body>
</html>