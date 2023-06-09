package com.generation.app.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.generation.app.dto.CustomerDto;
import com.generation.app.entity.Customer;

public abstract class CustomerMapper {
	
	
	CustomerDto customerDto;
	Customer customer;
	
	
	/**
	 * Convierte un objeto de tipo Customer a CustomerDto
	 * @param customer
	 * @return customerDto
	 */
	public static CustomerDto mapToCustomerDto(Customer customer) {
		CustomerDto customerDto = new CustomerDto();
		
		customerDto.setId( customer.getId() );
		customerDto.setFirstName( customer.getFirstName() );
		customerDto.setLastName( customer.getLastName() );
		customerDto.setAddress( customer.getAddress() );
		customerDto.setEmail( customer.getEmail() );
		customerDto.setPassword( "***" );
				
		return customerDto;
	}
	
	/**
	 * Convierte un objeto de tipo CustomerDto a Customer
	 * @param customerDto
	 * @return customer
	 */
	public static Customer mapToCustomer(CustomerDto customerDto) {
		Customer customer = new Customer();
		
		customer.setId( customerDto.getId() );
		customer.setFirstName( customerDto.getFirstName() );
		customer.setLastName( customerDto.getLastName() );
		customer.setAddress( customerDto.getAddress() );
		customer.setEmail( customerDto.getEmail() );
		customer.setPassword( customerDto.getPassword() );
		customer.setActive( true );		
		
		return customer;
		
	}
	

}
