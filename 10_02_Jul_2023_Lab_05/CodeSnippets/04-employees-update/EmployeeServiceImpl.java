	@Override
	public Employee getEmployeeDetails(Long id) {
		
		return employeeRepository.findById(id).get();
	}
