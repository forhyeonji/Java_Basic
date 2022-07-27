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
	String title=request.getParameter("title");
	String content=request.getParameter("content");
	int bno=Integer.parseInt(request.getParameter("bno"));
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	
	try {
			
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
			conn = ds.getConnection();
			
				
	//회원가입을 하기 위한 sql 문장
	//prepareStatement : java -> DB에 쿼리를 보내기 위해 사용하는 객체
	pstmt = conn.prepareStatement("update board set title=?, content=? where bno=?");
	
	
	pstmt.setString(1, title);
	pstmt.setString(2, content);
	pstmt.setInt(3, bno);
	
	//위 SQL 문장을 실행 (workbench : ctrl+enter)
	//insert가 되었으면 1값을 result 변수에 저장하고,
	//insert가 되지않았으면 0값을 result 변수에 저장.
	int result=pstmt.executeUpdate();

	//int 타입으로 0또는 1로 결과를 저장
	//executeQuery() : select
	//executeUpdate() : insert, update, delete
	
	
		//insert가 되었으면 (회원가입이 되었으면)
		if(result!=0){
		//로그인 화면으로 이동
			out.println("<script>");
			out.println("alert('수정 하였습니다.')");
			out.println("location.href='main.jsp'");
			out.println("</script>");
		} else{//그렇지 않으면
		//회원가입 화면으로 이동
			out.println("<script>");
			out.println("alert('수정이 실패하였습니다.')");
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