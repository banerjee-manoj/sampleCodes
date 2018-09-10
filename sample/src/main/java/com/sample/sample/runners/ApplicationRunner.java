package com.sample.sample.runners;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.sample.jpa.Customer;
import com.sample.sample.jpa.CustomerAddress;
import com.sample.sample.jpa.CustomerRepository;


//@Component
public class ApplicationRunner implements CommandLineRunner {

	@Autowired
	private CustomerRepository customeRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		
		Customer customer = new Customer();
		customer.setCustomerName("Customer 5");
		customer.setCustomerMobileNumber("1234567");
		customer.setCustomerType("Regular");
		CustomerAddress address = new CustomerAddress();
		List<CustomerAddress> addList = new ArrayList<>();
		address.setAddress("Customer Address 5");
		address.setCustomer(customer);
		addList.add(address);
		customer.setCustomerAddressLst(addList);
		
		ObjectMapper object = new ObjectMapper();
		System.out.println(object.writeValueAsString(customer));
		
		customeRepo.save(customer);
		
		
		
		
		System.out.println("Sample Application Runner...");
		
	}

}
