package com.practice.webapp.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

//configuration for session, please refer to: http://tuhrig.de/making-a-spring-bean-session-scoped/
@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class ManagerAccount implements java.io.Serializable {

	/**
	 * serialVersionUID is generated automatically
	 */
	private static final long serialVersionUID = 3476619468809859762L;
	private String managerusername;
	private String managerpassword;

	public String getManagerusername() {
		return managerusername;
	}
	public void setManagerusername(String managerusername) {
		this.managerusername = managerusername;
	}
	public String getManagerpassword() {
		return managerpassword;
	}
	public void setManagerpassword(String managerpassword) {
		this.managerpassword = managerpassword;
	}



}
