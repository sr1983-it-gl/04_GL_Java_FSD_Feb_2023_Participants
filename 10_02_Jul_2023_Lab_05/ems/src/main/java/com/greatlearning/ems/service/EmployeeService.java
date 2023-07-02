package com.greatlearning.ems.service;

import java.util.List;

import com.greatlearning.ems.entity.Employee;

public interface EmployeeService {

	List<Employee> listAllEmployees();

	void saveEmployee(Employee employee);

	Employee getEmployeeDetails(Long id);

	void deleteEmployee(Long id);
}
