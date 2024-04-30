package com.bank2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="support")
public class Support {
    
	@Id
	private String name;
	private String emailid;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Support() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Support [name=" + name + ", emailid=" + emailid + ", message=" + message + "]";
	}
}
