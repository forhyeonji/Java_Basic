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
<form action="modifyServer.jsp">
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
			<td>제목  :  </td>
			<td><input type="text" id="title" name="title" value=<%=rs.getString("title") %>>
				<input type="hidden" id="bno" name="bno" value=<%=rs.getString("bno") %>>
			</td>
		</tr>
	
		<tr>
			<td colspan="2"><textarea placeholder="Input some text." name="content"><%=rs.getString("content") %></textarea></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="발행" ></td>
			<td><input type="button" value="취소" onclick="location.href='main.jsp'"></td>
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
</form>
</body>
</html>