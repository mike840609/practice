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
import com.practice.webapp.entity.sa_BasicTest;

@Controller
public class testController
{
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");

	@RequestMapping(value = "/sa_homepage", method = RequestMethod.GET)
	public ModelAndView homepage()
	{
		ModelAndView model = new ModelAndView("sa_homepage");
		return model;
	}


	// 管理員 個報部分=================================================

	
	// ======================================================

	@RequestMapping(value = "/sa_astest", method = RequestMethod.GET)
	public ModelAndView sa_astest()
	{
		Student account_session = (Student) context.getBean("studentinfo");
		
		if (account_session.getAccount() != null)
		{			
			ModelAndView model = new ModelAndView("sa_astest");
			model.addObject("account_session", account_session);			
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_login");
			return model;
		}

	}

	@RequestMapping(value = "/sa_astestcheck", method = RequestMethod.GET)
	public ModelAndView sa_astestcheck()
	{
		ModelAndView model = new ModelAndView("sa_astestcheck");
		return model;
	}

	// basic test access dispatcher
	@RequestMapping(value = "/sa_bstest", method = RequestMethod.GET)
	public ModelAndView sa_bstestPage()
	{
		Student account_session = (Student) context.getBean("studentinfo");
		if (account_session.getAccount() != null)
		{
			ModelAndView model = new ModelAndView("sa_bstest");
			model.addObject("account_session", account_session);	
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_login");
			return model;
		}
	}

	@RequestMapping(value = "/sa_bstest", method = RequestMethod.POST)
	public ModelAndView sa_bstestRegister(@ModelAttribute sa_BasicTest sa_BasicTest)
	{
		Student account_session = (Student) context.getBean("studentinfo");
		sa_BasicTest.setAccount(account_session.getAccount());
		sa_TestDAO testRegisterDAO =  (sa_TestDAO) context.getBean("testDAO");
		testRegisterDAO.testRegister(sa_BasicTest);
		System.out.println("報名成功");
		ModelAndView model = new ModelAndView("redirect:/sa_perBsGrade");
		return model;
	}

	@RequestMapping(value = "/sa_engtest", method = RequestMethod.GET)
	public ModelAndView sa_engtest()
	{
		ModelAndView model = new ModelAndView("sa_engtest");
		return model;
	}

	@RequestMapping(value = "/sa_engtestcheck", method = RequestMethod.GET)
	public ModelAndView sa_engtestcheck()
	{
		ModelAndView model = new ModelAndView("sa_engtestcheck");
		return model;
	}

	@RequestMapping(value = "/sa_mangermodify", method = RequestMethod.GET)
	public ModelAndView sa_mangermodify()
	{
		ModelAndView model = new ModelAndView("sa_mangermodify");
		return model;
	}

	@RequestMapping(value = "/sa_mangersearch", method = RequestMethod.GET)
	public ModelAndView sa_mangersearch()
	{
		ModelAndView model = new ModelAndView("sa_mangersearch");

		return model;
	}

}
