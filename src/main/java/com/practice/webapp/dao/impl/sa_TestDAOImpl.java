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
		// int chinese = Arrays.binarySearch(sa_AssignTest.getSubject(), "國文");
		// int eng = Arrays.binarySearch(sa_AssignTest.getSubject(), "英文");
		// int matha = Arrays.binarySearch(sa_AssignTest.getSubject(), "數甲");
		// int mathb = Arrays.binarySearch(sa_AssignTest.getSubject(), "數乙");
		// int physical = Arrays.binarySearch(sa_AssignTest.getSubject(), "物理");
		// int chemical = Arrays.binarySearch(sa_AssignTest.getSubject(), "化學");
		// int biologyg = Arrays.binarySearch(sa_AssignTest.getSubject(), "生物");
		// int geography = Arrays.binarySearch(sa_AssignTest.getSubject(),
		// "地理");
		// int history = Arrays.binarySearch(sa_AssignTest.getSubject(), "歷史");
		// int civics = Arrays.binarySearch(sa_AssignTest.getSubject(), "公民");

		// 將科目判後結果串入陣列中
		// int[] subject = new int[]
		// { chinese, eng, matha, mathb, history, geography, civics, physical,
		// chemical, biologyg };
		//
		// for (int i : subject)
		// {
		// System.out.println(i+" ");
		// }

		int[] subject = new int[]
		{ sa_AssignTest.getChemical(), sa_AssignTest.getBiology(), sa_AssignTest.getChinese(),
				sa_AssignTest.getCivics(), sa_AssignTest.getEnglish(), sa_AssignTest.getGeography(),
				sa_AssignTest.getHistory(), sa_AssignTest.getMathA(), sa_AssignTest.getMathB(),
				sa_AssignTest.getPhysical() };

		int subjectCount = 0;
		int money = 0;

		for (int i = 0; i < subject.length; i++)
		{
			if (subject[i] == -1)
			{
				subjectCount++;
			}
		}
		if (sa_AssignTest.getIdentity().equals("一般生"))
		{
			money = 250 + 170 * subjectCount;
		}
		else if (sa_AssignTest.getIdentity().equals("中低收入戶"))
		{
			money = 175 + 119 * subjectCount;
		}
		else if (sa_AssignTest.getIdentity().equals("低收入戶"))
		{
			money = 0;
		}

		String sql = "INSERT sa_AssignTest(account,identity,testPlace,note,Chinese,English,MathA,MathB,History,Geography,Civics,Physical,Chemical,Biology,money) "
				+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, sa_AssignTest.getAccount());
			smt.setString(2, sa_AssignTest.getIdentity());
			smt.setString(3, sa_AssignTest.getTestplace());
			smt.setString(4, sa_AssignTest.getNote());
			smt.setInt(5, sa_AssignTest.getChinese());
			smt.setInt(6, sa_AssignTest.getEnglish());
			smt.setInt(7, sa_AssignTest.getMathA());
			smt.setInt(8, sa_AssignTest.getMathB());
			smt.setInt(9, sa_AssignTest.getHistory());
			smt.setInt(10, sa_AssignTest.getGeography());
			smt.setInt(11, sa_AssignTest.getCivics());
			smt.setInt(12, sa_AssignTest.getPhysical());
			smt.setInt(13, sa_AssignTest.getChemical());
			smt.setInt(14, sa_AssignTest.getBiology());
			smt.setInt(15, money);

			// 存在則寫入-1 不存在則不操作維持原本的值-2

			// for (int i = 0; i < subject.length; i++)
			// {
			// if (subject[i] != -1)
			// {
			// smt.setInt(i + 5, -1);
			// }
			// else
			// {
			// smt.setInt(i + 5, -2);
			// }
			// }

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
		int money = 0;
		if (sa_BasicTest.getIdentity().equals("一般生"))
		{
			money = 1100;
		}
		else if (sa_BasicTest.getIdentity().equals("中低收入戶")){
			money = 366;
		}
		else if (sa_BasicTest.getIdentity().equals("低收入戶")){
			money = 0;
		}
		
		String sql = "INSERT sa_BasicTest(account,identity,testPlace,note,money) " + "VALUES(?,?,?,?,?)";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, sa_BasicTest.getAccount());
			smt.setString(2, sa_BasicTest.getIdentity());
			smt.setString(3, sa_BasicTest.getTestplace());
			smt.setString(4, sa_BasicTest.getNote());
			smt.setInt(5, money);
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
		int money=0;
		 
		if(sa_EnglishListening.getIdentity().equals("一般生")){
			 money = 350;
		 }
		 else{
			 money = 245;
		 }
		String sql = "INSERT sa_EnglishListening(account,identity,testPlace,note,money) " + "VALUES(?,?,?,?,?)";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, sa_EnglishListening.getAccount());
			smt.setString(2, sa_EnglishListening.getIdentity());
			smt.setString(3, sa_EnglishListening.getTestplace());
			smt.setString(4, sa_EnglishListening.getNote());
			smt.setInt(5,money);
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
		String sql = "SELECT * FROM sa_AssignTest WHERE account = ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, student.getAccount());
			rs = smt.executeQuery();
			if (rs.next())
			{
				assignTest.setAccount(rs.getString("account"));

				assignTest.setChinese(rs.getInt("Chinese"));
				assignTest.setEnglish(rs.getInt("English"));
				assignTest.setMathA(rs.getInt("MathA"));
				assignTest.setMathB(rs.getInt("MathB"));
				assignTest.setBiology(rs.getInt("Biology"));
				assignTest.setChemical(rs.getInt("Chemical"));
				assignTest.setCivics(rs.getInt("Civics"));

				assignTest.setGeography(rs.getInt("MathA"));
				assignTest.setHistory(rs.getInt("History"));

				assignTest.setPhysical(rs.getInt("Physical"));

				assignTest.setTestid(rs.getString("testID"));
				assignTest.setType(rs.getString("type"));
				assignTest.setMoney(rs.getInt("money"));
				assignTest.setState(rs.getString("state"));
				assignTest.setIdentity(rs.getString("identity"));
				assignTest.setCode(rs.getString("code"));
				assignTest.setNote(rs.getString("note"));

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

	@Override
	public boolean asTestCheck(Student student)
	{
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM sa_AssignTest where account=?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);

			smt.setString(1, student.getAccount());

			rs = smt.executeQuery();
			if (rs.next())
			{
				return true;
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
		return false;
	}

	@Override
	public boolean bsTestCheck(Student student)
	{
		String sql = "SELECT * FROM sa_BasicTest where account=?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);

			smt.setString(1, student.getAccount());

			rs = smt.executeQuery();
			if (rs.next())
			{
				return true;
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
		return false;
	}

	@Override
	public boolean engTestCheck(Student student)
	{
		String sql = "SELECT * FROM sa_EnglishListening where account=?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);

			smt.setString(1, student.getAccount());

			rs = smt.executeQuery();
			if (rs.next())
			{
				return true;
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
		return false;
	}

}
