package com.greatlearning.javafsd.emailapp;

public class CredentialServiceImpl 
	implements ICredentialService{

//	Employee employee
	
	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generateEmailAddress(Employee employee) {
		
		//firstname.lastname@department.abc.com
		
		String firstName = employee.getFirstName();
		
		String lastName = employee.getLastName();
		
		String department = employee.getDepartment();
		
		// Concatenate strings
		StringBuilder emailBuilder = new StringBuilder();
		
		emailBuilder.append(firstName);
		emailBuilder.append(".");
		emailBuilder.append(lastName);
		emailBuilder.append("@");
		emailBuilder.append(department);
		emailBuilder.append(".gl.com");
		
		String emailAddress = emailBuilder.toString();
		
		employee.setEmailAddress(emailAddress);
				
		return emailAddress;
	}

	@Override
	public void displayCredentials(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	

}
