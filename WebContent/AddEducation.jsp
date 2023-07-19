<%
   String getlogin=(String)session.getAttribute("login");
   if(getlogin==null)
   {
	   response.sendRedirect("adminlogin.jsp");
   }
%>
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
<form action="Education" method="post">
<input type="text" name="year" placeholder="year"><br>
<input type="text" name="title" placeholder="title"><br>
<input type="text" name="subtitle" placeholder="subtitle"><br>
<input type="text" name="desc" placeholder="description"><br>
 <button>Add</button>
</form>
</body>
</html>