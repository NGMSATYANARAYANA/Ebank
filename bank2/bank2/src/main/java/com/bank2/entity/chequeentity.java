package com.bank2.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="checkrequest")
public class chequeentity {
	
	
	
	@Id
	private int requestid;
	
	private String acctnumber;
	private Date date;
	private int booknum;
	private int startnum;
	private int endnum;
	private int status;
	public int getRequestid() {
		return requestid;
	}
	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}
	public String getAcctnumber() {
		return acctnumber;
	}
	public void setAcctnumber(String acctnumber) {
		this.acctnumber = acctnumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getBooknum() {
		return booknum;
	}
	public void setBooknum(int booknum) {
		this.booknum = booknum;
	}
	public int getStartnum() {
		return startnum;
	}
	public void setStartnum(int startnum) {
		this.startnum = startnum;
	}
	public int getEndnum() {
		return endnum;
	}
	public void setEndnum(int endnum) {
		this.endnum = endnum;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public chequeentity(int requestid, String acctnumber, Date date, int booknum, int startnum, int endnum,
			int status) {
		super();
		this.requestid = requestid;
		this.acctnumber = acctnumber;
		this.date = date;
		this.booknum = booknum;
		this.startnum = startnum;
		this.endnum = endnum;
		this.status = status;
	}
	
	public chequeentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "chequeentity [requestid=" + requestid + ", acctnumber=" + acctnumber + ", date=" + date + ", booknum="
				+ booknum + ", startnum=" + startnum + ", endnum=" + endnum + ", status=" + status + "]";
	}
}
