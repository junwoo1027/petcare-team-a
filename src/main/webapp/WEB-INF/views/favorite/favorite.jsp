<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Favorite 리스트 페이지

	<form method="get" action="/favorite/delete"> 
		<table border="1">
			<tr>
				<th>Favorite</th>
				<th>User</th>
				<th>Hospital</th>
				<th>삭제<th>
			</tr>
			
			<!-- 병원용 추가하기 -->
			<c:forEach items="${hospitals}" var="hospitals">
				<tr>
					<td>넘버추가</td>
					<td>나야 나</td>
					<td>${hospitals}</td>
					<td><input type="button" value="삭제"></td>
					
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>