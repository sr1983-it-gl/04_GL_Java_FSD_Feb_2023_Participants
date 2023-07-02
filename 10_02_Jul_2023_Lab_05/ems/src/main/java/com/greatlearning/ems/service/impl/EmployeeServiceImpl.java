package com.greatlearning.ems.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

//import org.springframework.beans.factory.annotation.Autowired;

import com.greatlearning.ems.entity.Employee;
import com.greatlearning.ems.repository.EmployeeRepository;
import com.greatlearning.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl 
	implements EmployeeService{

//	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public List<Employee> listAllEmployees() {
		
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		
		employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeDetails(Long id) {
		
		return employeeRepository.findById(id).get();
	}

	@Override
	public void deleteEmployee(Long id) {
		
		employeeRepository.deleteById(id);		
	}

	
}
