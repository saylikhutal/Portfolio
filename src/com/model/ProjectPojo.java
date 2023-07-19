package com.model;

public class ProjectPojo {
private int srn;
private String filename;

public ProjectPojo(int srn, String filename) {
	super();
	this.srn = srn;
	this.filename = filename;
}
public int getSrn() {
	return srn;
}
public void setSrn(int srn) {
	this.srn = srn;
}
public String getFilename() {
	return filename;
}
public void setFilename(String filename) {
	this.filename = filename;
}

}
