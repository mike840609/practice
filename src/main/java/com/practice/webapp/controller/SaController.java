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

import com.practice.webapp.dao.StudentDAO;

import com.practice.webapp.dao.sa_TestPlaceDAO;
import com.practice.webapp.entity.Student;

import com.practice.webapp.entity.sa_TestPlace;

@Controller
public class SaController
{
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");

	public static String accountTemp;
	public static String pwdTemp;
	
	//登入帳號註冊部分
	@RequestMapping(value = "/sa_personInsert", method = RequestMethod.GET)
	public ModelAndView personInsertPage() // ModelAndView當中包括了 view 以及 model 資料
	{
		ModelAndView model = new ModelAndView("sa_personInsert");
		sa_TestPlaceDAO testPlaceDAO = (sa_TestPlaceDAO) context.getBean("sa_TestPlaceDAO");
		List<sa_TestPlace> sa_TestPlaceList = new ArrayList<sa_TestPlace>();
		sa_TestPlaceList = testPlaceDAO.getList();
		model.addObject("sa_TestPlaceList", sa_TestPlaceList);
		return model;
	}

	@RequestMapping(value = "/sa_personInsert", method = RequestMethod.POST)
	public ModelAndView personInsert(@ModelAttribute Student student)
	{
		ModelAndView model = new ModelAndView("redirect:/sa_register");
		StudentDAO studentDAO = (StudentDAO) context.getBean("studentDAO");
		studentDAO.insert(student);
		return model;
	}

	@RequestMapping(value = "/sa_register", method = RequestMethod.GET)
	public ModelAndView getStudentList()
	{
		
		ModelAndView model = new ModelAndView("sa_register");
		StudentDAO studentDAO = (StudentDAO) context.getBean("studentDAO");
		List<Student> studentList = new ArrayList<Student>();
		studentList = studentDAO.getList(); // astudent
		model.addObject("studentList", studentList);
		return model;
	}
	// =================================================================================
	// deleteStudent 在 sa_register 的 javascript當中

	@RequestMapping(value = "/deleteStudent", method = RequestMethod.POST)
	public ModelAndView deleteStudent(@ModelAttribute Student student)
	{
		ModelAndView model = new ModelAndView("redirect:/sa_register");
		StudentDAO studentDAO = (StudentDAO) context.getBean("studentDAO");
		studentDAO.delete(student);
		return model;
	}

	@RequestMapping(value = "/sa_update", method = RequestMethod.GET)
	public ModelAndView updateStudentPage(@ModelAttribute Student student)
	{
		ModelAndView model = new ModelAndView("sa_update");
		sa_TestPlaceDAO testPlaceDAO = (sa_TestPlaceDAO) context.getBean("sa_TestPlaceDAO");
		StudentDAO studentDAO = (StudentDAO) context.getBean("studentDAO");
		List<sa_TestPlace> sa_TestPlaceList = new ArrayList<sa_TestPlace>();
		sa_TestPlaceList = testPlaceDAO.getList();
		student = studentDAO.get(student);
		model.addObject("sa_TestPlaceList", sa_TestPlaceList);
		model.addObject("student", student);
		return model;
	}

	@RequestMapping(value = "/sa_update", method = RequestMethod.POST)
	public ModelAndView updateStudent(@ModelAttribute Student student)
	{
		ModelAndView model = new ModelAndView("redirect:/sa_register");
		StudentDAO studentDAO = (StudentDAO) context.getBean("studentDAO");
		studentDAO.update(student);
		return model;
	}

	// 測試頁面==================================================
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView loginfail()
	{
		ModelAndView model = new ModelAndView("test");
		return model;
	}

	// 首頁======================================================
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index()
	{
		ModelAndView model = new ModelAndView("index");
		return model;
	}


	


	
	
	


}
