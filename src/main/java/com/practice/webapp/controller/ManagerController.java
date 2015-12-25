package com.practice.webapp.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.dao.ManagerDAO;
import com.practice.webapp.entity.ManagerAccount;
import com.practice.webapp.entity.Student;
import com.practice.webapp.entity.sa_managerAssignTest;
import com.practice.webapp.entity.sa_managerBasicTest;
import com.practice.webapp.entity.sa_managerEnglishListening;

@Controller
public class ManagerController
{
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");

	@RequestMapping(value = "/sa_managerBTsearch", method = RequestMethod.GET)
	public ModelAndView getbasictestList()
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerBTsearch");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			List<sa_managerBasicTest> basictestList = new ArrayList<sa_managerBasicTest>();
			basictestList = managerDAO.getbasictestList();
			model.addObject("basictestList", basictestList);
			return model;
		}
	}

	// �C�X���Ҧҥ͸�ƲM��
	@RequestMapping(value = "/sa_managerATsearch", method = RequestMethod.GET)
	public ModelAndView getassigntestList()
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerATsearch");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			List<sa_managerAssignTest> assigntestList = new ArrayList<sa_managerAssignTest>();
			assigntestList = managerDAO.getassigntestList();
			model.addObject("assigntestList", assigntestList);
			return model;
		}
	}

	//
	@RequestMapping(value = "/sa_managerELsearch", method = RequestMethod.GET)
	public ModelAndView getenglishlisteningList()
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerELsearch");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			List<sa_managerEnglishListening> englishlisteningList = new ArrayList<sa_managerEnglishListening>();
			englishlisteningList = managerDAO.getenglishlisteningList();
			model.addObject("englishlisteningList", englishlisteningList);
			return model;
		}
	}

	//
	@RequestMapping(value = "/sa_managerSTUsearch", method = RequestMethod.GET)
	public ModelAndView getStudentList()
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerSTUsearch");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			List<Student> studentList = new ArrayList<Student>();
			studentList = managerDAO.getstudentList();
			model.addObject("studentList", studentList);
			return model;
		}
	}

	// �޲z���s�W�έק��Ƴ���
	// �Ǵ��ҥ͸�Ƨ�sGET
	@RequestMapping(value = "/sa_managerBTupdate", method = RequestMethod.GET)
	public ModelAndView updateBTpage(@ModelAttribute sa_managerBasicTest basictest)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerBTupdate");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			basictest = managerDAO.getBT(basictest);
			model.addObject("basictest", basictest);
			return model;
		}
	}

	// �Ǵ��ҥ͸��POST
	@RequestMapping(value = "/sa_managerBTupdate", method = RequestMethod.POST)
	public ModelAndView updateBT(@ModelAttribute sa_managerBasicTest basictest)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerBTsearch");
			// redirect���������^���e�عL��value�~�౵��ӭ���
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			managerDAO.updateBT(basictest);

			return model;
		}
	}

	// ���Ҧҥ͸��GET
	@RequestMapping(value = "/sa_managerATupdate", method = RequestMethod.GET)
	public ModelAndView updateATpage(@ModelAttribute sa_managerAssignTest assigntest)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerATupdate");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			assigntest = managerDAO.getAT(assigntest);
			model.addObject("assigntest", assigntest);
			return model;
		}
	}

	// ���Ҧҥ͸�Ƨ�s�ܸ�Ʈw
	@RequestMapping(value = "/sa_managerATupdate", method = RequestMethod.POST)
	public ModelAndView updateAT(@ModelAttribute sa_managerAssignTest assigntest)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerATsearch");
			// redirect���������^���e�عL��value�~�౵��ӭ���
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			managerDAO.updateAT(assigntest);

			return model;
		}
	}

	// �^ť�ҥ͸�Ƨ�s(������)
	@RequestMapping(value = "/sa_managerELupdate", method = RequestMethod.GET)
	public ModelAndView updateELpage(@ModelAttribute sa_managerEnglishListening englishlistening)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerELupdate");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			englishlistening = managerDAO.getEL(englishlistening);
			model.addObject("englishlistening", englishlistening);
			return model;
		}
	}

	// �^ť�ҥ͸�Ƨ�s�ܸ�Ʈw
	@RequestMapping(value = "/sa_managerELupdate", method = RequestMethod.POST)
	public ModelAndView updateEL(@ModelAttribute sa_managerEnglishListening englishlistening)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerELsearch");
			// redirect���������^���e�عL��value�~�౵��ӭ���
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			managerDAO.updateEL(englishlistening);

			return model;
		}
	}

	@RequestMapping(value = "/sa_managerSTUupdate", method = RequestMethod.GET)
	public ModelAndView updateStupage(@ModelAttribute Student student)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerSTUupdate");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			student = managerDAO.getSTU(student);
			model.addObject("student", student);
			return model;
		}
	}

	@RequestMapping(value = "/sa_managerSTUupdate", method = RequestMethod.POST)
	public ModelAndView updateStu(@ModelAttribute Student student)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerSTUsearch");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			managerDAO.updateSTU(student);

			return model;
		}
	}

	// �Ǵ�ú�O�妸�T�{
	@RequestMapping(value = "/sa_managerBTpayupdate", method = RequestMethod.GET)
	public ModelAndView payupdateBT(@ModelAttribute sa_managerBasicTest basictest)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			if (sa_managerBasicTest.getCheckbox() == null)
			{
				ModelAndView model = new ModelAndView("redirect:/sa_managerBTsearch");
				return model;
			}
			else
			{
				// redirect���������^���e�عL��value�~�౵��ӭ���
				ModelAndView model = new ModelAndView("redirect:/sa_managerBTsearch");
				ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
				managerDAO.payupdateBT(basictest);
				sa_managerBasicTest.setCheckbox(null);
				return model;
			}
		}
	}

	// ����ú�O�妸�T�{
	@RequestMapping(value = "/sa_managerATpayupdate", method = RequestMethod.GET)
	public ModelAndView payupdateAT(@ModelAttribute sa_managerAssignTest assigntest)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			if (sa_managerAssignTest.getCheckbox() == null)
			{
				ModelAndView model = new ModelAndView("redirect:/sa_managerATsearch");
				return model;
			}
			else
			{
				ModelAndView model = new ModelAndView("redirect:/sa_managerATsearch");
				// redirect���������^���e�عL��value�~�౵��ӭ���
				ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
				managerDAO.payupdateAT(assigntest);
				sa_managerAssignTest.setCheckbox(null);
				return model;
			}
		}
	}

	// �^ťú�O�妸�T�{
	@RequestMapping(value = "/sa_managerELpayupdate", method = RequestMethod.GET)
	public ModelAndView payupdateEL(@ModelAttribute sa_managerEnglishListening englishlistening)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			if (sa_managerEnglishListening.getCheckbox() == null)
			{
				ModelAndView model = new ModelAndView("redirect:/sa_managerELsearch");
				return model;
			}
			else
			{
				ModelAndView model = new ModelAndView("redirect:/sa_managerELsearch");
				// redirect���������^���e�عL��value�~�౵��ӭ���
				ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
				managerDAO.payupdateEL(englishlistening);
				sa_managerEnglishListening.setCheckbox(null);
				return model;
			}
		}
	}

	// �s���ӤH��ƭ���
	@RequestMapping(value = "/sa_managerSTUmodify", method = RequestMethod.GET)
	public ModelAndView modifyStuPage(@ModelAttribute Student student)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerSTUmodify");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			student = managerDAO.getSTU(student);
			model.addObject("student", student);
			return model;
		}
	}

	@RequestMapping(value = "/sa_managerBTconsearch", method = RequestMethod.GET)
	public ModelAndView getBTsearchList(sa_managerBasicTest basictest) throws UnsupportedEncodingException
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			String state = basictest.getState();
			state = new String(state.getBytes("ISO-8859-1"), "utf-8");
			basictest.setState(state);
			String identity = basictest.getIdentity();
			identity = new String(identity.getBytes("ISO-8859-1"), "utf-8");
			basictest.setIdentity(identity);
			ModelAndView model = new ModelAndView("sa_managerBTsearch");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			List<sa_managerBasicTest> basictestList = new ArrayList<sa_managerBasicTest>();
			basictestList = managerDAO.getBTsearchList(basictest);
			model.addObject("basictestList", basictestList);
			return model;
		}
	}

	@RequestMapping(value = "/sa_managerATconsearch", method = RequestMethod.GET)
	public ModelAndView getATsearchList(sa_managerAssignTest assigntest) throws UnsupportedEncodingException
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			String state = assigntest.getState();
			state = new String(state.getBytes("ISO-8859-1"), "utf-8");
			assigntest.setState(state);
			String identity = assigntest.getIdentity();
			identity = new String(identity.getBytes("ISO-8859-1"), "utf-8");
			assigntest.setIdentity(identity);
			ModelAndView model = new ModelAndView("sa_managerATsearch");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			List<sa_managerAssignTest> assigntestList = new ArrayList<sa_managerAssignTest>();
			assigntestList = managerDAO.getATsearchList(assigntest);
			model.addObject("assigntestList", assigntestList);
			return model;
		}
	}

	@RequestMapping(value = "/sa_managerELconsearch", method = RequestMethod.GET)
	public ModelAndView getELsearchList(sa_managerEnglishListening englishlistening) throws UnsupportedEncodingException
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			String state = englishlistening.getState();
			state = new String(state.getBytes("ISO-8859-1"), "utf-8");
			englishlistening.setState(state);
			String identity = englishlistening.getIdentity();
			identity = new String(identity.getBytes("ISO-8859-1"), "utf-8");
			englishlistening.setIdentity(identity);
			ModelAndView model = new ModelAndView("sa_managerELsearch");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			List<sa_managerEnglishListening> englishlisteningList = new ArrayList<sa_managerEnglishListening>();
			englishlisteningList = managerDAO.getELsearchList(englishlistening);
			model.addObject("englishlisteningList", englishlisteningList);
			return model;
		}
	}

	@RequestMapping(value = "/sa_managerSTUconsearch", method = RequestMethod.GET)
	public ModelAndView getSTUsearchList(Student student)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerSTUsearch");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			List<Student> studentList = new ArrayList<Student>();
			studentList = managerDAO.getSTUsearchList(student);
			model.addObject("studentList", studentList);
			return model;
		}
	}

	@RequestMapping(value = "sa_managerBTscore", method = RequestMethod.GET)
	public ModelAndView getBTscoreList()
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerBTscore");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			List<sa_managerBasicTest> BTscoreList = new ArrayList<sa_managerBasicTest>();
			BTscoreList = managerDAO.getBTscoreList();
			model.addObject("BTscoreList", BTscoreList);
			return model;
		}
	}

	@RequestMapping(value = "sa_managerATscore", method = RequestMethod.GET)
	public ModelAndView getATscoreList()
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerATscore");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			List<sa_managerAssignTest> ATscoreList = new ArrayList<sa_managerAssignTest>();
			ATscoreList = managerDAO.getATscoreList();
			model.addObject("ATscoreList", ATscoreList);
			return model;
		}
	}

	@RequestMapping(value = "sa_managerELscore", method = RequestMethod.GET)
	public ModelAndView getELscoreList()
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerELscore");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			List<sa_managerEnglishListening> ELscoreList = new ArrayList<sa_managerEnglishListening>();
			ELscoreList = managerDAO.getELscoreList();
			model.addObject("ELscoreList", ELscoreList);
			return model;
		}
	}

	@RequestMapping(value = "/sa_managerBTscoreupdate", method = RequestMethod.GET)
	public ModelAndView updateBTscorepage(@ModelAttribute sa_managerBasicTest basictest)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerBTscoreupdate");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			basictest = managerDAO.getBT(basictest);
			model.addObject("basictest", basictest);
			return model;
		}
	}

	@RequestMapping(value = "/sa_managerBTscoreupdate", method = RequestMethod.POST)
	public ModelAndView updateBTscore(@ModelAttribute sa_managerBasicTest basictest)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerBTscore");
			// redirect���������^���e�عL��value�~�౵��ӭ���
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			managerDAO.updateBTscore(basictest);

			return model;
		}
	}

	@RequestMapping(value = "/sa_managerATscoreupdate", method = RequestMethod.GET)
	public ModelAndView updateATscorepage(@ModelAttribute sa_managerAssignTest assigntest)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerATscoreupdate");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			assigntest = managerDAO.getAT(assigntest);
			model.addObject("assigntest", assigntest);
			return model;
		}
	}

	@RequestMapping(value = "/sa_managerATscoreupdate", method = RequestMethod.POST)
	public ModelAndView updateATscore(@ModelAttribute sa_managerAssignTest assigntest)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerATscore");
			// redirect���������^���e�عL��value�~�౵��ӭ���
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			managerDAO.updateATscore(assigntest);

			return model;
		}
	}

	@RequestMapping(value = "/sa_managerELscoreupdate", method = RequestMethod.GET)
	public ModelAndView updateELscorepage(@ModelAttribute sa_managerEnglishListening englishlistening)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerELscoreupdate");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			englishlistening = managerDAO.getEL(englishlistening);
			model.addObject("englishlistening", englishlistening);
			return model;
		}
	}

	@RequestMapping(value = "/sa_managerELscoreupdate", method = RequestMethod.POST)
	public ModelAndView updateELscore(@ModelAttribute sa_managerEnglishListening englishlistening)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerELscore");
			// redirect���������^���e�عL��value�~�౵��ӭ���
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			managerDAO.updateELscore(englishlistening);

			return model;
		}
	}

	@RequestMapping(value = "/sa_managerBTScoresearch", method = RequestMethod.GET)
	public ModelAndView getBTScoresearchList(sa_managerBasicTest basictest)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerBTscore");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			List<sa_managerBasicTest> BTscoreList = new ArrayList<sa_managerBasicTest>();
			BTscoreList = managerDAO.getBTScoresearchList(basictest);
			model.addObject("BTscoreList", BTscoreList);
			return model;
		}
	}

	@RequestMapping(value = "/sa_managerATScoresearch", method = RequestMethod.GET)
	public ModelAndView getATScoresearchList(sa_managerAssignTest assigntest)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerATscore");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			List<sa_managerAssignTest> ATscoreList = new ArrayList<sa_managerAssignTest>();
			ATscoreList = managerDAO.getATScoresearchList(assigntest);
			model.addObject("ATscoreList", ATscoreList);
			return model;
		}
	}

	@RequestMapping(value = "/sa_managerELScoresearch", method = RequestMethod.GET)
	public ModelAndView getELScoresearchList(sa_managerEnglishListening englishlistening)
	{
		ManagerAccount manageraccount_session = (ManagerAccount) context.getBean("manageraccount");
		if (manageraccount_session.getManagerusername() == null)
		{
			ModelAndView model = new ModelAndView("redirect:/sa_managerlogin");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView("sa_managerELscore");
			ManagerDAO managerDAO = (ManagerDAO) context.getBean("managerDAO");
			List<sa_managerEnglishListening> ELscoreList = new ArrayList<sa_managerEnglishListening>();
			ELscoreList = managerDAO.getELScoresearchList(englishlistening);
			model.addObject("ELscoreList", ELscoreList);
			return model;
		}
	}
}
