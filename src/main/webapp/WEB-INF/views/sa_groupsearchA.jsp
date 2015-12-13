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
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<!-- 雲端函式庫 -->
<link href="blog.css" rel="stylesheet">
<style>
body {
	padding-top: 90px;
}
</style>

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" href="css/groupcss/style.css">

<link rel="stylesheet" href="css/groupcss/search.css">



<!-- 自定義CSS -->
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
					<li class="dropdown "><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">個人中心 <b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="sa_grouplogin.html">登入</a></li>
							<li class="divider"></li>
							<li><a href="sa_groupinfor.html">考生資訊</a></li>
							<li class="divider"></li>
							<li><a href="sa_groupsearch.html">成績查詢</a></li>
						</ul></li>
				</ul>
				<ul class="nav navbar-nav">
					<li class="dropdown "><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> 團體專區 <b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="sa_grouplogin.html">登入</a></li>
							<li class="divider"></li>
							<li><a href="sa_groupinfor.html">資料查詢</a></li>
							<li class="divider"></li>
							<li><a href="sa_groupsearch.html">成績查詢</a></li>
						</ul></li>
				</ul>
				<ul class="nav navbar-nav">
					<li class="dropdown "><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">管理員操作 <b class="caret"></b>
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

	<div id="page-wrap">
		<b><font size="4" color="3366FF ">輔仁高中 學科能力測驗 成績</font></b>
		<p></p>
		<li><a href="sa_roupsearchB.html">指考成績查詢</a></li>
		<li><a href="sa_groupsearchC.html">英聽成績查詢</a></li>
		<center>
			<section class="webdesigntuts-workshop">
			<form action="" method="">
				<input type="search" placeholder="輸入欲查詢之關鍵字...">
				<button>搜尋</button>
			</form>
			</section>
		</center>
		<p></p>
		<table>

			<tr>
				<th>序列</th>
				<th>報名單位(代碼)</th>
				<th>學生姓名</th>
				<th>准考證號碼</th>
				<th>國文</th>
				<th>英文</th>
				<th>數學</th>
				<th>社會</th>
				<th>自然</th>
				<th>總級分</th>
			</tr>
			<tr>
				<td>1</td>
				<td>輔仁高中(001)</td>
				<td>林某</td>
				<td>402401000</td>
				<td>15</td>
				<td>13</td>
				<td>11</td>
				<td>9</td>
				<td>7</td>
				<td>55</td>
			</tr>
			<tr>
				<td>2</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td>3</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td>4</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td>5</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</table>
</body>

</html>
