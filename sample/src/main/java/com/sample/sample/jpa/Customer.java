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

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="customer")
@Where(clause="active='true'")
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
	@Column
	private String normalJarRate;
	@Column
	private String coldJarRate;
	@Column
	private String activationDate;
	@Column
	private String deActivationDate;
	@Column
	private String securityDeposit;
	@Column
	private String returnSecurityDeposit;
	@Column
	private String active;
	
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

	
	

	 public String getNormalJarRate() {
		return normalJarRate;
	}



	public void setNormalJarRate(String normalJarRate) {
		this.normalJarRate = normalJarRate;
	}



	public String getColdJarRate() {
		return coldJarRate;
	}



	public void setColdJarRate(String coldJarRate) {
		this.coldJarRate = coldJarRate;
	}



	public String getActivationDate() {
		return activationDate;
	}



	public void setActivationDate(String activationDate) {
		this.activationDate = activationDate;
	}



	public String getSecurityDeposit() {
		return securityDeposit;
	}



	public void setSecurityDeposit(String securityDeposit) {
		this.securityDeposit = securityDeposit;
	}



	public String getActive() {
		return active;
	}



	public void setActive(String active) {
		this.active = active;
	}



	public String getDeActivationDate() {
		return deActivationDate;
	}



	public void setDeActivationDate(String deActivationDate) {
		this.deActivationDate = deActivationDate;
	}



	public String getReturnSecurityDeposit() {
		return returnSecurityDeposit;
	}



	public void setReturnSecurityDeposit(String returnSecurityDeposit) {
		this.returnSecurityDeposit = returnSecurityDeposit;
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
