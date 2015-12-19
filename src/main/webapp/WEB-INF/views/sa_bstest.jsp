<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    
    <title>學測報名表</title>
    <!-- <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/andy/easy.css" />
  
</head>

<body>
<%@include file="sa_navbar.jspf" %>
	<form action="sa_bstest" class="register" method="post">
		<h1>學測報名表</h1>
		<fieldset class="row1">
			<legend>基本資料 </legend>
			<p>
				<label class="account">帳號: </label> <input type="text"
					value="${account_session.account}" readonly />
			</p>
			<div class="sex">
				<label>性別: </label> <input type="text"
					value="${account_session.sex}" readonly />
			</div>
			<div class="name1">
				<p>
					<label class="name ">姓名: </label> <input type="text"
						value="${account_session.name}" readonly />
				</p>
			</div>
			<label class="date1">生日: </label> <input type="text"
				value="${account_session.birth}" readonly />
			<p>
				<label class="id ">身分證: </label> <input type="text" name="id"
					value="${account_session.id}" readonly />
			</p>
			<!--  -->
		</fieldset>
		<fieldset class="row2">
			<legend>聯絡資訊 </legend>
			<p>
				<label>地址: </label> <input type="text" class="long" name="address"
					value="${account_session.address}" readonly />
			</p>
			<br> <br>
			<p>
				<label>電話: </label> <input type="text" maxlength="10"
					value="${account_session.tel}" readonly />
			</p>
			<p>
				<br> <label>Email </label> <input type="text" maxlength="10"
					value="${account_session.email}" readonly />
			</p>
		</fieldset>
		<fieldset class="row3">
			<legend>考試資訊填寫 </legend>
			<div class="zone" >
				<label>考區: </label>  <select class="form-control" name="testplace">
					<option >北區</option>
					<option >中區</option>
					<option >南區</option>
					<option >東區</option>
				</select>  
				<!-- <input type="text" maxlength="10"
					value=""name="testplace"  />  -->
			</div>
			<p>
			<div class="zone">
				<label>補助身分: </label>  <select class="form-control" name="identity">
					<option >一般生</option>
					<option >低收入戶</option>
					<option>中低收入戶</option>
				</select> 
			
			<!-- 	 <input type="text" maxlength="10"
					value=""name="identity"  />  -->
			</div>
			</p>
			<p>
				<label class="area">特殊備註: </label> <br>
		
				<textarea name="note" style="border: 3px black double;">
                </textarea>
			</p>
		</fieldset>
		<div>
			<button class="button1">Register &raquo;</button>
		</div>
	</form>

</body>

</html>
