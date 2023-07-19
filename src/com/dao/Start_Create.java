package com.dao;

import java.sql.Connection;
import java.sql.Statement;

public class Start_Create {
	public static void createDatabase()
	{
		try
		{
			Connection con=ConnectionFactory.getConnection();
			Statement st=con.createStatement();
			st.execute("create database smyportfolio");
		}
		catch(Exception e)
		{
			System.out.println("create-->createDatabase"+e);
		}
	}
	
	public static void createTable() {
		try
		{
			String sql="create table smyportfolio.admin("
					+"srn int primary key,"
					+"username varchar(20),"
					+"password varchar(30)"+")";
			Connection con=ConnectionFactory.getConnection();
			Statement st=con.createStatement();
			st.execute(sql);
		}
		catch(Exception e)
		{
			System.out.println("create-->createTable"+e);
		}
	}

}
