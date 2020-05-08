package com.employeedetails.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "employee9")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empId;
	private String name;
	private String dept;
	private double salary;
	private String address;

	@ManyToOne
	@JoinColumn(name = "employer_fk")
	@JsonIgnore
	private Employer employer;

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public Employee(String name, String dept, double salary, String address) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.address = address;
	}

	public Employee() {

	}
}
