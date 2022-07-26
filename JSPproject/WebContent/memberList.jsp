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
<table border="1">
	<tr>
		<td>아이디</td> <td>주소</td> <td>폰번호</td> <td>이메일</td> <td>이름</td>
	</tr>
<%
Connection conn=null;
PreparedStatement pstmt=null;
ResultSet rs = null;

try {
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
			
//List를 저장하기 위한 sql 문장
//MySQL에서 확인하고 복붙
pstmt = conn.prepareStatement("select * from member");

//위 SQL 문장을 실행 (workbench : ctrl+enter)
rs = pstmt.executeQuery();

while(rs.next()){
	
%>

	<tr>
		<td><%=rs.getString("id") %></td>
		<td><%=rs.getString("addr") %></td>
		<td><%=rs.getString("phone") %></td>
		<td><%=rs.getString("email") %></td>
		<td><%=rs.getString("name") %></td>
	</tr>


<%	
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
</table>
</body>
</html>