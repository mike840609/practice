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
    <link href="blog.css" rel="stylesheet">
    
    <link rel="stylesheet" type="text/css" href="css/wei/modify.css" />
    <!-- 自定義CSS -->
    <style>
    body {
        background: url("css/wei/img/123.jpg");
        
    }
    </style>
</head>
<body>
<%@include file="sa_managernavbar2.jspf" %>
<div class="container1">
	<section id="content">
		<form role="form" action="">
			<h1>考生個人資料</h1>
			<div class="form-group">
                <label for="exampleInputEmail1">帳號</label>
                <input type="text" class="form-control" id="name" name="account" value="${student.account}" readonly>
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">姓名</label>
                <input type="text" class="form-control" id="name" name="name" value="${student.name}" readonly>
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">性別</label>
                <input type="text" class="form-control" id="sex" name="sex" value="${student.sex}" readonly>
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">電子郵件</label>
                <input type="text" class="form-control" id="email" name="email" value="${student.email}" readonly>
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">身分證字號</label>
                <input type="text" class="form-control" id="id" name="id" value="${student.id}" readonly>
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">生日</label>
                <input type="text" class="form-control" id="birthday" name="birth" value="${student.birth}" readonly>
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">電話</label>
                <input type="text" class="form-control" id="phone" name="tel" value="${student.tel}" readonly>
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">住址</label>
                <input type="text" class="form-control" id="address" name="address" value="${student.address}" readonly>
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">學校代碼</label>
                <input type="text" class="form-control" id="school" name="code" value="${student.code}" readonly>
            </div>
		    <div>
				<input type ="button" onclick="history.back()" value="確認"></input>
			</div>
		</form><!-- form -->
	</section><!-- content -->
</div><!-- container -->
</body>
</html>