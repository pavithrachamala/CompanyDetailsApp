package com.employeedetails.exceptionhandler;

public class EmployeeNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(Long id) {
		super("employee id not found: " + id);
	}

	public EmployeeNotFoundException(String name) {
		super("employee name not found: " + name);
	}
}
