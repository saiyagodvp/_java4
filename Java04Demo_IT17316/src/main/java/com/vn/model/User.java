package com.vn.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	Integer id;
	
	private String username;
	private String password;
	private String fullName;
	
	public User() {
		super();
	}
	
	
	public User(String fullName,String username, String password) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
}
