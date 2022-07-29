<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="login.js">
</script>


<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Gamja+Flower&display=swap" rel="stylesheet">

<style>

h1{
	color : rgba(255, 126, 126);
	font-family: 'Gamja Flower', cursive;
}

#header {
	margin : 0 auto;
	width : 480px;
	margin-top : 30px;
	margin-bottom : 20px;
	text-align : center;
}


table {
	margin : 0;
	position : absolute;
	left : 870px;
}


td {
	height : 30px;
	text-align : left;
}

	
.But{
	border : 1px solid pink;
	background-color: white;
	color : rgba(255, 126, 126);
	padding : 5px;
}


</style>

</head>
<body>
<div id="header">
	<h1>🎗💖🎗   게시판 이용하기  🎗💖🎗</h1>
	<h1>💟</h1>
	<br>
</div>



	<form action="Q_loginServer.jsp" method="post">
	
		<table>
		<tr>
			<td><input type="text" placeholder="ID" width="200px" name="id" id="id"></td>
			<td id="idmsg"></td>
			
		</tr>
		
		<tr>
			<td><input type="password" placeholder="PASSWORD" width="200px" name="pw" id="pw"></td>
			<td id="pwmsg" width="380px"></td>
			
		</tr>
		
		<tr>
			<td colspan="2">
			<br>
			<input type="submit" value="로그인" class="But" id="login">
			<input type="button" value="회원가입" class="But" onclick="location.href='Q_member.jsp'">
			</td>
		</tr>
		</table>
	
	</form>

</body>
</html>