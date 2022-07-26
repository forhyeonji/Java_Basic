<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#write {
	margin:10px;
}

#fixed_title {
	background-color:powderblue;
}


</style>
</head>
<body>
<input type="button" value="글쓰기" onclick="location.href='board.jsp'" id="write">

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
pstmt = conn.prepareStatement("select * from board");

//위 SQL 문장을 실행 (workbench : ctrl+enter)
rs = pstmt.executeQuery();

while(rs.next()){
	
%>
	
	<tr>
		<td width="50px" style="text-align:center"><%=rs.getString("bno") %></td>
		<td width="300px"><a href="detailBoard.jsp?bno=<%=rs.getString("bno") %>"><%=rs.getString("title") %></a></td>
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