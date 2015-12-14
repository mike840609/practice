package com.practice.webapp.dao;

import java.util.List;

import com.practice.webapp.entity.Student;;


public interface StudentDAO {	
	
	public void insert(Student student);
	public void delete(Student student);
	public void update(Student student);
	public List<Student> getList();
	public Student get(Student student);
	public Student setSession(Student aStudent);
	
//在此介面中聲明方法 但不去實作
//等到實作時在實現方法
}
