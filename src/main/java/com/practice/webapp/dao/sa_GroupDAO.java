package com.practice.webapp.dao;

import java.util.List;

import com.practice.webapp.entity.Student;
import com.practice.webapp.entity.sa_School;

public interface sa_GroupDAO
{
	public int loginCheck (sa_School sa_School);
	public sa_School setSession(sa_School sa_School);
	public void groupRegister(sa_School sa_School);
	public List<Student>getList(sa_School sa_School);
}
