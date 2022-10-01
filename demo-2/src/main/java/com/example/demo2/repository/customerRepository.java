package com.example.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo2.customer.customer;

@Repository
public interface customerRepository  extends JpaRepository<customer, Integer>{
}

