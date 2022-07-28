<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.write {
	margin:10px;
}

#fixed_title {
	background-color:powderblue;
}

.But{
	border : 1px solid skyblue;
	background-color: white;
	color : skyblue;
	padding : 5px;
	
}

#logout{

	position:absolute;
	left : 780px;
} 

</style>
</head>
<body>

		<%if(session.getAttribute("id")!=null){ %>
		<input type="button" class="But" value="글쓰기" onclick="location.href='board.jsp'" class="write">
		<input type="button" class="But" value="로그아웃" onclick="location.href='logoutServer.jsp'" class="write" id="logout">
		<%} else { %>
		<input type="button" class="But" value="로그인" onclick="location.href='loginForm.jsp'" class="write">
		<%}%>


	<%-- 
	<c:choose>
		<c:when test="${id!=null}">
			<input type="button" class="But" value="글쓰기" onclick="location.href='board.jsp'" class="write">
			<input type="button" class="But" value="로그아웃" onclick="location.href='logoutServer.jsp'" class="write" id="logout">
		</c:when>
		
		<c:when test="${id=null}">
			<input type="button" class="But" value="로그인" onclick="location.href='loginForm.jsp'" class="write">
		</c:when>
	</c:choose>
  --%>
 
 

<table>
	<tr id="fixed_title">
		<td style="text-align:center">No</td> <td style="text-align:center">제목</td>
		<td style="text-align:center">작성시간</td> <td style="text-align:center">조회수</td>
		<td style="text-align:center">아이디</td>
	</tr>
	
<%
Connection conn=null;
PreparedStatement pstmt=null;
ResultSet rs = null;




try {
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
		
			
//List를 저장하기 위한 sql 문장
//MySQL에서 확인하고 복붙
pstmt = conn.prepareStatement("select * from board order by bno desc");

//위 SQL 문장을 실행 (workbench : ctrl+enter)
rs = pstmt.executeQuery();

while(rs.next()){
	
%>


	
	<tr>
		<td width="50px" style="text-align:center"><%=rs.getString("bno") %></td>
		<td width="400px"><a href="detailBoard.jsp?bno=<%=rs.getString("bno") %>"><%=rs.getString("title") %></a></td>
		<td width="200px" style="text-align:center"><%=rs.getString("regdate") %></td>
		<td width="70px" style="text-align:center"><%=rs.getString("cnt") %></td>
		<td width="100px" style="text-align:center"><%=rs.getString("id") %></td>
	</tr>	


	
<%	
		}


		} catch (Exception e){		
			System.out.println("실패");
			e.printStackTrace();		
		}finally{
			//메모리 환수
			conn.close();
			rs.close();
			pstmt.close();
		}


%>
	

</table>

</body>
</html>