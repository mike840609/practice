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
    
    <link rel="stylesheet" type="text/css" href="css/wei/search.css" />
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
            <h1>英聽成績資訊表</h1>
            <div class="form-group">
                <label for="exampleInputEmail1">姓名</label>
                <input type="text" class="form-control" id="name" value="張峻瑋" readonly="">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">準考證號碼</label>
                <input type="text" class="form-control" id="testid" value="402401XXX" readonly="">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">英聽分數</label>
                <input type="text" class="form-control" id="score" value="A" readonly="">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">繳費方式</label>
                <input type="text" class="form-control" id="type" value="ATM轉帳" readonly="">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">繳費金額</label>
                <input type="text" class="form-control" id="money" value="1500" readonly="">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">狀態</label>
                <input type="text" class="form-control" id="state" value="完成" readonly="">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">補助身分別</label>
                <input type="text" class="form-control" id="identity" value="一般考生" readonly="">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">考場代號</label>
                <input type="text" class="form-control" id="code" value="015" readonly="">
            </div>
        </form><!-- form -->
    </section><!-- content -->
</div><!-- container -->
</body>
</html>