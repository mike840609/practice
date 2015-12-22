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
    <%@include file="sa_navbar.jspf" %>
    <div class="wrapper">
        <div class="container">
            <h1><font face="fantasy">Welcome</font></h1>
            <h1><font face="fantasy">Login page for School</font></h1>
            <form class="form" action="sa_grouplogin" method="post">
                <input type="text" placeholder="SchoolCode" class="input1" name ="schoolcode"> 
                <input type="password" placeholder="Password" class="input1" name="pwd">
                
                <button type="submit" id="login-button" class="button1">Login</button>
                
                 <label class="label label-warning">${message}</label> 
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
