package com.practice.webapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Sa_GroupController
{
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");
	// 團體部分===================================================
	@RequestMapping(value = "/sa_groupinfo", method = RequestMethod.GET)
	public ModelAndView sa_groupinfo()
	{
		ModelAndView model = new ModelAndView("sa_groupinfo");
		return model;
	}

	@RequestMapping(value = "/sa_grouplogin", method = RequestMethod.GET)
	public ModelAndView sa_grouplogin()
	{
		ModelAndView model = new ModelAndView("sa_grouplogin");
		return model;
	}

	@RequestMapping(value = "/sa_groupregister", method = RequestMethod.GET)
	public ModelAndView sa_groupregister()
	{
		ModelAndView model = new ModelAndView("sa_groupregister");
		return model;
	}

	@RequestMapping(value = "/sa_groupsearchA", method = RequestMethod.GET)
	public ModelAndView sa_groupsearchA()
	{
		ModelAndView model = new ModelAndView("sa_groupsearchA");
		return model;
	}

	@RequestMapping(value = "/sa_groupsearchB", method = RequestMethod.GET)
	public ModelAndView sa_groupsearchB()
	{
		ModelAndView model = new ModelAndView("sa_groupsearchB");
		return model;
	}

	@RequestMapping(value = "/sa_groupsearchC", method = RequestMethod.GET)
	public ModelAndView sa_groupsearchC()
	{
		ModelAndView model = new ModelAndView("sa_groupsearchC");
		return model;
	}
}
