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
	

	//사용자가 입력한 address값을 addr변수에 저장

	int bno=Integer.parseInt(request.getParameter("bno"));
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	
	try {
			
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
			conn = ds.getConnection();
			
				
	//회원가입을 하기 위한 sql 문장
	//prepareStatement : java -> DB에 쿼리를 보내기 위해 사용하는 객체
	pstmt = conn.prepareStatement("delete from board where bno=?");
	pstmt.setInt(1, bno);
	
	int result=pstmt.executeUpdate();

	if(result!=0){
			out.println("<script>");
			out.println("alert('삭제되었습니다.')");
			out.println("location.href='main.jsp'");
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