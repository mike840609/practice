package com.practice.webapp.controller;

import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



import com.practice.webapp.dao.StudentDAO;
import com.practice.webapp.dao.sa_AccountDAO;
import com.practice.webapp.dao.sa_TestPlaceDAO;
import com.practice.webapp.entity.Student;
import com.practice.webapp.entity.sa_Account;
import com.practice.webapp.entity.sa_TestPlace;



@Controller
public class SaController
{
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");
   


	@RequestMapping(value = "/sa_personInsert", method = RequestMethod.GET)
	public ModelAndView personInsertPage()   //ModelAndView當中包括了 view 以及 model 資料
	{
		ModelAndView model = new ModelAndView("sa_personInsert");
		sa_TestPlaceDAO testPlaceDAO = (sa_TestPlaceDAO) context.getBean("sa_TestPlaceDAO");
		List<sa_TestPlace> sa_TestPlaceList = new ArrayList<sa_TestPlace>();
		sa_TestPlaceList = testPlaceDAO.getList();
		model.addObject("sa_TestPlaceList", sa_TestPlaceList);
		return model;
	}
	
	
	@RequestMapping(value = "/sa_personInsert", method = RequestMethod.POST)
	public ModelAndView personInsert(@ModelAttribute Student student){
		ModelAndView model = new ModelAndView("redirect:/sa_register");
		StudentDAO studentDAO = (StudentDAO)context.getBean("studentDAO");
		studentDAO.insert(student);
		return model;
	}
	
	
	@RequestMapping(value = "/sa_register", method = RequestMethod.GET)
	public ModelAndView getStudentList()
	{
		ModelAndView model = new ModelAndView("sa_register");
		StudentDAO studentDAO = (StudentDAO)context.getBean("studentDAO");
		List<Student> studentList = new ArrayList<Student>();
		studentList = studentDAO.getList(); //astudent
		model.addObject("studentList", studentList);
		return model;
	}
//	=================================================================================
//	deleteStudent 在 sa_register 的 javascript當中
	
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
	// 登入失敗==================================================
	@RequestMapping(value = "/test", method = RequestMethod.GET)      
	public ModelAndView loginfail()  {
		ModelAndView model = new ModelAndView("test");
	return model;
	}

	//account ==================================================

	@RequestMapping(value = "/sa_login", method = RequestMethod.GET)      
	public ModelAndView login()  {
		ModelAndView model = new ModelAndView("sa_login");
	return model;
	}
	
	@RequestMapping(value = "/sa_login", method = RequestMethod.POST)
	public ModelAndView checkLogin(@ModelAttribute sa_Account account) {
		ModelAndView model = new ModelAndView("redirect:/sa_register");
		
		//connect to database==============
		
        sa_AccountDAO accountCheck = (sa_AccountDAO)context.getBean("accountCheck");
		int State = accountCheck.loginCheck(account);
		if(State==1){
			System.out.println("failed!");
			model = new ModelAndView("sa_login");
			model.addObject("message", "無此帳號");
			sa_Account account_session = (sa_Account)context.getBean("account");
			account_session.setAccount("");
			account_session.setPwd("");
			
		}
		else if (State==2){
			System.out.println("failed!");
			model = new ModelAndView("sa_login");
			model.addObject("message", "密碼錯誤");
			sa_Account account_session = (sa_Account)context.getBean("account");
			account_session.setAccount("");
			account_session.setPwd("");
		}
		else{
			System.out.println("Successful!");
			sa_Account account_session = (sa_Account)context.getBean("account");
			account_session.setAccount(account.getAccount());
			account_session.setPwd(account.getPwd());
			
		}
		return model;
	}
	
	
}
