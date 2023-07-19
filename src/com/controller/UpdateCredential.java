 package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UpdateDaoImp;
import com.mysql.cj.Session;
public class UpdateCredential extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		String res=new UpdateDaoImp().updateCredential(username, password);
		HttpSession session =request.getSession();
		if(res.equals("updated"))
		{
			session.setAttribute("msg","credential updated succe");
			response.sendRedirect("updateadmin.jsp");
			
		}
		else
		{
			session.setAttribute("msg", "update went wrong");
			response.sendRedirect("updateadmin.jsp");
		}
	}

}
