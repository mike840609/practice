package com.practice.webapp.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
		ModelAndView model = new ModelAndView("redirect:/sa_register");

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
			Student account_session = (Student) context.getBean("studentinfo");
			account_session.setAccount(student.getAccount());
			account_session.setPwd(student.getPwd());
			account_session.setAddress(student.getAddress());
			account_session.setBirth(student.getBirth());
			account_session.setName(student.getName());
			account_session.setId(student.getId());
			account_session.setSex(student.getSex());
			account_session.setTel(student.getTel());
			account_session.setEmail(student.getEmail());
			
			System.out.println(account_session.getAccount());
			System.out.println(account_session.getPwd());
			System.out.println(account_session.getName());
			System.out.println(account_session.getSex());
			System.out.println(account_session.getAddress());

			// 印出session帳號密碼

		}
		return model;
	}
	
	//logout & clean session===============================================
//	@RequestMapping(value = "/sa_logout", method = RequestMethod.GET)
//	public ModelAndView Logout(@ModelAttribute Student student,HttpSession session){
//		ModelAndView model = new ModelAndView("redirect:/sa_homepage");
////		Student account_session = (Student) context.getBean("studentinfo");
//		
//		return model;
//	}

	
}
