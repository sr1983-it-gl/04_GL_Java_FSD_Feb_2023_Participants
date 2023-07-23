package com.greatlearning.sra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.sra.entity.Student;

public interface StudentRepository 
	extends JpaRepository<Student, Integer>{

	
}
