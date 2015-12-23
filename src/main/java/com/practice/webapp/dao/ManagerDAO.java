package com.practice.webapp.dao;

import java.util.List;

import com.practice.webapp.entity.Student;
//import com.practice.webapp.entity.Article;
import com.practice.webapp.entity.sa_managerAssignTest;
import com.practice.webapp.entity.sa_managerBasicTest;
import com.practice.webapp.entity.sa_managerEnglishListening;


public interface ManagerDAO {
	public List<Student> getstudentList();
	public List<sa_managerBasicTest> getbasictestList();
	public List<sa_managerAssignTest> getassigntestList();
	public List<sa_managerEnglishListening> getenglishlisteningList();
	public sa_managerBasicTest getBT(sa_managerBasicTest basictest);
	public sa_managerAssignTest getAT(sa_managerAssignTest assigntest);
	public sa_managerEnglishListening getEL(sa_managerEnglishListening englishlistening);
	public Student getSTU(Student student);
	public void updateBT(sa_managerBasicTest basictest);
	public void updateAT(sa_managerAssignTest assigntest);
	public void updateEL(sa_managerEnglishListening englishlistening);
	public void updateSTU(Student student);
	public void payupdateBT(sa_managerBasicTest basictest);
	public void payupdateAT(sa_managerAssignTest assigntest);
	public void payupdateEL(sa_managerEnglishListening englishlistening);
	public List<sa_managerBasicTest> getBTsearchList(sa_managerBasicTest basictest);
	public List<sa_managerAssignTest> getATsearchList(sa_managerAssignTest assigntest);
	public List<sa_managerEnglishListening> getELsearchList(sa_managerEnglishListening englishlistening);
	public List<Student> getSTUsearchList(Student student);
	public List<sa_managerAssignTest> getATscoreList();
	public List<sa_managerBasicTest> getBTscoreList();
	public List<sa_managerEnglishListening> getELscoreList();
	public void updateBTscore(sa_managerBasicTest basictest);
	public void updateATscore(sa_managerAssignTest assigntest);
	public void updateELscore(sa_managerEnglishListening englishlistening);
	public List<sa_managerBasicTest> getBTScoresearchList(sa_managerBasicTest basictest);
	public List<sa_managerAssignTest> getATScoresearchList(sa_managerAssignTest assigntest);
	public List<sa_managerEnglishListening> getELScoresearchList(sa_managerEnglishListening englishlistening);
}
