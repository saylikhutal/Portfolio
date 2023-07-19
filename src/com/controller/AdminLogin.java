package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ReadDaoImp;


public class AdminLogin extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		String result=new ReadDaoImp().readAdminLogin(username, password);
		
		HttpSession session=request.getSession();
		
		if(result.equals("exist"))
		{
			session.setAttribute("login","username");
			response.sendRedirect("admin.jsp");
		}
		else
		{
			session.setAttribute("msg","invalid id or password");
			response.sendRedirect("adminlogin.jsp");
		}
	}

}
