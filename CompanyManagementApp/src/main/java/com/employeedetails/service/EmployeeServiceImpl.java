package com.employeedetails.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.employeedetails.entities.Employee;
import com.employeedetails.exceptionhandler.EmployeeNotFoundException;
import com.employeedetails.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	List<Employee> salaryLimit = new ArrayList<>();

	@Override
	public Employee findByEmpId(Long id) {
		return repo.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
	}

	@Override
	public List<Employee> salaryLimit(Double salary) {
		for (Employee e : findAll()) {
			if (e.getSalary() > salary) {
				salaryLimit.add(e);
			}
		}
		return salaryLimit;
	}

	@Override
	public List<Employee> findAll() {
		return repo.findAll();
	}

	@Override
	public Optional<Employee> findByEmpName(String name) {
		return repo.findByName(name);
	}
}
