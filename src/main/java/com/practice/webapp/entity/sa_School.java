package com.practice.webapp.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class sa_School implements java.io.Serializable
{
	private static final long serialVersionUID = 3476619468809859762L;
	
	private String schoolcode;
	private String pwd;
	private String name;
	private String address;
	private String tel;
	private String person;
	private String persontel;
	private String paycode;
	
	public String getSchoolcode()
	{
		return schoolcode;
	}
	public void setSchoolcode(String schoolcode)
	{
		this.schoolcode = schoolcode;
	}
	public String getPwd()
	{
		return pwd;
	}
	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getTel()
	{
		return tel;
	}
	public void setTel(String tel)
	{
		this.tel = tel;
	}
	public String getPerson()
	{
		return person;
	}
	public void setPerson(String person)
	{
		this.person = person;
	}
	public String getPersontel()
	{
		return persontel;
	}
	public void setPersontel(String persontel)
	{
		this.persontel = persontel;
	}
	public String getPaycode()
	{
		return paycode;
	}
	public void setPaycode(String paycode)
	{
		this.paycode = paycode;
	}
	
	

}
