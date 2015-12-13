<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>大考中心報名系統</title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <!-- 雲端函式庫 -->
    <link href="blog.css" rel="stylesheet">
    <style>
    body {
        padding-top: 90px;
    }
    </style>

    <meta charset='UTF-8'>
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link rel="stylesheet" href="css/groupcss/style.css">

    <link rel="stylesheet" href="css/groupcss/button.css" >
    <!-- 自定義CSS -->
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
    <body background="http://www.skjh.chc.edu.tw/ginnie/%E8%A1%9B%E7%94%9F%E7%B5%84/%E7%B6%B2%E9%A0%81%E5%9C%96%E7%89%87/%E8%83%8C%E6%99%AF%E5%9C%96/1-3%E8%83%8C%E6%99%AF%E5%9C%96.jpg">


        <div id="page-wrap">
        <b><font face="微軟正黑體" size="5" color="007799 ">輔仁高中 考試報名資料</font></b>
        <p></p>
    <table>

        <tr>
            <th>序列</th>
            <th>報名單位(代碼)</th>
            <th>學生姓名</th>
            <th>報考項目</th>
            <th>准考證號碼</th>
            <th>出生日期</th>
            <th>試場</th>
            <th>聯絡電話</th>
            <th>聯絡地址</th>
            <th>照片</th>
        </tr>
        <tr>
            <td>1</td>
            <td>輔仁高中(336)</td>
            <td>黃耀政</td>
            <td>學測</td>
            <td>402401000</td>
            <td>1995.08.23</td>
            <td>輔仁大學</td>
            <td>09XXXXXXXX</td>
            <td>新莊市XXXXXXXXXXXXXXXXXXXX</td>
            <td>000.jpg</td>
        </tr>
        <tr>
            <td>2</td>
            <td>輔仁高中(336)</td>
            <td>林澤穎</td>
            <td>學測</td>
            <td>402401001</td>
            <td>1995.02.05</td>
            <td>輔仁大學</td>
            <td>09XXXXXXXX</td>
            <td>新北市XXXXXXXXXXXXXXXXXXXX</td>
            <td>001.jpg</td>
        </tr>
        <tr>
            <td>3</td>
            <td>輔仁高中(336)</td>
            <td>張瑋育</td>
            <td>學測</td>
            <td>402401002</td>
            <td>1995.03.28</td>
            <td>輔仁大學</td>
            <td>09XXXXXXXX</td>
            <td>新莊市XXXXXXXXXXXXXXXXXXXX</td>
            <td>002.jpg</td>
        </tr>
        <tr>
            <td>4</td>
            <td>輔仁高中(336)</td>
            <td>張瑋峻</td>
            <td>學測</td>
            <td>402401003</td>
            <td>1994.11.18</td>
            <td>輔仁大學</td>
            <td>09XXXXXXXX</td>
            <td>台北市XXXXXXXXXXXXXXXXXXXX</td>
            <td>003.jpg</td>
        </tr>
        <tr>
            <td>5</td>
            <td>輔仁高中(336)</td>
            <td>蔡金勻</td>
            <td>學測</td>
            <td>402401004</td>
            <td>1995.06.09</td>
            <td>輔仁大學</td>
            <td>09XXXXXXXX</td>
            <td>新莊市XXXXXXXXXXXXXXXXXXXX</td>
            <td>004.jpg</td>
        </tr>
    </table>
    <p></p>

<p align="right"><button>資料有誤　點擊修改</button></p> 


<div class="button">
<div class="outer">
<div class="height">
<div class="inner">Print Page</div></div></div></div>

</body>

</html>
