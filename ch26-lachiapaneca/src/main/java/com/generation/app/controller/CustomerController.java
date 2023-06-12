package com.generation.app.controller;

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

import com.generation.app.dto.CustomerDto;
import com.generation.app.entity.Customer;
import com.generation.app.service.CustomerService;
/*
 * 
 * 
 * @RequestBody vincula el cuerpo(body) de una solicitud HTTP a un objeto.
 *  Spring intenta convertir el cuerpo(JSON) de la solicitud HTTP en un objeto correspondiente.
 */

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
	
	@PostMapping
	public  CustomerDto createCustomer(@RequestBody CustomerDto customerDto){
		CustomerDto savedCustomer = customerService.createCustomer(customerDto);
		return savedCustomer;		
	}
	
	@DeleteMapping("{id}")
	public String deleteCustomer(@PathVariable long id) {
		customerService.deleteUser(id);
		return "Customer successfully deleted";
	}
	
	@PutMapping("{id}")
	public  CustomerDto updateCustomer(@PathVariable long id, @RequestBody CustomerDto customerDto){
		customerDto.setId(id);
		CustomerDto savedCustomer = customerService.updateCustomer(customerDto);
		return savedCustomer;		
	}
	
	
}
