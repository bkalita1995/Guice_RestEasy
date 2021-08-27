package com.restdemo.resources;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.restdemo.entity.StudentEntity;
import com.restdemo.service.StudentServiceImp;
@Singleton
@Path("/rest-demo")
public class MyResources{
	@Inject
	StudentServiceImp svi;
	
	@Path("/insert")
	@GET
	public void insert(@Context HttpServletRequest request, HttpServletResponse response ) {
		
		int rollno = Integer.parseInt( request.getParameter("roll_no"));
		String name=  request.getParameter("name");
		
		StudentEntity std = new StudentEntity(rollno, name);
		
		std.setRollNo(rollno);
		std.setName(name);
		
		svi.student(std);
	}

}
