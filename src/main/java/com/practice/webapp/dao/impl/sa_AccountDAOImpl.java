package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.practice.webapp.dao.sa_AccountDAO;
import com.practice.webapp.entity.sa_Account;

public class sa_AccountDAOImpl implements sa_AccountDAO
{
	private DataSource dataSource; // 會接收外部傳入得值
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement smt = null;

	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}

	public int loginCheck(sa_Account account)
	{

		// String sql = "SELECT * FROM student WHERE account = ? AND pwd =?";
		String sql = "SELECT * FROM student WHERE account = ? ";

		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, account.getAccount());
			// smt.setString(2, account.getPwd());
			rs = smt.executeQuery();
			if (!rs.next())
			{
				System.out.println("無此帳號");
				return 1;
			}
			else if (!rs.getString("pwd").equals(account.getPwd()))
			{
				System.out.println("密碼錯誤");
				return 2;
			}
			else
			{
				System.out.println("登入成功");
				return 3;
			}

		}
		catch (SQLException e)
		{
			throw new RuntimeException(e);
		}
		finally
		{
			if (conn != null)
			{
				try
				{
					conn.close();
					rs.close();
					smt.close();

				}
				catch (SQLException e)
				{
				}
			}
		}
	}
}
