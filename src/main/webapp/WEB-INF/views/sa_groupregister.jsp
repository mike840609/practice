<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
<!-- <meta charset="utf-8"> -->
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>大考中心報名系統</title>
<link rel="stylesheet" href="css/groupcss/buttonR.css">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<!-- 雲端函式庫 -->
<!-- <link href="blog.css" rel="stylesheet">  -->
<style>
body {
	padding-top: 90px;
}
</style>

<!--     <meta charset='UTF-8'> -->

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--  <link rel="stylesheet" href="css/groupcss/style.css">
    <link rel="stylesheet" href="css/groupcss/search.css"> -->

<!-- 自定義CSS -->
</head>

<body>
<body
	background="http://www.skjh.chc.edu.tw/ginnie/%E8%A1%9B%E7%94%9F%E7%B5%84/%E7%B6%B2%E9%A0%81%E5%9C%96%E7%89%87/%E8%83%8C%E6%99%AF%E5%9C%96/1-3%E8%83%8C%E6%99%AF%E5%9C%96.jpg">
	<%@include file="sa_groupNavbar.jspf"%>
	<ul>
		<li class="liactive"><a
			href="https://drive.google.com/file/d/0B3rEsDfGCM4rTlMteS1rSWxwVjA/view?usp=sharing"
			class="round green">Step1<span class="round">Download the
					register file</span></a></li>

		<li class="liactive"><a href="excelSQL" class="round red">Step2<span
				class="round">Upload the register file</span></a></li>
		<li class="liactive"><a href="sa_groupinfo" class="round yellow">Step3<span
				class="round">Check & Search</span></a></li>
	</ul>
	<div class="container">
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-md-6">
				<form role="form">
					<div class="form-group">
						<label for="exampleInputEmail1">照片</label> <label
							for="exampleInputFile">檔案上傳</label> <input type="file"
							id="exampleInputFile">
						<p class="help-block">在此示範區塊層級輔助說明文字。</p>

					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
