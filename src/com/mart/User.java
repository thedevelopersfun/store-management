package com.mart;

import java.io.Serializable;

public class User implements Serializable{
	
	private String name;
	private String role = Role.ROLE_MEMBER;	
	private String username; 
	private Long phoneNumber; 
	private String emailId;
	
	
	public User(String name, String role, String username, Long phoneNumber, String emailId) {
		this.name = name;
		this.role = role;
		this.username = username;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}


	public String getRole() {
		return role;
	}


	public String getUsername() {
		return username;
	}


	public Long getPhoneNumber() {
		return phoneNumber;
	}


	public String getEmailId() {
		return emailId;
	}
	
	
}
