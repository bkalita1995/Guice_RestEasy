package com.demo.resource;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jboss.resteasy.plugins.providers.html.View;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;

import com.demo.db.Student;
import com.demo.service.StudentService;
import com.google.inject.Inject;

@Path("student")
public class StudentResources {
	
	@Inject
	StudentService ss;
	
	@POST
	@Path("/insert")
	public void addstudent( @Context HttpServletRequest request, @Context HttpServletResponse response) {
		
		Student stud = new Student(request.getParameter("name"));
		ss.addStudent(stud);
		
	}
	
	 @GET
	 @Path("/get")
	 public View viewStudent() {
		 List<Student> list = ss.readStudents();
		return new View("/index.jsp",list,"studentlist");
		 
	 }
	 
	 @GET
	 @Path("/get/{roll_no}")
	 public View readStudentbyRollno(@Context HttpServletRequest request, @Context HttpServletResponse response, @PathParam ("roll_no") Integer roll_no) {
		Student stud = ss.readStudentbyroll_no(roll_no);
		System.out.println("StudentResource.readStudentbyRoll_no::"+ stud.getName());
		 return new View("/edit.jsp", stud, "StudentObj");
		 
	 }
	
	 @POST
	 @Path("/update")
	 public void updateStudent(@Context HttpServletRequest request, @Context HttpServletResponse response) throws IOException {
		 
		 int rollno = Integer.parseInt(request.getParameter("roll_no"));
		 String name = request.getParameter("name");
		 
		 Student stud = new Student(name);
		 ss.updateStudent(stud, rollno);
		 response.sendRedirect(request.getContextPath()+ "/student/get");
		 
	 }
	 
	 @GET
	 @Path("/delete/{roll_no}")
	 
	 public void deleteSyudent(@Context HttpServletRequest request, @Context HttpServletResponse response, @PathParam ("roll_no") Integer roll_no) throws IOException {
		 ss.deletStudent(roll_no);
		 response.sendRedirect(request.getContextPath() + "/student/get");
	 }
	 
	 
}
