package com.bank2.entity;


import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ddform")
public class Ddform {
    
	@Id
    private String requestid;
    private String accountnumber;
    private String ddnumber;
    private String infavof;
    private String payableat;
    private int commisionamount;
    private int amount;
    private Date date;
    private String status;
	public String getRequestid() {
		return requestid;
	}
	public void setRequestid(String requestid) {
		this.requestid = requestid;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getDdnumber() {
		return ddnumber;
	}
	public void setDdnumber(String ddnumber) {
		this.ddnumber = ddnumber;
	}
	public String getInfavof() {
		return infavof;
	}
	public void setInfavof(String infavof) {
		this.infavof = infavof;
	}
	public String getPayableat() {
		return payableat;
	}
	public void setPayableat(String payableat) {
		this.payableat = payableat;
	}
	public int getCommisionamount() {
		return commisionamount;
	}
	public void setCommisionamount(int commisionamount) {
		this.commisionamount = commisionamount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Ddform(String requestid, String accountnumber, String ddnumber, String infavof, String payableat,
			int commisionamount, int amount, Date date, String status) {
		super();
		this.requestid = requestid;
		this.accountnumber = accountnumber;
		this.ddnumber = ddnumber;
		this.infavof = infavof;
		this.payableat = payableat;
		this.commisionamount = commisionamount;
		this.amount = amount;
		this.date = date;
		this.status = status;
	}
	public Ddform() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ddform [requestid=" + requestid + ", accountnumber=" + accountnumber + ", ddnumber=" + ddnumber
				+ ", infavof=" + infavof + ", payableat=" + payableat + ", commisionamount=" + commisionamount
				+ ", amount=" + amount + ", date=" + date + ", status=" + status + "]";
	}
	
}