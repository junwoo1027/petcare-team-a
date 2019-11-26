<form action="faqInsert" method="post">
	<div style="clear: both; width: 60%; margin: auto;">
			<div>
				<label>id</label>
				<input type="text" class="form-control" name="userId" value="${sessionScope.member.userId}" readonly/>
			</div>
			<div>
				<label>title</label>
				<input type="text" class="form-control" name="faqTitle" />
			</div>
			<div>
				<label>content</label>
				<textarea class="form-control" name="faqContent" rows="3"></textarea>
			</div>
			<div>
				<input class="btn btn-default" type="submit" value="Edit">
				<div>
					<a class="btn btn-default" href="faqList">FaqList</a>
				</div>
			</div>
	</div>
</form>
<div class="container" style="clear:both; margin:auto;">
<div class="col-md-5">
    <div class="form-area">  
        <form role="form" action="/faq/faqInsert" method="post">
        <br style="clear:both">
                    <h3 style="margin-bottom: 25px; text-align: center;">FaqWriteForm</h3>
                    <div style="display: none;">
						<input type="text" class="form-control" id="name" name="userId" value="${sessionScope.member.userId}" readonly>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="mobile" name="faqTitle" placeholder="Title" required>
					</div>
                    <div class="form-group">
                    <textarea class="form-control" name="faqContent" type="textarea" id="message" placeholder="Content" rows="7"></textarea>
                        <span class="help-block"><p id="characterLeft" class="help-block "></p></span>                    
                    </div>
        <button type="submit" id="submit" name="submit" class="btn btn-primary pull-right">Submit Form</button>
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