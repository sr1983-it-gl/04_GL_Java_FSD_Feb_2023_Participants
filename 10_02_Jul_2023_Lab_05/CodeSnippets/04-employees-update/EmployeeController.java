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