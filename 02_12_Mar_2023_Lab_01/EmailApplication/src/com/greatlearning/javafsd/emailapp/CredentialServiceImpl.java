package com.greatlearning.javafsd.emailapp;

import com.greatlearning.javafsd.emailapp.model.Employee;
import com.greatlearning.javafsd.emailapp.service.ICredentialService;
import com.greatlearning.javafsd.emailapp.service.PasswordGenerator;

public class CredentialServiceImpl 
	implements ICredentialService{
	
	@Override
	public String generatePassword() {
		
		PasswordGenerator generator = new PasswordGenerator();
		
		String password = generator.generate();
		
		return password;
	}

	@Override
	public String generateEmailAddress(Employee employee) {
		
		//firstname.lastname@department.abc.com
		
		String firstName = employee.getFirstName();
		
		String lastName = employee.getLastName();
		
		String department = employee.getDepartment();
		
		// Concatenate strings
		StringBuilder emailBuilder = new StringBuilder();
		
		emailBuilder.append(firstName.toLowerCase());
		emailBuilder.append(".");
		emailBuilder.append(lastName.toLowerCase());
		emailBuilder.append("@");
		emailBuilder.append(department);
		emailBuilder.append(".gl.com");
		
		String emailAddress = emailBuilder.toString();
		
		employee.setEmailAddress(emailAddress);
				
		return emailAddress;
	}

	@Override
	public void displayCredentials(Employee employee) {

		StringBuilder messageBuilder = new StringBuilder();
		messageBuilder.append("Dear ");
		messageBuilder.append(employee.getFirstName());
		messageBuilder.append(", your generated credentials are as follows");
		
		// \r\n \n
		String newline = System.getProperty("line.separator");
		messageBuilder.append(newline);
		messageBuilder.append("Email        --->  ");
		messageBuilder.append(employee.getEmailAddress());
		
		messageBuilder.append(newline);
		messageBuilder.append("Password ---> ");
		messageBuilder.append(employee.getPassword());
		
		String finalMessage = messageBuilder.toString();
		
		System.out.println(finalMessage);
	}
}
