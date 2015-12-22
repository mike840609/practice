package com.practice.webapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.dao.sa_TestDAO;
import com.practice.webapp.entity.Student;
import com.practice.webapp.entity.sa_AssignTest;
import com.practice.webapp.entity.sa_BasicTest;
import com.practice.webapp.entity.sa_EnglishListening;

@Controller
public class testController
{
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");

	@RequestMapping(value = "/sa_homepage", method = RequestMethod.GET)
	public ModelAndView homepage()
	{
		Student account_session = (Student) context.getBean("studentinfo");
		ModelAndView model = new ModelAndView("sa_homepage");
		model.addObject("name", account_session.getName());
		return model;
	}

	// 管理員 個報部分=================================================

	// ======================================================

	@RequestMapping(value = "/sa_astest", method = RequestMethod.GET)
	public ModelAndView sa_astest()
	{
		Student account_session = (Student) context.getBean("studentinfo");
		sa_TestDAO testRegisterDAO = (sa_TestDAO) context.getBean("testDAO");
		if (account_session.getAccount() != null)
		{
			if (testRegisterDAO.asTestCheck(account_session)==true)
			{
				ModelAndView model = new ModelAndView("redirect:/sa_homepage");
				return model;
			}
			else
			{
				ModelAndView model = new ModelAndView("sa_astest");
				model.addObject("account_session", account_session);
				return model;
			}
		}
		else
		{
			ModelAndView model = new ModelAndView("redirect:/sa_login");
			return model;
		}

	}

	@RequestMapping(value = "/sa_astest", method = RequestMethod.POST)
	public ModelAndView sa_astestRegister(@ModelAttribute sa_AssignTest sa_AssignTest)
	{
		Student account_session = (Student) context.getBean("studentinfo");
		sa_AssignTest.setAccount(account_session.getAccount());
		sa_TestDAO testRegisterDAO = (sa_TestDAO) context.getBean("testDAO");
		
//		for (String i : sa_AssignTest.getSubject())
//		{
//			System.out.print(i + ",");
//		}
		
		testRegisterDAO.testRegister(sa_AssignTest);

		System.out.println("報名成功");
		ModelAndView model = new ModelAndView("redirect:/sa_perAsGrade");
		return model;
	}

	@RequestMapping(value = "/sa_astestcheck", method = RequestMethod.GET)
	public ModelAndView sa_astestcheck(@ModelAttribute sa_AssignTest sa_AssignTest)
	{

		ModelAndView model = new ModelAndView("sa_astestcheck");
		return model;
	}

	// basic test access dispatcher
	@RequestMapping(value = "/sa_bstest", method = RequestMethod.GET)
	public ModelAndView sa_bstestPage()
	{
		sa_TestDAO testRegisterDAO = (sa_TestDAO) context.getBean("testDAO");
		Student account_session = (Student) context.getBean("studentinfo");
		if (account_session.getAccount() != null)
		{
			if (testRegisterDAO.bsTestCheck(account_session)==true)
			{
				ModelAndView model = new ModelAndView("redirect:/sa_homepage");
				return model;
			}
			else
			{
				ModelAndView model = new ModelAndView("sa_bstest");
				model.addObject("account_session", account_session);
				return model;
			}
		}
		else
		{
			ModelAndView model = new ModelAndView("redirect:/sa_login");
			return model;
		}
	}

	@RequestMapping(value = "/sa_bstest", method = RequestMethod.POST)
	public ModelAndView sa_bstestRegister(@ModelAttribute sa_BasicTest sa_BasicTest)
	{
		Student account_session = (Student) context.getBean("studentinfo");
		sa_BasicTest.setAccount(account_session.getAccount());
		sa_TestDAO testRegisterDAO = (sa_TestDAO) context.getBean("testDAO");
		testRegisterDAO.testRegister(sa_BasicTest);
		System.out.println("報名成功");
		ModelAndView model = new ModelAndView("redirect:/sa_perBsGrade");
		return model;
	}

	@RequestMapping(value = "/sa_engtest", method = RequestMethod.GET)
	public ModelAndView sa_engtestPage()
	{

		sa_TestDAO testRegisterDAO = (sa_TestDAO) context.getBean("testDAO");
		Student account_session = (Student) context.getBean("studentinfo");

		if (account_session.getAccount() != null)
		{
			if (testRegisterDAO.engTestCheck(account_session)==true)
			{
				ModelAndView model = new ModelAndView("redirect:/sa_homepage");
				return model;
			}
			else
			{
				ModelAndView model = new ModelAndView("sa_engtest");
				model.addObject("account_session", account_session);
				return model;
			}
		}
		else
		{
			ModelAndView model = new ModelAndView("redirect:/sa_login");
			return model;
		}

	}

	@RequestMapping(value = "/sa_engtest", method = RequestMethod.POST)
	public ModelAndView sa_engtestRegister(@ModelAttribute sa_EnglishListening sa_EnglishListening)
	{
		Student account_session = (Student) context.getBean("studentinfo");
		sa_EnglishListening.setAccount(account_session.getAccount());
		sa_TestDAO testRegisterDAO = (sa_TestDAO) context.getBean("testDAO");
		testRegisterDAO.testRegister(sa_EnglishListening);
		System.out.println("報名成功");
		ModelAndView model = new ModelAndView("redirect:/sa_perEngGrade");
		return model;

	}

	@RequestMapping(value = "/sa_engtestcheck", method = RequestMethod.GET)
	public ModelAndView sa_engtestcheck()
	{
		ModelAndView model = new ModelAndView("sa_engtestcheck");
		return model;
	}

//	@RequestMapping(value = "/sa_mangermodify", method = RequestMethod.GET)
//	public ModelAndView sa_mangermodify()
//	{
//		ModelAndView model = new ModelAndView("sa_mangermodify");
//		return model;
//	}
//
//	@RequestMapping(value = "/sa_mangersearch", method = RequestMethod.GET)
//	public ModelAndView sa_mangersearch()
//	{
//		ModelAndView model = new ModelAndView("sa_mangersearch");
//
//		return model;
//	}

}
