package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.practice.webapp.dao.ManagerAccountDAO;
import com.practice.webapp.entity.ManagerAccount;


public class ManagerAccountDAOImpl implements ManagerAccountDAO
{
	private DataSource dataSource;           
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public int managerloginCheck(ManagerAccount manageraccount){

		String sql = "SELECT * FROM sa_manager WHERE account = ? ";
		
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, manageraccount.getManagerusername());
			rs = smt.executeQuery();		
			 if(!rs.next()) 
			    { 
			      System.out.println("無此帳號");
				 return 1;
			    }    
			    else if(!rs.getString("password").equals(manageraccount.getManagerpassword()))
			    { 
			        System.out.println("密碼錯誤");
			        return 2;
			    }
			    else 
			    {
			    	System.out.println("登入成功");
			    	return 3;
			    }  
			 
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			
			if (conn != null) {
				try {
					conn.close();
					rs.close();
					smt.close();
					
				} catch (SQLException e) {}
			}
		
		}
		
//		System.out.println(account.getAccount());
//		System.out.println(account.getPwd());
		
//		if(rs != null){return true;}
//	    else {return false;}
	}

}
