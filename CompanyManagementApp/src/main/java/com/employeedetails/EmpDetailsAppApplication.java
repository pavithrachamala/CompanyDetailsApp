package com.employeedetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employeedetails.entities.Employee;
import com.employeedetails.entities.Employer;
import com.employeedetails.repository.EmployeeRepository;
import com.employeedetails.repository.EmployerRepository;

@SpringBootApplication
public class EmpDetailsAppApplication implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private EmployerRepository employerRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmpDetailsAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Employer em1=new Employer("raj");
//		Employer em2=new Employer("PP");
//		
//		employerRepository.save(em1);
//		employerRepository.save(em2);
//		
//		Employee emp1=new Employee("pavi","abc",10000.0,"bangalore");
//		Employee emp2=new Employee("sai","def",20000.0,"chennai");
//		Employee emp3=new Employee("veera","ghi",30000.0,"hyderabad");
//		Employee emp4=new Employee("meghana","frt",40000.0,"kerala");
//		Employee emp5=new Employee("veer","cmp",35000.0,"kolkata");
//		Employee emp6=new Employee("megh","ngt",45000.0,"mysore");
//		
//		emp1.setEmployer(em1);
//		emp2.setEmployer(em1);
//		emp3.setEmployer(em1);
//		emp4.setEmployer(em2);
//		emp5.setEmployer(em2);
//		emp6.setEmployer(em2);
//		
//		em1.getEmployees().add(emp1);
//		em1.getEmployees().add(emp2);
//		em1.getEmployees().add(emp3);
//		em2.getEmployees().add(emp4);
//		em2.getEmployees().add(emp5);
//		em2.getEmployees().add(emp6);
//		
//		employeeRepository.save(emp1);
//		employeeRepository.save(emp2);
//		employeeRepository.save(emp3);
//		employeeRepository.save(emp4);
//		employeeRepository.save(emp5);
//		employeeRepository.save(emp6);

	}
}