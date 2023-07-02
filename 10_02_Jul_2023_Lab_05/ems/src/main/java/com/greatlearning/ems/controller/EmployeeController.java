package com.greatlearning.ems.controller;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
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
	
	@GetMapping("/employees/new")
	public String addEmployeeStep1(Model model) {
		
		Employee employee = new Employee();
		// Default values
		
		model.addAttribute("employee", employee);
		
		return "add_employee";
	}
	
	@PostMapping("/employees")
	public String addEmployeeStep2(
		@ModelAttribute("employee")
		Employee employee) {
		
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}
	
	@GetMapping("/employees/edit/{id}")
	public String updateEmployeeStep1(
		@PathVariable
		Long id, Model model) {
		
		Employee employeeObj = employeeService.getEmployeeDetails(id);
		
		model.addAttribute("employee", employeeObj);
		return "update_employee";
	}
	
	@PostMapping("/employees/{id}")
	public String updateEmployeeStep2(
		@PathVariable Long id,  
		@ModelAttribute("employee") Employee employeeObjWithUserValues
		) {
		
		Employee existingEmployeeObjFromDB 
			= employeeService.getEmployeeDetails(id);

		existingEmployeeObjFromDB.setFirstName(
				employeeObjWithUserValues.getFirstName());
		existingEmployeeObjFromDB.setLastName(
				employeeObjWithUserValues.getLastName());
		existingEmployeeObjFromDB.setEmailId(
				employeeObjWithUserValues.getEmailId());
		
		employeeService.saveEmployee(existingEmployeeObjFromDB);
		return "redirect:/employees";		
	}
	
	@GetMapping("/employees/{id}")
	public String deleteEmployee(
		@PathVariable Long id) {
		
		employeeService.deleteEmployee(id);
		return "redirect:/employees";		
	}
}
