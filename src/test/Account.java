package test;

import java.util.Date;

public class Account {

	private String name;
	private String bussNum;
	private Date bussDate;
	public String getBussNum() {
		return bussNum;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBussNum(String bussNum) {
		this.bussNum = bussNum;
	}
	public Date getBussDate() {
		return bussDate;
	}
	public void setBussDate(Date bussDate) {
		this.bussDate = bussDate;
	}
	@Override
	public String toString() {
		return "Account [bussNum=" + bussNum + ", bussDate=" + bussDate + "]";
	}
	public Account(String bussNum, Date bussDate) {
		super();
		this.bussNum = bussNum;
		this.bussDate = bussDate;
	}
	
	

}
