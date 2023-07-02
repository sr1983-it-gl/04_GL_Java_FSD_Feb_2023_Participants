package com.greatlearning.ems.controller;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.greatlearning.ems.entity.Employee;
import com.greatlearning.ems.service.EmployeeService;

@Controller
public class EmployeeController {

//	@Autowired
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService= employeeService;
	}
	
	@GetMapping("/employees")
	public String listEmployees(Model model) {
		
		List<Employee> employeesList = employeeService.listAllEmployees();
		
		model.addAttribute("employees", employeesList);
		
		return "employees";
	}
}
