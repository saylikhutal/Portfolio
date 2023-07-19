package com.fileprocessing;

import java.io.File;
import java.io.FileOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

public class FileIOImp implements FileIO {
	private String result;
	HttpServletRequest Request;
	@SuppressWarnings("finally")
	@Override
	public String deleteProject(String filename) {
		try {
//			String path = "D:\\javaOOPS\\portfolio\\WebContent\\mydata\\project\\"+filename;
			String path=Request.getRealPath("mydata\\project")+File.separator+filename;
			boolean delete=new File(path).delete();
			if(delete==true)
			{
				result="deleted";
			}
			else
			{
				result="failed";
			}
		
		}
		catch(Exception e)
		{
			System.out.println("fileIOImp--->"+e);
			result="failed";

		}
		finally {
			return result;
		}
		
		 
	}

	@SuppressWarnings("finally")
	@Override
	public String uploadResume(String filename, Part part) {
		try {
			byte[] b = part.getInputStream().readAllBytes();
//			String path = "D:\\javaOOPS\\portfolio\\WebContent\\mydata\\resume\\"+filename;
			String path=Request.getRealPath("mydata\\resume")+File.separator+filename;
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(b);
			result="uploaded";
			fos.close();
		}
		catch(Exception e)
		{
			System.out.println("fileIOImp--->"+e);
			result="exp";

		}
		finally {
			return result;
		}

	}
	
	 

}
