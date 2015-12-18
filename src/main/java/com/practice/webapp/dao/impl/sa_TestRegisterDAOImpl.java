package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.practice.webapp.dao.sa_TestRegisterDAO;
import com.practice.webapp.entity.sa_AssignTest;
import com.practice.webapp.entity.sa_BasicTest;
import com.practice.webapp.entity.sa_EnglishListening;

public class sa_TestRegisterDAOImpl implements sa_TestRegisterDAO
{
	private DataSource dataSource;
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement smt = null;
	
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}
	
	
	public void testRegister(sa_AssignTest sa_AssignTest)
	{
	           
		
	}

	public void testRegister(sa_BasicTest sa_BasicTest)
	{
		String sql =  "INSERT sa_BasicTest(account,identity,testPlace,note) "
				+ "VALUES(?,?,?,?)";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, sa_BasicTest.getAccount());
//			smt.setString(2, sa_BasicTest.getType());
//			smt.setInt(3, sa_BasicTest.getMoney());
//			smt.setString(3, sa_BasicTest.getState());
			smt.setString(2, sa_BasicTest.getIdentity());
//			smt.setString(5, sa_BasicTest.getCode());
			smt.setString(3, sa_BasicTest.getTestplace());
			smt.setString(4, sa_BasicTest.getNote());
			smt.executeUpdate();			
			smt.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		
	}

	public void testRegister(sa_EnglishListening sa_EnglishListening)
	{
		
	}

}
