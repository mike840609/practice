package com.practice.webapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.entity.Student;

@Controller
public class Sa_PersonGradeController
{
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");

	
	@RequestMapping(value = "/sa_perAsGrade", method = RequestMethod.GET)
	public ModelAndView sa_perAsGrade()
	{
		ModelAndView model = new ModelAndView("sa_perAsGrade");
		return model;
	}

	@RequestMapping(value = "/sa_perBsGrade", method = RequestMethod.GET)
	public ModelAndView sa_perBsGrade()
	{
		Student account_session = (Student) context.getBean("studentinfo");
		
		ModelAndView model = new ModelAndView("sa_perBsGrade");
		
		return model;
	}

	@RequestMapping(value = "/sa_perEngGrade", method = RequestMethod.GET)
	public ModelAndView sa_perEngGrade()
	{
		ModelAndView model = new ModelAndView("sa_perEngGrade");
		return model;
	}
}
