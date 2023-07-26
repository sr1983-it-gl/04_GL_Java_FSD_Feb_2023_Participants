package com.greatlearning.sra.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
			
			studentObj = studentService.findById(id);
			
			studentObj.setFirstName(firstName);
			studentObj.setLastName(lastName);
			studentObj.setCourse(course);
			studentObj.setCountry(country);
			
			// Update Flow
		}else {
			
			// Add Flow
			
			studentObj = new Student(firstName, lastName, course, country);
		}
		
		studentService.add(studentObj);
		
		return "redirect:/students/list";
	}
	
	
	@RequestMapping("/update-show-form")
	public String updateStudentStep1(
			
		@RequestParam("studentId") int studentId,
		Model modelObj) 
	{
		
		Student studentObj = 
				studentService.findById(studentId);
		
		modelObj.addAttribute("student", studentObj);
		
		return "student-form";
	}

	@RequestMapping("/delete")
	public String delete(
		
		@RequestParam("studentId") int studentId
		) {
		
		studentService.deleteById(studentId);
		
		return "redirect:/students/list";
	}
	
	
	@RequestMapping(value = "/403")
	public ModelAndView handleForbiddenError(
			Principal user) {
	    
	    ModelAndView mv = new ModelAndView();
	    
	    mv.setViewName("403");
	    
	    String message = "";
	    if (user != null) {
	        
	        message = "Hello " + user.getName() + ", "
	            + " You dont have permission to access the page / perform the operation";						
	    }else {

	        message = "Hello " + ", "
	                + " You dont have permission to access the page / perform the operation";									
	    }
	    
	    mv.addObject("msg", message);
	    
	    return mv;		
	}	
}
