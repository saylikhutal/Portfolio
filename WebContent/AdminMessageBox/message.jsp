<%
     String s=(String)session.getAttribute("msg");
     if(s!=null)
     {
  %>
  <h2 style="text-align: center; color: blue;"><%=s%></h2> 
  <%
      } 
      session.removeAttribute("msg");
  %>