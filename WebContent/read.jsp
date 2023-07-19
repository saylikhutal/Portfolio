<%@page import="com.model.msg"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.ReadDaoImp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>read here</h1>
	<%
	ReadDaoImp re=new ReadDaoImp();
	ArrayList<msg> al=re.readmsg(); 
	for(msg m:al)
	{
	%>
		SRN:<%=m.getSrn() %><br>
		NAME:<%=m.getName() %><br>
		EMAIL:<%=m.getEmail() %><br>
		MESSAGE:<%=m.getMessage() %><br><br>

<%	
	}
%>
</body>
</html>