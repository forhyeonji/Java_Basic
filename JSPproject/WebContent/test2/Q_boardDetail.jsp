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
<style>

*{
		margin:0px;
		padding:0px;
	}
	
	
	
.But{
	border : 1px solid pink;
	background-color: white;
	color : rgba(255, 126, 126);
	padding : 5px;
}


#Title{
	border : 1px solid pink;
	background-color: white;
	border-collapse: collapse;
	width : 730px;
	height : 30px;
	padding-left : 10px;
}


#Content {
	border : 1px solid pink;
	background-color: white;
	border-collapse: collapse;
	width : 730px;
	height : 300px;
	padding-left : 10px;
	}

table {
	margin: 0px auto;
}

p {
	text-align : center;
	margin-top : 20px;
	margin-bottom : 10px;
}

h1 {
	text-align : center;
	margin : 10px;
}


</style>


</head>
<body>
<h1>💟</h1>
<p>🌼💙🌼💚🌼💗🌼💜🌼💛🌼</p>
<%

	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs = null;
	
	int bno=Integer.parseInt(request.getParameter("bno"));
			
	try {
		
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
		
		pstmt = conn.prepareStatement("select * from board where bno=?");
		
		pstmt.setInt(1, bno);
		
		rs = pstmt.executeQuery();
		
		
	if(rs.next()){
		%>
		
		<table>
			<tr>
				<td id="Title"><%=rs.getString("title") %></td>
			</tr>
			
			<tr>
				<td id="Content"><%=rs.getString("content") %></td>
			</tr>
			
			<tr>
				<td>
					<input type="button" value="수정" class="But" onclick="location.href='Q_boardModify.jsp?bno=<%=rs.getInt("bno")%>'">
					<input type="button" value="삭제" class="But" onclick="location.href='Q_boardDelete.jsp?bno=<%=rs.getInt("bno")%>'">
					<input type="button" value="목록" class="But" onclick="location.href='Q_boardList.jsp'">
				</td>
			</tr>
		</table>
		
		
		<%
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