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
<link href="blog.css" rel="stylesheet">
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
	<%@include file="sa_navbar.jspf"%>
	<div id="page-wrap">
		<b><font size="4" color="3366FF ">輔仁高中 指定科目考試 成績</font></b>
		<p></p>
		<li><a href="sa_groupsearch.html">學測成績查詢</a></li>
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
				<th>報名單位(代碼)</th>
				<th>學生姓名</th>
				<th>准考證號碼</th>
				<th>國文</th>
				<th>英文</th>
				<th>數甲</th>
				<th>數乙</th>
				<th>地理</th>
				<th>歷史</th>
				<th>公民</th>
				<th>物理</th>
				<th>化學</th>
				<th>生物</th>
				<th>總分</th>
				<th>平均</th>
			</tr>
			<c:forEach items="${students}" var="student">
				<tr>
					<td>${student.account}</td>
					<td>${student.pwd}</td>
					<td>${student.code}</td>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.sex}</td>
					<td>${student.birth}</td>
					<td>${student.tel}</td>
					<td>${student.address}</td>
					<td>${student.email}</td>
				</tr>
			</c:forEach>
			<tr>
				<td>輔仁高中(001)</td>
				<td>林某</td>
				<td>402401000</td>
				<td>30</td>
				<td>70</td>
				<td>無報考</td>
				<td>57</td>
				<td>27</td>
				<td>25</td>
				<td>30</td>
				<td>無報考</td>
				<td>無報考</td>
				<td>無報考</td>
				<td>239</td>
				<td>39.8</td>
			</tr>
		</table>
</body>

</html>
