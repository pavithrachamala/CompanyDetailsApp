package com.employeedetails.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employeedetails.entities.Employer;
import com.employeedetails.exceptionhandler.EmployerNotFoundException;
import com.employeedetails.service.EmployerService;

@RestController
public class EmployerRestController {
	@Autowired
	private EmployerService employerService;

	@GetMapping(path = "/employers", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employer>> getAllEmployees() {
		return new ResponseEntity<List<Employer>>(employerService.findAll(), HttpStatus.OK);
	}

	@GetMapping(path = "/employers/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employer> getEmployerById(@PathVariable(name = "id") Long id) {
		return new ResponseEntity<Employer>(employerService.findByEmployerId(id), HttpStatus.OK);
	}

	@GetMapping(path = "/employer/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employer> getEmployerByName(@PathVariable(name = "name") String name) {
		Employer e = employerService.findByEmployerName(name).orElseThrow(()->new EmployerNotFoundException(name));
		return new ResponseEntity<Employer>(e, HttpStatus.OK);
	}
}
