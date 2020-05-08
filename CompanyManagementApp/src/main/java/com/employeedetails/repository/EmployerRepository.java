package com.employeedetails.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeedetails.entities.Employer;
@Repository
public interface EmployerRepository extends JpaRepository<Employer, Long>{
	public Optional<Employer> findByName(String name);
	
}
