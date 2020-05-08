package com.employeedetails.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employeedetails.entities.Employee;
import com.employeedetails.exceptionhandler.EmployeeNotFoundException;
import com.employeedetails.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping(path = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getAllEmployees() {
		return new ResponseEntity<List<Employee>>(employeeService.findAll(), HttpStatus.OK);
	}

	@GetMapping(path = "/employees/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(name = "id") Long id) {
		return new ResponseEntity<Employee>(employeeService.findByEmpId(id), HttpStatus.OK);
	}

	@GetMapping(path = "/employees/limit/{salary}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getEmployeeBySalary(@PathVariable(name = "salary") double salary) {
		return new ResponseEntity<List<Employee>>(employeeService.salaryLimit(salary), HttpStatus.OK);
	}

	@GetMapping(path = "/employee/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> getEmployeeByName(@PathVariable(name = "name") String name) {
		Employee e = employeeService.findByEmpName(name).orElseThrow(()->new EmployeeNotFoundException(name));
		return new ResponseEntity<Employee>(e, HttpStatus.OK);
	}
}
