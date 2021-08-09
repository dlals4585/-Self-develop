<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>

	<title>[main.jsp]</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
    
    <script src="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/css/gijgo.min.css" rel="stylesheet" type="text/css" />
	<script src = "https://code.jquery.com/jquery-3.1.1.min.js"></script>
		
	<script type="text/javascript">	
		
		
	</script>
     
</head>
<body style="margin-top: 50px;">
	
	<!-- Modal(== alert) 기능 구현 시 필요 -->
	<%-- <jsp:include page="modal.jsp" /> --%>

	<!-- 카로셀 시작 -->
	<div class="container" style = "width:80%; position: relative; padding: 0;">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
		    <ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
		    </ol>
	
			<!-- Wrapper for slides -->
			<div class="carousel-inner">
				<div class="item active">
			        <img src="resources/main_images/1.jpg" alt="image1" style="width:100%;height:500px;">
			        <div class="carousel-caption">
						<h3></h3>
						<p></p>
			        </div>
				</div>

				<div class="item">
					<img src="resources/main_images/2.jpg" alt="image2" style="width:100%;height:500px;">
					<div class="carousel-caption">
						<h3></h3>
						<p></p>
		        	</div>
				</div>
		    
				<div class="item">
		        <img src="resources/main_images/3.jpg" alt="image3" style="width:100%;height:500px;">
			        <div class="carousel-caption">
						<h3></h3>
						<p></p>
			        </div>
				</div>
			</div>
	
		    <!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span>
				<span class="sr-only">Previous</span>
		    </a>
		    <a class="right carousel-control" href="#myCarousel" data-slide="next">
				<span class="glyphicon glyphicon-chevron-right"></span>
				<span class="sr-only">Next</span>
		    </a>
		</div>

		<div style="position: absolute; 
					left: 50%; 
					top: 50%;
					transform: translate(-50%,-50%); 
					background-color: white; 
					padding: 20px; 
					border-radius: 20px; 
					text-align: center;">	
					

					
			<!-- 지역 / 체크인 / 체크아웃 검색 창 시작 -->
			<form id = "check_form" action="guestlocation.do">
				<div class="form-group">
					<label for="sel1">지역</label>
					<select class="form-control" id="sel1" name="g_addr" onchange="progress();">
						<option>선택</option>
						<option value="seoul">서울</option>
						<option value="gyeonggi">경기</option>
						<option value="inchun">인천</option>
						<option value="gangwon">강원</option>
						<option value="chungbuk">충북</option>
						<option value="chungnam">충남</option>
						<option value="jeollabuk">전북</option>
						<option value="jeollanam">전남</option>
						<option value="gyeongbuk">경북</option>
						<option value="gyeongnam">경남</option>
						<option value="jeju">제주</option>
					</select>
				</div>
			</form>
		</div>
	</div>
				
				

	<c:import url="http://localhost:9090/footer.do"></c:import>
		
	${checked }<br>
	${access_token}<br>
</body>
</html>