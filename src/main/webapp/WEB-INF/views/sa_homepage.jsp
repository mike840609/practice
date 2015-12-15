<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>大考中心報名系統</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link href="css/blog.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/buttons/buttons.css" />
<!-- 自定義CSS -->
<style>
body {
	background: url("css/img/section_bg.png");
	margin-top: 20px;
}
</style>
</head>

<body>
	<!-- 導入navbar -->
	<%@include file="sa_navbar.jspf" %>
	<!-- Main jumbotron for a primary marketing message or call to action -->
	<div class="jumbotron">
		<section class="features-video section section-on-bg feature-index">
			<div class="container">
				<h1>
					<!-- <em> -->
					大考中心報名系統
					<!-- </em> -->
					<small><h2>
							<p class="p1">Wan Wan Mei Shen Dou</p>
						</h2></small>
				</h1>
				<p>大考中心將三大考試報名彙整成一個頁面,大考中心報名系統會依據當前在線系統切換，變更可按按鈕，而非在線系統報名按鈕則會出現禁止標誌並且無法點選</p>
				<!-- <p><a class="btnCircle" href="#" role="button">詳細資訊 &raquo;</a></p> -->
				<nav>
					<a href="detail.html" class="button small green rounded">詳細資訊</a>
				</nav>
			</div>
		</section>
	</div>
	<div class="container">
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-md-4">
				<h2>學科基本能力測驗報名</h2>
				<p>
				<div class="well note">
					大學學科能力測驗是在中華民國舉行的一種大型考試，用於測驗高中學生是否具備基本的知識以進入台灣各大學就讀。有別於過去的聯考，大學學科能力測驗用於台灣的大學多元入學新方案，只有通過此一標準的考生，才可以參加台灣的｢大學甄選入學｣或｢大學考試分發入學｣。
					</p>
					<p>
						<a class="button small orange" href="sa_bstest" role="button">報名考科
							&raquo;</a>
					</p>
					<!-- <button type="button" class="btn btn-success btn-lg" data-toggle="modal" data-target="#myModal"> -->
				</div>
			</div>
			<div class="col-md-4">
				<h2>指定科目考試報名</h2>
				<p>
				<div class="well note">
					大學入學指定科目考試（Advanced Subjects
					Test），簡稱指定科目考試、指考。為臺灣教育中，大學入學方案中三大考試之一（另兩大為大學學科能力測驗、大學入學術科考試），由財團法人大學入學考試中心基金會舉辦。前身為聯考，自2002年廢除聯考後，開始實施此測驗。.
					</p>
					<!-- <button type="button" class="btn btn-default" disabled="disabled">點我報名</button> -->
					<button type="button" class="button small orange"
						data-toggle="modal" data-target="#myModal">報名考科&raquo;</button>
					<!-- Modal -->
				</div>
			</div>
			<div class="col-md-4">
				<h2>英文聽力測驗報名</h2>
				<p>
				<div class="well note">
					大學入學考試中心高中英語聽力測驗係配合普通高級中學課程綱要之內涵，以適切之題型，針對高中學生英語聽力進行的一項綜合評量。同時，為呼應大學校
					園國際化趨勢，本測驗除著重英語於日常生活中之應用與溝通外，也強調課堂學習相關之英語能力，以期能將所學與世界接軌。
					</p>
					<!-- <button type="button" class="btn btn-default" disabled="disabled">點我報名</button> -->
					<button type="button" class="button small orange"
						data-toggle="modal" data-target="#myModal">報名考科&raquo;</button>
					<!-- Modal -->
				</div>
			</div>
			<nav></nav>
		</div>
		<hr>
		<footer>
			<p>&copy; 萬萬沒想到 2015 / 11 / 19</p>
		</footer>
	</div>
	<!-- /container -->
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script
		src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<!-- 雲端函式庫 -->
	<!-- 提示視窗 -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true ">&times;</span><span class="sr-only">Close</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">不提供考科報名</h4>
				</div>
				<div class="modal-body">此時段並不提供該項考試科目報名,將於系統開放時提供考科報名</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>
</body>

</html>
