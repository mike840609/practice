<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

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
	<%@include file="sa_groupNavbar.jspf"%>
	<div id="page-wrap">
		<b><font size="4" color="3366FF ">團報 指考 成績</font></b>
		<p></p>
		<li><a href="sa_roupsearchB">學測成績查詢</a></li>
		<li><a href="sa_groupsearchC">英聽成績查詢</a></li>
		<center>
			<section class="webdesigntuts-workshop">
			<form action="sa_groupsearchA" method="post">
				<input type="search" placeholder="輸入欲查詢之關鍵字..." name="account">
				<button type="submit">搜尋</button>
			</form>
			</section>
		</center>
		<p></p>
		<table>

			<tr>
				<th>報名單位(代碼)</th>
				<th>准考證號碼</th>
				<th>考生帳號</th>
				<th>國文</th>
				<th>英文</th>
				<th>數學甲</th>
				<th>數學乙</th>
				<th>歷史</th>
				<th>地理</th>
				<th>公民</th>
				<th>物理</th>
				<th>化學</th>
				<th>生物</th>

				<th>考場</th>

			</tr>
			<c:forEach items="${ATscoreList}" var="ATscoreList">
				<tr>
					<td>${ATscoreList.code}</td>
					<td>${ATscoreList.testid}</td>
					<td>${ATscoreList.account}</td>
					<td>${ATscoreList.chinese}</td>
					<td>${ATscoreList.english}</td>
					<td>${ATscoreList.mathA}</td>
					<td>${ATscoreList.mathB}</td>
					<td>${ATscoreList.history}</td>
					<td>${ATscoreList.geography}</td>
					<td>${ATscoreList.civics}</td>
					<td>${ATscoreList.physical}</td>
					<td>${ATscoreList.chemical}</td>
					<td>${ATscoreList.biology}</td>
					<td>${ATscoreList.testplace}</td>

				</tr>
			</c:forEach>

		</table>
</body>

</html>
