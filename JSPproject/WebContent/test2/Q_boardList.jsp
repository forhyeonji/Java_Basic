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
	margin:10px;
	
}


#fixed {
	background-color : rgba(255, 216, 216);
}
.fixfont {
	color : rgba(255, 108, 108);
	text-align:center
}

a {
	text-decoration: none;
	color : rgba(205, 59, 59);
}

#logout{

	position:absolute;
	left : 1237px;
} 

table {
margin: 0px auto;
}

h1 {
	text-align : center;
	margin : 10px;
}

#content {
	padding-left : 10px;
}



</style>


</head>
<body>
<h1>💟</h1>
<table>
	<%if (session.getAttribute("id")!=null){ %>

		<tr>
			<td>
			<input type="button" value="글쓰기" onclick="location.href='Q_write.jsp'" class="But">
			<input type="button" value="로그아웃" onclick="location.href='Q_logout.jsp'" class="But" id="logout">
			</td>
		</tr>
		
		<% } else { %>
	
		
		<tr>
			<td><input type="button" value="로그인" onclick="location.href='Q_loginForm.jsp'" class="But"></td>
		</tr>
			
			<% } %>
		
		
	

		
		<tr id="fixed">
			<td class="fixfont">글번호</td>
			<td class="fixfont">글쓴이</td>
			<td class="fixfont">글제목</td>
		</tr>
	
	<%
	
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs = null;
	
	
	try {
		
	
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();
		
		pstmt = conn.prepareStatement("select * from member m join board b on m.id=b.id order by bno desc;");
		rs = pstmt.executeQuery();
		String name=(String)session.getAttribute("name");
		String id1=(String)session.getAttribute("id");
		
		while(rs.next()){	
	%>
	
	<tr>
		<td width="60px" class="fixfont"><%=rs.getString("bno") %></td>
		<td width="150px" class="fixfont"><%=rs.getString("name") %></td>
		<td width="500px" id="content"><a href="Q_boardDetail.jsp?bno=<%=rs.getString("bno") %>"><%=rs.getString("title") %></a></td>
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