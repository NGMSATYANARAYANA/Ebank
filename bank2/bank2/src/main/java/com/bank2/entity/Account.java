package com.bank2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accountholderinfo")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long accountnumber;
	
	private int registerid;
	
	private String accounttype;
	
	private String cardnumber;
	
	private String branch;
	
	private String balance;

	public Long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(Long accountnumber) {
		this.accountnumber = accountnumber;
	}

	public int getRegisterid() {
		return registerid;
	}

	public void setRegisterid(int registerid) {
		this.registerid = registerid;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public Account(Long accountnumber, int registerid, String accounttype, String cardnumber, String branch,
			String balance) {
		super();
		this.accountnumber = accountnumber;
		this.registerid = registerid;
		this.accounttype = accounttype;
		this.cardnumber = cardnumber;
		this.branch = branch;
		this.balance = balance;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Account [accountnumber=" + accountnumber + ", registerid=" + registerid + ", accounttype=" + accounttype
				+ ", cardnumber=" + cardnumber + ", branch=" + branch + ", balance=" + balance + "]";
	}
	
	

}
