<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
111 ${login}  222
<h1>게시판 목록입니다</h1>
<input type="button" value="글쓰기" onclick="location.href='http://localhost:8080/write'">

<table border="1">
	<tr>
		<td>게시판번호</td> <td>제목</td> <td>작성일자</td> <td>조회수</td>
	</tr>
	
	<!-- for문 시작 -->
	<c:forEach items="${list}" var="boardlist">
		<tr>
			<td>${boardlist.bno}</td>
			<td><a href="/detail?bno=${boardlist.bno}">${boardlist.title}</a></td>
			<td>${boardlist.regdate}</td>
			<td>${boardlist.cnt}</td>
		</tr>
	</c:forEach>
	<!-- for문 끝 -->


</table>

</body>
</html>