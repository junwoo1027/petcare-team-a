<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>반려 동물 정보</h1>
	<div>
		이름 <input type="text" name="name"  value="${animal.name}" readonly="readonly">
	</div>

	<div>
		성별 <input type="text" name="gender" value="${animal.gender}" readonly="readonly">
	</div>
	
	<div>
		몸무게 <input type="text" name="weight" value="${animal.weight}" readonly="readonly">
	</div>
	
	<div>
		종류 <input type="text" name="type" value="${animal.type}" readonly="readonly">
	</div>
	
	<div>
		나이 <input type="text" name="age" value="${animal.age}" readonly="readonly">
	</div>
	
	<div>
		<button data-oper='modify'>수정</button>
		<button data-oper='list'>목록</button>
	</div>
	
	<form id='operForm' action="/animal/modify" method="get">
		<input type="hidden" id='ano' name='ano' value="${animal.ano}">
		<input type='hidden' name='pageNum' value="${cri.pageNum}">
		<input type='hidden' name='amount' value="${cri.amount}">
	</form>

<script>
$(document).ready(function(e){
	var operForm = $("#operForm");
	
	$("button[data-oper='modify']").on("click", function(e){
		operForm.attr("action", "/animal/modify").submit();
	});
	
	$("button[data-oper='list']").on("click", function(e){
		operForm.find("#ano").remove();
		operForm.attr("action", "/animal/list")
		operForm.submit();
	});	
});

</script>
</body>
</html>