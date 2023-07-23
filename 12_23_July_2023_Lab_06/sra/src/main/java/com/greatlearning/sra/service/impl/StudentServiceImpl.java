package com.greatlearning.sra.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	@Override
	public void add(Student studentObj) {
		
		studentRepository.save(studentObj);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student findById(int studentId) {
		
		return studentRepository.findById(studentId).get();
	}

	@Override
	public void deleteById(int studentId) {
		
		studentRepository.deleteById(studentId);
	}

}
