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
	//한글깨짐 방지 설정
	request.setCharacterEncoding("UTF-8");
	


	String title=request.getParameter("title");
	String content=request.getParameter("content");
	String id=(String)session.getAttribute("id");

	
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	
	try {
		
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
				
					
	
		//prepareStatement : java -> DB에 쿼리를 보내기 위해 사용하는 객체
		pstmt = conn.prepareStatement("insert into board (title, content, id, regdate) values (?,?,?,now())");
		

		pstmt.setString(1, title);
		pstmt.setString(2, content);
		pstmt.setString(3, id);
		
		int result=pstmt.executeUpdate();  //int 타입으로 0또는 1로 결과를 저장
		
		
			if(result!=0){
				out.println("<script>");
				out.println("location.href='main.jsp'");
				out.println("</script>");
			} else {//그렇지 않으면
			//회원가입 화면으로 이동
				out.println("<script>");
				out.println("location.href='board.jsp'");
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