import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


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

