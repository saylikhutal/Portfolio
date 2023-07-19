package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.fileprocessing.FileIOImp;

@MultipartConfig
public class UploadResume extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			Part part=request.getPart("resume");
			String filename="myresume.pdf";
			
			String res=new FileIOImp().uploadResume(filename, part);
			HttpSession session = request.getSession();
			if(res.equals("uploaded"))
			{
				session.setAttribute("msg", "resume uploaded successfully");
				response.sendRedirect("uploadresume.jsp");
			}
			else
			{
				session.setAttribute("msg", "something went wrong");
				response.sendRedirect("uploadresume.jsp");
			}

			
	}

}
