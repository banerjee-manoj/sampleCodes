package com.hibernate.example.hibernateExample.service;

import java.util.Optional;

import com.hibernate.example.hibernateExample.model.Employee;

public interface EmployeeService{

	public Optional<Employee> getEmployeeListById(Integer id);
	public Optional<Employee> addNewEmployee(String name,String address, 
			String mobile);
	
}
