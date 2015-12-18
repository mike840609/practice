<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>大考中心報名系統</title>
<link rel="stylesheet" href="css/bootstrap.min.css">

<link rel="stylesheet" type="text/css" href="css/wei/search.css" />
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
			<h1>英聽成績資訊表</h1>
			<div class="form-group">
				<label for="exampleInputEmail1">姓名</label> <input type="text"
					class="form-control" id="name" value="張峻瑋" readonly="">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">準考證號碼</label> <input type="text"
					class="form-control" id="testid" value="402401XXX" readonly="">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">英聽分數</label> <input type="text"
					class="form-control" id="score" value="A" readonly="">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">繳費方式</label> <input type="text"
					class="form-control" id="type" value="ATM轉帳" readonly="">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">繳費金額</label> <input type="text"
					class="form-control" id="money" value="1500" readonly="">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">狀態</label> <input type="text"
					class="form-control" id="state" value="完成" readonly="">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">補助身分別</label> <input type="text"
					class="form-control" id="identity" value="一般考生" readonly="">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">考場代號</label> <input type="text"
					class="form-control" id="code" value="015" readonly="">
			</div>
		</form>
		<!-- form --> </section>
		<!-- content -->
	</div>
	<!-- container -->
</body>
</html>