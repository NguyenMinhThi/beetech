package com.example.demo2;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.customer.customer;
import com.example.demo2.product.product;
import com.example.demo2.repository.ProductRepository;
import com.example.demo2.repository.customerRepository;



@RestController
@RequestMapping("/test")
public class CustomerController {
	@Autowired
	customerRepository customerRepository;
	
	@PostMapping("/customer")
	public customer AddCustomer(@RequestBody customer customer)
	{
		customer Customer = customerRepository.save(customer);
   	 
   	 return Customer;
	}
	@DeleteMapping("/customer/{id}")
	public void deleteCustomer(@PathVariable(value = "id") Integer customer_id)
	{
		customer customer = customerRepository.findById(customer_id).get();
		customerRepository.delete(customer);
	}
	
	@GetMapping("/customer")
	public List<customer> getAll(){
		  List<customer> customer = customerRepository.findAll();
		return customer;
	}
	//----------------------------
	@Autowired
	ProductRepository ProductRepository;
	@PostMapping("/product")
	public product AddProduct(@RequestBody product product )
	{
		product Product = ProductRepository.save(product);
   	 
   	 return Product;
	}
	@DeleteMapping("/product/{id}")
	public void DeleteProduct(@PathVariable(value = "id") Integer product_ID)
	{
		product Product_ID  = ProductRepository.findById(product_ID).get();
		ProductRepository.delete(Product_ID);
	}
	
	@GetMapping("/product")
	public List<product> getAllProduct(){
		  List<product> product = ProductRepository.findAll();
		return product;
	}
	
}
