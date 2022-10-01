package com.example.demo2.service;

import java.util.List;

import com.example.demo2.customer.customer;

public interface ICustomer {
	public customer addCustomer(customer Customer);
	public void deleteCustomer(int id);
	public List<customer> getAllCustomer();
	

}
