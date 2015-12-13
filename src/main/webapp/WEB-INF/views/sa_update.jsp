<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>sa_update</title>
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/jquery.validate.css" rel="stylesheet">

</head>
<body>
	<div class="container">
		<div class="row">
			<br>
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<form method="post" action="sa_update" id="updateForm">
					
					<input type="hidden" name="account" value="${student.account}">
					
					<div class="form-group">
						<label>姓名:</label> <input type="text" name="name"
							class="form-control" placeholder="姓名" value="${student.name}" >
					</div>
					
					
					<div class="form-group">
						<label>性別:</label> <select class="form-control" name="sex">
							<option value="男">男</option>
							<option value="女">女</option>
						</select>
					</div>
					
					<div class="form-group">
						<label>身分證:</label> <input type="text" name="id" placeholder="身分證"
							class="form-control" value="${student.id}">	
					</div>
				
				
				
					<div class="form-group">
						<label for="sa_TestPlace.code">分類</label> <select
							class="form-control" id="sa_TestPlace.code"
							name="sa_TestPlace.code">
							<c:forEach items="${sa_TestPlaceList}" var="TestPlaceList">
								<option value="${TestPlaceList.place}"
								<%-- ${student.testPlace.place==sa_TestPlaceList.place?'selected':''} --%>>
									${TestPlaceList.place}</option>
							</c:forEach>
						</select>
					</div>
					
					<div class="form-group">
						<label>生日:</label> <input type="text" name="birth"
							placeholder="生日" class="form-control" value="${student.birth}">
					</div>
					<div class="form-group">
						<label>電話:</label> <input type="text" name="tel"
							placeholder="電話號碼" class="form-control" value="${student.tel}">
						<!-- <p class="help-block">考生電話</p> -->
					</div>
					<div class="form-group">
						<label>住址:</label> <input type="text" name="address"
							placeholder="聯絡地址" class="form-control" value="${student.address}" >
						<!-- <p class="help-block">聯絡地址</p> -->
					</div>
					<div class="form-group">
						<label>E-mail:</label> <input type="email" name="email"
							placeholder="email" class="form-control" value="${student.email}">
						<!-- <p class="help-block">email</p> -->
					</div>
					
				

					<button type="submit" class="btn btn-primary">修改</button>
				</form>
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.validate.js"></script>
	<script src="js/additional-methods.js"></script>
	<script src="js/messages_zh_TW.js"></script>
	<script>
		$("#updateForm").validate({
			rules : {
				/* title : "required",
				content : "required" */
			}
		});
	</script>
</body>
</html>



