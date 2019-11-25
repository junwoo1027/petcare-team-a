<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form id="actionForm" action="/appointment/list" method="get">
	<input type='hidden' name='pageNum' value = '${pageMaker.cri.pageNum}'>
	<input type='hidden' name='amount' value = '${pageMaker.cri.amount}'>
</form>

<div>
	<div>
		<h1>예약내역</h1>
	</div>
	
	<div>
		<table border="1">
			<tr>
				<th>예약날짜</th>
				<th>예약시간</th>
				<th>동물이름</th>
				<th>예약아이디</th>
				<th>예약상태</th>
			</tr>
			
			<c:forEach items="${apptLists}" var="apptList">
				<tr>
					<td><fmt:formatDate value="${apptList.apptDate}" pattern="yyyy/MM/dd"/></td>
					<td><fmt:formatDate value="${apptList.apptTime}" pattern="HH:mm"/></td>
					<td>${apptList.petNo}</td>
					<td>${apptList.userId}</td>
					<c:if test="${apptList.apptStatus == 0}">
						<td><a class='move' href='<c:out value="${apptList.apptNo}"/>'>예약완료</a></td>
					</c:if>
					<c:if test="${apptList.apptStatus == 1}">
						<td><a class='move' href='<c:out value="${apptList.apptNo}"/>'>예약취소</a></td>
					</c:if>
				</tr>
			</c:forEach>
		</table>
		
		<div>
			<ul class="page">
				<c:if test="${pageMaker.prev}">
					<li><a href="${pageMaker.startPage -1}">이전</a>
					</li>
				</c:if>
				
				<c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
					<li class="paginate_button ${pageMaker.cri.pageNum == num ? "active":""}">
						<a href="${num}">${num}</a></li>
				</c:forEach>
				
				<c:if test="${pageMaker.next}">
					<li><a href="${pageMaker.endPage + 1}">다음</a></li>
				</c:if>
			</ul>
		</div>
	</div>
</div>
<script>
$(document).ready(function(){
	
	var modify = '<c:out value="${modify}"/>';
	
	checkModify(modify);
	
	history.replaceState({}, null, null); //alert창 중복 방지
	
	function checkModify(modify){
		
		if(modify === '' || history.state){
			return;
		}
		
		alert("예약상태를 수정했습니다.");
	}
	
	var actionForm = $("#actionForm");
	
	$(".paginate_button a").on("click", function(e){
		e.preventDefault();
		
		console.log('click');
		
		actionForm.find("input[name='pageNum']").val($(this).attr("href"));
		actionForm.submit();
	});
	
	$(".move").on("click", function(e){
		e.preventDefault();
		actionForm.append("<input type='hidden' name='apptNo' value='"+ $(this).attr("href")+"'>");
		actionForm.attr("action", "/appointment/modify");
		actionForm.submit();
	});
});
</script>
</body>
</html>