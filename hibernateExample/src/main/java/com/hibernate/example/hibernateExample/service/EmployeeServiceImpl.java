package com.hibernate.example.hibernateExample.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hibernate.example.hibernateExample.jpa.EmployeeRepository;
import com.hibernate.example.hibernateExample.model.Employee;
import com.hibernate.example.hibernateExample.model.EmployeeAddress;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeRepository empRepo;
	
	@Override
	public Optional<Employee> getEmployeeListById(Integer empId) {
		
		return empRepo.findById(empId);
	}

	@Override
	public Optional<Employee> addNewEmployee(String name, String address, String mobile) {
		try {
		Employee emp = new Employee();
		emp.setEmpName(name);
		emp.setEmpAddress(address);
		emp.setEmpMobileNos(mobile);
		
		List<EmployeeAddress> empAdlst = new ArrayList();
		EmployeeAddress address1 = new EmployeeAddress();
		address1.setEmpAddress(address);
		address1.setEmployee(emp);
		empAdlst.add(address1);
		emp.setEmpAddresses(empAdlst);
		System.out.println(emp.toString());
		ObjectMapper object = new ObjectMapper();
		System.out.println(object.writeValueAsString(emp));
		empRepo.save(emp);
		}catch(Exception ex) {
			System.out.println("Exception "+ex.getMessage());
		}
		return null;
	}

}
