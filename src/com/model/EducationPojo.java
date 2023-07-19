package com.model;

public class EducationPojo {
	private int srn;
	private String year;
	private String title;
	private String subtitle;
	private String desc;
	
	
	public EducationPojo(int srn,String year,String title,String subtitle,String desc)
	{
		super();
		this.srn=srn;
		this.year=year;
		this.title=title;
		this.subtitle=subtitle;
		this.desc=desc;
	}
	public int getSrn() {
		return srn;
	}
	public void setSrn(int srn) {
		this.srn = srn;
	}
	
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
