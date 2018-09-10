package com.sample.sample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.sample.jpa.Customer;
import com.sample.sample.jpa.CustomerAddress;
import com.sample.sample.jpa.CustomerRepository;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	@CrossOrigin
	@GetMapping(path="/getAllCustomer")
	public List<Customer> getName() {
		
		return customerRepository.findAll();
	}

	@CrossOrigin
	@PostMapping(path="/saveCustomer",consumes="application/json")
	public Customer saveCustomer(@RequestBody Customer customer) {
		
		try {
			ObjectMapper object = new ObjectMapper();
			System.out.println(object.writeValueAsString(customer));
			
			customerRepository.save(customer);
			
			return customer;
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
		
		
		
	}
	
	
	
	
	
	
}
