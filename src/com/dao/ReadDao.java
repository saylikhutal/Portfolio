package com.dao;

import java.util.ArrayList;

import com.model.EducationPojo;
import com.model.ProjectPojo;
import com.model.ReadCredentialPojo;
import com.model.msg;

public interface ReadDao {
	public ArrayList<msg> readmsg();
	public String readAdminLogin(String username,String password);
	public ReadCredentialPojo readcredential();
	public ArrayList<ProjectPojo> readProject();
	public ArrayList<EducationPojo> readEducation();

}
