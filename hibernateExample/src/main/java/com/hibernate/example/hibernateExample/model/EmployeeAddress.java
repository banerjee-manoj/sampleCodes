package com.hibernate.example.hibernateExample.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="employee_address")
public class EmployeeAddress implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id")
	private int id;	


	@Column(name="emp_address")
	private String empAddress;	
	
	
	
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Employee employee;

	 
	 public EmployeeAddress() {}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmpAddress() {
		return empAddress;
	}


	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}


	
	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	 
	 
}
