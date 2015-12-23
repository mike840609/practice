<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Update Assign Test</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/jquery.validate.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row">
			<br>
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<form method="post" action="sa_managerATscoreupdate" id="updateForm">
					<input type="hidden" name="account" value="${assigntest.account}">
					<div class="form-group">
					    <label for="title">目前修改帳號：</label>
						${assigntest.account}
				  	</div>
				  	<div class="form-group">
					    <label for="title">國文分數</label>
						<input type="text" class="form-control" id="title" name="chinese" value="${assigntest.chinese}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">英文分數</label>
						<input type="text" class="form-control" id="title" name="english" value="${assigntest.english}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">數學(甲)分數</label>
						<input type="text" class="form-control" id="title" name="mathA" value="${assigntest.mathA}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">數學(乙)分數</label>
						<input type="text" class="form-control" id="title" name="mathB" value="${assigntest.mathB}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">地理分數</label>
						<input type="text" class="form-control" id="title" name="geography" value="${assigntest.geography}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">歷史分數</label>
						<input type="text" class="form-control" id="title" name="history" value="${assigntest.history}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">公民分數</label>
						<input type="text" class="form-control" id="title" name="civics" value="${assigntest.civics}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">物理分數</label>
						<input type="text" class="form-control" id="title" name="physical" value="${assigntest.physical}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">化學分數</label>
						<input type="text" class="form-control" id="title" name="chemical" value="${assigntest.chemical}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">生物分數</label>
						<input type="text" class="form-control" id="title" name="biology" value="${assigntest.biology}">
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