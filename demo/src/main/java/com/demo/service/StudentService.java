package com.demo.service;

import java.util.List;

import com.demo.db.Student;



public interface StudentService {
	public boolean addStudent(Student stud);
	public List<Student> readStudents();
	public boolean updateStudent(Student stud, int roll_no);
	public Student readStudentbyroll_no( int roll_no);
	public boolean deletStudent( int roll_no);
}
