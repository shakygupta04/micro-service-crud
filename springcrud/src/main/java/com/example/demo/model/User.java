package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	
	

	private String fname;
	private String lname;
	private String email;
	private long phonenumber;
	private String address;
	private long accountbal;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long accountno;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getAccountbal() {
		return accountbal;
	}

	public void setAccountbal(long accountbal) {
		this.accountbal = accountbal;
	}

	public long getAccountno() {
		return accountno;
	}

	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	
	
	@Override
	public String toString() {
		return "User [phonenumber=" + phonenumber + ", accountbal=" + accountbal + ", accountno=" + accountno + "]";
	}




}
