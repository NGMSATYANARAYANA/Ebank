package com.bank2.entity;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Account")
public class AccountRequest {
	
	@Id
	private int reqid;
    private int accountnumber;
	private String password;
	private String firstname;
	private String secondname;
	private String sex;
    private String emailid;
	private int residencephonenumber;
    private int officephonenumber;
	private String housename;
    private String secretquestion;
	private String secretanswer;
	private String city;
	private String branch;
	private int age;
	private String country;
	public int getReqid() {
		return reqid;
	}
	public void setReqid(int reqid) {
		this.reqid = reqid;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getResidencephonenumber() {
		return residencephonenumber;
	}
	public void setResidencephonenumber(int residencephonenumber) {
		this.residencephonenumber = residencephonenumber;
	}
	public int getOfficephonenumber() {
		return officephonenumber;
	}
	public void setOfficephonenumber(int officephonenumber) {
		this.officephonenumber = officephonenumber;
	}
	public String getHousename() {
		return housename;
	}
	public void setHousename(String housename) {
		this.housename = housename;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public AccountRequest(int reqid, int accountnumber, String password, String firstname, String secondname,
			String sex, String emailid, int residencephonenumber, int officephonenumber, String housename,
			String secretquestion, String secretanswer, String city, String branch, int age, String country) {
		super();
		this.reqid = reqid;
		this.accountnumber = accountnumber;
		this.password = password;
		this.firstname = firstname;
		this.secondname = secondname;
		this.sex = sex;
		this.emailid = emailid;
		this.residencephonenumber = residencephonenumber;
		this.officephonenumber = officephonenumber;
		this.housename = housename;
		this.secretquestion = secretquestion;
		this.secretanswer = secretanswer;
		this.city = city;
		this.branch = branch;
		this.age = age;
		this.country = country;
	}
	public AccountRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AccountRequest [reqid=" + reqid + ", accountnumber=" + accountnumber + ", password=" + password
				+ ", firstname=" + firstname + ", secondname=" + secondname + ", sex=" + sex + ", emailid=" + emailid
				+ ", residencephonenumber=" + residencephonenumber + ", officephonenumber=" + officephonenumber
				+ ", housename=" + housename + ", secretquestion=" + secretquestion + ", secretanswer=" + secretanswer
				+ ", city=" + city + ", branch=" + branch + ", age=" + age + ", country=" + country + "]";
	}
	
	
	
	
	
		
		
	

	
	

}
