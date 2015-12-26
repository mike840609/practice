package com.practice.webapp.dao;

import java.util.List;

import com.practice.webapp.entity.Student;
import com.practice.webapp.entity.sa_AssignTest;
import com.practice.webapp.entity.sa_BasicTest;
import com.practice.webapp.entity.sa_EnglishListening;
import com.practice.webapp.entity.sa_School;

public interface sa_GroupDAO
{
	public int loginCheck (sa_School sa_School);
	public sa_School setSession(sa_School sa_School);
	public void groupRegister(sa_School sa_School);
	public List<Student>getList(sa_School sa_School);
	
	//GET METHOD 
	public List<sa_AssignTest>getAssign(sa_School sa_School);
	public List<sa_BasicTest>getBasic(sa_School sa_School);
	public List<sa_EnglishListening>getEng(sa_School sa_School);
	
	//POST OVERLOADING
	public List<sa_AssignTest>getAssign(sa_AssignTest assignTest);
	public List<sa_BasicTest>getBasic(sa_BasicTest basicTest);
	public List<sa_EnglishListening>getEng(sa_EnglishListening englishListening);
	
}
