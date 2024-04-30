package com.bank2.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Register")
public class RegistrationEntity {
	@Id
     private int registerid;
	 private int requestid;
	 private String firstname;
	 private String secondname;
	 private String sex;
	 private String emailid;
	 private String residencephonenumber;
	 private String officephonenumber;
	 private String housename;
	 private String city;
	 private int age;
	 private String country;
	 
	public int getRegisterid() {
		return registerid;
	}
	public void setRegisterid(int registerid) {
		this.registerid = registerid;
	}
	public int getRequestid() {
		return requestid;
	}
	public void setRequestid(int requestid) {
		this.requestid = requestid;
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
	public RegistrationEntity(int registerid, int requestid, String firstname, String secondname, String sex,
			String emailid, String residencephonenumber, String officephonenumber, String housename, String city,
			int age, String country) {
		super();
		this.registerid = registerid;
		this.requestid = requestid;
		this.firstname = firstname;
		this.secondname = secondname;
		this.sex = sex;
		this.emailid = emailid;
		this.residencephonenumber = residencephonenumber;
		this.officephonenumber = officephonenumber;
		this.housename = housename;
		this.city = city;
		this.age = age;
		this.country = country;
	}
	public RegistrationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RegistrationEntity [registerid=" + registerid + ", requestid=" + requestid + ", firstname=" + firstname
				+ ", secondname=" + secondname + ", sex=" + sex + ", emailid=" + emailid + ", residencephonenumber="
				+ residencephonenumber + ", officephonenumber=" + officephonenumber + ", housename=" + housename
				+ ", city=" + city + ", age=" + age + ", country=" + country + "]";
	}
	 
	 
	
	 
}
