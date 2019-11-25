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
		이름 <input type="text" name="petName"  value="${pet.petName}" readonly="readonly">
	</div>

	<div>
		성별 <input type="text" name="petGender" value="${pet.petGender}" readonly="readonly">
	</div>

	<div>
		중성화 여부 <input type="text" name="petNeuter" value="${pet.petNeuter}" readonly="readonly">
	</div>
		
	<div>
		몸무게 <input type="text" name="petWeight" value="${pet.petWeight}" readonly="readonly">
	</div>
	
	<div>
		종류 <input type="text" name="petSpecies" value="${pet.petSpecies}" readonly="readonly">
	</div>
	
	<div>
		품종 <input type="text" name="petBreed" value="${pet.petBreed}" readonly="readonly">
	</div>
	
	<div>
		나이 <input type="text" name="petAge" value="${pet.petAge}" readonly="readonly">
	</div>
	
	<div>
		<button data-oper='modify'>수정</button>
		<button data-oper='list'>목록</button>
	</div>
	
	<form id='operForm' action="/petl/modify" method="get">
		<input type="hidden" id='petNo' name='petNo' value="${pet.petNo}">
		<input type='hidden' name='pageNum' value="${cri.pageNum}">
		<input type='hidden' name='amount' value="${cri.amount}">
	</form>

<script>
$(document).ready(function(e){
	var operForm = $("#operForm");
	
	$("button[data-oper='modify']").on("click", function(e){
		operForm.attr("action", "/pet/modify").submit();
	});
	
	$("button[data-oper='list']").on("click", function(e){
		operForm.find("#petNo").remove();
		operForm.attr("action", "/pet/list")
		operForm.submit();
	});	
});

</script>
</body>
</html>