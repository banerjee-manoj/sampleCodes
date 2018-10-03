package com.hibernate.example.hibernateExample.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id")
	private int id;	

	@Column(name="emp_name")
	private String empName;

	@Column(name="emp_address")
	private String empAddress;	  

	@Column(name="emp_mobile_nos")
	private String empMobileNos;
	
	
	 @OneToMany(cascade = CascadeType.ALL,
	            fetch = FetchType.EAGER,
	            mappedBy = "employee")
	    private List<EmployeeAddress> empAddresses;
	 
	 
	 public Employee() {}
	 
	 
	 
	 
	 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpMobileNos() {
		return empMobileNos;
	}

	public void setEmpMobileNos(String empMobileNos) {
		this.empMobileNos = empMobileNos;
	}





	public List<EmployeeAddress> getEmpAddresses() {
		return empAddresses;
	}





	public void setEmpAddresses(List<EmployeeAddress> empAddresses) {
		this.empAddresses = empAddresses;
	}
	
	
	
}
