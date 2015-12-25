package com.practice.webapp.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.dao.ManagerAccountDAO;
import com.practice.webapp.entity.ManagerAccount;

@Controller
public class ManagerAccountController
{
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");


	@RequestMapping(value = "/sa_managerlogin", method = RequestMethod.GET)
	public ModelAndView managerlogin()
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
	
	if(manageraccount_session.getManagerusername()!=null){
		ModelAndView model = new ModelAndView("redirect:/sa_managerSTUsearch");
		System.out.println(manageraccount_session.getManagerusername());
		System.out.println(manageraccount_session.getManagerpassword());
		
		return model;
	}
	else{
		ModelAndView model = new ModelAndView("sa_managerlogin");
	return model;
	}
	}
	
	@RequestMapping(value = "/sa_managerlogin", method = RequestMethod.POST)
	public ModelAndView managercheckLogin(@ModelAttribute ManagerAccount manageraccount)
	{
		ModelAndView model = new ModelAndView("redirect:/sa_managerSTUsearch");


		ManagerAccountDAO manageraccountCheck = (ManagerAccountDAO) context.getBean("manageraccountcheck");

		int State = manageraccountCheck.managerloginCheck(manageraccount);

		if (State == 1)
		{
			System.out.println("failed!");
			model = new ModelAndView("sa_managerlogin");
			model.addObject("message", "無此帳號");
			ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
			manageraccount_session.setManagerusername("");
			manageraccount_session.setManagerpassword("");
		}
		else if (State == 2)
		{
			System.out.println("failed!");
			model = new ModelAndView("sa_managerlogin");
			model.addObject("message", "密碼錯誤");
			ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
			manageraccount_session.setManagerusername("");
			manageraccount_session.setManagerpassword("");
		}
		else
		{
			System.out.println("Successful!");
			ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
			manageraccount_session.setManagerusername(manageraccount.getManagerusername());
			manageraccount_session.setManagerpassword(manageraccount.getManagerpassword());

			
			System.out.println(manageraccount_session.getManagerusername());
			System.out.println(manageraccount_session.getManagerpassword());



		}
		return model;
	}
	
	
	@RequestMapping(value = "/sa_managerlogout", method = RequestMethod.GET)
	public ModelAndView Logout()
	{

		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		// account_session.setAccount(""); "" != null
		manageraccount_session.setManagerusername(null);
		manageraccount_session.setManagerpassword(null);


		System.out.println(manageraccount_session.getManagerusername());
		ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
		return model;
	}
	
}

