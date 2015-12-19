package com.practice.webapp.dao.impl;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import javax.sql.DataSource;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.practice.webapp.dao.sa_TestDAO;
import com.practice.webapp.entity.Student;
import com.practice.webapp.entity.sa_AssignTest;
import com.practice.webapp.entity.sa_BasicTest;
import com.practice.webapp.entity.sa_EnglishListening;

public class sa_TestDAOImpl implements sa_TestDAO
{
	private DataSource dataSource;
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement smt = null;

	// 分別建立三個物件 用以儲存成績
	sa_AssignTest assignTest = new sa_AssignTest();
	sa_BasicTest basicTest = new sa_BasicTest();
	sa_EnglishListening englishListening = new sa_EnglishListening();

	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}

	public void testRegister(sa_AssignTest sa_AssignTest)
	{

		// 不存在 = -1 如果!= -1 存在 有報考
//		int chinese = Arrays.binarySearch(sa_AssignTest.getSubject(), "國文");
//		int eng = Arrays.binarySearch(sa_AssignTest.getSubject(), "英文");
//		int matha = Arrays.binarySearch(sa_AssignTest.getSubject(), "數甲");
//		int mathb = Arrays.binarySearch(sa_AssignTest.getSubject(), "數乙");
//		int physical = Arrays.binarySearch(sa_AssignTest.getSubject(), "物理");
//		int chemical = Arrays.binarySearch(sa_AssignTest.getSubject(), "化學");
//		int biologyg = Arrays.binarySearch(sa_AssignTest.getSubject(), "生物");
//		int geography = Arrays.binarySearch(sa_AssignTest.getSubject(), "地理");
//		int history = Arrays.binarySearch(sa_AssignTest.getSubject(), "歷史");
//		int civics = Arrays.binarySearch(sa_AssignTest.getSubject(), "公民");

		// 將科目判後結果串入陣列中
//		int[] subject = new int[]
//		{ chinese, eng, matha, mathb, history, geography, civics, physical, chemical, biologyg };
//		
//		for (int i : subject)
//		{
//			System.out.println(i+" ");
//		}
		
		String sql = "INSERT sa_AssignTest(account,identity,testPlace,note,Chinese,English,MathA,MathB,History,Geography,Civics,Physical,Chemical,Biology) "
				+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1,sa_AssignTest.getAccount());
			smt.setString(2,sa_AssignTest.getIdentity());
			smt.setString(3,sa_AssignTest.getTestplace());
			smt.setString(4,sa_AssignTest.getNote());
			smt.setInt(5,sa_AssignTest.getChinese());
			smt.setInt(6,sa_AssignTest.getEnglish());
			smt.setInt(7,sa_AssignTest.getMathA());
			smt.setInt(8,sa_AssignTest.getMathB());
			smt.setInt(9,sa_AssignTest.getHistory());
			smt.setInt(10,sa_AssignTest.getGeography());
			smt.setInt(11,sa_AssignTest.getCivics());
			smt.setInt(12,sa_AssignTest.getPhysical());
			smt.setInt(13,sa_AssignTest.getChemical());
			smt.setInt(14,sa_AssignTest.getBiology());
			

			// 存在則寫入-1 不存在則不操作維持原本的值-2

//			for (int i = 0; i < subject.length; i++)
//			{
//				if (subject[i] != -1)
//				{
//					smt.setInt(i + 5, -1);
//				}
//				else
//				{
//					smt.setInt(i + 5, -2);
//				}
//			}

			

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

	public void testRegister(sa_BasicTest sa_BasicTest)
	{
		String sql = "INSERT sa_BasicTest(account,identity,testPlace,note) " + "VALUES(?,?,?,?)";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, sa_BasicTest.getAccount());
			// smt.setString(2, sa_BasicTest.getType());
			// smt.setInt(3, sa_BasicTest.getMoney());
			// smt.setString(3, sa_BasicTest.getState());
			smt.setString(2, sa_BasicTest.getIdentity());
			// smt.setString(5, sa_BasicTest.getCode());
			smt.setString(3, sa_BasicTest.getTestplace());
			smt.setString(4, sa_BasicTest.getNote());
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

	public void testRegister(sa_EnglishListening sa_EnglishListening)
	{
		String sql = "INSERT sa_EnglishListening(account,identity,testPlace,note) " + "VALUES(?,?,?,?)";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, sa_EnglishListening.getAccount());
			smt.setString(2, sa_EnglishListening.getIdentity());
			smt.setString(3, sa_EnglishListening.getTestplace());
			smt.setString(4, sa_EnglishListening.getNote());
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

	public sa_AssignTest AssignTestGrade(Student student)
	{

		return assignTest;
	}

	public sa_BasicTest BasicTestGrade(Student student)
	{
		String sql = "SELECT * FROM sa_BasicTest WHERE account = ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, student.getAccount());
			rs = smt.executeQuery();
			if (rs.next())
			{
				basicTest.setAccount(rs.getString("account"));

				basicTest.setChinese(rs.getInt("Chinese"));
				basicTest.setEnglish(rs.getInt("English"));
				basicTest.setMath(rs.getInt("Math"));
				basicTest.setSociety(rs.getInt("Society"));
				basicTest.setScience(rs.getInt("Science"));

				basicTest.setTestid(rs.getString("testID"));
				basicTest.setType(rs.getString("type"));
				basicTest.setMoney(rs.getInt("money"));
				basicTest.setState(rs.getString("state"));
				basicTest.setIdentity(rs.getString("identity"));
				basicTest.setCode(rs.getString("code"));
				basicTest.setNote(rs.getString("note"));

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
		return basicTest;
	}

	public sa_EnglishListening EnglishTestGrade(Student student)
	{
		String sql = "SELECT * FROM sa_EnglishListening WHERE account = ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, student.getAccount());
			rs = smt.executeQuery();
			if (rs.next())
			{
				englishListening.setAccount(rs.getString("account"));

				englishListening.setScore(rs.getInt("score"));

				englishListening.setTestid(rs.getString("testID"));
				englishListening.setType(rs.getString("type"));
				englishListening.setMoney(rs.getInt("money"));
				englishListening.setState(rs.getString("state"));
				englishListening.setIdentity(rs.getString("identity"));
				englishListening.setCode(rs.getString("code"));
				englishListening.setNote(rs.getString("note"));

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
		return englishListening;
	}

	// @Override
	// public sa_AssignTest AssignTestGrade(Student student)
	// {
	// // TODO Auto-generated method stub
	// return null;
	// }
}
