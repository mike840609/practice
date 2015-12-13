<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<style>
.top {
	margin-top: 50px;
	/*color: white*/
}

body {
	/*font-family: DFKai-sb;*/
	background: url("css/img/123.jpg");
}

.form-style-10 {
	/*font-family: DFKai-sb;*/
	/*padding-top:60px;*/
	width: 600px;
	padding: 30px;
	margin: 100px auto;
	background: #FFF;
	border-radius: 10px;
	-webkit-border-radius: 10px;
	-moz-border-radius: 10px;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);
	-moz-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);
	-webkit-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);
}

.form-style-10 .inner-wrap {
	/*font-family: DFKai-sb;*/
	font-size: 15px;
	padding: 30px;
	background: #F8F8F8;
	border-radius: 6px;
	margin-bottom: 15px;
	/*padding-bottom:5px;*/
}

.form-style-10 h1 {
	background: #2A88AD;
	padding: 20px 30px 15px 30px;
	margin: -30px -30px 30px -30px;
	border-radius: 10px 10px 0 0;
	-webkit-border-radius: 10px 10px 0 0;
	-moz-border-radius: 10px 10px 0 0;
	color: #fff;
	text-shadow: 1px 1px 3px rgba(0, 0, 0, 0.12);
	font: normal 30px 'Bitter', serif;
	-moz-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	-webkit-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	border: 1px solid #257C9E;
}

.form-style-10 h1>span {
	display: block;
	margin-top: 2px;
	font: 13px Arial, Helvetica, sans-serif;
}

.form-style-10 label {
	/*font-family: Microsoft JhengHei;*/
	display: block;
	font: 13px Arial, Helvetica, sans-serif;
	color: #888;
	margin-bottom: 15px;
}

.form-style-10 input[type="text"], .form-style-10 input[type="date"],
	.form-style-10 input[type="datetime"], .form-style-10 input[type="email"],
	.form-style-10 input[type="number"], .form-style-10 input[type="search"],
	.form-style-10 input[type="time"], .form-style-10 input[type="url"],
	.form-style-10 input[type="password"], .form-style-10 textarea,
	.form-style-10 select {
	font-family: monospace;
	display: block;
	box-sizing: border-box;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	width: 50%;
	padding: 5px;
	border-radius: 6px;
	-webkit-border-radius: 6px;
	-moz-border-radius: 6px;
	border: 2px solid #fff;
	box-shadow: inset 0px 1px 1px rgba(0, 0, 0, 0.33);
	-moz-box-shadow: inset 0px 1px 1px rgba(0, 0, 0, 0.33);
	-webkit-box-shadow: inset 0px 1px 1px rgba(0, 0, 0, 0.33);
}

.form-style-10 .section {
	/*font-family: DFKai-sb;*/
	font: normal 20px 'Bitter', serif;
	color: #2A88AD;
	margin-bottom: 5px;
}

.form-style-10 .section span {
	background: #2A88AD;
	padding: 5px 10px 5px 10px;
	position: absolute;
	border-radius: 50%;
	-webkit-border-radius: 50%;
	-moz-border-radius: 50%;
	border: 4px solid #fff;
	font-size: 14px;
	margin-left: -45px;
	color: #fff;
	margin-top: -3px;
}

.form-style-10 input[type="button"], .form-style-10 input[type="submit"]
	{
	background: #2A88AD;
	padding: 5px 20px 5px 20px;
	border-radius: 5px;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	color: #fff;
	text-shadow: 1px 1px 3px rgba(0, 0, 0, 0.12);
	font: normal 30px 'Bitter', serif;
	-moz-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	-webkit-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	border: 1px solid #257C9E;
	font-size: 15px;
	margin-top: 35px;
}

.form-style-10 input[type="button"]:hover, .form-style-10 input[type="submit"]:hover
	{
	background: #2A6881;
	-moz-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28);
	-webkit-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28);
	box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28);
}

.form-style-10 .privacy-policy {
	float: right;
	width: 250px;
	font: 12px Arial, Helvetica, sans-serif;
	color: #4D4D4D;
	margin-top: 40px;
	text-align: right;
}

.inner-wrap1 {
	margin-top: 30px;
}

.inner-wrap2 {
	/*margin-left: 10px;*/
	
}
</style>
</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand " href="index.html">大考中心報名系統</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse ">
			<div>
				<ul class="nav navbar-nav">
					<li><a href="login.html">個人報考</a></li>
					<li><a href="team.html">團體報考</a></li>
					<li class="dropdown "><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> 個人中心 <b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="#">考生資訊</a></li>
							<li class="divider"></li>
							<li><a href="#">成績查詢</a></li>
						</ul></li>
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

	</div>
	</nav>

	<div class="form-style-10 ">
		<h1>
			Sign in <span></span>
		</h1>
		<form>
			<div class="section">
				<span>1</span>帳號資料
			</div>
			<div class="inner-wrap">
				<label>帳號 <input type="text" name="field1"
					placeholder="Enter account" />
				</label> <label>密碼 <input type="text" name="field2"
					placeholder="Enter password" />
				</label>
			</div>
			<div class="section">
				<span>2</span>基本資料
			</div>
			<div class="inner-wrap">
				<label>姓名 <input type="text" name="field3"
					placeholder="Enter name" />
				</label> <label>身分證 <input type="text" name="field4"
					placeholder="Enter ID" />
				</label> <label>性別</label> <select class="form-control">
					<option>男</option>
					<option>女</option>
				</select> <br> <label>生日 <input type="date" name="field5" />
				</label>
				<div class="section">
					<span>3</span>聯絡資訊
				</div>
				<br>
				<div class="inner-wrap2">
					<label>電話 <input type="text" name="field6"
						placeholder="Enter tel" />
					</label> <label>Email <input type="email" name="field7"
						placeholder="Enter email" />
					</label> <label>地址 <input type="text" name="field8"
						placeholder="Enter address" />
					</label>
					<div class="button-section"></div>

					<input type="submit" name="Sign Up" />
					
					<input type="checkbox" name="field7">我同意以上條約並確實遵守
		</form>
</body>

</html>
