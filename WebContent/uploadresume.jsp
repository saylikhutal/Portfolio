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
<form action="UploadResume" method="post" enctype="multipart/form-data">
<input type="file" name="resume"><br>
<button>Upload</button>
</form>
</body>
</html>