package com.wq.training;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data


public class Sellers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
     String userName,password,companyName,email,mobileNumber;

	public Integer getId() {
		return id;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public Sellers(Integer id, String userName, String password, String companyName, String email,
			String mobileNumber) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.companyName = companyName;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	public Sellers() {
		super();
	}
     
     
    
    
	

	
	

	
	
}
