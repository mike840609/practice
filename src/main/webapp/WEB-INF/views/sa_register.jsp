<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>sa_register</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row">
			<br>
			<div class="col-md-12">
	  		 <a class="btn btn-success" href="sa_personInsert">考生報名</a>
	  			
				<table class="table">
				  	<tr>
				  		<th>帳號</th>
				  		<th>准考證號碼</th>
				  		<th>身分證</th>
				  		<th>姓名</th>
				  		<th>性別</th>
				  		<th>生日</th>
				  		<th>電話</th>
				  		<th>住址</th>
				  		<th>Email</th>
				  	</tr>
				  	<c:forEach items="${studentList}" var="student">
					  	<tr>
					  		<td>${student.account}</td>
					  		<td>${student.code}</td>
					  		<td>${student.id}</td>
					  		<td>${student.name}</td>
					  		<td>${student.sex}</td>
					  		<td>${student.birth}</td>
					  		<td>${student.tel}</td>
					  		<td>${student.address}</td>
					  		<td>${student.email}</td>
					  		<td>
					  			<a class="btn btn-default" href="sa_update?account=${student.account}">修改</a>
					  			<a class="btn btn-sm btn-danger deleteBtn" href="#" data-toggle="modal" data-target="#deleteModal" data-id="${student.account}">刪除</a>
					  		 
					  		 </td>
					  	</tr>
				  	</c:forEach>
				</table>
			</div>
		</div>
	</div>
	<div class="modal fade bs-example-modal-sm" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-sm">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">刪除學生資料</h4>
                </div>
                <div class="modal-body">
                    <p>確認刪除後，相關之訊息也將刪除</p>
                </div>
                <div class="modal-footer">
	                <form id="deleteForm" action="deleteStudent" method="post">
	            		<input type="text" name="account" id="deleteID">   <!-- account 對應  -->
	                    
	                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
	                    <button type="submit" class="btn btn-danger">確認刪除</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>    
    <script>
    $(function(){
    	$(".deleteBtn").click(function(){
    		$("#deleteID").val($(this).attr("data-id"));
    	});
    });
    </script>
</body>
</html>