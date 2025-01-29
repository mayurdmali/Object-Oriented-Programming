package com.entity;

public class Student {
	public String name;
	private int roll;
	private String div;
	private String course;
	private double fees;
	public Student() {
		super();
	}
	public Student(String name, int roll, String div, String course, double fees) {
		super();
		this.name = name;
		this.roll = roll;
		this.div = div;
		this.course = course;
		this.fees = fees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getDiv() {
		return div;
	}
	public void setDiv(String div) {
		this.div = div;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", div=" + div + ", course=" + course + ", fees=" + fees
				+ "]";
	}
	
	

}
