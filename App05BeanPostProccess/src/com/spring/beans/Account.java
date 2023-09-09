package com.spring.beans;

public class Account {
	private String accNo;
	private String accType;
	private Double bal;
	private String accHolderName;
	private String accHolderMobileNumber;
	private String accHolderEmail;
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public Double getBal() {
		return bal;
	}
	public void setBal(Double bal) {
		this.bal = bal;
	}
	
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getAccHolderMobileNumber() {
		return accHolderMobileNumber;
	}
	public void setAccHolderMobileNumber(String accHolderMobileNumber) {
		this.accHolderMobileNumber = accHolderMobileNumber;
	}
	public String getAccHolderEmail() {
		return accHolderEmail;
	}
	public void setAccHolderEmail(String accHolderEmail) {
		this.accHolderEmail = accHolderEmail;
	}
	public void getAccountDetails() {
		System.out.println("Account Details");
		System.out.println("-----------------------------");
		System.out.println("Account Number      : "+accNo);
		System.out.println("Account Type        : "+ accType);
		System.out.println("Account Balance     : "+bal);
		System.out.println("Account Holder Name : "+accHolderName);
		System.out.println("Account Holder Phone: "+accHolderMobileNumber);
		System.out.println("Account Holder Email: "+accHolderEmail);
	}
}
