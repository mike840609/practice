package com.practice.webapp.dao;

import com.practice.webapp.entity.Student;
import com.practice.webapp.entity.sa_AssignTest;
import com.practice.webapp.entity.sa_BasicTest;
import com.practice.webapp.entity.sa_EnglishListening;

public interface sa_TestDAO
{

	//Overloading 寫法
	
	public void testRegister(sa_AssignTest sa_AssignTest);

	public void testRegister(sa_BasicTest sa_BasicTest);

	public void testRegister(sa_EnglishListening sa_EnglishListening);

	public sa_AssignTest AssignTestGrade(Student student);
	public sa_BasicTest BasicTestGrade(Student student);
	public sa_EnglishListening EnglishTestGrade(Student student);
	
}
