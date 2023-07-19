package com.model;

public class ReadCredentialPojo {

	private int srn;
	private String username;
	private String password;
	
	public  ReadCredentialPojo(int srn, String username, String password)
	{
		super();
		this.srn=srn;
		this.username=username;
		this.password=password;
	}
	
	public int getSrn() {
		return srn;
	}
	
	public void setSrn(int srn) {
		this.srn = srn;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}
