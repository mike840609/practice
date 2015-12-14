package com.practice.webapp.dao;

import com.practice.webapp.entity.Student;
import com.practice.webapp.entity.sa_Account;

public interface sa_AccountDAO
{
//	public void loginCheck(sa_Account account);
	public int loginCheck(sa_Account account);
	public int loginCheck(Student student);
}
