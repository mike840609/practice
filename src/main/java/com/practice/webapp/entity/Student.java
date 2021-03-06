package com.practice.webapp.entity;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class Student implements java.io.Serializable
{
	private static final long serialVersionUID = 3476619468809859762L;
	
	private Date createDate; // 新建時間
	private Date updateDate; // 修改時間
	private sa_TestPlace testPlace = new sa_TestPlace();
	
	private String account;
	private String code;
	private String id;
	private String name;
	private String sex;
	private String birth;

	private String tel;
	private String address;
	private String pwd;
	private String email;
	private String photo;
	
	private String[] subject = new String[20];
	
	public String[] getSubject()
	{
		return subject;
	}
	public void setSubject(String[] subject)
	{
		this.subject = subject;
	}
	 
	public sa_TestPlace getTestPlace()
	{
		return testPlace;
	}
	public void setTestPlace(sa_TestPlace testPlace)
	{
		this.testPlace = testPlace;
	}
	

	
	public String getPwd()
	{
		return pwd;
	}
	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}

	
	public Date getCreateDate()
	{
		return createDate;
	}
	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}
	public Date getUpdateDate()
	{
		return updateDate;
	}
	public void setUpdateDate(Date updateDate)
	{
		this.updateDate = updateDate;
	}

	
	
	public String getAccount()
	{
		return account;
	}
	public void setAccount(String account)
	{
		this.account = account;
	}
	public String getCode()
	{
		return code;
	}
	public void setCode(String code)
	{
		this.code = code;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getSex()
	{
		return sex;
	}
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	public String getBirth()
	{
		return birth;
	}
	public void setBirth(String birth)
	{
		this.birth = birth;
	}
	public String getTel()
	{
		return tel;
	}
	public void setTel(String tel)
	{
		this.tel = tel;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getPhoto()
	{
		return photo;
	}
	public void setPhoto(String photo)
	{
		this.photo = photo;
	}
	
}
