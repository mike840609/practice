<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>大考中心報名系統</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- <link href="blog.css" rel="stylesheet"> -->
<link rel="stylesheet" type="text/css" href="css/buttons/buttons.css" />
<link rel="stylesheet" type="text/css" href="css/wei/search.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<!-- 自定義CSS -->
<style>
body {
	background: url("css/wei/img/123.jpg");
}
</style>
</head>
<body>
<%@include file="sa_navbar.jspf" %>
	<div class="container1">
		<section id="content">
			<form role="form" action="">
				<h1>考生個人資料</h1>
				<div class="form-group">
					<label for="exampleInputEmail1">姓名</label> <input type="text"
						class="form-control" id="name" value="${account_session.name}"
						readonly>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">性別</label> <input type="text"
						class="form-control" id="sex" value="${account_session.sex}"
						readonly>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">電子郵件</label> <input type="email"
						class="form-control" id="email" value="${account_session.email}"
						readonly>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">身分證</label> <input type="text"
						class="form-control" id="identity" value="${account_session.id}"
						readonly>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">密碼</label> <input type="password"
						class="form-control" id="identity" value="${account_session.pwd}"
						readonly>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">生日</label> <input type="text"
						class="form-control" id="birthday"
						value="${account_session.birth}" readonly>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">電話</label> <input type="text"
						class="form-control" id="phone" value="${account_session.tel}"
						readonly>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">住址</label> <input type="text"
						class="form-control" id="address"
						value="${account_session.address}" readonly>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">學校代碼</label> <input type="text"
						class="form-control" id="school" value="015" readonly>
				</div>
				
					<!-- <input type="submit"  value="修改"/>  -->
					<a href="sa_perModify" class="button small blue rounded">修改</a>
			</form>
			<!-- form -->

		</section>
		<!-- content -->
	</div>
	<!-- container -->
</body>
</html>