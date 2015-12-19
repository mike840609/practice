package com.practice.webapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.dao.sa_TestDAO;
import com.practice.webapp.entity.Student;
import com.practice.webapp.entity.sa_AssignTest;
import com.practice.webapp.entity.sa_BasicTest;
import com.practice.webapp.entity.sa_EnglishListening;

@Controller
public class Sa_PersonGradeController
{

	ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");

	@RequestMapping(value = "/sa_perAsGrade", method = RequestMethod.GET)
	public ModelAndView sa_perAsGrade()
	{
		Student account_session = (Student) context.getBean("studentinfo");
		sa_TestDAO testDAO = (sa_TestDAO) context.getBean("testDAO");
		sa_AssignTest sa_AssignTest = testDAO.AssignTestGrade(account_session);
		ModelAndView model = new ModelAndView("sa_perAsGrade");
		model.addObject("account_session", account_session);
		model.addObject("sa_AssignTest", sa_AssignTest);
		return model;
	}

	@RequestMapping(value = "/sa_perBsGrade", method = RequestMethod.GET)
	public ModelAndView sa_perBsGrade()
	{
		Student account_session = (Student) context.getBean("studentinfo");

		sa_TestDAO testDAO = (sa_TestDAO) context.getBean("testDAO");

		sa_BasicTest sa_BasicTest = testDAO.BasicTestGrade(account_session);

		ModelAndView model = new ModelAndView("sa_perBsGrade");

		model.addObject("account_session", account_session);
		model.addObject("sa_BasicTest", sa_BasicTest);

		return model;
	}

	@RequestMapping(value = "/sa_perEngGrade", method = RequestMethod.GET)
	public ModelAndView sa_perEngGrade()
	{
		Student account_session = (Student) context.getBean("studentinfo");

		sa_TestDAO testDAO = (sa_TestDAO) context.getBean("testDAO");

		sa_EnglishListening sa_EnglishListening = testDAO.EnglishTestGrade(account_session);

		ModelAndView model = new ModelAndView("sa_perEngGrade");

		model.addObject("account_session", account_session);
		model.addObject("sa_EnglishListening", sa_EnglishListening);
		
		return model;
	}
}
