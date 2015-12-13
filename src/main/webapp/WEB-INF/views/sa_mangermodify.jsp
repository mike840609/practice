<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link rel="stylesheet" href="css/andy/search.css">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js"></script>
    <script src="js/jquery.color.js"></script>
    <script src="js/script.js"></script>
    
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <link rel="stylesheet" href="css/bootstrap.min.css">
    
    <style>
    body {
        background: url("css/andy/img/123.jpg");
       
        color: #444;
        font: 100%/30px 'Helvetica Neue', helvetica, arial, sans-serif;
        text-shadow: 0 1px 0 #fff;
        margin-top: 100px;
    }
    
    strong {
        font-weight: bold;
    }
    
    em {
        font-style: italic;
    }
    
    table {
        /*border-radius: 50px;*/
        background: #f5f5f5;
        border-collapse: separate;
        box-shadow: inset 0 1px 0 #fff;
        font-size: 12px;
        line-height: 24px;
        margin: 30px auto;
        text-align: left;
        /*width: 1000px;*/
    }
    
    th {
        /*border-radius: 50px;*/
        background: url(http://jackrugile.com/images/misc/noise-diagonal.png), linear-gradient(#777, #444);
        border-left: 1px solid #555;
        border-right: 1px solid #777;
        border-top: 1px solid #555;
        border-bottom: 1px solid #333;
        box-shadow: inset 0 1px 0 #999;
        color: #fff;
        font-weight: bold;
        padding: 10px 15px;
        position: relative;
        text-shadow: 0 1px 0 #000;
        text-align: center;
        /*margin: 0px auto;*/
    }
    
    th:after {
        background: linear-gradient(rgba(255, 255, 255, 0), rgba(255, 255, 255, .08));
        content: '';
        display: block;
        height: 25%;
        left: 0;
        margin: 1px 0 0 0;
        margin: 0px auto;
        position: absolute;
        top: 25%;
        width: 100%;
    }
    
    th:first-child {
        border-left: 1px solid #777;
        box-shadow: inset 1px 1px 0 #999;
    }
    
    th:last-child {
        box-shadow: inset -1px 1px 0 #999;
    }
    
    td {
        /*border-radius: 50px;*/
        border-right: 1px solid #fff;
        border-left: 1px solid #e8e8e8;
        border-top: 1px solid #fff;
        border-bottom: 1px solid #e8e8e8;
        padding: 10px 15px;
        position: relative;
        transition: all 300ms;
    }
    
    td:first-child {
        box-shadow: inset 1px 0 0 #fff;
    }
    
    td:last-child {
        border-right: 1px solid #e8e8e8;
        box-shadow: inset -1px 0 0 #fff;
    }
    
    tr {
        /*border-radius: 50px;*/
        background: url(http://jackrugile.com/images/misc/noise-diagonal.png);
    }
    
    tr:nth-child(odd) td {
        background: #f1f1f1 url(http://jackrugile.com/images/misc/noise-diagonal.png);
    }
    
    tr:last-of-type td {
        box-shadow: inset 0 -1px 0 #fff;
    }
    
    tr:last-of-type td:first-child {
        box-shadow: inset 1px -1px 0 #fff;
    }
    
    tr:last-of-type td:last-child {
        box-shadow: inset -1px -1px 0 #fff;
    }
    
    tbody:hover td {
        color: transparent;
        text-shadow: 0 0 3px #aaa;
    }
    
    tbody:hover tr:hover td {
        color: #444;
        text-shadow: 0 1px 0 #fff;
    }
    /* thead tr {
        display: block;
    }
    
    tbody {
        display: block;
        height: 400px;
        overflow: auto;
    }*/
    /* th {
        width: 300px;
    }
    
    td {
        width: 350px;
    }*/
    
    .select1 {
        /* font-size:14px;*/
        margin-left: 500px;
    }
    /* Base for label styling */
    
    [type="checkbox"]:not(:checked),
    [type="checkbox"]:checked {
        position: absolute;
        left: -9999px;
    }
    
    [type="checkbox"]:not(:checked) + label,
    [type="checkbox"]:checked + label {
        position: relative;
        padding-left: 25px;
        cursor: pointer;
    }
    /* checkbox aspect */
    
    [type="checkbox"]:not(:checked) + label:before,
    [type="checkbox"]:checked + label:before {
        content: '';
        position: absolute;
        left: 0;
        top: 2px;
        width: 17px;
        height: 17px;
        border: 1px solid #aaa;
        background: #f8f8f8;
        border-radius: 3px;
        box-shadow: inset 0 1px 3px rgba(0, 0, 0, .3)
    }
    /* checked mark aspect */
    
    [type="checkbox"]:not(:checked) + label:after,
    [type="checkbox"]:checked + label:after {
        content: '✔';
        position: absolute;
        top: 3px;
        left: 4px;
        font-size: 18px;
        line-height: 0.8;
        color: #09ad7e;
        transition: all .2s;
    }
    /* checked mark aspect changes */
    
    [type="checkbox"]:not(:checked) + label:after {
        opacity: 0;
        transform: scale(0);
    }
    
    [type="checkbox"]:checked + label:after {
        opacity: 1;
        transform: scale(1);
    }
    /* disabled checkbox */
    
    [type="checkbox"]:disabled:not(:checked) + label:before,
    [type="checkbox"]:disabled:checked + label:before {
        box-shadow: none;
        border-color: #bbb;
        background-color: #ddd;
    }
    
    [type="checkbox"]:disabled:checked + label:after {
        color: #999;
    }
    
    [type="checkbox"]:disabled + label {
        color: #aaa;
    }
    /* accessibility */
    
    [type="checkbox"]:checked:focus + label:before,
    [type="checkbox"]:not(:checked):focus + label:before {
        border: 1px dotted blue;
    }
    /* hover style just for information */
    
    label:hover:before {
        border: 1px solid #4778d9!important;
    }
    /* Useless styles, just for demo design */
    
    body {
        font-family: "Open sans", "Segoe UI", "Segoe WP", Helvetica, Arial, sans-serif;
        color: #777;
    }
    
    h1,
    h2 {
        margin-bottom: 5px;
        font-weight: normal;
        text-align: center;
    }
    
    h2 {
        margin: 5px 0 2em;
        color: #aaa;
    }
    
    form {
        width: 80px;
        margin: 0 auto;
    }
    
    .txtcenter {
        margin-top: 4em;
        font-size: .9em;
        text-align: center;
        color: #aaa;
    }
    
    .copy {
        margin-top: 2em;
    }
    
    .copy a {
        text-decoration: none;
        color: #4778d9;
    }
    
    .checkbox1 {
        margin-left: 200px;
    }
    </style>
</head>

<body>
    <div id="container">
        <div id="main">
            <form id="searchForm">
                <fieldset>
                    <div class="input">
                        <input type="text" name="s" id="s" value="輸入學校代碼" />
                    </div>
                    <input type="submit" id="searchSubmit" value="" />
                </fieldset>
            </form>
        </div>
    </div>
    <div class="checkbox1">
        <form action="#">
            <p>
                <input type="checkbox" id="test1" />
                <label for="test1">中低收戶</label>
                <input type="checkbox" id="test2" checked="checked" />
                <label for="test2">低收入戶</label>
                <input type="checkbox" id="test3" checked="checked" disabled="disabled" />
                <label for="test3">未繳費</label>
                <input type="checkbox" id="test4" disabled="disabled" />
                <label for="test4">已繳費</label>
        </form>
    </div>
    <table>
        <thead>
            <tr>
                <th>姓名</th>
                <th>性別</th>
                <th>生日</th>
                <th>身分證</th>
                <th>准考證</th>
                <th>email</th>
                <th>電話</th>
                <th>地址</th>
                <th>考區</th>
                <th>減免身分</th>
                <th>繳費狀況</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><strong>張育瑋</strong></td>
                <td>男</td>
                <td>84.03.28</td>
                <td>A129172193</td>
                <td>A402401149</td>
                <td>a98747590@gamil.com</td>
                <td>0988617380</td>
                <td>新北市新莊區中正路514巷</td>
                <td>非洲</td>
                <td>副二代</td>
                <td>
                    <input type="checkbox" id="test5" />
                    <label for="test5">已繳費</label>
            </tr>
            <tr>
                <td><strong>蔡鈞</strong></td>
                <td>GAY</td>
                <td>84.03.28</td>
                <td>A129172193</td>
                <td>A402401149</td>
                <td>a98747590@gamil.com</td>
                <td>0988617380</td>
                <td>新北市新莊區中正路514巷</td>
                <td>非洲</td>
                <td>智障生全額減免</td>
                <td>繳不起</td>
            </tr>
            <tr>
                <td><strong>黃政耀</strong></td>
                <td>GAY</td>
                <td>84.03.28</td>
                <td>A129172193</td>
                <td>A402401149</td>
                <td>a98747590@gamil.com</td>
                <td>0988617380</td>
                <td>新北市新莊區中正路514巷</td>
                <td>非洲</td>
                <td>中度智障減免70%</td>
                <td>謊報繳費</td>
            </tr>
            <tr>
                <td><strong>張峻瑋</strong></td>
                <td>女</td>
                <td>84.03.28</td>
                <td>A129172193</td>
                <td>A402401149</td>
                <td>a98747590@gamil.com</td>
                <td>0988617380</td>
                <td>新北市新莊區中正路514巷</td>
                <td>非洲</td>
                <td>肢體障礙減免10%</td>
                <td>謊報繳費</td>
            </tr>
            <tr>
                <td><strong>林穎澤</strong></td>
                <td>GAY</td>
                <td>84.03.28</td>
                <td>A129172193</td>
                <td>A402401149</td>
                <td>a98747590@gamil.com</td>
                <td>0988617380</td>
                <td>新北市新莊區中正路514巷</td>
                <td>非洲</td>
                <td>高材生繳三倍</td>
                <td>繳了五次</td>
            </tr>
            <tr>
                <td><strong>黃政耀</strong></td>
                <td>GAY</td>
                <td>84.03.28</td>
                <td>A129172193</td>
                <td>A402401149</td>
                <td>a98747590@gamil.com</td>
                <td>0988617380</td>
                <td>新北市新莊區中正路514巷</td>
                <td>非洲</td>
                <td>中度智障減免70%</td>
                <td>謊報繳費</td>
            </tr>
            <tr>
                <td><strong>黃政耀</strong></td>
                <td>GAY</td>
                <td>84.03.28</td>
                <td>A129172193</td>
                <td>A402401149</td>
                <td>a98747590@gamil.com</td>
                <td>0988617380</td>
                <td>新北市新莊區中正路514巷</td>
                <td>非洲</td>
                <td>中度智障減免70%</td>
                <td>謊報繳費</td>
            </tr>
            <tr>
                <td><strong>黃政耀</strong></td>
                <td>GAY</td>
                <td>84.03.28</td>
                <td>A129172193</td>
                <td>A402401149</td>
                <td>a98747590@gamil.com</td>
                <td>0988617380</td>
                <td>新北市新莊區中正路514巷</td>
                <td>非洲</td>
                <td>中度智障減免70%</td>
                <td>謊報繳費</td>
            </tr>
            <tr>
                <td><strong>黃政耀</strong></td>
                <td>GAY</td>
                <td>84.03.28</td>
                <td>A129172193</td>
                <td>A402401149</td>
                <td>a98747590@gamil.com</td>
                <td>0988617380</td>
                <td>新北市新莊區中正路514巷</td>
                <td>非洲</td>
                <td>中度智障減免70%</td>
                <td>謊報繳費</td>
            </tr>
            <tr>
                <td><strong>黃政耀</strong></td>
                <td>GAY</td>
                <td>84.03.28</td>
                <td>A129172193</td>
                <td>A402401149</td>
                <td>a98747590@gamil.com</td>
                <td>0988617380</td>
                <td>新北市新莊區中正路514巷</td>
                <td>非洲</td>
                <td>中度智障減免70%</td>
                <td>謊報繳費</td>
            </tr>
            <tr>
                <td><strong>黃政耀</strong></td>
                <td>GAY</td>
                <td>84.03.28</td>
                <td>A129172193</td>
                <td>A402401149</td>
                <td>a98747590@gamil.com</td>
                <td>0988617380</td>
                <td>新北市新莊區中正路514巷</td>
                <td>非洲</td>
                <td>中度智障減免70%</td>
                <td>謊報繳費</td>
            </tr>
            <tr>
                <td><strong>黃政耀</strong></td>
                <td>GAY</td>
                <td>84.03.28</td>
                <td>A129172193</td>
                <td>A402401149</td>
                <td>a98747590@gamil.com</td>
                <td>0988617380</td>
                <td>新北市新莊區中正路514巷</td>
                <td>非洲</td>
                <td>中度智障減免70%</td>
                <td>謊報繳費</td>
            </tr>
        </tbody>
    </table>
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
</body>
