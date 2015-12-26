<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<meta charset='UTF-8'>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/groupcss/style.css">
<link rel="stylesheet" href="css/groupcss/search.css">
<!-- 自定義CSS -->
</head>

<body>
	<%@include file="sa_groupNavbar.jspf"%>
	<div id="page-wrap">
		<b><font size="4" color="3366FF ">輔仁高中 英文聽力測驗 成績</font></b>
		<p></p>
		<li><a href="sa_groupsearch.html">學測成績查詢</a></li>
		<li><a href="sa_groupsearchB.html">指考成績查詢</a></li>
		<center>
			<section class="webdesigntuts-workshop">
			<form action="sa_groupsearchC" method="post">
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
				<th>成績等第</th>
				<th>考場</th>
			</tr>
			<c:forEach items="${englishListenings}" var="englishListenings">
				<tr>
					<td>${englishListenings.code}</td>
					<td>${englishListenings.testid}</td>
					<td>${englishListenings.account}</td>
					<td>${englishListenings.score}</td>
					<td>${englishListenings.testplace}</td>
				</tr>
			</c:forEach>
			
		</table>
</body>

</html>
