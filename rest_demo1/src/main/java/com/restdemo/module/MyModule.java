package com.restdemo.module;

import com.google.inject.AbstractModule;
import com.restdemo.resources.MyResources;
import com.restdemo.service.StudentService;
import com.restdemo.service.StudentServiceImp;

public class MyModule extends AbstractModule{
	@Override
	protected void configure() {
		bind(MyResources.class);
		bind(StudentService.class).to(StudentServiceImp.class);

			
	}
	

}
