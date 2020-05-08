package com.employeedetails.exceptionhandler;

public class EmployerNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public EmployerNotFoundException(Long id)
	{
		super("Employer id not found:"+ id);
	}
	public EmployerNotFoundException(String name)
	{
		super("Employer name not found:" +name);
	}

}
