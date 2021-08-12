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
			var id = frm.id.value;
			var newpwd = frm.newpwd.value;
			console.log("id=",id);
			console.log("newpwd=",newpwd);
			frm.action="<c:url value='login_update_start'/>";
			frm.method="post";
			frm.submit();
		}
		//var u_no = update.no.value;	//name 기준
	</script>
</head>
<body style="text-align: center;margin: 50px;">
	<div>
		<!-- <form action="" id = "update"  name="update" onsubmit = "funsubmit();"  method = "post" > enctype="multipart/form-data"-->
		<form action="" id = "update"  name="update">
			아이디 : <input type="text" name="id" id="id" value="${userid}"> <br><br>
			패스워드 : <input type="text" name="newpwd" id="newpwd" value="${userpw}"><br><br>
			<input type="Button" onclick="funsubmit();" value="갱신하기" style="background-color:blue">
			<!-- <input type="submit" value="갱신하기"> -->
		</form>
	</div>
</body>
</html>