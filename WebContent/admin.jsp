<% String getlogin=(String)session.getAttribute("login");
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
<a href="readmessage.jsp">READ MESSAGE</a><br><br>
<a href="updateadmin.jsp">update password</a><br><br>
<a href="Addproject.jsp">upload file/PROJECT</a><br><br>
<a href="deleteproject.jsp">delete img/PROJECT</a><br><br>
<a href="AddEducation.jsp">addEducation</a><br><br>
<a href="uploadresume.jsp">upload resume</a>
<form action="Logout" method="post">
<button>logout</button>
</form>
</body>
</html>