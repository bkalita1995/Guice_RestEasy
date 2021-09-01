package com.demo.service;

import java.util.List;

import javax.persistence.EntityManager;

import com.demo.db.Student;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;

@Singleton
public class StudentServiceImp implements StudentService{
	
	@Inject
	Provider<EntityManager> em;
	
	@Transactional
	@Override
	public boolean addStudent(Student stud) {
		EntityManager emanager = em.get();
		emanager.persist(stud);
		return true;
	}
	
	@Transactional
	@Override
	public List<Student> readStudents() {
		EntityManager emanager= em.get();
		List<Student> studentList= emanager.createQuery("from Student", Student.class).getResultList();
		return studentList;
		
	}
	
	
	@Transactional
	@Override
	public Student readStudentbyroll_no(int roll_no) {
		EntityManager emanager = em.get();
		Student s = emanager.find(Student.class, roll_no);
		return s;
	}
	
	@Transactional
	@Override
	public boolean updateStudent(Student stud, int roll_no) {
		EntityManager emanager = em.get();
		Student student = emanager.find(Student.class, roll_no);
		student.setName(stud.getName());
		return true;
	}
	
	@Transactional
	@Override
	public boolean deletStudent(int roll_no) {
		EntityManager emanager = em.get();
		Student stud = emanager.find(Student.class, roll_no);
		emanager.remove(stud);
		return true;
	}
	

}
