package com.practice.webapp.controller;


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
	
	//登入判斷 並寫入session===============================================
	
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
			//建立student 物件
			Student account_session = (Student) context.getBean("studentinfo");
			
			//student account pass to sql for set student attribute
			StudentDAO studentDAO = (StudentDAO) context.getBean("studentDAO");
            
		   //must be set this attribute for search
			account_session.setAccount(student.getAccount());
			
			//account_session set attribute
			account_session = studentDAO.setSession(account_session);
			System.out.println("登入資訊：");
			System.out.println("帳號："+account_session.getAccount());
			System.out.println("密碼："+ account_session.getPwd());
			System.out.println("姓名："+ account_session.getName());
			System.out.println("性別："+ account_session.getSex());
			System.out.println("地址："+account_session.getAddress());
			System.out.println("身分證："+account_session.getId());
			System.out.println("生日："+account_session.getBirth());
			System.out.println("電話："+account_session.getTel());
			// 印出session帳號密碼
		}
		return model;
	}
	
	//logout & clean session===============================================
	@RequestMapping(value = "/sa_logout", method = RequestMethod.GET)
	public ModelAndView Logout(){
		
		Student account_session = (Student) context.getBean("studentinfo");
        //account_session.setAccount("");  "" != null
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

	
}
