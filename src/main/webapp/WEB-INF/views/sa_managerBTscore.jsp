<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<link rel="stylesheet" href="css/andy/research.css">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js"></script>
<script src="js/jquery.color.js"></script>
<script src="js/script.js"></script>
<meta charset="utf-8">
<meta name="description"
	content="Rolling Rounded Menu with jQuery and CSS3" />
<meta name="keywords"
	content="jquery, css3, rolling, rounded, menu, navigation" />
<!-- <link rel="stylesheet" href="css/buttons.css"> -->
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/research.css">
<style>
body {
	background: url("css/img/123.jpg");
	/*table-layout: fixed;*/
	/*background: #fafafa url(http://jackrugile.com/images/misc/noise-diagonal.png);*/
	color: #444;
	font: 'Helvetica Neue', helvetica, arial, sans-serif;
	/*text-shadow: 0 1px 0 #fff;*/
	margin-top: 100px;
}

strong {
	font-weight: bold;
}

em {
	font-style: italic;
}

table {
	/*border-radius: 50px;*/
	background: #f5f5f5;
	border-collapse: separate;
	box-shadow: inset 0 1px 0 #fff;
	font-size: 12px;
	line-height: 24px;
	margin: 70px auto;
	text-align: left;
}

th {
	/*border-radius: 50px;*/
	background: url(http://jackrugile.com/images/misc/noise-diagonal.png),
		linear-gradient(#777, #444);
	border-left: 1px solid #555;
	border-right: 1px solid #777;
	border-top: 1px solid #555;
	border-bottom: 1px solid #333;
	box-shadow: inset 0 1px 0 #999;
	color: #fff;
	font-weight: bold;
	padding: 10px 15px;
	position: relative;
	text-shadow: 0 1px 0 #000;
	text-align: center;
	/*margin: 0px auto;*/
}

th:after {
	background: linear-gradient(rgba(255, 255, 255, 0),
		rgba(255, 255, 255, .08));
	content: '';
	display: block;
	height: 25%;
	left: 0;
	margin: 1px 0 0 0;
	margin: 0px auto;
	position: absolute;
	top: 25%;
	width: 100%;
}

th:first-child {
	border-left: 1px solid #777;
	box-shadow: inset 1px 1px 0 #999;
}

th:last-child {
	box-shadow: inset -1px 1px 0 #999;
}

td {
	/*border-radius: 50px;*/
	border-right: 1px solid #fff;
	border-left: 1px solid #e8e8e8;
	border-top: 1px solid #fff;
	border-bottom: 1px solid #e8e8e8;
	padding: 10px 15px;
	position: relative;
	transition: all 300ms;
}

td:first-child {
	box-shadow: inset 1px 0 0 #fff;
}

td:last-child {
	border-right: 1px solid #e8e8e8;
	box-shadow: inset -1px 0 0 #fff;
}

tr {
	/*border-radius: 50px;*/
	background: url(http://jackrugile.com/images/misc/noise-diagonal.png);
}

tr:nth-child(odd) td {
	background: #f1f1f1
		url(http://jackrugile.com/images/misc/noise-diagonal.png);
}

tr:last-of-type td {
	box-shadow: inset 0 -1px 0 #fff;
}

tr:last-of-type td:first-child {
	box-shadow: inset 1px -1px 0 #fff;
}

tr:last-of-type td:last-child {
	box-shadow: inset -1px -1px 0 #fff;
}

tbody:hover td {
	color: transparent;
	text-shadow: 0 0 3px #aaa;
}

tbody:hover tr:hover td {
	color: #444;
	text-shadow: 0 1px 0 #fff;
}
</style>
</head>

<body>
<%@include file="sa_managernavbar2.jspf" %>
	<form action="sa_managerBTScoresearch"><div class="container">
		<div class="row">
			<div class="col-md-6">
				<div class="search">
					<input type="text" class="form-control input-sm" maxlength="64"
						name="account" placeholder="請輸入帳號" />
					<button type="submit" class="btn btn-primary btn-sm">帳號</button>
				</div>
				<br>
				<div class="search">
					<input type="text" class="form-control input-sm" maxlength="64"
						name="testid" placeholder="輸入准考證號碼" />
					<button type="submit" class="btn btn-primary btn-sm">准考證號碼</button>
				</div>
				</div>
			</div></form>
			<div class="row">
				<div class="col-md-12">
					<form action="sa_managerBTpayupdate">
	<table>
		<thead>
			<tr>
				<th>帳號</th>
				<th>准考證號碼</th>
				<th>校方代碼</th>
				<th>國文成績</th>
				<th>英文成績</th>
				<th>數學成績</th>
				<th>社會成績</th>
				<th>自然成績</th>
				<th>修改</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${BTscoreList}" var="basictestscore">
			<tr>
				<td><strong><a href="sa_managerSTUmodify?account=${basictestscore.account}">${basictestscore.account}</a></strong></td>
				<td>${basictestscore.testid}</td>
				<td>${basictestscore.code}</td>
				<td>${basictestscore.chinese}</td>
				<td>${basictestscore.english}</td>
				<td>${basictestscore.math}</td>
				<td>${basictestscore.society}</td>
				<td>${basictestscore.science}</td>
				<td><a class="btn btn-default" href="sa_managerBTscoreupdate?account=${basictestscore.account}">修改</a>
			    </td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</form>
				</div>
			</div>
		</div>
</body>


