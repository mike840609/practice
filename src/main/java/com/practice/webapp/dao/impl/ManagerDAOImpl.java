package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.practice.webapp.dao.ManagerDAO;
import com.practice.webapp.entity.Student;
import com.practice.webapp.entity.sa_managerAssignTest;
import com.practice.webapp.entity.sa_managerBasicTest;
import com.practice.webapp.entity.sa_managerEnglishListening;

public class ManagerDAOImpl implements ManagerDAO
{
	private DataSource dataSource;
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement smt = null;

	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}

	// Ū���Ǵ���ƪ�s�WList��æs����List
	public List<sa_managerBasicTest> getbasictestList()
	{
		// TODO Auto-generated method stub
		List<sa_managerBasicTest> basictestList = new ArrayList<sa_managerBasicTest>();
		String sql = "SELECT * FROM sa_basictest";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while (rs.next())
			{
				sa_managerBasicTest basictest = new sa_managerBasicTest();
				basictest.setAccount(rs.getString("account"));
				basictest.setTestid(rs.getString("testid"));
				basictest.setMoney(rs.getString("money"));
				basictest.setState(rs.getString("state"));
				basictest.setIdentity(rs.getString("identity"));
				basictest.setCode(rs.getString("code"));
				basictest.setTestplace(rs.getString("testPlace"));
				basictest.setType(rs.getString("type"));
				basictest.setNote(rs.getString("note"));
				basictestList.add(basictest);
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
		return basictestList;
	}

	// Ū�����Ҹ�ƪ�÷s�WList��s����List
	public List<sa_managerAssignTest> getassigntestList()
	{
		// TODO Auto-generated method stub
		List<sa_managerAssignTest> assigntestList = new ArrayList<sa_managerAssignTest>();
		String sql = "SELECT * FROM sa_assigntest";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while (rs.next())
			{
				sa_managerAssignTest assigntest = new sa_managerAssignTest();
				assigntest.setAccount(rs.getString("account"));
				assigntest.setTestid(rs.getString("testid"));
				assigntest.setMoney(rs.getString("money"));
				assigntest.setState(rs.getString("state"));
				assigntest.setIdentity(rs.getString("identity"));
				assigntest.setCode(rs.getString("code"));
				assigntest.setTestplace(rs.getString("testPlace"));
				assigntest.setType(rs.getString("type"));
				assigntest.setChinese(rs.getString("Chinese"));
				assigntest.setMathA(rs.getString("MathA"));
				assigntest.setMathB(rs.getString("MathB"));
				assigntest.setEnglish(rs.getString("English"));
				assigntest.setGeography(rs.getString("Geography"));
				assigntest.setHistory(rs.getString("History"));
				assigntest.setCivics(rs.getString("Civics"));
				assigntest.setBiology(rs.getString("Biology"));
				assigntest.setChemical(rs.getString("Chemical"));
				assigntest.setPhysical(rs.getString("Physical"));
				assigntest.setNote(rs.getString("note"));
				assigntestList.add(assigntest);
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
		return assigntestList;
	}

	// Ū���^ť��ƪ�÷s�WList��s����List
	public List<sa_managerEnglishListening> getenglishlisteningList()
	{
		// TODO Auto-generated method stub
		List<sa_managerEnglishListening> englishlisteningList = new ArrayList<sa_managerEnglishListening>();
		String sql = "SELECT * FROM sa_englishlistening";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while (rs.next())
			{
				sa_managerEnglishListening englishlistening = new sa_managerEnglishListening();
				englishlistening.setAccount(rs.getString("account"));
				englishlistening.setTestid(rs.getString("testid"));
				englishlistening.setMoney(rs.getString("money"));
				englishlistening.setState(rs.getString("state"));
				englishlistening.setIdentity(rs.getString("identity"));
				englishlistening.setCode(rs.getString("code"));
				englishlistening.setTestplace(rs.getString("testPlace"));
				englishlistening.setType(rs.getString("type"));
				englishlistening.setScore(rs.getString("score"));
				englishlistening.setNote(rs.getString("note"));
				englishlisteningList.add(englishlistening);
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
		return englishlisteningList;
	}

	// Ū���b����ƪ�÷s�WList��s����List
	public List<Student> getstudentList()
	{
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<Student>();
		String sql = "SELECT * FROM student";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while (rs.next())
			{
				Student student = new Student();
				student.setAccount(rs.getString("account"));
				student.setPwd(rs.getString("code"));
				student.setId(rs.getString("id"));
				student.setName(rs.getString("name"));
				student.setSex(rs.getString("sex"));
				student.setBirth(rs.getString("birth"));
				student.setTel(rs.getString("tel"));
				student.setAddress(rs.getString("address"));
				student.setEmail(rs.getString("email"));
				studentList.add(student);
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

	// get����
	// get �z�L�Ǵ� account�ӧ����L���
	public sa_managerBasicTest getBT(sa_managerBasicTest basictest)
	{
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM sa_basictest WHERE account = ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, basictest.getAccount());
			rs = smt.executeQuery();
			if (rs.next())
			{
				basictest.setAccount(rs.getString("account"));
				basictest.setTestid(rs.getString("testid"));
				basictest.setMoney(rs.getString("money"));
				basictest.setState(rs.getString("state"));
				basictest.setIdentity(rs.getString("identity"));
				basictest.setCode(rs.getString("code"));
				basictest.setType(rs.getString("type"));
				basictest.setChinese(rs.getString("Chinese"));
				basictest.setMath(rs.getString("Math"));
				basictest.setEnglish(rs.getString("English"));
				basictest.setSociety(rs.getString("Society"));
				basictest.setScience(rs.getString("Science"));
				basictest.setTestplace(rs.getString("testplace"));
				basictest.setNote(rs.getString("note"));
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
		return basictest;
	}

	// get �z�L���� account�ӧ����L���
	public sa_managerAssignTest getAT(sa_managerAssignTest assigntest)
	{
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM sa_assigntest WHERE account = ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, assigntest.getAccount());
			rs = smt.executeQuery();
			if (rs.next())
			{
				assigntest.setAccount(rs.getString("account"));
				assigntest.setTestid(rs.getString("testid"));
				assigntest.setMoney(rs.getString("money"));
				assigntest.setState(rs.getString("state"));
				assigntest.setIdentity(rs.getString("identity"));
				assigntest.setCode(rs.getString("code"));
				assigntest.setType(rs.getString("type"));
				assigntest.setChinese(rs.getString("Chinese"));
				assigntest.setMathA(rs.getString("MathA"));
				assigntest.setMathB(rs.getString("MathB"));
				assigntest.setEnglish(rs.getString("English"));
				assigntest.setGeography(rs.getString("Geography"));
				assigntest.setHistory(rs.getString("History"));
				assigntest.setCivics(rs.getString("Civics"));
				assigntest.setPhysical(rs.getString("Physical"));
				assigntest.setChemical(rs.getString("Chemical"));
				assigntest.setBiology(rs.getString("Biology"));
				assigntest.setTestplace(rs.getString("testplace"));
				assigntest.setNote(rs.getString("note"));
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
		return assigntest;
	}

	// get �z�L�^ť account�ӧ����L���
	public sa_managerEnglishListening getEL(sa_managerEnglishListening englishlistening)
	{
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM sa_englishlistening WHERE account = ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, englishlistening.getAccount());
			rs = smt.executeQuery();
			if (rs.next())
			{
				englishlistening.setAccount(rs.getString("account"));
				englishlistening.setTestid(rs.getString("testid"));
				englishlistening.setMoney(rs.getString("money"));
				englishlistening.setState(rs.getString("state"));
				englishlistening.setIdentity(rs.getString("identity"));
				englishlistening.setCode(rs.getString("code"));
				englishlistening.setType(rs.getString("type"));
				englishlistening.setScore(rs.getString("score"));
				englishlistening.setTestplace(rs.getString("testplace"));
				englishlistening.setNote(rs.getString("note"));
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
		return englishlistening;
	}

	// �z�Laccount�ӧ��ҥͱb�����
	public Student getSTU(Student student)
	{
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM student WHERE account = ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, student.getAccount());
			rs = smt.executeQuery();
			if (rs.next())
			{
				student.setAccount(rs.getString("account"));
				student.setPwd(rs.getString("pwd"));
				student.setId(rs.getString("id"));
				student.setName(rs.getString("name"));
				student.setSex(rs.getString("sex"));
				student.setBirth(rs.getString("birth"));
				student.setTel(rs.getString("tel"));
				student.setAddress(rs.getString("address"));
				student.setEmail(rs.getString("email"));
				student.setCode(rs.getString("code"));
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
		return student;
	}

	// update���
	// update�Ǵ����
	public void updateBT(sa_managerBasicTest basictest)
	{
		// TODO Auto-generated method stub
		String sql = "UPDATE sa_basictest SET testid=?, state=?, testPlace=?" + "WHERE account = ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, basictest.getTestid());
			smt.setString(2, basictest.getState());
			smt.setString(3, basictest.getTestplace());
			smt.setString(4, basictest.getAccount());
			// �Ʀr�n�P�W������
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

	// update�Ǵ����
	public void updateAT(sa_managerAssignTest assigntest)
	{
		// TODO Auto-generated method stub
		String sql = "UPDATE sa_assigntest SET testid=?, state=?, testPlace=?" + " WHERE account = ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, assigntest.getTestid());
			smt.setString(2, assigntest.getState());
			smt.setString(3, assigntest.getTestplace());
			smt.setString(4, assigntest.getAccount());
			// �Ʀr�n�P�W������
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

	// update�^ť���
	public void updateEL(sa_managerEnglishListening englishlistening)
	{
		// TODO Auto-generated method stub
		String sql = "UPDATE sa_englishlistening SET testid=?, state=?, testPlace=?" + "WHERE account = ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, englishlistening.getTestid());
			smt.setString(2, englishlistening.getState());
			smt.setString(3, englishlistening.getTestplace());
			smt.setString(4, englishlistening.getAccount());
			// �Ʀr�n�P�W������
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

	// �ҥͱb����Ƨ�s
	public void updateSTU(Student student)
	{
		// TODO Auto-generated method stub
		String sql = "UPDATE student SET code=?, name=?, tel=?, id=?, sex=?, birth=?, address=?, email=?"
				+ "WHERE account = ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, student.getPwd());
			smt.setString(2, student.getName());
			smt.setString(3, student.getTel());
			smt.setString(4, student.getId());
			smt.setString(5, student.getSex());
			smt.setString(6, student.getBirth());
			smt.setString(7, student.getAddress());
			smt.setString(8, student.getEmail());
			smt.setString(9, student.getAccount());
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

	// �妸�ק�ú�O����
	// �Ǵ��妸�ק�ú�O���A
	public void payupdateBT(sa_managerBasicTest basictest)
	{

		String chkbox[] = sa_managerBasicTest.getCheckbox();
		int length = java.lang.reflect.Array.getLength(sa_managerBasicTest.getCheckbox());
		for (int i = 0; i < length; i++)
		{
			String sql = "UPDATE sa_basictest SET state = '已繳費'" + "WHERE account = ?";
			try
			{
				conn = dataSource.getConnection();
				smt = conn.prepareStatement(sql);
				smt.setString(1, chkbox[i]);
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
	}

	public void payupdateAT(sa_managerAssignTest assigntest)
	{
		String chkbox[] = sa_managerAssignTest.getCheckbox();
		// �z�L�}�C�x�scheckbox�̪���
		int length = java.lang.reflect.Array.getLength(sa_managerAssignTest.getCheckbox());
		// �ŧi�}�C����
		for (int i = 0; i < length; i++)
		{
			String sql = "UPDATE sa_assigntest SET state = '已繳費'" + "WHERE account = ?";
			try
			{
				conn = dataSource.getConnection();
				smt = conn.prepareStatement(sql);
				smt.setString(1, chkbox[i]);
				// �Ʀr�n�P�W�������A�z�L�j��̧�Ū����
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
	}

	// �^ť�妸�ק�ú�O���A
	public void payupdateEL(sa_managerEnglishListening englishlistening)
	{
		String chkbox[] = sa_managerEnglishListening.getCheckbox();
		// �z�L�}�C�x�scheckbox�̪���
		int length = java.lang.reflect.Array.getLength(sa_managerEnglishListening.getCheckbox());
		// �ŧi�}�C����
		for (int i = 0; i < length; i++)
		{
			String sql = "UPDATE sa_englishlistening SET state = '已繳費'" + "WHERE account = ?";
			try
			{
				conn = dataSource.getConnection();
				smt = conn.prepareStatement(sql);
				smt.setString(1, chkbox[i]);
				// �Ʀr�n�P�W�������A�z�L�j��̧�Ū����
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
	}

	public List<sa_managerBasicTest> getBTsearchList(sa_managerBasicTest basictest)
	{
		// TODO Auto-generated method stub
		List<sa_managerBasicTest> basictestList = new ArrayList<sa_managerBasicTest>();
		String sql = "SELECT * FROM sa_basictest WHERE state LIKE ? AND identity LIKE ? AND account LIKE ? AND code LIKE ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, "%" + basictest.getState() + "%");
			smt.setString(2, "%" + basictest.getIdentity() + "%");
			smt.setString(3, "%" + basictest.getAccount() + "%");
			smt.setString(4, "%" + basictest.getCode() + "%");
			rs = smt.executeQuery();
			while (rs.next())
			{
				sa_managerBasicTest basictestsearch = new sa_managerBasicTest();
				basictestsearch.setAccount(rs.getString("account"));
				basictestsearch.setTestid(rs.getString("testid"));
				basictestsearch.setMoney(rs.getString("money"));
				basictestsearch.setState(rs.getString("state"));
				basictestsearch.setIdentity(rs.getString("identity"));
				basictestsearch.setCode(rs.getString("code"));
				basictestsearch.setTestplace(rs.getString("testPlace"));
				basictestsearch.setType(rs.getString("type"));
				basictestsearch.setNote(rs.getString("note"));
				basictestList.add(basictestsearch);
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
		return basictestList;
	}

	public List<sa_managerAssignTest> getATsearchList(sa_managerAssignTest assigntest)
	{
		// TODO Auto-generated method stub
		List<sa_managerAssignTest> assigntestList = new ArrayList<sa_managerAssignTest>();
		String sql = "SELECT * FROM sa_assigntest WHERE state LIKE ? AND identity LIKE ? AND account LIKE ? AND code LIKE ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, "%" + assigntest.getState() + "%");
			smt.setString(2, "%" + assigntest.getIdentity() + "%");
			smt.setString(3, "%" + assigntest.getAccount() + "%");
			smt.setString(4, "%" + assigntest.getCode() + "%");
			rs = smt.executeQuery();
			while (rs.next())
			{
				sa_managerAssignTest assigntestsearch = new sa_managerAssignTest();
				assigntestsearch.setAccount(rs.getString("account"));
				assigntestsearch.setTestid(rs.getString("testid"));
				assigntestsearch.setMoney(rs.getString("money"));
				assigntestsearch.setState(rs.getString("state"));
				assigntestsearch.setIdentity(rs.getString("identity"));
				assigntestsearch.setCode(rs.getString("code"));
				assigntestsearch.setTestplace(rs.getString("testPlace"));
				assigntestsearch.setType(rs.getString("type"));
				assigntestsearch.setNote(rs.getString("note"));
				assigntestList.add(assigntestsearch);
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
		return assigntestList;
	}

	public List<sa_managerEnglishListening> getELsearchList(sa_managerEnglishListening englishlistening)
	{
		// TODO Auto-generated method stub
		List<sa_managerEnglishListening> englishlisteningList = new ArrayList<sa_managerEnglishListening>();
		String sql = "SELECT * FROM sa_englishlistening WHERE state LIKE ? AND identity LIKE ? AND account LIKE ? AND code LIKE ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, "%" + englishlistening.getState() + "%");
			smt.setString(2, "%" + englishlistening.getIdentity() + "%");
			smt.setString(3, "%" + englishlistening.getAccount() + "%");
			smt.setString(4, "%" + englishlistening.getCode() + "%");
			rs = smt.executeQuery();
			while (rs.next())
			{
				sa_managerEnglishListening englishlisteningsearch = new sa_managerEnglishListening();
				englishlisteningsearch.setAccount(rs.getString("account"));
				englishlisteningsearch.setTestid(rs.getString("testid"));
				englishlisteningsearch.setMoney(rs.getString("money"));
				englishlisteningsearch.setState(rs.getString("state"));
				englishlisteningsearch.setIdentity(rs.getString("identity"));
				englishlisteningsearch.setCode(rs.getString("code"));
				englishlisteningsearch.setTestplace(rs.getString("testPlace"));
				englishlisteningsearch.setType(rs.getString("type"));
				englishlisteningsearch.setNote(rs.getString("note"));
				englishlisteningList.add(englishlisteningsearch);
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
		return englishlisteningList;
	}

	public List<Student> getSTUsearchList(Student student)
	{
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<Student>();
		String sql = "SELECT * FROM student WHERE id LIKE ? AND account LIKE ? ";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, "%" + student.getId() + "%");
			smt.setString(2, "%" + student.getAccount() + "%");
			rs = smt.executeQuery();
			while (rs.next())
			{
				Student studentsearch = new Student();
				studentsearch.setAccount(rs.getString("account"));
				studentsearch.setPwd(rs.getString("pwd"));
				studentsearch.setCode(rs.getString("code"));
				studentsearch.setId(rs.getString("id"));
				studentsearch.setName(rs.getString("name"));
				studentsearch.setSex(rs.getString("sex"));
				studentsearch.setBirth(rs.getString("birth"));
				studentsearch.setTel(rs.getString("tel"));
				studentsearch.setAddress(rs.getString("address"));
				studentsearch.setEmail(rs.getString("email"));
				studentList.add(studentsearch);
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

	public List<sa_managerBasicTest> getBTscoreList()
	{
		// TODO Auto-generated method stub
		List<sa_managerBasicTest> BTscoreList = new ArrayList<sa_managerBasicTest>();
		String sql = "SELECT * FROM sa_basictest ";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while (rs.next())
			{
				sa_managerBasicTest basictest = new sa_managerBasicTest();
				basictest.setAccount(rs.getString("account"));
				basictest.setTestid(rs.getString("testid"));
				basictest.setCode(rs.getString("code"));
				if (rs.getInt("Chinese") == -1)
				{
					basictest.setChinese("尚未公布");
				}
				else if (rs.getInt("Chinese") == -2)
				{
					basictest.setChinese("未報考");
				}
				else
				{
					basictest.setChinese(rs.getString("Chinese"));
				}
				if (rs.getInt("Math") == -1)
					basictest.setMath("尚未公布");
				else if (rs.getInt("Math") == -2)
				{
					basictest.setMath("未報考");
				}
				else
				{
					basictest.setMath(rs.getString("Math"));
				}
				if (rs.getInt("English") == -1)
				{
					basictest.setEnglish("尚未公布");
				}
				else if (rs.getInt("English") == -2)
				{
					basictest.setEnglish("未報考");
				}
				else
				{
					basictest.setEnglish(rs.getString("English"));
				}
				if (rs.getInt("Society") == -1)
				{
					basictest.setSociety("尚未公布");
				}
				else if (rs.getInt("Society") == -2)
				{
					basictest.setSociety("未報考");
				}
				else
				{
					basictest.setSociety(rs.getString("Society"));
				}
				if (rs.getInt("Science") == -1)
				{
					basictest.setScience("尚未公布");
				}
				else if (rs.getInt("Science") == -2)
				{
					basictest.setScience("未報考");
				}
				else
				{
					basictest.setScience(rs.getString("Science"));
				}
				BTscoreList.add(basictest);
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
		return BTscoreList;
	}

	public List<sa_managerAssignTest> getATscoreList()
	{
		// TODO Auto-generated method stub
		List<sa_managerAssignTest> ATscoreList = new ArrayList<sa_managerAssignTest>();
		String sql = "SELECT * FROM sa_assigntest ";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while (rs.next())
			{
				sa_managerAssignTest assigntest = new sa_managerAssignTest();
				assigntest.setAccount(rs.getString("account"));
				assigntest.setTestid(rs.getString("testid"));
				assigntest.setCode(rs.getString("code"));
				if (rs.getInt("Chinese") == -1)
				{
					assigntest.setChinese("尚未公佈");
				}
				else if (rs.getInt("Chinese") == -2)
				{
					assigntest.setChinese("未報考");
				}
				else
				{
					assigntest.setChinese(rs.getString("Chinese"));
				}
				if (rs.getInt("MathA") == -1)
					assigntest.setMathA("尚未公佈");
				else if (rs.getInt("MathA") == -2)
				{
					assigntest.setMathA("未報考");
				}
				else
				{
					assigntest.setMathA(rs.getString("MathA"));
				}
				if (rs.getInt("MathB") == -1)
					assigntest.setMathB("尚未公佈");
				else if (rs.getInt("MathB") == -2)
				{
					assigntest.setMathB("未報考");
				}
				else
				{
					assigntest.setMathB(rs.getString("MathB"));
				}
				if (rs.getInt("English") == -1)
				{
					assigntest.setEnglish("尚未公佈");
				}
				else if (rs.getInt("English") == -2)
				{
					assigntest.setEnglish("未報考");
				}
				else
				{
					assigntest.setEnglish(rs.getString("English"));
				}
				if (rs.getInt("History") == -1)
				{
					assigntest.setHistory("尚未公佈");
				}
				else if (rs.getInt("History") == -2)
				{
					assigntest.setHistory("未報考");
				}
				else
				{
					assigntest.setHistory(rs.getString("History"));
				}
				if (rs.getInt("Geography") == -1)
				{
					assigntest.setGeography("尚未公佈");
				}
				else if (rs.getInt("Geography") == -2)
				{
					assigntest.setGeography("尚未公佈");
				}
				else
				{
					assigntest.setGeography(rs.getString("Geography"));
				}
				if (rs.getInt("Civics") == -1)
				{
					assigntest.setCivics("尚未公佈");
				}
				else if (rs.getInt("Civics") == -2)
				{
					assigntest.setCivics("未報考");
				}
				else
				{
					assigntest.setCivics(rs.getString("Civics"));
				}
				if (rs.getInt("Physical") == -1)
				{
					assigntest.setPhysical("尚未公佈");
				}
				else if (rs.getInt("Physical") == -2)
				{
					assigntest.setPhysical("未報考");
				}
				else
				{
					assigntest.setPhysical(rs.getString("Physical"));
				}
				if (rs.getInt("Chemical") == -1)
				{
					assigntest.setChemical("尚未公佈");
				}
				else if (rs.getInt("Chemical") == -2)
				{
					assigntest.setChemical("未報考");
				}
				else
				{
					assigntest.setChemical(rs.getString("Chemical"));
				}
				if (rs.getInt("Biology") == -1)
				{
					assigntest.setBiology("尚未公佈");
				}
				else if (rs.getInt("Biology") == -2)
				{
					assigntest.setBiology("未報考");
				}
				else
				{
					assigntest.setBiology(rs.getString("Biology"));
				}
				ATscoreList.add(assigntest);
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
		return ATscoreList;
	}

	public List<sa_managerEnglishListening> getELscoreList()
	{
		// TODO Auto-generated method stub
		List<sa_managerEnglishListening> ELscoreList = new ArrayList<sa_managerEnglishListening>();
		String sql = "SELECT * FROM sa_englishlistening ";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while (rs.next())
			{
				sa_managerEnglishListening englishlistening = new sa_managerEnglishListening();
				englishlistening.setAccount(rs.getString("account"));
				englishlistening.setTestid(rs.getString("testid"));
				englishlistening.setCode(rs.getString("code"));
				if (rs.getInt("score") == -1)
				{
					englishlistening.setScore("尚未公佈");
				}
				else if (rs.getInt("score") == -2)
				{
					englishlistening.setScore("未報考");
				}
				else
				{
					englishlistening.setScore(rs.getString("score"));
				}
				ELscoreList.add(englishlistening);
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
		return ELscoreList;
	}

	public void updateBTscore(sa_managerBasicTest basictest)
	{
		// TODO Auto-generated method stub
		String sql = "UPDATE sa_basictest SET Chinese=?, Math=?, English=?, Society=?, Science=?" + "WHERE account = ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, basictest.getChinese());
			smt.setString(2, basictest.getMath());
			smt.setString(3, basictest.getEnglish());
			smt.setString(4, basictest.getSociety());
			smt.setString(5, basictest.getScience());
			smt.setString(6, basictest.getAccount());
			// �Ʀr�n�P�W������
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

	public void updateATscore(sa_managerAssignTest assigntest)
	{
		// TODO Auto-generated method stub
		String sql = "UPDATE sa_assigntest SET Chinese=?, MathA=?, MathB=?, English=?, Geography=?, "
				+ "History=?, Civics=?, Physical=?, Chemical=?, Biology=? " + "WHERE account=?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, assigntest.getChinese());
			smt.setString(2, assigntest.getMathA());
			smt.setString(3, assigntest.getMathB());
			smt.setString(4, assigntest.getEnglish());
			smt.setString(5, assigntest.getGeography());
			smt.setString(6, assigntest.getHistory());
			smt.setString(7, assigntest.getCivics());
			smt.setString(8, assigntest.getPhysical());
			smt.setString(9, assigntest.getChemical());
			smt.setString(10, assigntest.getBiology());
			smt.setString(11, assigntest.getAccount());
			// �Ʀr�n�P�W������
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

	public void updateELscore(sa_managerEnglishListening englishlistening)
	{
		// TODO Auto-generated method stub
		String sql = "UPDATE sa_englishlistening SET score=? " + "WHERE account=?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, englishlistening.getScore());
			smt.setString(2, englishlistening.getAccount());
			// �Ʀr�n�P�W������
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

	public List<sa_managerBasicTest> getBTScoresearchList(sa_managerBasicTest basictest)
	{
		// TODO Auto-generated method stub
		List<sa_managerBasicTest> basictestList = new ArrayList<sa_managerBasicTest>();
		String sql = "SELECT * FROM sa_basictest WHERE  account LIKE ? AND testid LIKE ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, "%" + basictest.getAccount() + "%");
			smt.setString(2, "%" + basictest.getTestid() + "%");
			rs = smt.executeQuery();
			while (rs.next())
			{
				sa_managerBasicTest basictestsearch = new sa_managerBasicTest();
				basictestsearch.setAccount(rs.getString("account"));
				basictestsearch.setTestid(rs.getString("testid"));
				basictestsearch.setCode(rs.getString("code"));
				if (rs.getInt("Chinese") == -1)
				{
					basictestsearch.setChinese("尚未公佈");
				}
				else if (rs.getInt("Chinese") == -2)
				{
					basictestsearch.setChinese("未報考");
				}
				else
				{
					basictestsearch.setChinese(rs.getString("Chinese"));
				}
				if (rs.getInt("Math") == -1)
					basictestsearch.setMath("尚未公佈");
				else if (rs.getInt("Math") == -2)
				{
					basictestsearch.setMath("未報考");
				}
				else
				{
					basictestsearch.setMath(rs.getString("Math"));
				}
				if (rs.getInt("English") == -1)
				{
					basictestsearch.setEnglish("尚未公佈");
				}
				else if (rs.getInt("English") == -2)
				{
					basictestsearch.setEnglish("未報考");
				}
				else
				{
					basictestsearch.setEnglish(rs.getString("English"));
				}
				if (rs.getInt("Society") == -1)
				{
					basictestsearch.setSociety("尚未公佈");
				}
				else if (rs.getInt("Society") == -2)
				{
					basictestsearch.setSociety("未報考");
				}
				else
				{
					basictestsearch.setSociety(rs.getString("Society"));
				}
				if (rs.getInt("Science") == -1)
				{
					basictestsearch.setScience("尚未公佈");
				}
				else if (rs.getInt("Science") == -2)
				{
					basictestsearch.setScience("未報考");
				}
				else
				{
					basictestsearch.setScience(rs.getString("Science"));
				}
				basictestList.add(basictestsearch);
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
		return basictestList;
	}

	public List<sa_managerAssignTest> getATScoresearchList(sa_managerAssignTest assigntest)
	{
		// TODO Auto-generated method stub
		List<sa_managerAssignTest> ATscoreList = new ArrayList<sa_managerAssignTest>();
		String sql = "SELECT * FROM sa_assigntest WHERE account LIKE ? AND testid LIKE ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, "%" + assigntest.getAccount() + "%");
			smt.setString(2, "%" + assigntest.getTestid() + "%");
			rs = smt.executeQuery();
			while (rs.next())
			{
				sa_managerAssignTest assigntestsearch = new sa_managerAssignTest();
				assigntestsearch.setAccount(rs.getString("account"));
				assigntestsearch.setTestid(rs.getString("testid"));
				assigntestsearch.setCode(rs.getString("code"));
				if (rs.getInt("Chinese") == -1)
				{
					assigntestsearch.setChinese("尚未公佈");
				}
				else if (rs.getInt("Chinese") == -2)
				{
					assigntestsearch.setChinese("未報考");
				}
				else
				{
					assigntestsearch.setChinese(rs.getString("Chinese"));
				}
				if (rs.getInt("MathA") == -1)
					assigntestsearch.setMathA("尚未公佈");
				else if (rs.getInt("MathA") == -2)
				{
					assigntestsearch.setMathA("未報考");
				}
				else
				{
					assigntestsearch.setMathA(rs.getString("MathA"));
				}
				if (rs.getInt("MathB") == -1)
					assigntestsearch.setMathB("尚未公佈");
				else if (rs.getInt("MathB") == -2)
				{
					assigntestsearch.setMathB("未報考");
				}
				else
				{
					assigntestsearch.setMathB(rs.getString("MathB"));
				}
				if (rs.getInt("English") == -1)
				{
					assigntestsearch.setEnglish("尚未公佈");
				}
				else if (rs.getInt("English") == -2)
				{
					assigntestsearch.setEnglish("未報考");
				}
				else
				{
					assigntestsearch.setEnglish(rs.getString("English"));
				}
				if (rs.getInt("History") == -1)
				{
					assigntestsearch.setHistory("尚未公佈");
				}
				else if (rs.getInt("History") == -2)
				{
					assigntestsearch.setHistory("未報考");
				}
				else
				{
					assigntestsearch.setHistory(rs.getString("History"));
				}
				if (rs.getInt("Geography") == -1)
				{
					assigntestsearch.setGeography("尚未公佈");
				}
				else if (rs.getInt("Geography") == -2)
				{
					assigntestsearch.setGeography("未報考");
				}
				else
				{
					assigntestsearch.setGeography(rs.getString("Geography"));
				}
				if (rs.getInt("Civics") == -1)
				{
					assigntestsearch.setCivics("尚未公佈");
				}
				else if (rs.getInt("Civics") == -2)
				{
					assigntestsearch.setCivics("未報考");
				}
				else
				{
					assigntestsearch.setCivics(rs.getString("Civics"));
				}
				if (rs.getInt("Physical") == -1)
				{
					assigntestsearch.setPhysical("尚未公佈");
				}
				else if (rs.getInt("Physical") == -2)
				{
					assigntestsearch.setPhysical("未報考");
				}
				else
				{
					assigntestsearch.setPhysical(rs.getString("Physical"));
				}
				if (rs.getInt("Chemical") == -1)
				{
					assigntestsearch.setChemical("尚未公佈");
				}
				else if (rs.getInt("Chemical") == -2)
				{
					assigntestsearch.setChemical("未報考");
				}
				else
				{
					assigntestsearch.setChemical(rs.getString("Chemical"));
				}
				if (rs.getInt("Biology") == -1)
				{
					assigntestsearch.setBiology("尚未公佈");
				}
				else if (rs.getInt("Biology") == -2)
				{
					assigntestsearch.setBiology("未報考");
				}
				else
				{
					assigntestsearch.setBiology(rs.getString("Biology"));
				}
				ATscoreList.add(assigntestsearch);
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
		return ATscoreList;
	}

	public List<sa_managerEnglishListening> getELScoresearchList(sa_managerEnglishListening englishlistening)
	{
		// TODO Auto-generated method stub
		List<sa_managerEnglishListening> ELscoreList = new ArrayList<sa_managerEnglishListening>();
		String sql = "SELECT * FROM sa_englishlistening WHERE  account LIKE ? AND testid LIKE ?";
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, "%" + englishlistening.getAccount() + "%");
			smt.setString(2, "%" + englishlistening.getTestid() + "%");
			rs = smt.executeQuery();
			while (rs.next())
			{
				sa_managerEnglishListening englishlisteningsearch = new sa_managerEnglishListening();
				englishlisteningsearch.setAccount(rs.getString("account"));
				englishlisteningsearch.setTestid(rs.getString("testid"));
				englishlisteningsearch.setCode(rs.getString("code"));
				if (rs.getInt("score") == -1)
				{
					englishlisteningsearch.setScore("尚未公佈");
				}
				else if (rs.getInt("score") == -2)
				{
					englishlisteningsearch.setScore("未報考");
				}
				else
				{
					englishlisteningsearch.setScore(rs.getString("score"));
				}
				ELscoreList.add(englishlisteningsearch);
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
		return ELscoreList;
	}
}
