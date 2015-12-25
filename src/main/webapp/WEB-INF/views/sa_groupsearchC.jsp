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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<style>
body {
	padding-top: 90px;
}
</style>
<meta charset='UTF-8'>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/groupcss/style.css">
<link rel="stylesheet" href="css/groupcss/search.css">
<!-- 自定義CSS -->
</head>

<body>
	<%@include file="sa_groupNavbar.jspf" %>
	<div id="page-wrap">
		<b><font size="4" color="3366FF ">輔仁高中 英文聽力測驗 成績</font></b>
		<p></p>
		<li><a href="sa_groupsearch.html">學測成績查詢</a></li>
		<li><a href="sa_groupsearchB.html">指考成績查詢</a></li>
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
				<th>成績等第</th>
			</tr>
			<tr>
				<td>1</td>
				<td>輔仁高中(001)</td>
				<td>林某</td>
				<td>402401000</td>
				<td>A</td>
			</tr>
			<tr>
				<td>2</td>
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
			</tr>
			<tr>
				<td>4</td>
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
			</tr>
		</table>
</body>

</html>
