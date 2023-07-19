package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.model.EducationPojo;
import com.model.ProjectPojo;
import com.model.ReadCredentialPojo;
import com.model.msg;

public class ReadDaoImp implements ReadDao {
	ArrayList<msg> al=new ArrayList();
	private String sql;
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private boolean b;
	private String result;
	
	@SuppressWarnings("finally")
	@Override
	public ArrayList<msg> readmsg() {
		ArrayList<msg> arrayList=new ArrayList<>();
	try {
		sql="select * from message";
		con=ConnectionFactory.getConnection();
		ps=con.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next())
		{
			int srn=rs.getInt("srn");
			String name=rs.getString("name");
			String email=rs.getString("email");
			String message=rs.getString("message");
			
			msg m = new msg(srn,name,email,message);
			al.add(m);
			}
		
		
	} catch (Exception e) {
		System.out.println("ReadDaoImp"+e);
	}	
	finally {
		return al;

	}
		
			}
	@SuppressWarnings("finally")
	@Override
	public String readAdminLogin(String username, String password) {
		try {
			sql="select * from admin where username=? and password=?";
			con=ConnectionFactory.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2,password);
			rs=ps.executeQuery();
			b=rs.next();
			if(b==true)
			{
				result="exist";
			}
			else
			{
				result="notexist";
			}
			
				}
			
			
		 catch (Exception e) {
			System.out.println("ReadDaoImp---->readAdminLogin"+e);
			result="exp";
		}	
		finally {
			return result;

		}
			
				}
	@SuppressWarnings("finally")
	@Override
	public ReadCredentialPojo readcredential() {
		
		ReadCredentialPojo r=null;
		try {
			sql="select * from admin";
			con=ConnectionFactory.getConnection();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			rs.next();
			
			r=new ReadCredentialPojo(rs.getInt("srn"),rs.getString("username"),rs.getString("password"));
			}
			
		catch (Exception e) {
			System.out.println("ReadDaoImp---->readcredential()"+e);
		}	
		finally {
			return r;

		}

	}
	@SuppressWarnings("finally")
	@Override
	public ArrayList<ProjectPojo> readProject() {
		ArrayList<ProjectPojo> arrayList=new ArrayList<>();
		try {
			sql="select * from project";
			con=ConnectionFactory.getConnection();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				int srn=rs.getInt("srn");
				String filename=rs.getString("filename");
				ProjectPojo m = new ProjectPojo(srn, filename);
				arrayList.add(m);
				}
			
			
		} catch (Exception e) {
			System.out.println("ReadDaoImp"+e);
		}	
		finally {
			return arrayList;

		}

	}
	@SuppressWarnings("finally")
	@Override
	public ArrayList<EducationPojo> readEducation() {
		ArrayList<EducationPojo> arrayList=new ArrayList<>();
		try {
			sql="select * from edu";
			con=ConnectionFactory.getConnection();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				int srn=rs.getInt("srn");
				String year=rs.getString("year");
				String title=rs.getString("title");
				String sutitle=rs.getString("subtitle");
				String desc=rs.getString("description");
				EducationPojo m = new EducationPojo(srn, year,title,sutitle,desc);
				arrayList.add(m);
				}
			
			
		} catch (Exception e) {
			System.out.println("ReadDaoImp"+e);
		}	
		finally {
			return arrayList;

		}
	}
}