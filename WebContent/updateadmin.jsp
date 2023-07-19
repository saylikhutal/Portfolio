<%
   String getlogin=(String)session.getAttribute("login");
   if(getlogin==null)
   {
	   response.sendRedirect("adminlogin.jsp");
   }
%>

<%@page import="com.model.ReadCredentialPojo"%>
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
<%@include file="AdminMessageBox/message.jsp" %>

<%
ReadDaoImp r=new ReadDaoImp();
ReadCredentialPojo rc=r.readcredential();
%>

<form action="UpdateCredential" method="post">
<input type="text" name="name" value="<%=rc.getUsername()%>"><br>
<input type="text" name="password" value="<%=rc.getPassword()%>"><br>
<button>update</button>
</form>
<br><br>
<a href="admin.jsp">home</a>
</body>
</html>