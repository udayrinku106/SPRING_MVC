package com.spring.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Student {
	
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty(message = "Please enter your password.")
	@Size(min = 6, max = 15, message = "Your password must between 6 and 15 characters")
	@Pattern(regexp = "[0-9]+",message="must be numeric")
	private String password;

	
	@Range(min = 1, max = 9) 
	private int securityKey;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSecurityKey() {
		return securityKey;
	}

	public void setSecurityKey(int securityKey) {
		this.securityKey = securityKey;
	}
	
	

}
