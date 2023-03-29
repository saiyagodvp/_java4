package com.vn.model;

public class Student {
	
	private String name;
	private Double mark;
	
	public Student() {
		super();
	}
	
	public Student(String name, Double mark) {
		super();
		this.name = name;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getMark() {
		return mark;
	}
	public void setMark(Double mark) {
		this.mark = mark;
	}

}
