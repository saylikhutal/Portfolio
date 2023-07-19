package com.dao;

import java.sql.Connection;
import java.sql.Statement;

public class Start_Destory {
	public static void deleteAll()
	{
		try
		{
			Connection con=ConnectionFactory.getConnection();
			Statement st=con.createStatement();
			st.execute("drop database smyportfolio");
		}
		catch(Exception e)
		{
			System.out.println("Destory->deleteAll"+e);
		}
	}

}
