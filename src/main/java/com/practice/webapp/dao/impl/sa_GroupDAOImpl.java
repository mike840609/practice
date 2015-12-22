package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.practice.webapp.dao.sa_GroupDAO;
import com.practice.webapp.entity.sa_School;

public class sa_GroupDAOImpl implements sa_GroupDAO
{

	private DataSource dataSource; // 會接收外部傳入得值
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement smt = null;

	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}

	@Override
	public int loginCheck(sa_School sa_School)
	{
		String sql = "SELECT * FROM sa_School WHERE schoolcode = ? ";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, sa_School.getSchoolcode());
			rs = smt.executeQuery();

			if (!rs.next())
			{
				System.out.println("無此帳號");
				return 1;
			}
			else if (!rs.getString("pwd").equals(sa_School.getPwd()))
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
		catch (Exception e)
		{
			throw new RuntimeException(e);
			// TODO: handle exception
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

	@Override
	public sa_School setSession(sa_School sa_School)
	{
		String sql = "SELECT * FROM sa_School WHERE schoolcode = ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, sa_School.getSchoolcode());
			rs = smt.executeQuery();
			if (rs.next())
			{
				sa_School.setSchoolcode(rs.getString("schoolcode"));
				sa_School.setPwd(rs.getString("pwd"));
				sa_School.setName(rs.getString("name"));
				sa_School.setAddress(rs.getString("address"));
				sa_School.setTel(rs.getString("tel"));
				sa_School.setPerson(rs.getString("person"));
				sa_School.setPersontel(rs.getString("personTel"));
				

			}
			rs.close();
			smt.close();

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
				}
				catch (SQLException e)
				{
				}
			}
		}
		return sa_School;
	}
}
