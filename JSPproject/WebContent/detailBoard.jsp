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
		<td><%=rs.getString("title") %></td>
	</tr>
	
	<tr>
		<td><%=rs.getString("content") %></td>
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