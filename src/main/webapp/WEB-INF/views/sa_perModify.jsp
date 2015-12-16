<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <link rel="stylesheet" type="text/css" href="css/wei/modify.css" />
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
		<form role="form" action="sa_perModify" method="post">
			<h1>考生個人資料</h1>
            <div class="form-group">
                <label for="exampleInputEmail1">姓名</label>
                <input type="text" class="form-control" id="name" name="name" value="${account_session.name}">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">性別</label>
                <select class="form-control" name="sex">
                    <option>男</option>
                    <option>女</option>
                </select>
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">電子郵件</label>
                <input type="email" class="form-control" id="email" name ="email" value="${account_session.email}">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">身分證</label>
                <input type="text" class="form-control" id="identity" name="id" value="${account_session.id }">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">密碼</label>
                <input type="text" class="form-control" id="password" name ="pwd" value="${account_session.pwd}">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">生日</label>
                <input type="text" class="form-control" id="birthday" name="birth" value="${account_session.birth }">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">電話</label>
                <input type="text" class="form-control" id="phone" name ="tel" value="${account_session.tel}">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">住址</label>
                <input type="text" class="form-control" id="address" name="address" value="${account_session.address }">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">學校代碼</label>
                <input type="text" class="form-control" id="school" name ="code" value="${account_session.code }">
            </div>
		    <div>
				<input type="submit" value="確認修改" />
			</div>
		</form><!-- form -->
	</section><!-- content -->
</div><!-- container -->
</body>
</html>