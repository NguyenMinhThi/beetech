package com.example.demo2.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class customer 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer customer_id;
	
	@Column(name = "customer_name", nullable = false)
    private String customer_name;
    
    @Column(name = "customer_email", nullable = false)
    private String customer_email;
    
    @Column(name = "customer_address", nullable = false)
    private String customer_address;

	public Integer getCustomer_Id() {
		return customer_id;
	}

	public void setCustomer_Id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_Name() {
		return customer_name;
	}

	public void setCustomer_Name(String customer_name) {
		if(customer_name.matches("[^0-9]"))
		{
			this.customer_name= customer_name;
			
		}
		else
		{
			this.customer_name = "no name";
			
		}
	}

	public String getCustomer_Email() {
		return customer_email;
	}

	public void setCustomer_Email(String customer_email) {
		this.customer_email = customer_email;
	}

	public String getCustomer_Address() {
		return customer_address;
	}

	public void setCustomer_Address(String customer_address) {
		this.customer_address = customer_address;
	}
    
}
