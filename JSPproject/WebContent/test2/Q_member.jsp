<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Gamja+Flower&display=swap" rel="stylesheet">

<style>

*{
		margin:0px;
		padding:0px;
	}
	
h1{
	color : rgba(255, 126, 126);
	font-family: 'Gamja Flower', cursive;
}


.But{
	border : 1px solid pink;
	background-color: white;
	color : rgba(255, 126, 126);
	padding : 5px;
}

table {
	margin : 0 auto;
}


td {
	height : 30px;
	text-align : center;
}

#header {
	margin : 0 auto;
	width : 480px;
	margin-top : 30px;
	margin-bottom : 20px;
	text-align : center;
}



</style>


</head>
<body>
<div id="header">
<h1>🌼     회원 가입    🌼</h1><br>
<h2>💟</h2>
</div>

<form action="Q_memberServer.jsp" method="post">

	<table>
	<tr>
		<td><input type="text" placeholder="ID" name="id"></td>
	</tr>
	
	<tr>
		<td><input type="password" placeholder="PASSWORD" name="pw"></td>
	</tr>
	
	<tr>
		<td><input type="text" placeholder="NAME" name="name"></td>
	</tr>
	
	<tr>
		<td>
		<br>
		<input type="submit" value="가입하기" class="But">
		</td>
	</tr>
	</table>

</form>
</body>
</html>