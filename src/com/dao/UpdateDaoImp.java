package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class UpdateDaoImp implements UpdateDao {
	private String sql;
	private Connection con;
	private PreparedStatement ps;
	private String result;
	private int row;
	
	@SuppressWarnings("finally")
	@Override
	public String updateCredential(String username, String password) {
		try
		{
			sql="update admin set username=? ,password=? where srn=1";
			con=ConnectionFactory.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2, password);
			row=ps.executeUpdate();
			if(row==1)
				{result="updated";}
		}
		catch(Exception e)
		{
			System.out.println("Update-->updateCredential");
			result="exp";
		}
		
		finally
		{
			return result;
		}
		
	}

}
