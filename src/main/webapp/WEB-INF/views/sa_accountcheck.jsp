<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href='http://fonts.googleapis.com/css?family=Arvo'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="css/andy/buttons.css">
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
}

body {
	background: url("css/andy/img/123.jpg");
}

.form-style-10 {
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

}
.form-style-10 input[type="button"]:hover, .form-style-10 input[type="submit"]:hover
	{
	background: #2A6881; */
	-moz-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28); */
	-webkit-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28); */
	box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28);
	*/
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
</style>
</head>

<body>
	<%@include file="sa_navbar.jspf"%>

	<div class="form-style-10 ">
		<h1>
			Sign in <span></span>
		</h1>
		<form action="sa_accountcheck" method="post">
			<div class="section">
				<span>1</span>帳號資料
			</div>
			<div class="inner-wrap">
				<label>帳號 <input type="text" name="account"
					placeholder="Enter account" value="${student.account}" readonly />
				</label> <label>密碼 <input type="text" name="pwd"
					placeholder="Enter password" value="${student.pwd}" readonly />
				</label>
			</div>
			<div class="section">
				<span>2</span>基本資料
			</div>
			<div class="inner-wrap">
				<label>姓名 <input type="text" name="name"
					placeholder="Enter name" value="${student.name}" />
				</label> <label>身分證 <input type="text" name="id"
					placeholder="Enter ID" value="${student.id}" readonly />
				</label> <label>性別</label> <input class="form-control"
					value="${student.sex}" name="sex" readonly> <br> <label>生日
					<input type="date" name="birth" value="${student.birth}" readonly />
				</label>
				<div class="section">
					<span>3</span>聯絡資訊
				</div>
				<br>
				<div class="inner-wrap2">
					<label>電話 <input type="text" name="tel"
						placeholder="Enter tel" value="${student.tel}" readonly />
					</label> <label>Email <input type="email" name="email"
						placeholder="Enter email" value="${student.email}" readonly />
					</label> <label>地址 <input type="text" name="address"
						placeholder="Enter address" value="${student.address}" readonly />
					</label> <input type="checkbox" value="checked">我同意以上條約並確實遵守
					<section class="container">
					<div class="wrapper">
						<!-- <a href="sa_accountcheck" class="button blue"> -->
						<button type="submit" class="button blue"  >
							<!-- <div class="light"></div> -->
							資料正確,送出
						</button>
						</a> <a href="sa_accountregister" class="button orange">
							<div class></div>資料錯誤,須修正
						</a>
					</div>
					</section>
		</form>

		
</body>

</html>