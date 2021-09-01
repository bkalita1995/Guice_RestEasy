package com.demo.db;

import javax.persistence.*;

@Entity
public class StudentEmail {
	
	@Id
	@Column(name="email_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int eid;
	private String email;
	
//	Constructor
	public StudentEmail() {}

public StudentEmail(String email) {
		super();
		this.email = email;
	}



//	Gatter and Setter
public int getEid() {
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}



@Override
public String toString() {
	return this.email;
}



	
	

}
