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

import com.practice.webapp.dao.sa_GroupDAO;
import com.practice.webapp.entity.Student;
import com.practice.webapp.entity.sa_AssignTest;
import com.practice.webapp.entity.sa_BasicTest;
import com.practice.webapp.entity.sa_EnglishListening;
import com.practice.webapp.entity.sa_School;

@Controller
public class Sa_GroupController
{
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");

	// 團體部分===================================================
	@RequestMapping(value = "/sa_groupinfo", method = RequestMethod.GET)
	public ModelAndView sa_groupinfo()
	{
		sa_School school_session = (sa_School) context.getBean("schoolinfo");

		if (school_session.getSchoolcode() != null)
		{
			ModelAndView model = new ModelAndView("sa_groupinfo");
			sa_GroupDAO groupDAO = (sa_GroupDAO) context.getBean("groupDAO");
			List<Student> studentList = new ArrayList<Student>();
			studentList = groupDAO.getList(school_session);
			model.addObject("students", studentList);
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_grouplogin");
			return model;
		}
	}

	@RequestMapping(value = "/sa_grouplogin", method = RequestMethod.GET)
	public ModelAndView sa_grouplogin()
	{
		sa_School school_session = (sa_School) context.getBean("schoolinfo");

		if (school_session.getSchoolcode() != null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_groupregister");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_grouplogin");
			return model;
		}

	}

	@RequestMapping(value = "/sa_grouplogin", method = RequestMethod.POST)
	public ModelAndView checkgrouplogin(@ModelAttribute sa_School school)
	{
		ModelAndView model = new ModelAndView("redirect:/sa_groupregister");
		sa_GroupDAO group = (sa_GroupDAO) context.getBean("groupCheck");

		int State = group.loginCheck(school);

		if (State == 1)
		{
			model = new ModelAndView("sa_grouplogin");
			model.addObject("message", "無此帳號");

		}
		else if (State == 2)
		{
			model = new ModelAndView("sa_grouplogin");
			model.addObject("message", "帳號存在  密碼錯誤");
		}
		else
		{
			System.out.println("Successful!");
			sa_School schoolsession = (sa_School) context.getBean("schoolinfo");
			sa_GroupDAO groupDAO = (sa_GroupDAO) context.getBean("groupDAO");
			schoolsession.setSchoolcode(school.getSchoolcode());
			schoolsession = groupDAO.setSession(schoolsession);

		}
		return model;
	}

	@RequestMapping(value = "/sa_groupregister", method = RequestMethod.GET)
	public ModelAndView sa_groupregister()
	{

		sa_School school_session = (sa_School) context.getBean("schoolinfo");
		if (school_session.getSchoolcode() != null)
		{
			ModelAndView model = new ModelAndView("sa_groupregister");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_grouplogin");
			return model;
		}

	}

	// 指考成績查詢
	@RequestMapping(value = "/sa_groupsearchA", method = RequestMethod.GET)
	public ModelAndView sa_groupsearchA()
	{
		sa_School school_session = (sa_School) context.getBean("schoolinfo");
		if (school_session.getSchoolcode() != null)
		{

			List<sa_AssignTest> assignTests = new ArrayList<sa_AssignTest>();
			sa_GroupDAO groupDAO = (sa_GroupDAO) context.getBean("groupDAO");
			assignTests = groupDAO.getAssign(school_session);
			ModelAndView model = new ModelAndView("sa_groupsearchA");
			model.addObject("ATscoreList", assignTests);
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_grouplogin");
			return model;
		}
	}
	
	//指考搜尋列表
	@RequestMapping(value = "/sa_groupsearchA", method = RequestMethod.POST)
	public ModelAndView assignPost(@ModelAttribute sa_AssignTest assignTest)
	{
		List<sa_AssignTest> assignTests = new ArrayList<sa_AssignTest>();
		ModelAndView modelAndView = new ModelAndView("sa_groupsearchA");
		sa_GroupDAO groupDAO = (sa_GroupDAO) context.getBean("groupDAO");
		assignTests = groupDAO.getAssign(assignTest);
		modelAndView.addObject("ATscoreList", assignTests);
		return modelAndView;
	}

	// 學測成績查詢
	@RequestMapping(value = "/sa_groupsearchB", method = RequestMethod.GET)
	public ModelAndView sa_groupsearchB()
	{

		sa_School school_session = (sa_School) context.getBean("schoolinfo");
		if (school_session.getSchoolcode() != null)
		{
			List<sa_BasicTest> basicTests = new ArrayList<sa_BasicTest>();
			sa_GroupDAO groupDAO = (sa_GroupDAO) context.getBean("groupDAO");
			basicTests = groupDAO.getBasic(school_session);
			ModelAndView model = new ModelAndView("sa_groupsearchB");
			System.out.println(basicTests);
			model.addObject("basicTests", basicTests);
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_grouplogin");
			return model;
		}

	}
	//學測搜尋列表
	@RequestMapping(value = "/sa_groupsearchB", method = RequestMethod.POST)
	public ModelAndView assignPost(@ModelAttribute sa_BasicTest basicTest)
	{
		List<sa_BasicTest> basicTests = new ArrayList<sa_BasicTest>();
		ModelAndView modelAndView = new ModelAndView("sa_groupsearchB");
		sa_GroupDAO groupDAO = (sa_GroupDAO) context.getBean("groupDAO");
		basicTests = groupDAO.getBasic(basicTest);
		modelAndView.addObject("basicTests", basicTests);
		return modelAndView;
	}

	// 英聽成績查詢
	@RequestMapping(value = "/sa_groupsearchC", method = RequestMethod.GET)
	public ModelAndView sa_groupsearchC()
	{
		sa_School school_session = (sa_School) context.getBean("schoolinfo");
		if (school_session.getSchoolcode() != null)
		{
			List<sa_EnglishListening> englishListenings = new ArrayList<sa_EnglishListening>();
			sa_GroupDAO groupDAO = (sa_GroupDAO) context.getBean("groupDAO");
			englishListenings = groupDAO.getEng(school_session);
			ModelAndView model = new ModelAndView("sa_groupsearchC");
			model.addObject("englishListenings", englishListenings);
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_grouplogin");
			return model;
		}

	}
	//英聽搜尋列表
	@RequestMapping(value = "/sa_groupsearchC", method = RequestMethod.POST)
	public ModelAndView assignPost(@ModelAttribute sa_EnglishListening englishListening)
	{
		List<sa_EnglishListening> englishListenings = new ArrayList<sa_EnglishListening>();
		ModelAndView modelAndView = new ModelAndView("sa_groupsearchC");
		sa_GroupDAO groupDAO = (sa_GroupDAO) context.getBean("groupDAO");
		englishListenings = groupDAO.getEng(englishListening);
		modelAndView.addObject("englishListenings", englishListenings);
		return modelAndView;
	}

	@RequestMapping(value = "/excelSQL", method = RequestMethod.GET)
	public ModelAndView excelSQL()
	{
		sa_School schoolsession = (sa_School) context.getBean("schoolinfo");
		sa_GroupDAO groupDAO = (sa_GroupDAO) context.getBean("groupDAO");
		groupDAO.groupRegister(schoolsession);
		ModelAndView model = new ModelAndView("redirect:/sa_groupinfo");
		return model;
	}

	// logout & clean session===============================================
	@RequestMapping(value = "/sa_grouplogout", method = RequestMethod.GET)
	public ModelAndView sa_grouplogout()
	{

		sa_School schoolsession = (sa_School) context.getBean("schoolinfo");

		schoolsession.setAddress(null);
		schoolsession.setName(null);
		schoolsession.setPaycode(null);
		schoolsession.setPerson(null);
		schoolsession.setPersontel(null);
		schoolsession.setPwd(null);
		schoolsession.setSchoolcode(null);
		schoolsession.setTel(null);

		System.out.println("清空session 成功登出 ");
		ModelAndView model = new ModelAndView("redirect:/sa_homepage");
		return model;
	}

}
