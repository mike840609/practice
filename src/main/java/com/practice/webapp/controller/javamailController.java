package com.practice.webapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.practice.webapp.dao.StudentDAO;
import com.practice.webapp.entity.Student;

@Controller
public class javamailController
{
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");

	@RequestMapping(value = "/sa_javamail", method = RequestMethod.GET)
	public ModelAndView javamail()
	{
		ModelAndView model = new ModelAndView("sa_javamail");
		return model;
	}

	
	
	//TLS 協定 帳號基本資料寄回
	@RequestMapping(value = "/sa_javamail", method = RequestMethod.POST)
	public ModelAndView mailsend(@ModelAttribute Student student)
	{
		StudentDAO studentDAO = (StudentDAO) context.getBean("studentDAO");
		Student studentInfo = studentDAO.javamail(student);
		//基本資料注入
		
		final String username = "mike840609@gmail.com";
		final String password = "402401606";

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getInstance(props, new Authenticator()
		{
			protected PasswordAuthentication getPasswordAuthentication()
			{
				return new PasswordAuthentication(username, password);
			}
		});
		try
		{

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("mike840609@gmail.com.tw"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("mike840609@gmail.com.tw"));
			message.setSubject(" 基本資料寄送 ");
			message.setText("Dear"+ studentInfo.getName() +"\n 以下為您的帳號基本資料：\n\n\n"
					+"帳號："+studentInfo.getAccount()+"\n\n密碼:"+studentInfo.getPwd()+"\n\n身分證:"+
					studentInfo.getId()+"\n\n姓名:"+studentInfo.getName()
					+"\n\n生日:"+studentInfo.getBirth()+"\n\n電話:"+studentInfo.getTel()
					+"\n\n住址:"+studentInfo.getAddress()+"\n\n電子郵件:"+studentInfo.getEmail());

			Transport.send(message);
			System.out.println("Done");

		}
		catch (MessagingException e)
		{
			throw new RuntimeException(e);
		}

		ModelAndView model = new ModelAndView("redirect:/sa_homepage");

		return model;
	}
}
