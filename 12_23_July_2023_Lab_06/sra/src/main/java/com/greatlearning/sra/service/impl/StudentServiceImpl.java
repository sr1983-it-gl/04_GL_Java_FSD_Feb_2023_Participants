package com.greatlearning.sra.service.impl;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.greatlearning.sra.entity.Student;
import com.greatlearning.sra.repository.StudentRepository;
import com.greatlearning.sra.service.StudentService;

@Service
public class StudentServiceImpl 
	implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> findAll() {
		
		return studentRepository.findAll();
		
	}
	
//	public void findAllv2(Model modelObj){
//	
//		List<Student> allStudents 
//			= studentRepository.findAll();
//		
//		modelObj.addAttribute("students", allStudents);		
//	}
	

	@Override
	public Student findById(int studentId) {
		
		return studentRepository.findById(studentId).get();
	}

	@Override
	public void deleteById(int studentId) {
		
		studentRepository.deleteById(studentId);
	}

	@Override
	public void insertOrUpdate(
		int id, String firstName, String lastName, String course, 
		String country) {
				
		Student studentObj = null;
		
		if (id != 0) {
			
			studentObj = findById(id);
			
			studentObj.setFirstName(firstName);
			studentObj.setLastName(lastName);
			studentObj.setCourse(course);
			studentObj.setCountry(country);
			
			// Update Flow
		}else {
			
			// Add Flow
			
			studentObj = new Student(firstName, lastName, course, country);
		}
		
		studentRepository.save(studentObj);
	}

	@Override
	public String getAuthorizationErrorMessage(Principal user) {
		
	    String message = "";
	    if (user != null) {
	        
	        message = "Hello " + user.getName() + ", "
	            + " You dont have permission to access the page / perform the operation";						
	    }else {

	        message = "Hello " + ", "
	                + " You dont have permission to access the page / perform the operation";									
	    }
	
	    return message;
	}

}
