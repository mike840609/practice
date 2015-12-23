package com.practice.webapp.dao.impl;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

//import apache poi
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

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

	// File read and writeTo mariaDB
	@Override
	public void groupRegister(sa_School sa_School)
	{
		String sql = "INSERT student(account,pwd,code,id,name,sex,birth,tel,address,email) " + "VALUES(?,?,?,?,?,?,?,?,?,?)";
		
		File file = new File("/Users/mike840609/Documents/workspace/practice/school.xls");
		
		try
		{
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			
			// 創建工作簿
			HSSFWorkbook workbook = new HSSFWorkbook(FileUtils.openInputStream(file));
			// 創建工作表
			HSSFSheet sheet = workbook.getSheetAt(0);
			// 開頭Row
			// 二階陣列用來儲存值
			String[][] studentArray = new String[sheet.getLastRowNum()+1][10];

			for (int i = 1; i <= sheet.getLastRowNum(); i++)
			{
				HSSFRow row = sheet.getRow(i);

				for (int j = 0; j < row.getLastCellNum(); j++)
				{
					HSSFCell cell = row.getCell(j);
					cell.setCellType(Cell.CELL_TYPE_STRING);
					String value = cell.getStringCellValue();
					System.out.print(value + "  ");
					studentArray[i][j] = value;
				}
				System.out.println();
			}
			
			//SAVE  data 2 DB
			for(int i=1;i<studentArray.length;i++){
				smt.setString(1,studentArray[i][0]);
				smt.setString(2,studentArray[i][1]);
				smt.setString(3,studentArray[i][2]);
				smt.setString(4,studentArray[i][3]);
				smt.setString(5,studentArray[i][4]);
				smt.setString(6,studentArray[i][5]);
				smt.setString(7,studentArray[i][6]);
				smt.setString(8,studentArray[i][7]);
				smt.setString(9,studentArray[i][8]);
				smt.setString(10,studentArray[i][9]);
				smt.executeUpdate();
			}
			
			smt.close();
			
			
//			System.out.println("==================================迴圈列印=====================================");
//			for (int i = 1; i <= 10; i++)
//			{
//				HSSFRow row = sheet.getRow(i);
//
//				for (int j = 0; j < 10; j++)
//				{
//				
//					System.out.print(studentArray[i][j] +"  ");
//					
//				}
//				System.out.println();
//			}
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
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
