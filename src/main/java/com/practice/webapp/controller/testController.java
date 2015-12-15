package com.practice.webapp.controller;



import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;
import javax.xml.soap.SAAJResult;

import org.springframework.cglib.reflect.MethodDelegate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.dao.StudentDAO;
import com.practice.webapp.entity.Student;


@Controller
public class testController
{
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");
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
	
	//管理員 個報部分=================================================
	
	@RequestMapping(value = "/sa_accountcheck", method = RequestMethod.GET)
	public ModelAndView sa_accountcheckPage(@ModelAttribute Student student) throws UnsupportedEncodingException
	{
		//@ModelAttribute 去接傳近來的值
		
		String name = student.getName();
//		String account = student.getAccount();
//		String pwd = student.getPwd();
//		String id = student.getId();
		String sex = student.getSex();
//		String birth = student.getBirth();
//		String tel = student.getTel();
//		String email = student.getEmail();
		String address = student.getAddress();
		
		// 轉換 中文 編碼 
		name = new String(name.getBytes("ISO-8859-1"),"utf-8");
		address = new String(address.getBytes("ISO-8859-1"),"utf-8");
		sex = new String(sex.getBytes("ISO-8859-1"),"utf-8");
		
		student.setAddress(address);
		student.setName(name);
		student.setSex(sex);
		
		ModelAndView model = new ModelAndView("sa_accountcheck");
		model.addObject("student",student);
		
		return model;
	}
	// 確認無誤,此段寫入資料庫  12.15 綠蓋新增  問題500  按鈕form注意 submit 修改 href=================
	@RequestMapping(value = "/sa_accountcheck", method = RequestMethod.POST)
	public ModelAndView sa_accountcheck(@ModelAttribute Student student)
	{
		ModelAndView model = new ModelAndView("sa_homepage");
		StudentDAO studentDAO = (StudentDAO) context.getBean("studentDAO");
		studentDAO.insertStu(student);
		return model;
	}
	//登入帳號註冊部分==========================
	@RequestMapping(value = "/sa_accountregister", method = RequestMethod.GET)
	public ModelAndView sa_accountregisterPage()
	{
		ModelAndView model = new ModelAndView("sa_accountregister");
		return model;
	}
	@RequestMapping(value = "/sa_accountregister", method = RequestMethod.POST)
	public ModelAndView sa_accountregister(/*@ModelAttribute Student student*/)
	{
//		ModelAndView model = new ModelAndView("redirect:/sa_accountcheck");
		ModelAndView model = new ModelAndView("sa_accountcheck");
		return model;
	}
	//======================================================
	
	@RequestMapping(value = "/sa_astest", method = RequestMethod.GET)
	public ModelAndView sa_astest()
	{
		Student account_session = (Student) context.getBean("studentinfo");
		if(account_session.getAccount()!=null){
			ModelAndView model = new ModelAndView("sa_atest");
			return model;
		}
		else{
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

	//basic test access dispatcher
	@RequestMapping(value = "/sa_bstest", method = RequestMethod.GET)
	public ModelAndView sa_bstest()
	{
		Student account_session = (Student) context.getBean("studentinfo");
		if(account_session.getAccount()!=null){
			ModelAndView model = new ModelAndView("sa_bstest");
			return model;
		}
		else{
		ModelAndView model = new ModelAndView("sa_login");
		return model;
		}
	}
	
	@RequestMapping(value = "/sa_bstestcheck", method = RequestMethod.GET)
	public ModelAndView sa_bstestcheck()
	{
		ModelAndView model = new ModelAndView("sa_bstestcheck");
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
