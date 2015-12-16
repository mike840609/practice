<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link rel="stylesheet" href="css/buttons/buttons.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    
    <title>學測報名表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/andy/easy1.css" />
    <style>
    .wrapper {
        margin-left: 550px;
        margin-top: -25px;
    }
    </style>
</head>

<body>
    <form action="" class="register">
        <h1>學測報名表</h1>
        <fieldset class="row1">
            <legend>基本資料
            </legend>
            <p>
                <label class="account">帳號:
                </label>
                <input type="text" name="account " />
            </p>
           
            <div class="sex ">
                <label >性別:
                </label>
             
                <select>
                    <option value="0 ">男生
                    </option>
                    <option value="1 ">女生
                    </option>
                </select>
                
            </div>
            <div class="name1 ">
                <p>
                    <label class="name ">姓名:
                    </label>
                    <input type="text" name="name" />
                </p>
            </div>
            <label class="date1 ">生日:
            </label>
            <input type="date" name="date " />
            <p>
                <label class="id ">身分證:
                </label>
                <input type="text" name="id " />
            </p>
            <!--  -->
        </fieldset>
        <fieldset class="row2 ">
            <legend>聯絡資訊
            </legend>
            <p>
                <label>地址:
                </label>
                <input type="text" class="long " />
            </p>
            <br>
            <br>
            <p>
                <label>電話:
                </label>
                <input type="text" maxlength="10 " />
            </p>
            <p>
                <br>
                <label>Email
                </label>
                <input type="text" maxlength="10 " />
            </p>
        </fieldset>
        <fieldset class="row3 ">
            <legend>考試資訊填寫
            </legend>
            <div class="zone ">
                <label>考區:
                </label>
                <select>
                    <option value="0 ">北區
                    </option>
                    <option value="1 ">中區
                    </option>
                </select>
            </div>
            <p>
                <div class="zone ">
                    <label>補助身分:
                    </label>
                    <select>
                        <option value="0 ">一般生
                        </option>
                        <option value="1 ">低收入戶
                        </option>
                        <option value="1 ">中低收入戶
                        </option>
                    </select>
                </div>
            </p>
            <p>
                <label class="area ">特殊備註:
                </label>
                <br>
                <textarea class="area1 " rows="2 " cols="20 "  style="border:3px black double; ">
                </textarea>
            </p>
        </fieldset>
        <div id="buttonContainer" class="a">
                    <div class="wrapper">
                        <button type="button" class="button small blue">資料送出</a>
                        <button type="button" class="button small orange">修改資料</a>
                    </div>
                </div>
    </form>
    <nav class="navbar navbar-inverse navbar-fixed-top " role="navigation ">
        <div class="container ">
            <div class="navbar-header ">
                <button type="button " class="navbar-toggle collapsed " data-toggle="collapse " data-target="#navbar " aria-expanded="false " aria-controls="navbar ">
                    <span class="sr-only ">Toggle navigation</span>
                    <span class="icon-bar "></span>
                    <span class="icon-bar "></span>
                    <span class="icon-bar "></span>
                </button>
                <a class="navbar-brand " href="index.html ">大考中心報名系統</a>
            </div>
            <div id="navbar " class="navbar-collapse collapse ">
                <div>
                    <ul class="nav navbar-nav ">
                        <li><a href="login.html ">個人報考</a></li>
                        <li><a href="team.html ">團體報考</a></li>
                        <li class="dropdown ">
                            <a href="# " class="dropdown-toggle " data-toggle="dropdown ">
               個人中心 
               <b class="caret "></b>
            </a>
                            <ul class="dropdown-menu ">
                                <li><a href="# ">考生資訊</a></li>
                                <li class="divider "></li>
                                <li><a href="# ">成績查詢</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <form class="navbar-form navbar-right " role="form ">
                    <div class="form-group ">
                        <input type="text " placeholder="ID " class="form-control ">
                    </div>
                    <div class="form-group ">
                        <input type="password " placeholder="Password " class="form-control ">
                    </div>
                    <button type="submit " class="btn btn-success ">Sign in</button>
                </form>
            </div>
            <!--/.navbar-collapse -->
        </div>
    </nav>
</body>

</html>
