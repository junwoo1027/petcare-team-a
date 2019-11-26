<%@ include file="../includes/header.jsp"%>
<form action="faqModify">
	<div style="clear: both; width: 60%; margin: auto;">
		<input type="hidden" name="faqNo" value="${faqModify.faqNo}" />
			<div>
				<label>id</label>
				<input type="text" class="form-control" name="userId" value="${sessionScope.member.userId}" readonly />
			</div>
			<div>
				<label>title</label>
				<input type="text" class="form-control" name="faqTitle" value="${faqModify.faqTitle}" />
			</div>
			<div>
				<label>content</label>
				<textarea class="form-control" name="faqContent" rows="3">${faqModify.faqContent}</textarea>
			</div>
			<div>
				<input class="btn btn-default" type="submit" value="update">
				<a class="btn btn-default" href="faqList">faqList</a>
				<a class="btn btn-default" href="faqDelete?faqNo=${faqModify.faqNo}">delete</a>
			</div>
	</div>
</form>
<div class="container">
<div class="col-md-5">
    <div class="form-area">  
        <form role="form" action="modify">
        <br style="clear:both">
        			<input type="hidden" name="faqNo" value="${faqModify.faqNo}" />
                    <h3 style="margin-bottom: 25px; text-align: center;">FaqWriteForm</h3>
                    <div class="form-group">
						<input type="text" class="form-control" id="name" name="userId" value="${sessionScope.member.userId}" readonly>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="mobile" name="faqTitle" value="${faqModify.faqTitle}" placeholder="Title" required>
					</div>
                    <div class="form-group">
                    <textarea class="form-control" name="faqContent" type="textarea" id="message" placeholder="Content" rows="7">
                    ${faqModify.faqContent}
                    </textarea>
                        <span class="help-block">
                        	<p id="characterLeft" class="help-block ">You have reached the limit</p>
                        </span>                    
                    </div>
        <button type="submit" id="submit" name="submit" class="btn btn-primary pull-right">Submit Form</button>
        <a class="btn btn-primary pull-right" href="faqList">faqList</a>
		<a class="btn btn-primary pull-right" href="faqDelete?faqNo=${faqModify.faqNo}">delete</a>
        </form>
    </div>
</div>
</div>
<style>
.red{
    color:red;
    }
.form-area
{
    background-color: #FAFAFA;
	padding: 10px 40px 60px;
	margin: 10px 0px 60px;
	border: 1px solid GREY;
	}
</style>
<%@ include file="../includes/footer.jsp"%>