package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.practice.webapp.dao.StudentDAO;
import com.practice.webapp.entity.Student;

public class StudentDAOImpl implements StudentDAO
{

	private DataSource dataSource;
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement smt = null;

	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}

	public void insertStu(Student aStudent)
	{
		
		String sql =  "INSERT student(name,account,pwd,id,sex,birth,tel,email,address) "
				+ "VALUES(?,?,?,?,?,?,?,?,?)";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			
			smt.setString(1, aStudent.getName());
			smt.setString(2, aStudent.getAccount());
			smt.setString(3, aStudent.getPwd());
			smt.setString(4, aStudent.getId());
			smt.setString(5, aStudent.getSex());
			smt.setString(6, aStudent.getBirth());
			smt.setString(7, aStudent.getTel());
			smt.setString(8, aStudent.getEmail());
			smt.setString(9, aStudent.getAddress());
			smt.executeUpdate();
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

	}
	
	
	public void insert(Student aStudent)
	{
		
		String sql =  "INSERT student(name,account,sex,id,code,birth,tel,address,email) "
				+ "VALUES(?,?,?,?,?,?,?,?,?)";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			
			smt.setString(1, aStudent.getName());
			smt.setString(2, aStudent.getAccount());
			smt.setString(3, aStudent.getSex());
			smt.setString(4, aStudent.getId());
			smt.setString(5, aStudent.getTestPlace().getPlace());
			smt.setString(6, aStudent.getBirth());
			smt.setString(7, aStudent.getTel());
			smt.setString(8, aStudent.getAddress());
			smt.setString(9, aStudent.getEmail());
			smt.executeUpdate();
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

	}

	public void delete(Student student)
	{
		String sql = "DELETE FROM student WHERE account = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, student.getAccount());
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

	public void update(Student student)
	{
		String sql = "UPDATE student SET code=?, id=?, name=?, sex=?, birth=?, tel=?, address=?, email=? "
				+ "WHERE account = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, student.getCode());
			smt.setString(2, student.getId());
			smt.setString(3, student.getName());
			smt.setString(4, student.getSex());
			smt.setString(5, student.getBirth());
			smt.setString(6, student.getTel());
			smt.setString(7, student.getAddress());
			smt.setString(8, student.getEmail());
			smt.setString(9, student.getAccount());
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

	

	public List<Student> getList()
	{

		List<Student> studentList = new ArrayList<Student>();
		String sql = "SELECT * FROM student";
	
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while (rs.next())
			{
				Student aStudent = new Student();
				aStudent.setAccount(rs.getString("account"));
				aStudent.setCode(rs.getString("code"));
				aStudent.setId(rs.getString("id"));
				aStudent.setName(rs.getString("name"));
				aStudent.setSex(rs.getString("sex"));
				aStudent.setBirth(rs.getString("birth"));
				aStudent.setTel(rs.getString("tel"));
				aStudent.setAddress(rs.getString("address"));
				aStudent.setEmail(rs.getString("email"));
				
				studentList.add(aStudent);
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
		return studentList;
	}

	public Student get(Student aStudent)
	{
		String sql = "SELECT * FROM student WHERE account = ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, aStudent.getAccount());
			rs = smt.executeQuery();
			if (rs.next())
			{
				aStudent.setAccount(rs.getString("account"));
				aStudent.setCode(rs.getString("code"));
				aStudent.setId(rs.getString("id"));
				aStudent.setName(rs.getString("name"));
				aStudent.setSex(rs.getString("sex"));
				aStudent.setBirth(rs.getString("birth"));
				aStudent.setTel(rs.getString("tel"));
				aStudent.setAddress(rs.getString("address"));
				aStudent.setEmail(rs.getString("email"));
				// aStudent.setPhoto(rs.getString("picture"));
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
		return aStudent;
	}
	
	public Student setSession(Student aStudent)
	{
		String sql = "SELECT * FROM student WHERE account = ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, aStudent.getAccount());
			rs = smt.executeQuery();
			if (rs.next())
			{
				aStudent.setAccount(rs.getString("account"));
				aStudent.setCode(rs.getString("code"));
				aStudent.setId(rs.getString("id"));
				aStudent.setName(rs.getString("name"));
				aStudent.setSex(rs.getString("sex"));
				aStudent.setBirth(rs.getString("birth"));
				aStudent.setTel(rs.getString("tel"));
				aStudent.setAddress(rs.getString("address"));
				aStudent.setEmail(rs.getString("email"));

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
		return aStudent;
	}


}
