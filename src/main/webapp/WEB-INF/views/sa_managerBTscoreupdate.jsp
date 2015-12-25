<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Update Basic Test</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/jquery.validate.css" rel="stylesheet">
</head>
<body>
<%@include file="sa_managernavbar2.jspf" %>
	<div class="container">
		<div class="row">
			<br>
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<form method="post" action="sa_managerBTscoreupdate" id="updateForm">
					<input type="hidden" name="account" value="${basictest.account}">
					<br><br><br>
					<div class="form-group">
					    <label for="title">目前修改帳號：</label>
						${basictest.account}
				  	</div>
				  	<div class="form-group">
					    <label for="title">國文分數</label>
						<input type="text" class="form-control" id="title" name="chinese" value="${basictest.chinese}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">英文分數</label>
						<input type="text" class="form-control" id="title" name="english" value="${basictest.english}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">數學分數</label>
						<input type="text" class="form-control" id="title" name="math" value="${basictest.math}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">社會分數</label>
						<input type="text" class="form-control" id="title" name="society" value="${basictest.society}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">自然分數</label>
						<input type="text" class="form-control" id="title" name="science" value="${basictest.science}">
				  	</div>
					<button type="submit" class="btn btn-primary">確定修改</button>
				</form>
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script> 
	<script src="js/jquery.validate.js"></script>
	<script src="js/additional-methods.js"></script>
	<script src="js/messages_zh_TW.js"></script>
	<script>
	$("#updateForm").validate({
		rules:{

		}
	});
	</script>
</body>
</html>