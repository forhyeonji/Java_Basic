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

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Gamja+Flower&display=swap" rel="stylesheet">



<style>

#title {
	width : 700px;
	height : 22px;
}

textarea {
	width : 700px;
	height : 500px;

}

.But{
	border : 1px solid pink;
	background-color: white;
	color : rgba(255, 126, 126);
	padding : 5px;
}

h1{
	color : rgba(255, 126, 126);
	font-family: 'Gamja Flower', cursive;
	text-align : center;
}

table {
	margin : 0 auto;
}

</style>

</head>
<body>
<form action="Q_boardModifyServer.jsp">
<h1>💗🌼💗  글 수정하기  💗🌼💗</h1>
<table>
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
		<tr>
			<td><input type="text" value=<%=rs.getString("title") %> id="title" name="title"></td>
			<td><input type="hidden" value=<%=rs.getString("bno") %> name="bno"></td>
		</tr>
		
		<tr>
			<td colspan="2"><textarea name="content"><%=rs.getString("content") %></textarea></td>
		</tr>
		
		<tr>
			<td>
			<input type="submit" value="수정" class="But">
			<input type="button" value="취소" class="But" onclick="location.href='Q_boardDetail.jsp?bno=<%=rs.getString("bno")%>'">
			</td>
		</tr>
		
		
		
		
		<%
	}

	} catch (Exception e) {
		
		System.out.println("실패");
		e.printStackTrace();
		
	} finally{
		
		//메모리 환수
		conn.close();
		pstmt.close();
		rs.close();
	} //finally


%>


</table>
</form>
</body>
</html>