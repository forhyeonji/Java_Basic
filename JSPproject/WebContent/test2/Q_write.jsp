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
	
#container {
		width:1000px;
		height:1040px;
		margin:0px auto;
		padding-left:5px;
		padding-right:5px;
		position:relative;
	}


	

h1{
	color : rgba(255, 126, 126);
	font-family: 'Gamja Flower', cursive;
}

#title {
	width : 700px;
	height : 22px;
}

textarea {
	width : 700px;
	height : 500px;

}

.But{
	border : 1px solid pink;
	background-color: white;
	color : rgba(255, 126, 126);
	padding : 5px;
}

#header {
	margin : 10px;
	text-align : center;
}

#main {
	width : 705px;
	margin : 0px auto;
}





</style>
</head>
<body>
<div id="container">

<div id="header">
<br><br>
<h1>💗🌼💗  게시글 올리기  💗🌼💗</h1>
<br><br>
</div>


<div id="main">
<form action="Q_writeServer.jsp">
<table>

	<tr>
		<td><input type="text" id="title" name="title" placeholder="제목을 입력하세요."></td>
	</tr>

	<tr>
		<td><textarea placeholder="Input some text." name="content"></textarea></td>
	</tr>
	
	<tr>
		<td>
		<input type="submit" value="등록" class="But">
		<input type="button" value="취소" class="But" onclick="location.href='Q_boardList.jsp'">
		</td>
	</tr>	
</table>

</form>
</div> <!-- main -->

</div> <!-- container -->

</body>
</html>