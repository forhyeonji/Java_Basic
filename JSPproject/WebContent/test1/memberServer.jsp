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
	
	//사용자가 입력한 id값을 id변수에 저장
	String id=request.getParameter("id");
	//사용자가 입력한 password값을 pw변수에 저장
	String pw=request.getParameter("pw");
	//사용자가 입력한 address값을 addr변수에 저장
	String addr=request.getParameter("addr");
	
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	
	try {
			
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
			conn = ds.getConnection();
			
				
	//회원가입을 하기 위한 sql 문장
	//prepareStatement : java -> DB에 쿼리를 보내기 위해 사용하는 객체
	pstmt = conn.prepareStatement("insert into member (id, password, addr) values (?,?,?)");
	
	//첫 번째 물음표에는 사용자가 입력한 id값 (request.getParameter("id"))을 설정
	pstmt.setString(1, id);
	
	//두 번째 물음표에는 사용자가 입력한 password값 (request.getParameter("pw"))을 설정
	pstmt.setString(2, pw);
	
	//세 번째 물음표에는 사용자가 입력한 address값 (request.getParameter("addr"))을 설정
	pstmt.setString(3, addr);
	
	//위 SQL 문장을 실행 (workbench : ctrl+enter)
	//insert가 되었으면 1값을 result 변수에 저장하고,
	//insert가 되지않았으면 0값을 result 변수에 저장.
	int result=pstmt.executeUpdate();  //int 타입으로 0또는 1로 결과를 저장
	//executeQuery() : select
	//executeUpdate() : insert, update, delete
	
	
		//insert가 되었으면 (회원가입이 되었으면)
		if(result!=0){
		//로그인 화면으로 이동
			out.println("<script>");
			out.println("location.href='loginForm.jsp'");
			out.println("</script>");
		} else{//그렇지 않으면
		//회원가입 화면으로 이동
			out.println("<script>");
			out.println("location.href='loginForm.jsp'");
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