<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Update Product</title>
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
				<form method="post" action="updateProduct" id="updateForm">
					<input type="hidden" name="id" value="${product.id}">
					<div class="form-group">
						<label for="category">類別:</label>
						<select class="form-control" name="category">
						<option value="1" ${product.category==1?'selected':''}>1</option>
						<option value="2" ${product.category==2?'selected':''}>2</option>
						<option value="3" ${product.category==3?'selected':''}>3</option>
						<option value="4" ${product.category==4?'selected':''}>4</option>
						<option value="5" ${product.category==5?'selected':''}>5</option>
						</select>
					</div>
<!-- will need this part later
				  	<div class="form-group">
					    <label for="articleCategory.id">分類</label>
				  		<select class="form-control" id="articleCategory.id" name="articleCategory.id">
				  		<c:forEach items="${articleCategoryList}" var="articleCategory">
					  		<option value="${articleCategory.id}" ${article.articleCategory.id==articleCategory.id?'selected':''}>
					  			${articleCategory.name}
				  			</option>
				  		</c:forEach>
						</select>
				  	</div>
-->

					<div class="form-group">
						<label>描述:</label>
						<input type="text" name="desc" placeholder="輸入產品敘述" value="${product.desc}">
						<p class="help-block">產品敘述</p>
					</div>
					<div class="form-group">
						<label>庫存量:</label>
						<input type="number" name="inventory" placeholder="0" value="${product.inventory}">
						<p class="help-block">目前庫存數量</p>
					</div>
					<div class="form-group">
						<label>安全存量:</label>
						<input type="number" name="reorderPoint" placeholder="0" value="${product.reorderPoint}">
						<p class="help-block">當目前庫存數量低於此數字就應該進貨</p>
					</div>
					<button type="submit" class="btn btn-primary">修改</button>
				</form>
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script> 
	<script src="js/jquery.validate.js"></script>
	<script src="js/additional-methods.js"></script>
	<script src="js/messages_zh_TW.js"></script>
	<script>
	$("#updateForm").validate({
		rules:{
			title:"required",
			content:"required"
		}
	});
	</script>
</body>
</html>