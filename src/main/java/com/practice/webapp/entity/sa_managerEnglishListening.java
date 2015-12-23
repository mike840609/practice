package com.practice.webapp.entity;

public class sa_managerEnglishListening
{
	private String account;
	private String score;
	private String type;
	private String money;
	private String state;
	private String identity;
	private String code;
	private String testid;
	private String testplace;
	private String note;
	private static String checkbox[];

	public static String[] getCheckbox() {
		return checkbox;
	}
	public static void setCheckbox(String[] checkbox) {
		sa_managerEnglishListening.checkbox = checkbox;
	}
	public String getTestplace() {
		return testplace;
	}
	public void setTestplace(String testplace) {
		this.testplace = testplace;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String testplace) {
		this.code = testplace;
	}
	public String getTestid() {
		return testid;
	}
	public void setTestid(String testid) {
		this.testid = testid;
	}
	
}
