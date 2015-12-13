package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.practice.webapp.dao.sa_TestPlaceDAO;
import com.practice.webapp.entity.sa_TestPlace;

public class sa_TestPlaceDAOImpl implements sa_TestPlaceDAO
{
	private DataSource dataSource;
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement smt = null;

	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}

	
	
	
	public List<sa_TestPlace> getList()
	{

		// TODO Auto-generated method stub
		List<sa_TestPlace> sa_TestPlaceList = new ArrayList<sa_TestPlace>();
		String sql = "SELECT * FROM sa_TestPlace1 ";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while (rs.next())
			{
				sa_TestPlace TestPlace = new sa_TestPlace();
				TestPlace.setCode(rs.getString("code"));
				TestPlace.setInformation(rs.getString("information"));
				TestPlace.setPlace(rs.getString("place"));
				sa_TestPlaceList.add(TestPlace);
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
		return sa_TestPlaceList;

	}

}
