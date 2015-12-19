<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<title>指考報名表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/andy/hard.css" />
<style>
table {
	width: 50px;
	margin-left: 60px;
}

.text1 {
	font-family: Verdana, Arial, Helvetica, sans-serif;
	margin-left: 28px;
	font-color: #444;
}

.area {
	margin-left: -40px;
}

.area1 {
	margin-left: -10px;
}

</style>
</head>

<body>
<%@include file="sa_navbar.jspf" %>
	<form action="sa_astest" class="register" method="post">
		<h1>指考報名表</h1>
		<fieldset class="row1">
			<legend>基本資料 </legend>
			<p>
				<label class="account">帳號: </label> <input type="text"
					name="account" value="${account_session.account}" readonly />
			</p>
			<div class="sex">
				<label>性別: </label><!--  <select >
					<option >男生</option>
					<option >女生</option>
				</select> -->
				<input type="text"
					value="${account_session.sex}" readonly />
			</div>
			<div class="name1">
				<p>
					<label class="name ">姓名: </label> <input type="text" name="name" value="${account_session.name}" readonly/>
				</p>
			</div>
			<label class="date1">生日: </label> <input type="text"  value="${account_session.birth}" readonly/>
			<p>
				<label class="id ">身分證: </label> <input type="text" name="id" value="${account_session.id}" readonly  />
			</p>
			<!--  -->
		</fieldset>
		<fieldset class="row2">
			<legend>聯絡資訊 </legend>
			<p>
				<label>地址: </label> <input type="text" class="long" value="${account_session.address}" readonly/>
			</p>
			<br> <br>
			<p>
				<label>電話: </label> <input type="text" maxlength="10" value="${account_session.tel}" readonly/>
			</p>
			<p>
				<br> <label>Email </label> <input type="text" maxlength="10" value="${account_session.email}" readonly />
			</p>
		</fieldset>
		<fieldset class="row3">
			<legend>考試資訊填寫 </legend>
			<div class="zone">
				<label>考區: </label> <select class="form-control" name="testplace">
					<option >北區</option>
					<option >中區</option>
					<option >南區</option>
					<option >東區</option>
				</select>
			</div>
			<p>
			<div class="zone">
				<label>補助身分: </label> <select class="form-control" name="identity">
					<option >一般生</option>
					<option >低收入戶</option>
					<option>中低收入戶</option>
				</select> 
			</div>
			<p>
			<div class="text1">考科:</div>
			<label>國文: </label> <select class="form-control" name="chinese">
					<option value="-1">報考</option>
					<option value="-2">不報考</option>
				</select> 
				<label>英文: </label> <select class="form-control" name="english">
				<option value="-1">報考</option>
					<option value="-2">不報考</option>
				</select> 
				<label>數甲: </label> <select class="form-control" name="mathA">
					<option value="-1">報考</option>
					<option value="-2">不報考</option>
				</select> 
				<label>數乙: </label> <select class="form-control" name="mathB">
					<option value="-1">報考</option>
					<option value="-2">不報考</option>
				</select> 
				<label>歷史: </label> <select class="form-control" name="history">
					<option value="-1">報考</option>
					<option value="-2">不報考</option>
				</select> 
				<label>地理: </label> <select class="form-control" name="geography">
				<option value="-1">報考</option>
					<option value="-2">不報考</option>
				</select> 
				<label>公民: </label> <select class="form-control" name="civics">
				<option value="-1">報考</option>
					<option value="-2">不報考</option>
				</select> 
				<label>物理: </label> <select class="form-control" name="physical">
					<option value="-1">報考</option>
					<option value="-2">不報考</option>
				</select> 
				<label>化學: </label> <select class="form-control" name="chemical">
					<option value="-1">報考</option>
					<option value="-2">不報考</option>
				</select> 
				<label>生物: </label> <select class="form-control" name="biology">
					<option value="-1">報考</option>
					<option value="-2">不報考</option>
				</select> 
				
				
			<!-- <table>
				<tr>
					<th>國文</th>
					<th>英文</th>
					<th>數甲</th>
					<th>數乙</th>
					<th>物理</th>
					<th>化學</th>
					<th>生物</th>
					<th>地理</th>
					<th>歷史</th>
					<th>公民</th>
				</tr>
				<tr>
					<td><input type="checkbox" name="subject" value="國文">
					</td>
					<td><input type="checkbox"  name="subject" value="英文">
					</td>
					<td><input type="checkbox"  name="subject" value="數甲">
					</td>
					<td><input type="checkbox"  name="subject" value="數乙">
					</td>
					<td><input type="checkbox"  name="subject" value="物理">
					</td>
					<td><input type="checkbox"  name="subject" value="化學">
					</td>
					<td><input type="checkbox"  name="subject" value="生物">
					</td>
					<td><input type="checkbox"  name="subject" value="地理">
					</td>
					<td><input type="checkbox"  name="subject" value="歷史">
					</td>
					<td><input type="checkbox"  name="subject" value="公民">
					</td>
				</tr>
			</table> -->
			<p>
				<label class="area">特殊備註: </label> <br>
				<textarea class="area1" rows="2" cols="20"
					style="border: 3px black double;">
                        </textarea>
			</p>
		</fieldset>
		<div>
			<button class="button1">Register &raquo;</button>
		</div>
	</form>
	 
</body>

</html>
