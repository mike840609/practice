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
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand " href="#">大考中心報名系統</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse ">
                <div>
                    <ul class="nav navbar-nav">
                        <li><a href="login.html">個人報考</a></li>
                        <li><a href="team.html">團體報考</a></li>
                        <li class="dropdown ">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
               個人中心 
               <b class="caret"></b>
            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#">考生資訊</a></li>
                                <li class="divider"></li>
                                <li><a href="#">成績查詢</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <form class="navbar-form navbar-right" role="form">
                    <div class="form-group">
                        <input type="text" placeholder="ID" class="form-control">
                    </div>
                    <div class="form-group">
                        <input type="password" placeholder="Password" class="form-control">
                    </div>
                    <button type="submit" class="btn btn-success">Sign in</button>
                </form>
            </div>
            <!--/.navbar-collapse -->
        </div>
    </nav>
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