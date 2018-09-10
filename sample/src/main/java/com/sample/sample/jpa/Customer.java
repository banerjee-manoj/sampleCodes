package com.sample.sample.jpa;

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="customer")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Customer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerId;
	@Column
	private String customerName;
	@Column
	private String customerType;
	@Column
	private String customerMobileNumber;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="customer",cascade=CascadeType.ALL)
	@JsonManagedReference
	private List<CustomerAddress> customerAddressLst;
	
	
	
	public Customer() {
		super();
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getCustomerType() {
		return customerType;
	}



	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}



	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}



	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}


	 @OneToMany(fetch = FetchType.EAGER, mappedBy = "employee")
	    @JsonManagedReference
	public List<CustomerAddress> getCustomerAddressLst() {
		return customerAddressLst;
	}



	public void setCustomerAddressLst(List<CustomerAddress> customerAddressLst) {
		this.customerAddressLst = customerAddressLst;
	}
	
	
	
	
	
	
	
	
	
	

}
