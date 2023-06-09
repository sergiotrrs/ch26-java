package com.generation.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.app.dto.CustomerDto;
import com.generation.app.entity.Customer;
import com.generation.app.service.CustomerService;

@RestController
@RequestMapping("api/customers")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping
	public List<Customer> getAllCustomers(){
		List<Customer> customers = customerService.getAllCustomers();
		return customers;
	}
	
	@GetMapping("active")
	public List<CustomerDto> getAllActiveCustomers(){
		List<CustomerDto> customers = customerService.getAllActiveCustomers();
		return customers;
	}
	
	
	
}
