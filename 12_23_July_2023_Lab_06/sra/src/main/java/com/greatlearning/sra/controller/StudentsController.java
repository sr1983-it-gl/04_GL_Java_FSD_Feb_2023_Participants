package com.greatlearning.sra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.sra.entity.Student;
import com.greatlearning.sra.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentsController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping("/list")
	public String listAllStudents(Model modelObj) {
		
		List<Student> allStudents 
			= studentService.findAll();
		
		modelObj.addAttribute("students", allStudents);
		
		return "student-lister";
	}
	
	@RequestMapping("/add-show-form")
	public String addStudentStep1(Model modelObj) {
		
		Student studentObj = new Student();
		
		modelObj.addAttribute("student", studentObj);
		
		return "student-form";
	}
	
	@RequestMapping("/save")
	public String save(
		
		@RequestParam("id") int id,
		@RequestParam("firstName") String firstName,
		@RequestParam("lastName") String lastName,
		@RequestParam("course") String course,
		@RequestParam("country") String country		
		) {
		
		Student studentObj = null;
		
		if (id != 0) {
			
			// Update Flow
		}else {
			
			// Add Flow
			
			studentObj = new Student(firstName, lastName, course, country);
		}
		
		studentService.add(studentObj);
		
		return "redirect:/students/list";
	}
}
