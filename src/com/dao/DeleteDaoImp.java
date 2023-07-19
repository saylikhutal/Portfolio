package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.fileprocessing.FileIOImp;

public class DeleteDaoImp implements DeleteDao {

	private Connection con;
	private PreparedStatement ps;
	private String sql;
	private String result;

	private int row;

	@SuppressWarnings("finally")
	@Override
	public String deleteMessage(int srn) {
		try {
			con = ConnectionFactory.getConnection();
			sql = "delete from message where srn=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, srn);
			row = ps.executeUpdate();
			if (row == 1)
				result = "deleted";
		} catch (Exception e) {
			System.out.println("DeleteDaoImp->deleteMessage: " + e);
			result = "exp";
		} finally {
			return result;
		}
	}

	@SuppressWarnings("finally")
	@Override
	public String deleteproject(int srn,String filename) {
		try {
			con = ConnectionFactory.getConnection();
			con.setAutoCommit(false);
			sql = "delete from project where srn=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, srn);
			row = ps.executeUpdate();
			if (row == 1)
			{
				String res=new FileIOImp().deleteProject(filename);
				if(res.equals("deleted"))
				{
					con.commit();
					result="deleted";
				}
				else
				{
					con.rollback();
					result="failed";
				}
			} 
		} catch (Exception e) {
			System.out.println("DeleteDaoImp->deleteMessage: " + e);
			result = "exp";
		} finally {
			return result;
		}
	}

}
