package com.model;

public class msg {
	private int srn;
	private String name;
	private String email;
	private String message;
	
	public msg(int srn,String name,String email,String message)
	{
		this.srn=srn;
		this.name=name;
		this.email=email;
		this.message=message;
	}
	
	public int getSrn() {
		return srn;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getMessage() {
		return message;
	}

}
