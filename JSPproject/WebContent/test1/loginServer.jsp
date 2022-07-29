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
	// loginForm.jsp 에 있는 데이터 수집
	String id=request.getParameter("id");   //로그인 정보를 서버에 요청
	String pw=request.getParameter("pw");   //비밀번호 정보를 서버에 요청
	
	//System.out.println(id);
	//System.out.println(pw);

	//DB 연결
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs = null;
	
	try {
			
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
			conn = ds.getConnection();
			
			//System.out.println("DB성공")	;
				
	//login을 하기 위한 sql 문장
	//MySQL에서 확인하고 복붙
	pstmt = conn.prepareStatement("select * from member where id =? and password =?");
	
	//첫 번째 물음표에는 사용자가 입력한 id값 (request.getParameter("id"))을 설정
	pstmt.setString(1, id);
	
	//두 번째 물음표에는 사용자가 입력한 pw값 (request.getParameter("pw"))을 설정
	pstmt.setString(2, pw);
	
	//위 SQL 문장을 실행 (workbench : ctrl+enter)
	rs = pstmt.executeQuery();
	
	//executeQuery() : select
	//executeUpdate() : insert, update, delete
	
		
	if(rs.next()){ //resultSet 에 데이터가 존재하면
		//login을 해라. (session)
		//session 영역에 id값을 유지시킴으로 로그인 된 채로 서비스를 이용
		session.setAttribute("id",id); //로그인이 된채로
		//메인페이지로 이동

		out.println("<script>");
		out.println("alert('로그인 성공')");
		out.println("location.href='main.jsp'");
		out.println("</script>");
		
	} else { //그렇지 않으면
		//loginForm.jsp를 실행
		out.println("<script>");
		out.println("alert('로그인 실패')");
		out.println("location.href='loginForm.jsp'");
		out.println("</script>");
		
	}
	
	
			} catch (Exception e){		
				System.out.println("실패");
				e.printStackTrace();		
			}finally{
				//메모리 환수
				conn.close();
				rs.close();
				pstmt.close();
			}
%>

</body>
</html>