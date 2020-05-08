package com.employeedetails.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employeedetails.entities.Employer;
import com.employeedetails.exceptionhandler.EmployerNotFoundException;
import com.employeedetails.repository.EmployerRepository;
@Service
@Transactional
public class EmployerServiceImpl implements EmployerService{
	@Autowired
	private EmployerRepository repo;

	@Override
	public List<Employer> findAll() {
		return repo.findAll();
	}
	@Override
	public Employer findByEmployerId(Long id) {
		return repo.findById(id).orElseThrow(() -> new EmployerNotFoundException(id));
	}
	@Override
	public Optional<Employer> findByEmployerName(String name) {
		return repo.findByName(name);
	}
}
