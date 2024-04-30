package com.bank2.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Transactionform1")
public class TransEntity {
	
	
	@Id
	private int transactionid;
	private int accountnumber;
	private Date transactiondate;
	private int debitamount;
	private int creditamount;
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public Date getTransactiondate() {
		return transactiondate;
	}
	public void setTransactiondate(Date transactiondate) {
		this.transactiondate = transactiondate;
	}
	public int getDebitamount() {
		return debitamount;
	}
	public void setDebitamount(int debitamount) {
		this.debitamount = debitamount;
	}
	public int getCreditamount() {
		return creditamount;
	}
	public void setCreditamount(int creditamount) {
		this.creditamount = creditamount;
	}
	public TransEntity(int transactionid, int accountnumber, Date transactiondate, int debitamount, int creditamount) {
		super();
		this.transactionid = transactionid;
		this.accountnumber = accountnumber;
		this.transactiondate = transactiondate;
		this.debitamount = debitamount;
		this.creditamount = creditamount;
	}
	public TransEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TransEntity [transactionid=" + transactionid + ", accountnumber=" + accountnumber + ", transactiondate="
				+ transactiondate + ", debitamount=" + debitamount + ", creditamount=" + creditamount + "]";
	}
}