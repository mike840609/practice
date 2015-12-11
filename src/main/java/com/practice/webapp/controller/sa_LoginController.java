package com.practice.webapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.entity.sa_Account;


public class sa_LoginController
{
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
//	@RequestMapping(value = "/sa_login", method = RequestMethod.POST)
//	public ModelAndView checkLogin(@ModelAttribute sa_Account account) {
//		ModelAndView model = new ModelAndView("redirect:/sa_register");
//		
//		//you can modify this part to check username and password with DB, AD, LDAP, or open id
//		
//		if ("sa".equals(account.getAccount()) && "ilovesa".equals(account.getPwd())){
//			//save username and password in the session bean
//			sa_Account account_session = (sa_Account)context.getBean("account");
//			account_session.setAccount(account.getAccount());
//			account_session.setPwd(account.getPwd());
//			System.out.println("Successful!");
//		}
//		else{
//			model = new ModelAndView("index");
//			model.addObject("message", "登入失敗");
//			System.out.println("failed!");
//			//reset username and password in the session bean
//			sa_Account account_session = (sa_Account)context.getBean("account");
//			account_session.setAccount("");
//			account_session.setPwd("");
//		}	
//		return model;
//	}
	

//	@RequestMapping(value = "/sa_login", method = RequestMethod.GET)      
//	public ModelAndView login()  {
//		ModelAndView model = new ModelAndView("sa_login");
//	return model;
//	}
	

}
