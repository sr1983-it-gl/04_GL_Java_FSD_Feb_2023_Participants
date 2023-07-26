package com.greatlearning.sra.service;

import java.security.Principal;
import java.util.List;

import org.springframework.ui.Model;

import com.greatlearning.sra.entity.Student;

public interface StudentService {

	List<Student> findAll();

//	void findAllv2(Model modelObj);
		
	Student findById(int studentId);
	
	void deleteById(int studentId);

	void insertOrUpdate(int id, String firstName, 
			String lastName, String course,  String country);
	
	String getAuthorizationErrorMessage(Principal user);
	
}
