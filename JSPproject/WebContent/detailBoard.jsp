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
#Title{
	width : 400px;
}

#Content{
	width : 400px;
	height : 300px;
}

#Modify{
	margin : 10px;
}

table, td {
	border: 1px solid gray;
	border-collapse: collapse;
}
</style>
</head>
<body>
<table>
<%
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs = null;
	
	String bno=request.getParameter("bno");
	String title=request.getParameter("title");
	String content=request.getParameter("content");
	String id=(String)session.getAttribute("id");

	
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
			conn = ds.getConnection();
			
			pstmt = conn.prepareStatement("select * from board where bno=?");
			
			pstmt.setString(1, bno);
			
			rs = pstmt.executeQuery();
	
		if(rs.next()){
			
		
%>
	
	<tr>
		<td id="Title"><%=rs.getString("title") %></td>
	</tr>
	
	<tr>
		<td id="Content"><%=rs.getString("content") %></td>
	</tr>
	
	<tr>
		<td id="Modify"><input type="button" value="수정" onclick="location.href='boardModify.jsp?bno=<%=rs.getString("bno") %>'">
		<input type="button" value="삭제" onclick="location.href='deleteBoard.jsp?bno=<%=rs.getString("bno") %>'"></td>
	</tr>	
<%			
		}
		
		} catch (Exception e){		
			System.out.println("실패");
			e.printStackTrace();		
		} finally {
			//메모리 환수
			conn.close();
			rs.close();
			pstmt.close();
		}
%>

</table>


</body>
</html>