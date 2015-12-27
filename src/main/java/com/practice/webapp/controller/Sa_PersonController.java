package com.practice.webapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.dao.StudentDAO;
import com.practice.webapp.entity.Student;

@Controller
public class Sa_PersonController
{
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");

	// 個人部分=================================================================
		
        //導入頁面
		@RequestMapping(value = "/sa_perModify", method = RequestMethod.GET)
		public ModelAndView sa_perModifyPage()
		{
			Student account_session = (Student) context.getBean("studentinfo");
			ModelAndView model = new ModelAndView("sa_perModify");
			model.addObject("account_session", account_session);
			return model;
		}
		
		//寫入資料庫
		@RequestMapping(value = "/sa_perModify", method = RequestMethod.POST)
		public ModelAndView sa_perModify(@ModelAttribute Student student)
		{
			Student account_session = (Student) context.getBean("studentinfo");
            
			//將帳號注入student屬性 前端沒有帳號這值 所以由 注入
			student.setAccount(account_session.getAccount());
			StudentDAO studentDAO = (StudentDAO) context.getBean("studentDAO");
			studentDAO.updateStu(student);
			System.out.println("修改成功");
			
			//修改後重新寫入到session
			account_session = studentDAO.setSession(account_session);
			
			ModelAndView model = new ModelAndView("redirect:/sa_homepage");
			return model;
		}

		@RequestMapping(value = "/sa_perSearch", method = RequestMethod.GET)
		public ModelAndView sa_perSearch()
		{
			Student account_session = (Student) context.getBean("studentinfo");
			
			if (account_session.getAccount()!= null)
			{
				ModelAndView model = new ModelAndView("sa_perSearch");
				model.addObject("account_session", account_session);
				return model;
			}
			else
			{
				ModelAndView model = new ModelAndView("sa_login");
				return model;
			}
		}
}
