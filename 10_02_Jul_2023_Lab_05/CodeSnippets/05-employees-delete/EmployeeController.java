	@GetMapping("/employees/{id}")
	public String deleteEmployee(
		@PathVariable Long id) {
		
		employeeService.deleteEmployee(id);
		return "redirect:/employees";		
	}
