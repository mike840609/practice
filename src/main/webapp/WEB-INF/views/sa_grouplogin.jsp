<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!--     <meta charset="UTF-8"> -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>大考中心報名系統</title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <!-- <title>Calm breeze login screen</title> -->
    <link rel="stylesheet" href="css/groupcss/grouplogin.css">
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
                <a class="navbar-brand " href="index.html">大考中心報名系統</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse ">
                <div>
                    <ul class="nav navbar-nav">
                        <li class="dropdown ">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">個人中心 
                                <b class="caret"></b>
                            </a>
                    <ul class="dropdown-menu">
                                <li><a href="sa_grouplogin.html">登入</a></li>
                                <li class="divider"></li>
                                <li><a href="sa_groupinfor.html">考生資訊</a></li>
                                <li class="divider"></li>
                                <li><a href="sa_groupsearch.html">成績查詢</a></li>
                    </ul>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav">
                    <li class="dropdown ">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
               團體專區 
               <b class="caret"></b>
            </a>
                            <ul class="dropdown-menu">
                                <li><a href="sa_grouplogin.html">登入</a></li>
                                <li class="divider"></li>
                                <li><a href="sa_groupinfor.html">資料查詢</a></li>
                                <li class="divider"></li>
                                <li><a href="sa_groupsearch.html">成績查詢</a></li>
                            </ul>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav">
                        <li class="dropdown ">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">管理員操作 
                                <b class="caret"></b>
                            </a>
                    <ul class="dropdown-menu">
                                <li><a href="#">登入</a></li>
                                <li class="divider"></li>
                                <li><a href="#">管理員查詢</a></li>
                    </ul>
                </div>
                <form class="navbar-form navbar-right" role="form">
                    <div class="form-group">
                        <input type="text" placeholder="ID" class="form-control ">
                    </div>
                    <div class="form-group">
                        <input type="password" placeholder="Password" class="form-control ">
                    </div>
                    <button type="submit" class="btn btn-success">Sign in</button>
                </form>
            </div>
            <!--/.navbar-collapse -->
        </div>
    </nav>
    <div class="wrapper">
        <div class="container">
            <h1><font face="fantasy">Welcome</font></h1>
            <h1><font face="fantasy">Login page for School</font></h1>
            <form class="form">
                <input type="text" placeholder="Username" class="input1"> 
                <input type="password" placeholder="Password" class="input1">
                
                <button type="submit" id="login-button" class="button1">Login</button>
            </form>
        </div>
        <ul class="bg-bubbles">
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
        </ul>
    </div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
    <script src="js/grouplogin.js"></script>
</body>

</html>
