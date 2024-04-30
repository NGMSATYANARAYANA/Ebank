package com.bank2.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "loanrequest")
public class LoanRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)

   private long requestid;
	
	
	private String account;
	
	

	private String cardnumber;
	
	private String firstname;
	
	private String secondname;
	
	private String profession;
	
	private String annualincome;
	
	private String residencephonenumber;
   private String officephonenumber;
	private String housename;
	private String city ;
	private String pin;
    private String emailid;
	private String purpose;
	private int statues;
	public long getRequestid() {
		return requestid;
	}
	public void setRequestid(long requestid) {
		this.requestid = requestid;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
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
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getAnnualincome() {
		return annualincome;
	}
	public void setAnnualincome(String annualincome) {
		this.annualincome = annualincome;
	}
	public String getResidencephonenumber() {
		return residencephonenumber;
	}
	public void setResidencephonenumber(String residencephonenumber) {
		this.residencephonenumber = residencephonenumber;
	}
	public String getOfficephonenumber() {
		return officephonenumber;
	}
	public void setOfficephonenumber(String officephonenumber) {
		this.officephonenumber = officephonenumber;
	}
	public String getHousename() {
		return housename;
	}
	public void setHousename(String housename) {
		this.housename = housename;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public int getStatues() {
		return statues;
	}
	public void setStatues(int statues) {
		this.statues = statues;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public LoanRequest(long requestid, String account, String cardnumber, String firstname, String secondname,
			String profession, String annualincome, String residencephonenumber, String officephonenumber,
			String housename, String city, String pin, String emailid, String purpose, int statues) {
		super();
		this.requestid = requestid;
		this.account = account;
		this.cardnumber = cardnumber;
		this.firstname = firstname;
		this.secondname = secondname;
		this.profession = profession;
		this.annualincome = annualincome;
		this.residencephonenumber = residencephonenumber;
		this.officephonenumber = officephonenumber;
		this.housename = housename;
		this.city = city;
		this.pin = pin;
		this.emailid = emailid;
		this.purpose = purpose;
		this.statues = statues;
	}
	public LoanRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LoanRequest [requestid=" + requestid + ", account=" + account + ", cardnumber=" + cardnumber
				+ ", firstname=" + firstname + ", secondname=" + secondname + ", profession=" + profession
				+ ", annualincome=" + annualincome + ", residencephonenumber=" + residencephonenumber
				+ ", officephonenumber=" + officephonenumber + ", housename=" + housename + ", city=" + city + ", pin="
				+ pin + ", emailid=" + emailid + ", purpose=" + purpose + ", statues=" + statues + "]";
	}
	
	
	
	
	
}
