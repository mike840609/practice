package com.practice.webapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.entity.Student;

@Controller
public class Sa_PersonController
{
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");

	// 個人部分=================================================================
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
