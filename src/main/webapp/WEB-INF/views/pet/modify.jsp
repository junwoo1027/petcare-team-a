<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>반려 동물 수정</h1>
<form:form role="form" action="/pet/modify" method="post" modelAttribute="pet">
	
	<input type="hidden" name="petNo" value="${pet.petNo}">
	<input type="hidden" name='pageNum' value="${cri.pageNum}">
	<input type="hidden" name='amount' value="${cri.amount}">
	
	<div>
		이름 <form:input path="petName"  value="${pet.petName}"/>
			<form:errors path="petName"/>
	</div>
	<div>
		성별 
		<select name="petGender" class="petGender">
			<option value="수컷">수컷</option>
			<option value="암컷">암컷</option>
		</select> 
	</div>
	
	<div>
		중성화 여부 
		<select name="petNeuter">
			<option value="실시">실시</option>
			<option value="미실시">안했음</option>
		</select> 
	</div>
	
	<div>
		몸무게 <form:input path="petWeight" name="petWeight"/>
			  <form:errors path="petWeight"/>
	</div>
	
	<div>
		종류 <form:input path="petSpecies"/>
			<form:errors path="petSpecies"/>
	</div>

	<div>
		품종 <form:input path="petBreed"/>
			<form:errors path="petBreed"/>
	</div>	
	
	<div>
		나이 <form:input path="petAge"/>
			<form:errors path="petAge"/>
	</div>
	
	<div>
		<button type="submit" data-oper='modify'>수정</button>
		<button type="submit" data-oper='remove'>삭제</button>
		<button type="submit" data-oper='list'>목록</button>
	</div>
</form:form>
<script>
$(document).ready(function(){
	var formObj = $("form");
	
	$('button').on("click", function(e){
		e.preventDefault();
		
		var operation = $(this).data("oper");
		
		if(operation === 'remove'){
			formObj.attr("action", '/pet/remove?petNo=${pet.petNo}');
		}else if(operation === 'list'){
			formObj.attr("action", "/pet/list").attr("method", "get");
			var pageNumTag = $("input[name='pageNum']").clone();
			var amountTag = $("input[name='amount']").clone();
			
			formObj.empty();
			formObj.append(pageNumTag);
			formObj.append(amountTag);
		}
		
		formObj.submit();
	});
	
	/*
	$('.gender').each(function(){

		console.log($(this).val());
		console.log(${animal.gender});
		  
	    if($(this).val()=="${animal.gender}"){
			$(this).attr("selected","selected"); // attr적용안될경우 prop으로 
		}
	});
	*/
});
</script>
</body>
</html>