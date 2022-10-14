package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repos.CustomerRepositoryImpl;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepositoryImpl repo;
	public boolean save(Customer entity) {
		return this.repo.save(entity);
	}
	public List<Customer> findAll() {
		return this.repo.findAll();
	}

}
