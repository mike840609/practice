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
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/groupcss/style.css">
<link rel="stylesheet" href="css/groupcss/search.css">
<!-- 自定義CSS -->
</head>
<body>
	<%@include file="sa_groupNavbar.jspf"%>
	<div id="page-wrap">
		<b><font size="4" color="3366FF ">團報 學測 成績</font></b>
		<p></p>
		<li><a href="sa_groupsearch.html">指考成績查詢</a></li>
		<li><a href="sa_groupsearchC.html">英聽成績查詢</a></li>
		<center>
			<section class="webdesigntuts-workshop">
			<form action="sa_groupsearchB" method="post">
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
				<th>數學</th>
				<th>自然</th>
				<th>社會</th>
				
				<th>考場</th>

			</tr>
			<c:forEach items="${basicTests}" var="basicTests">
				<tr>
					<td>${basicTests.code}</td>
					<td>${basicTests.testid}</td>
					<td>${basicTests.account}</td>
					<td>${basicTests.chinese}</td>
					<td>${basicTests.english}</td>
					<td>${basicTests.math}</td>
					<td>${basicTests.science}</td>
					<td>${basicTests.society}</td>
					<td>${basicTests.testplace}</td>
					
				</tr>
			</c:forEach> 

		</table>
</body>

</html>
