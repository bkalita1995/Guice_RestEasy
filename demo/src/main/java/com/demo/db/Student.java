package com.demo.db;

import javax.persistence.*;

@Entity
@Table(name="student_table")
public class Student {
	
	@Id
	@Column(name="student_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int roll_no;
	
	@Column(name="student_name")
	private String name;
	
	
	
//	Constructor
	public Student() {}
	

	public Student(String name) {
		super();
		this.name = name;
	}

//	Getter and Setter
	public int getRoll_no() {
		return roll_no;
	}


	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
	
}
