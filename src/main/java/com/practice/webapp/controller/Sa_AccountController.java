package com.practice.webapp.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.dao.StudentDAO;
import com.practice.webapp.dao.sa_AccountDAO;
import com.practice.webapp.entity.Student;

@Controller
public class Sa_AccountController
{

	ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");

	// account ==================================================

	@RequestMapping(value = "/sa_login", method = RequestMethod.GET)
	public ModelAndView login()
	{
		Student account_session = (Student) context.getBean("studentinfo");
		if (account_session.getAccount() != null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_perSearch");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_login");
			return model;
		}
	}
	// 登入判斷 並寫入session===============================================

	@RequestMapping(value = "/sa_login", method = RequestMethod.POST)
	public ModelAndView checkLogin(@ModelAttribute Student student)
	{
		ModelAndView model = new ModelAndView("redirect:/sa_homepage");

		// connect to database==============

		sa_AccountDAO accountCheck = (sa_AccountDAO) context.getBean("accountCheck");

		int State = accountCheck.loginCheck(student);

		if (State == 1)
		{
			System.out.println("failed!");
			model = new ModelAndView("sa_login");
			model.addObject("message", "無此帳號");
			Student account_session = (Student) context.getBean("studentinfo");
			account_session.setAccount("");
			account_session.setPwd("");
		}
		else if (State == 2)
		{
			System.out.println("failed!");
			model = new ModelAndView("sa_login");
			model.addObject("message", "帳號存在  密碼錯誤");
			Student account_session = (Student) context.getBean("studentinfo");
			account_session.setAccount("");
			account_session.setPwd("");
		}
		else
		{
			System.out.println("Successful!");
			// 建立student 物件
			Student account_session = (Student) context.getBean("studentinfo");

			// student account pass to sql for set student attribute
			StudentDAO studentDAO = (StudentDAO) context.getBean("studentDAO");

			// must be set this attribute for search
			account_session.setAccount(student.getAccount());

			// account_session set attribute
			account_session = studentDAO.setSession(account_session);
			System.out.println("登入資訊：");
			System.out.println("帳號：" + account_session.getAccount());
			System.out.println("密碼：" + account_session.getPwd());
			System.out.println("姓名：" + account_session.getName());
			System.out.println("性別：" + account_session.getSex());
			System.out.println("地址：" + account_session.getAddress());
			System.out.println("身分證：" + account_session.getId());
			System.out.println("生日：" + account_session.getBirth());
			System.out.println("電話：" + account_session.getTel());
			// 印出session帳號密碼
		}
		return model;
	}

	// logout & clean session===============================================
	@RequestMapping(value = "/sa_logout", method = RequestMethod.GET)
	public ModelAndView Logout()
	{

		Student account_session = (Student) context.getBean("studentinfo");
		// account_session.setAccount(""); "" != null
		account_session.setAccount(null);
		account_session.setAddress(null);
		account_session.setBirth(null);
		account_session.setCode(null);
		account_session.setEmail(null);
		account_session.setId(null);
		account_session.setName(null);
		account_session.setPwd(null);
		account_session.setSex(null);
		account_session.setTel(null);

		System.out.println(account_session.getAccount());
		System.out.println("清空session 成功登出 ");
		ModelAndView model = new ModelAndView("redirect:/sa_homepage");
		return model;
	}

	@RequestMapping(value = "/sa_accountcheck", method = RequestMethod.GET)
	public ModelAndView sa_accountcheckPage(@ModelAttribute Student student) throws UnsupportedEncodingException
	{
		// @ModelAttribute 去接傳近來的值

		String name = student.getName();
		// String account = student.getAccount();
		// String pwd = student.getPwd();
		// String id = student.getId();
		String sex = student.getSex();
		// String birth = student.getBirth();
		// String tel = student.getTel();
		// String email = student.getEmail();
		String address = student.getAddress();

		// 轉換 中文 編碼
		name = new String(name.getBytes("ISO-8859-1"), "utf-8");
		address = new String(address.getBytes("ISO-8859-1"), "utf-8");
		sex = new String(sex.getBytes("ISO-8859-1"), "utf-8");

		student.setAddress(address);
		student.setName(name);
		student.setSex(sex);

		ModelAndView model = new ModelAndView("sa_accountcheck");
		model.addObject("student", student);

		return model;
	}

	// 確認無誤,此段寫入資料庫 12.15 綠蓋新增 問題500 按鈕form注意 submit 修改 href=================
	// 12/21新增註冊判斷
	@RequestMapping(value = "/sa_accountcheck", method = RequestMethod.POST)
	public ModelAndView sa_accountcheck(@ModelAttribute Student student)
	{
		ModelAndView model = new ModelAndView("sa_homepage");
		ModelAndView model1 = new ModelAndView("sa_accountregister");

		StudentDAO studentDAO = (StudentDAO) context.getBean("studentDAO");

		if (studentDAO.accountCheck(student))
		{
			model1.addObject("message", "帳號重複註冊");
			System.out.println("帳號重複");
			return model1;
		}
		else if (studentDAO.idCheck(student))
		{
			model1.addObject("message1", "身分證已重複使用");
			System.out.println("身份證重複");
			return model1;
		}
		else
		{
			System.out.println("註冊成功");
			studentDAO.insertStu(student);
			return model;
		}
		
	}

	// 登入帳號註冊部分==========================
	@RequestMapping(value = "/sa_accountregister", method = RequestMethod.GET)
	public ModelAndView sa_accountregisterPage()
	{
		Student account_session = (Student) context.getBean("studentinfo");
		if (account_session.getAccount() != null)
		{
			ModelAndView model = new ModelAndView("sa_homepage");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_accountregister");
			return model;
		}
	}

	@RequestMapping(value = "/sa_accountregister", method = RequestMethod.POST)
	public ModelAndView sa_accountregister(/* @ModelAttribute Student student */)
	{
		// ModelAndView model = new ModelAndView("redirect:/sa_accountcheck");
		ModelAndView model = new ModelAndView("sa_accountcheck");
		return model;
	}

}
