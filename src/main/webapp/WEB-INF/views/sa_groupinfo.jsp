<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>團體報考</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<!-- 雲端函式庫 -->
<style>
body {
	padding-top: 90px;
}
</style>

<meta charset='UTF-8'>

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" href="css/groupcss/style.css">

<link rel="stylesheet" href="css/groupcss/button.css">
<!-- 自定義CSS -->
</head>

<body>
	<%@include file="sa_navbar.jspf" %>
	<body>
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

		<p align="right">
			<button>資料有誤 點擊修改</button>
		</p>


		<div class="button">
			<div class="outer">
				<div class="height">
					<div class="inner">Print Page</div>
				</div>
			</div>
		</div>
</body>

</html>
