package com.generation.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.generation.app.model.Customer;
import com.generation.app.service.CustomerService;


@RestController
@RequestMapping("api/customers")
@CrossOrigin(origins="*")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	@GetMapping //localhost:8080/api/customers
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();		
	}
}
