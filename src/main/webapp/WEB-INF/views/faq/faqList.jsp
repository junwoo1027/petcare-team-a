<%@ include file="../includes/header.jsp"%>
<div class="container">
<div class="page-header">
    <h1>FAQ</h1>
</div>

<!-- Bootstrap FAQ - START -->
<div class="container">
    <div style="display: none;" class="alert alert-warning alert-dismissible" role="alert">
        <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    </div>
    <c:choose>
			<c:when test="${sessionScope.member.role == 1}">
					<h4 class="panel-title"><a class="panel-title" style="" href="/faqForm">faq Write</a></h4>
			</c:when>
		    <c:otherwise>
		     		<div hidden></div>
		    </c:otherwise>
    </c:choose>
    <br />
    <div class="panel-group" id="accordion">
        <c:forEach items="${faqList}" var="faq">
        <div class="panel panel-default">
        	<div hidden>${faq.faqNo}</div>
            <div class="panel-heading">
                <h4 class="panel-title">
                   	<a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
                   	${faq.faqTitle}
                   	</a>
                   	<c:choose>
						<%-- <c:when test="${not empty sessionScope.member}"> --%>
						<c:when test="${sessionScope.member.role == 1}">
							<a href="faqModify?faqNo=${faq.faqNo}">Edit</a>
						</c:when>
		    			<c:otherwise>
		    				<div hidden></div>
		    			</c:otherwise>
    				</c:choose>
                   	
                </h4>
            </div>
            <div id="collapseOne" class="panel-collapse collapse in">
            	<div hidden>
            		<div>${faq.userId}</div>
            		<div>${faq.faqRegdate}</div>
            	</div>
                <div class="panel-body">
                	${faq.faqContent}
                </div>
            </div>
        </div>
        </c:forEach>
    </div>
</div>

<style>
@import url(//fonts.googleapis.com/earlyaccess/jejugothic.css);
    .faqHeader {
        font-size: 27px;
        margin: 20px;
    }

    .panel-heading [data-toggle="collapse"]:after {
        font-family: 'Glyphicons Halflings';
        content: "\e072"; /* "play" icon */
        float: right;
        color: #F58723;
        font-size: 18px;
        line-height: 22px;
        /* rotate "play" icon from > (right arrow) to down arrow */
        -webkit-transform: rotate(-90deg);
        -moz-transform: rotate(-90deg);
        -ms-transform: rotate(-90deg);
        -o-transform: rotate(-90deg);
        transform: rotate(-90deg);
    }

    .panel-heading [data-toggle="collapse"].collapsed:after {
        /* rotate "play" icon from > (right arrow) to ^ (up arrow) */
        -webkit-transform: rotate(90deg);
        -moz-transform: rotate(90deg);
        -ms-transform: rotate(90deg);
        -o-transform: rotate(90deg);
        transform: rotate(90deg);
        color: #454444;
    }

.btnSubmit{
    font-weight: 600;
    width: 50%;
    color: #282726;
    background-color: #fff;
    border: none;
    border-radius: 1.5rem;
    padding:2%;
}
</style>

<!-- Bootstrap FAQ - END -->

</div>
<%@ include file="../includes/footer.jsp"%>