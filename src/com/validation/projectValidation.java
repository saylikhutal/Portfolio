package com.validation;

import javax.servlet.http.Part;

public class projectValidation {

	private String result;
	public String validate(Part part) {
		String ct=part.getContentType();		//format
		System.out.println(ct);
		
		Long size=part.getSize();
		System.out.println(size);
		  
		if(!ct.endsWith("jpeg")) {
			result="invalid format";
		}
		else if(size>=1048576)			//byte
		{
			result="size exceded";
		}
		else
		{
			result="valid";
		}
		return result;
	}
	
}
