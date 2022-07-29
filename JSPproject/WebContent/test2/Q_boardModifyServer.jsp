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
	int bno=Integer.parseInt(request.getParameter("bno"));
	
	Connection conn=null;
	PreparedStatement pstmt=null;

try{
		
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();	
		
		pstmt = conn.prepareStatement("update board set title=?, content=? where bno=?");
		
		pstmt.setString(1, title);
		pstmt.setString(2, content);
		pstmt.setInt(3, bno);
		
		int result=pstmt.executeUpdate();
		
		if(result!=0){
			out.println("<script>");
			out.println("alert('수정 하였습니다.')");
			out.println("location.href='Q_boardDetail.jsp?bno="+bno+"'"); 
			out.println("</script>");
		} else{
			out.println("<script>");
			out.println("alert('수정이 실패하였습니다.')");
			out.println("</script>");
			}
		
	} catch (Exception e) {
		System.out.println("실패");
		e.printStackTrace();	
	} finally {
		
		conn.close();
		pstmt.close();
		
	}



%>

</body>
</html>