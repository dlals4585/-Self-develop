<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<!DOCTYPE html>
<html>

<head>

	<meta charset="UTF-8">
	<title>[회원 정보 수정]</title>
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	<script type="text/javascript">
		function funsubmit(){		//id 기준
			var frm = document.getElementById("update");  
			var u_no = frm.no.value;
			var u_pwd = frm.pw.value;
			console.log("u_no=",u_no);
			console.log("u_pwd=",u_pwd);
			frm.action="<c:url value='login_update'/>";
			frm.method="post";
			frm.submit();
		}
		//var u_no = update.no.value;							//name 기준
	</script>
	
</head>

<body style="text-align: center;margin: 50px;">
	<div>
		
		<!-- <form action="" id = "update"  name="update" onsubmit = "funsubmit();"  method = "post" > enctype="multipart/form-data"-->
		<form action="" id = "update"  name="update">
			<input type="text" name="no" id="no" value="1">
			<input type="text" name="pw" id="pw" value="qwer1234!">
			<input type="Button" onclick="funsubmit();" value="갱신하기">
			<!-- <input type="submit" value="갱신하기"> -->
		</form>
	</div>
	
</body>
</html>