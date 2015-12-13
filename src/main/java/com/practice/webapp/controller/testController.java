package com.practice.webapp.controller;



import java.util.ArrayList;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class testController
{
//個人部分=================================================================
	@RequestMapping(value = "/sa_perAsGrade", method = RequestMethod.GET)
	public ModelAndView sa_perAsGrade()
	{
		ModelAndView model = new ModelAndView("sa_perAsGrade");
		return model;
	}
	
	@RequestMapping(value = "/sa_perBsGrade", method = RequestMethod.GET)
	public ModelAndView sa_perBsGrade()
	{
		ModelAndView model = new ModelAndView("sa_perBsGrade");
		return model;
	}
	
	@RequestMapping(value = "/sa_perEngGrade", method = RequestMethod.GET)
	public ModelAndView sa_perEngGrade()
	{
		ModelAndView model = new ModelAndView("sa_perEngGrade");
		return model;
	}
	@RequestMapping(value = "/sa_perModify", method = RequestMethod.GET)
	public ModelAndView sa_perModify()
	{
		ModelAndView model = new ModelAndView("sa_perModify");
		return model;
	}
	
	@RequestMapping(value = "/sa_perSearch", method = RequestMethod.GET)
	public ModelAndView sa_perSearch()
	{
		ModelAndView model = new ModelAndView("sa_perSearch");
		return model;
	}
	
//	團體部分===================================================

	@RequestMapping(value = "/sa_homepage", method = RequestMethod.GET)
	public ModelAndView homepage()
	{
		ModelAndView model = new ModelAndView("sa_homepage");
		return model;
	}
	
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
