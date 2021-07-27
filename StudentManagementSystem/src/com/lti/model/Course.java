package com.lti.model;

import java.time.LocalDate;

public class Course {

	private int id;
	private String name;
	private int duration;
	private int fees;
	
	//constructor
	
	public Course() {
		
	} 
	
	public Course(int id, String name, int duration, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.fees = fees;
	}
	
	// getter and setter

	public int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getDuration() {
		return duration;
	}

	protected void setDuration(int duration) {
		this.duration = duration;
	}

	protected int getFees() {
		return fees;
	}

	protected void setFees(int fees) {
		this.fees = fees;
	}
	
	public void MonthlyFees(){
		System.out.println(fees/duration);
	
	}

	}


