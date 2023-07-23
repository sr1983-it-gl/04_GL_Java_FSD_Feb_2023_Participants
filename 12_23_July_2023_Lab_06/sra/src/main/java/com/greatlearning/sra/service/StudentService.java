package com.greatlearning.sra.service;

import java.util.List;

import com.greatlearning.sra.entity.Student;

public interface StudentService {

	List<Student> findAll();
	
	void add(Student studentObj);
	
	Student findById(int studentId);
	
}
