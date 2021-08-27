package com.restdemo.entity;

import javax.persistence.*;

@Entity
@Table(name="STUDENT_DETAILS")
public class StudentEntity {
	
	@Id
	@Column(name="roll_no")
	private int rollNo;
	
	@Column(name="student_name")
	private String name;
	public StudentEntity(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
