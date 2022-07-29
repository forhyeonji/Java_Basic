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

<%
	String title=request.getParameter("title");
	String content=request.getParameter("content");
	String id=(String)session.getAttribute("id");
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	
			
	try {
		
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
		
		pstmt = conn.prepareStatement("insert into board(title, content, id) values (?,?,?)");
		
		pstmt.setString(1, title);
		pstmt.setString(2, content);
		pstmt.setString(3, id);
		
		
		int result=pstmt.executeUpdate();
		
			if(result!=0){
				out.println("<script>");
				out.println("location.href='Q_boardList.jsp'");
				out.println("</script>");
			}
		
		
		} catch (Exception e) {
			
			System.out.println("실패");
			e.printStackTrace();
			
		} finally{
			
			//메모리 환수
			conn.close();
			pstmt.close();
			
		} //finally








%>

</body>
</html>