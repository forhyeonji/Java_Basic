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
	
	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
	String name=request.getParameter("name");
	
	Connection conn=null;
	PreparedStatement pstmt=null;

	
	try{
		
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();	
		
		pstmt = conn.prepareStatement("insert into member (id, password, name) values (?,?,?)");
		
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		pstmt.setString(3, name);
		
		int result=pstmt.executeUpdate();
		
		if(result!=0){
			out.println("<script>");
			out.println("location.href='Q_loginForm.jsp'");
			out.println("</script>");
		} else{
			out.println("<script>");
			out.println("location.href='Q_member.jsp'");
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