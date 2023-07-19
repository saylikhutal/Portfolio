package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.InsertDaoImp;


public class Education extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Call from AddEducation.jsp insert form
		String year=request.getParameter("year");
		String title=request.getParameter("title");
		String subtitle=request.getParameter("subtitle");
		String desc=request.getParameter("desc");
		
		//validation 
		
		//dao added from insertdao.java to database  
		String res=new InsertDaoImp().saveEducation(year, title, subtitle, desc);
		HttpSession session=request.getSession();
		if(res=="saved")
		{
			session.setAttribute("msg","educaton data added to database");
			response.sendRedirect("AddEducation.jsp");
		}
		else
		{
			session.setAttribute("msg","educaton data Not added to database");
			response.sendRedirect("AddEducation.jsp");	
		}
		
	}

}
