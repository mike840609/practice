<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/buttons/buttons.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<meta charset="utf-8">
<title>指考報名表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/andy/hard1.css" />
<style>
table {
	width: 50px;
	margin-left: 60px;
}

.text1 {
	font-family: Verdana, Arial, Helvetica, sans-serif;
	margin-left: -40px;
	font-color: #444;
}

.area {
	margin-left: -40px;
}

.area1 {
	margin-left: -10px;
}

.wrapper {
	margin-left: 580px;
	margin-top: -80px;
}
</style>
</head>

<body>
<%@include file="sa_navbar.jspf" %>
	<form action="" class="register">
		<h1>指考報名表</h1>
		<fieldset class="row1">
			<legend>基本資料 </legend>
			<p>
				<label class="account">帳號: </label> <input type="text"
					name="account" />
			</p>
			<div class="sex">
				<label>性別: </label> <select>
					<option value="0">男生</option>
					<option value="1">女生</option>
				</select>
			</div>
			<div class="name1">
				<p>
					<label class="name ">姓名: </label> <input type="text" name="name" value="肥宅小鈞 "readonly/>
				</p>
			</div>
			<label class="date1">生日: </label> <input type="date" name="date" />
			<p>
				<label class="id ">身分證: </label> <input type="text" name="id" />
			</p>
			<!--  -->
		</fieldset>
		<fieldset class="row2">
			<legend>聯絡資訊 </legend>
			<p>
				<label>地址: </label> <input type="text" class="long" />
			</p>
			<br> <br>
			<p>
				<label>電話: </label> <input type="text" maxlength="10" />
			</p>
			<p>
				<br> <label>Email </label> <input type="text" maxlength="10" />
			</p>
		</fieldset>
		<fieldset class="row3">
			<legend>考試資訊填寫 </legend>
			<div class="zone">
				<label>考區: </label> <select>
					<option value="0">北區</option>
					<option value="1">中區</option>
				</select>
			</div>
			<p>
			<div class="zone">
				<label>補助身分: </label> <select>
					<option value="0">一般生</option>
					<option value="1">低收入戶</option>
					<option value="1">中低收入戶</option>
				</select>
			</div>
			<p>
			<div class="text1">
			<label>考科: </label>
			<table>
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
				
					<td><input type="checkbox" value="1" name="Product_1">
					</td>
					<td><input type="checkbox" value="2" name="Product_1">
					</td>
					<td><input type="checkbox" value="3" name="Product_1">
					</td>
					<td><input type="checkbox" value="4" name="Product_1">
					</td>
					<td><input type="checkbox" value="5" name="Product_1">
					</td>
					<td><input type="checkbox" value="6" name="Product_1">
					</td>
					<td><input type="checkbox" value="7" name="Product_1">
					</td>
					<td><input type="checkbox" value="8" name="Product_1">
					</td>
					<td><input type="checkbox" value="9" name="Product_1">
					</td>
					<td><input type="checkbox" value="10" name="Product_1">
					</td>
				</tr>
			</table>
			</div>
			<p>
				<label class="area">特殊備註: </label> <br>
				<textarea class="area1" rows="2" cols="20"
					style="border: 3px black double;">
                        </textarea>
			</p>
		</fieldset>
		<div id="buttonContainer" class="a">
			<div class="wrapper">
				<button type="button" class="button small blue">
					資料送出 
					<button type="button" class="button small orange">
						修改資料 
			</div>
		</div>
	</form>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script
		src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	
</body>

</html>
