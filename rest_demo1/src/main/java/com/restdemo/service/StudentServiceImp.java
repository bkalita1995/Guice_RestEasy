package com.restdemo.service;

import javax.persistence.EntityManager;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;
import com.restdemo.entity.StudentEntity;

@Singleton
public class StudentServiceImp implements StudentService{
		
	@Inject
	Provider<EntityManager> em;	
	@Transactional
	@Override
	public void student(StudentEntity std) {
		EntityManager emanager = em.get();
		emanager.persist(std);
	}
}
