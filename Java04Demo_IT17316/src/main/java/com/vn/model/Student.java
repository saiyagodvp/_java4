package com.vn.model;

public class Student {
	
	private String id;
	private String name;
	private Boolean gender;
	
	public Student() {
		super();
	}
	
	public Student(String id, String name, Boolean gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	
}
