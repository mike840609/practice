<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>sa_griuoinfo</title>
<meta name="description"
	content="Source code generated using layoutit.com">
<meta name="author" content="LayoutIt!">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">


</head>
</head>

<body>
	<%@include file="sa_groupNavbar.jspf" %>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<h3>校方單位學生資料</h3>
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title">校方學生資料表</h3>
					</div>
					<div class="panel-body">
						團報單位學生資料
						<table class="table table-striped">
							<tr>
								<th>帳號</th>
								<th>密碼</th>
								<th>學校代碼</th>
								<th>身分證</th>
								<th>姓名</th>
								<th>性別</th>
								<th>生日</th>
								<th>電話</th>
								<th>地址</th>
								<th>電子郵件</th>
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
						</table>
					</div>
					<div class="panel-footer">＠mike8406069 copy right</div>
				</div>
			</div>

		</div>
	</div>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>

</html>
