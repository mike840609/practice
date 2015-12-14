package com.practice.webapp.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


//configuration for session, please refer to: http://tuhrig.de/making-a-spring-bean-session-scoped/
@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class sa_Account  implements java.io.Serializable
{
	/**
	 * serialVersionUID is generated automatically
	 */
	
	private static final long serialVersionUID = 3476619468809859762L;
	
	private String account;
	private String pwd;
	public String getAccount()
	
	{
		return account;
	}
	public void setAccount(String account)
	{
		this.account = account;
	}
	public String getPwd()
	{
		return pwd;
	}
	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}
	

}
