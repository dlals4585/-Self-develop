<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>

	<title>[home]</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
    
    <script src="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/css/gijgo.min.css" rel="stylesheet" type="text/css" />
	<script src = "https://code.jquery.com/jquery-3.1.1.min.js"></script>
		
	<script type="text/javascript">
		function popupWindow(url, width1, hight1){
			var left = (screen.width/2) - (width1/2);
			var top = (screen.hight/2) - (hight1/2) - 50;
			return window.open(url, url, 'width='+width1+', height='+hight1+', top='+top+', left='+left);
		}
	</script>
     
</head>
<body style="margin-top: 50px;">
	
	<!-- Modal(== alert) 기능 구현 시 필요 -->
	<%-- <jsp:include page="modal.jsp" /> --%>
	<div style="height:100px;"></div>
	
	
	<div>
  		<c:import url="http://localhost:9090/side_page"></c:import>
  		<!-- <input style="text-color:black" type="button" value = "로그인" onclick="popupWindow('login?host=${param}',410, 450);"/> -->
  		<a href="login_update">회원정보 수정</a>
  		<a href="camplist">캠핑장 지도 test</a>
  		<input type="button" value="캠핑장 지도 test" onclick="popupWindow('camplist',500, 400);">
  		
	</div>
	
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
			<form id = "check_form" action="guestlocation">
				<div class="form-group">
					<label for="sel1">지역</label>
					<select class="form-control" id="sel1" name="g_addr" onchange="progress();">
						<option>선택</option>
						<c:forEach var="list1" items="${list}" varStatus="i">
							<option value="${list1.area_Cd}">${list1.area_Name}</option>
						</c:forEach>
					</select>
				</div>
			</form>
		</div>
	</div>
				
				

	<c:import url="http://localhost:9090/footer"></c:import>
		
	${checked }<br>
	${access_token}<br>
</body>
</html>