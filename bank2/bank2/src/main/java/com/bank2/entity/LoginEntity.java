package com.bank2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Loginform")
public class LoginEntity {
	
	@Id
private int regitserid;
private String accountnumber;
  private String password;
  private String secretquestion;
  private String secretanswer;
  private String role;
public int getRegitserid() {
	return regitserid;
}
public void setRegitserid(int regitserid) {
	this.regitserid = regitserid;
}
public String getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(String accountnumber) {
	this.accountnumber = accountnumber;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getSecretquestion() {
	return secretquestion;
}
public void setSecretquestion(String secretquestion) {
	this.secretquestion = secretquestion;
}
public String getSecretanswer() {
	return secretanswer;
}
public void setSecretanswer(String secretanswer) {
	this.secretanswer = secretanswer;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public LoginEntity(int regitserid, String accountnumber, String password, String secretquestion,
		String secretanswer, String role) {
	super();
	this.regitserid = regitserid;
	this.accountnumber = accountnumber;
	this.password = password;
	this.secretquestion = secretquestion;
	this.secretanswer = secretanswer;
	this.role = role;
}
public LoginEntity() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "LoginEntity [regitserid=" + regitserid + ", accountnumber=" + accountnumber + ", password=" + password
			+ ", secretquestion=" + secretquestion + ", secretanswer=" + secretanswer + ", role=" + role + "]";
}
}