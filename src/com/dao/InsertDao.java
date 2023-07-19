package com.dao;

public interface InsertDao {
	public String saveMessage(String name,String email, String message);
	public String saveProject(String filename);
	public String saveEducation(String year,String title, String subtitle,String desc);


}
