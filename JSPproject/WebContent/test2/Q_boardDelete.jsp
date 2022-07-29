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

	int bno=Integer.parseInt(request.getParameter("bno"));
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	
	try {
		
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
		
		pstmt = conn.prepareStatement("delete from board where bno=?");
		pstmt.setInt(1, bno);
		
		int result=pstmt.executeUpdate();

		if(result!=0){
				out.println("<script>");
				out.println("alert('삭제되었습니다.')");
				out.println("location.href='Q_boardList.jsp'");
				out.println("</script>");
				} else{//그렇지 않으면
			//회원가입 화면으로 이동
				out.println("<script>");
				out.println("alert('삭제가 실패하였습니다.')");
				out.println("</script>");
				}
				
				} catch (Exception e){		
					System.out.println("실패");
					e.printStackTrace();		
				}finally{
					//메모리 환수
					conn.close();
					pstmt.close();
				}
		




%>
</body>
</html>