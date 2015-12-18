package com.practice.webapp.dao;

import com.practice.webapp.entity.sa_AssignTest;
import com.practice.webapp.entity.sa_BasicTest;
import com.practice.webapp.entity.sa_EnglishListening;

public interface sa_TestRegisterDAO
{

	//Overloading 寫法
	
	public void testRegister(sa_AssignTest assignTest);

	public void testRegister(sa_BasicTest sa_BasicTest);

	public void testRegister(sa_EnglishListening sa_EnglishListening);

}
