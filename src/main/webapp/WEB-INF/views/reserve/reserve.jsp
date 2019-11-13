<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>병원 예약</title>
    <link rel=" shortcut icon" href="image/favicon.ico">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/fullcalendar/vendor/css/fullcalendar.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/fullcalendar/vendor/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/fullcalendar/vendor/css/select2.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/fullcalendar/vendor/css/bootstrap-datetimepicker.min.css" />
   <!--  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:400,500,600">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons"> -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/fullcalendar/css/main.css">
	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
</head>

<body>

    <div class="container">

        <!-- 일자 클릭시 메뉴오픈 -->
        <div id="contextMenu" class="dropdown clearfix">
            <ul class="dropdown-menu dropNewEvent" role="menu" aria-labelledby="dropdownMenu"
                style="display:block;position:static;margin-bottom:5px;">
                <li><a tabindex="-1" href="#">예약하기</a></li>
                <li class="divider"></li>
                <li><a tabindex="-1" href="#" data-role="close">Close</a></li>
            </ul>
        </div>

        <div id="wrapper">
            <div id="loading"></div>
            <div id="calendar"></div>
        </div>


        <!-- 일정 추가 MODAL -->
        <div class="modal fade" tabindex="-1" role="dialog" id="eventModal">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title"></h4>
                    </div>
                    <div class="modal-body">

                        <div class="row">
                            <div class="col-xs-12">
                                <!-- <label class="col-xs-4" for="edit-allDay">하루종일</label> -->
                                <!-- <input class='allDayNewEvent' id="edit-allDay" type="checkbox"></label> -->
                            </div>
                        </div>

                        <!-- <div class="row">
                            <div class="col-xs-12">
                                <label class="col-xs-4" for="edit-title">진료내용</label>
                                <input class="inputModal" type="text" name="mediContent" id="mediContent"
                                    required="required" />
                            </div>
                        </div> -->
                        <div class="row">
                            <div class="col-xs-12">
                                <label class="col-xs-4" for="edit-start">예약시간(예약은 30분 단위로 가능합니다.)</label>
                                <input class="inputModal" type="text" name="edit-start" id="edit-start" />
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                                <label class="col-xs-4" for="edit-end">끝</label>
                                <input class="inputModal" type="text" name="edit-end" id="edit-end" disabled="disabled"/>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                                <label class="col-xs-4" for="edit-type">진료받으실 반려동물을 선택해주세요</label>
                                <select class="inputModal" type="text" name="petName" id="petName">
                                	<c:forEach items="${userAnims}" var="list" varStatus="status">
                                    	<option value="카테고리1"> ${list}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="row">
                            <!-- <div class="col-xs-12">
                                <label class="col-xs-4" for="edit-color">원장님 성함</label>
                                <select class="inputModal" name="color" id="edit-color">
                                    <option value="#ffa94d" style="color:#ffa94d;">김원장님</option>
                                    <option value="#74c0fc" style="color:#74c0fc;">임원장님</option>
                                </select>
                            </div> -->
                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                                <label class="col-xs-4" for="edit-desc">진료내용</label>
                                <textarea rows="4" cols="50" class="inputModal" name="edit-desc"
                                    id="edit-desc"></textarea>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer modalBtnContainer-addEvent">
                        <button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
                        <button type="button" class="btn btn-primary" id="save-event" onclick="saveOnClick();">저장</button>
                    </div>
                    <div class="modal-footer modalBtnContainer-modifyEvent">
                        <button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
                        <button type="button" class="btn btn-danger" id="deleteEvent">삭제</button>
                        <button type="button" class="btn btn-primary" id="updateEvent">저장</button>
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->

        <div class="panel panel-default">

            <div class="panel-heading">
                <h3 class="panel-title">예약 안내 사항</h3>
            </div>

            <div class="panel-body">

                <div class="col-lg-6">
                    <h1>예약은 30분 단위로 가능합니다.</h1>
                </div>
<!-- 특이사항 메모는 모달창에 -->
               <!--  <div class="col-lg-6">
                    <label for="calendar_view">특이사항 메모</label>
                    <div class="input-group">
                       <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                    </div>
                </div> -->

            </div>
        </div>
        <!-- /.filter panel -->
    </div>
<%@ include file="/WEB-INF/views/commons/CoreJS.jsp" %>
<script type="text/javascript">
$(document).ready(function() {
	console.log("hello")
	var loginUser = "${sessionScope.loginUser.id}";
	var userAnims = "${sessionScope.userAnims}";
	console.log("loginUser : " + loginUser);
	console.log("userAnims : " + userAnims);
	
	
	
	
	
});
function saveOnClick() {
	var id = "${sessionScope.loginUser.id}";
	var rDate = document.getElementById("edit-start").value;
	var hNo = '1'
	var note = document.getElementById("edit-desc").value;
	
	$.ajax({
        type: 'post'
        ,url: '/reserve/insertReserv'
        ,contentType: 'application/json'
        ,data: JSON.stringify({
            'id':id
//            ,'hNo':hNo
           ,'rDate':rDate
//           ,'rTime':rdate	//삭제예정
            ,'note' : note
        })
        ,success: function (data) {
        	alert("성공"+rDate);
            //DB연동시 중복이벤트 방지를 위한
            //$('#calendar').fullCalendar('removeEvents');
            //$('#calendar').fullCalendar('refetchEvents');
        },
        error : function(xhr, ajaxOption, thrownError) {
        	alert(xhr.status);
            alert(thrownError);
        }
    });
}

</script>
</body>
</html>