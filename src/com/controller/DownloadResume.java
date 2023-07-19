package com.controller;

import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DownloadResume extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String path="D:\\javaOOPS\\portfolio\\WebContent\\mydata\\resume\\myresume.pdf";
			FileInputStream fis = new FileInputStream(path);
			byte[] b = fis.readAllBytes();
			
			ServletOutputStream os = response.getOutputStream();
			response.setHeader("content-disposition", "filename=myresume.pdf");
			response.setContentType("application/octet-stream");
			
			os.write(b);
			fis.close();
			os.close();

	}

}
