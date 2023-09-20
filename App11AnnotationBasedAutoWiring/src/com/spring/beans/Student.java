package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String sRoll;
	private String sName;
	private Account account;

	public String getsRoll() {
		return sRoll;
	}

	public void setsRoll(String sRoll) {
		this.sRoll = sRoll;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Account getAccount() {
		return account;
	}
//	@Required
	@Autowired(required = true)
	@Qualifier("account")
	public void setAccount(Account account) {
		this.account = account;
	}

	public void getSudentDetails() {
		System.out.println("Student Details");
		System.out.println("----------------------------------");
		System.out.println("Student Roll        : "+sRoll);
		System.out.println("Student Name        : "+sName);
		System.out.println();
		System.out.println("Account Details");
		System.out.println("----------------------------------");
		System.out.println("Account Details");
		System.out.println("Account Number      : "+account.getAccNo());
		System.out.println("Account Branch      : "+account.getBranch());
		
	}

}
