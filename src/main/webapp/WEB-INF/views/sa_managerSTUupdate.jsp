<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Update Student</title>
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
				<form method="post" action="sa_managerSTUupdate" id="updateForm">
					<input type="hidden" name="account" value="${student.account}">
					<div class="form-group">
					    <label for="title">目前帳號：</label>
						${student.account}
				  	</div>
					<div class="form-group">
					    <label for="title">密碼</label>
						<input type="password" class="form-control" id="title" name="pwd" value="${student.pwd}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">身分證字號</label>
						<input type="text" class="form-control" id="title" name="id" value="${student.id}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">姓名</label>
						<input type="text" class="form-control" id="title" name="name" value="${student.name}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">性別</label>
				  		<select class="form-control" id="title" name="sex" >
					  		<option>男</option>
					  		<option>女</option>
						</select>
				  	</div>
				  	<div class="form-group">
					    <label for="title">生日</label>
						<input type="text" class="form-control" id="title" name="birth" value="${student.birth}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">電話</label>
						<input type="text" class="form-control" id="title" name="tel" value="${student.tel}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">地址</label>
						<input type="text" class="form-control" id="title" name="address" value="${student.address}">
				  	</div>
				  	<div class="form-group">
					    <label for="title">電子信箱</label>
						<input type="text" class="form-control" id="title" name="email" value="${student.email}">
				  	</div>
					<button type="submit" class="btn btn-primary">修改</button>
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
			title:"required",
			content:"required"
		}
	});
	</script>
</body>
</html>