package com.employeedetails.service;

import java.util.List;
import java.util.Optional;

import com.employeedetails.entities.Employer;

public interface EmployerService {
	public List<Employer> findAll();
	public Employer findByEmployerId(Long id);
	public Optional<Employer> findByEmployerName(String name);
}
