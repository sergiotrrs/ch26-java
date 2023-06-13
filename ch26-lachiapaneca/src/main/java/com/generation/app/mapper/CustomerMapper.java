package com.generation.app.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
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
	 * @return new customer
	 */
	public static Customer mapToCustomer(CustomerDto customerDto) {
		Customer customer = new Customer();
		
		customer.setId( customerDto.getId()  );
		customer.setFirstName( customerDto.getFirstName() );
		customer.setLastName( customerDto.getLastName() );
		customer.setAddress( customerDto.getAddress() );
		customer.setEmail( customerDto.getEmail() );
		customer.setPassword( new BCryptPasswordEncoder().encode( customerDto.getPassword() ) );
		customer.setActive( true );		
		
		return customer;
		
	}
	
	/**
	 * Convierte un objeto de tipo CustomerDto a Customer existente
	 * @param customerDto
	 * @return existingCustomer
	 */
	public static Customer mapToCustomer(CustomerDto customerDto, Customer existingCustomer ) {

		existingCustomer.setFirstName( customerDto.getFirstName() );
		existingCustomer.setLastName( customerDto.getLastName() );
		existingCustomer.setAddress( customerDto.getAddress() );
		existingCustomer.setEmail( customerDto.getEmail() );
		existingCustomer.setPassword( new BCryptPasswordEncoder().encode( customerDto.getPassword() )  );
		existingCustomer.setActive( true );		
		
		return existingCustomer;
		
	}
	

}
