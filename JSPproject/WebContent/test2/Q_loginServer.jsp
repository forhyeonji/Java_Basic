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
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs = null;
	
	
	try {
		
		
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
		
		pstmt = conn.prepareStatement("select * from member where id =? and password =?");
		
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		
		rs = pstmt.executeQuery();

			if(rs.next()){
				
				session.setAttribute("id",id);

				
				out.println("<script>");
				out.println("location.href='Q_boardList.jsp'");
				out.println("</script>");
			}
			
			else { //그렇지 않으면
				//loginForm.jsp를 실행
				out.println("<script>");
				out.println("alert('로그인 실패')");
				out.println("location.href='Q_loginForm.jsp'");
				out.println("</script>");
				
			}

		
		
	} catch (Exception e) {
		
		System.out.println("실패");
		e.printStackTrace();
		
	}finally{
		
		//메모리 환수
		conn.close();
		rs.close();
		pstmt.close();
		
	} //finally
		


%>




</body>
</html>