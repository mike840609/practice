<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta charset="utf-8"> -->
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>大考中心報名系統</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link href="blog.css" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="css/wei/search.css" />
<!-- 自定義CSS -->
<style>
body {
	background: url("css/wei/img/123.jpg");
	margin-top:10%;
}
</style>
</head>
<body>
	<%@include file="sa_navbar.jspf" %>
	<div class="container1">
		<section id="content">
		<form role="form" action="">
			<h1>學測成績資訊表</h1>
			<div class="form-group">
				<label for="exampleInputEmail1">姓名</label> <input type="text"
					class="form-control" id="name" value="${account_session.name }" readonly>
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">準考證號碼</label> <input type="text"
					class="form-control" id="testid" value="${sa_BasicTest.testid }" readonly>
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">國文</label> <input type="text"
					class="form-control" id="chinese" value="${sa_BasicTest.chinese }" readonly>
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">英文</label> <input type="text"
					class="form-control" id="english" value="${sa_BasicTest.english }" readonly>
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">數學</label> <input type="text"
					class="form-control" id="math" value="${sa_BasicTest.math }" readonly>
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">社會</label> <input type="text"
					class="form-control" id="society" value="${sa_BasicTest.society }" readonly>
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">自然</label> <input type="text"
					class="form-control" id="science" value="${sa_BasicTest.science }" readonly>
			</div>
		<%-- 	<div class="form-group">
				<label for="exampleInputEmail1">總級分</label> <input type="text"
					class="form-control"  value="${sa_BasicTest.science }" readonly>
			</div> --%>
			<div class="form-group">
				<label for="exampleInputEmail1">繳費方式</label> <input type="text"
					class="form-control" id="type" value="${sa_BasicTest.type }" readonly>
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">繳費金額</label> <input type="text"
					class="form-control" id="money" value="${sa_BasicTest.money }" readonly>
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">狀態</label> <input type="text"
					class="form-control" id="state" value="${sa_BasicTest.state }" readonly>
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">補助身分別</label> <input type="text"
					class="form-control" id="identity" value="${sa_BasicTest.identity }" readonly>
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">考場代號</label> <input type="text"
					class="form-control" id="code" value="${sa_BasicTest.testplace }" readonly>
			</div>
		</form>
		<!-- form --> </section>
		<!-- content -->
	</div>
	<!-- container -->
</body>
</html>