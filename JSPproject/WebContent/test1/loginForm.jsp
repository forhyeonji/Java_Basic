<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>


</style>
</head>
<body>
<h1>로그인 하세요</h1>
<form action="loginServer.jsp" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"></td>	
			</tr>
			
			
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw"></td>	
			</tr>
			
			<tr>
				<td><input type="submit" value="로그인"></td>
				<td colspan="2"><a href="member.jsp">회원가입</a></td>
			</tr>
			
<!-- 			<tr>
				<td colspan="2"><a href="memberList.jsp">회원목록</a></td>
			</tr>
			 -->
			
		</table>
</form>
</body>
</html>