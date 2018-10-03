package com.hibernate.example.hibernateExample;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.example.hibernateExample.model.Employee;
import com.hibernate.example.hibernateExample.service.EmployeeService;

@SpringBootApplication
public class HibernateExampleApplication  implements CommandLineRunner{

	@Autowired
    EmployeeService empService;	
	
	public static void main(String[] args) {
		SpringApplication.run(HibernateExampleApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Optional<Employee> emp = empService.getEmployeeListById(1);
		
		System.out.println(emp.get().getEmpName());
		
		System.out.println(empService.getEmployeeListById(1));
		
		empService.addNewEmployee("Mamoj2","purulia","2323323");
		
		
	}
}
