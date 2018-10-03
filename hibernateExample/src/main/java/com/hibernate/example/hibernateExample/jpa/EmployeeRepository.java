package com.hibernate.example.hibernateExample.jpa;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.example.hibernateExample.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	
	Optional<Employee> findById(Integer empId);
}
