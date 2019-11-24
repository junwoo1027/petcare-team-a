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
<form:form role="form" action="/animal/modify" method="post" modelAttribute="animal">
	
	<input type="hidden" name="ano" value="${animal.ano}">
	<input type="hidden" name='pageNum' value="${cri.pageNum}">
	<input type="hidden" name='amount' value="${cri.amount}">
	
	<div>
		이름 <form:input path="name"  value="${animal.name}"/>
			<form:errors path="name"/>
	</div>
	<div>
		성별 
		<select name="gender" class="gender">
			<option value="수컷">수컷</option>
			<option value="암컷">암컷</option>
			<option value="중성">중성</option>
		</select> 
	</div>
	
	<div>
		몸무게 <form:input path="weight" value="${animal.weight}"/>
				<form:errors path="weight"/>
	</div>
	
	<div>
		종류 <form:input path="type" value="${animal.type}"/>
			<form:errors path="type"/>
	</div>
	
	<div>
		나이 <form:input path="age" value="${animal.age}"/>
			<form:errors path="age"/>
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
			formObj.attr("action", '/animal/remove?ano=${animal.ano}');
		}else if(operation === 'list'){
			formObj.attr("action", "/animal/list").attr("method", "get");
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