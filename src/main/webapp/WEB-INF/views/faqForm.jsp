<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="insert" method="post">
		<div style="clear: both; width: 100%; margin: auto;">
				<div>
					<label>id</label>
					<p>${view.id}</p>
				</div>
				<div>
					<label>title</label>
					<p>${view.title}</p>
				</div>
				<div>
					<label>content</label>
					<p>${view.content}</p>
				</div>
				<div>
					<a class="btn btn-default" href="modify_view?code=${view.code}">수정</a>
					<a class="btn btn-default" href="list">목록보기</a>
					<a class="btn btn-default" href="delete?code=${view.code}">삭제</a>
					<a class="btn btn-default" href="reply_view?code=${view.code}">답변</a>
				</div>
		</div>
			
</form>
	
</body>
</html>