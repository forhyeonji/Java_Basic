<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#title {
width : 353px;
}

textarea {
width : 400px;
height : 250px;
}

</style>

</head>
<body>
<form action="boardServer.jsp">
	<table>
		<tr>
			<td>제목  :  </td>
			<td><input type="text" id="title" name="title"></td>
		</tr>
	
		<tr>
			<td colspan="2"><textarea placeholder="Input some text." name="content"></textarea></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="발행"></td>
			<td><input type="button" value="취소" onclick="location.href='main.jsp'"></td>
		</tr>
	
	</table>
</form>



</body>
</html>