package com.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.dao.DeleteDaoImp;
import com.dao.InsertDaoImp;
import com.validation.projectValidation;

@MultipartConfig
public class AddProject extends HttpServlet {
	private String result;
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String check=request.getParameter("check");
			HttpSession session = request.getSession();
			
			// it can e null so
			if(check!=null)
			{
				if(check.equals("deleteproject"))
				{
					//delete project
					String srn=request.getParameter("srn");
					String filename=request.getParameter("filename");
					request.getSession();
					//dao
					this.result=new DeleteDaoImp().deleteproject(Integer.parseInt(srn), filename);
					if(result.equals("deleted"))
					{
						session.setAttribute("msg", "project deleted");
						response.sendRedirect("deleteproject.jsp");
					}
					else
					{
						session.setAttribute("msg", "project not deleted");
						response.sendRedirect("deleteproject.jsp");
					}
					
				}
			}
			else
			{
			Part part = request.getPart("project");
			String filename = /*LocalDateTime.now().toString()+"@"+*/part.getSubmittedFileName();
			//validation
			this.result= new projectValidation().validate(part);
			if(result.equals("valid"))
			{
			
			// dao
			String res = new InsertDaoImp().saveProject(filename);
			
			if (res.equals("saved")) {
				InputStream is = part.getInputStream();
				byte[] b = is.readAllBytes();
//				String path = "D:\\javaOOPS\\portfolio\\WebContent\\mydata\\project\\"+filename;
				String path=request.getRealPath("mydata\\project")+File.separator+filename;		// work only on server
				FileOutputStream fos = new FileOutputStream(path);
				fos.write(b);
				session.setAttribute("msg", "project added successfully");
				response.sendRedirect("Addproject.jsp");
			} 
			else {
				session.setAttribute("msg", "something went wrong");
				response.sendRedirect("Addproject.jsp");
			}
			}
			else
			{
				session.setAttribute("msg",result);
				response.sendRedirect("Addproject.jsp");
			}
		}
	}
}
