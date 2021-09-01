package com.demo.config;

import com.demo.resource.StudentResources;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImp;
import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule{
	@Override
	protected void configure() {
		bind(StudentResources.class);
		bind(StudentService.class).to(StudentServiceImp.class);
	}

}
