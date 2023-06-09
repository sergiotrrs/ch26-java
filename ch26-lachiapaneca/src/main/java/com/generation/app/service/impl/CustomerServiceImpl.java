package com.generation.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.app.dto.CustomerDto;
import com.generation.app.entity.Customer;
import com.generation.app.mapper.CustomerMapper;
import com.generation.app.repository.CustomerRepository;
import com.generation.app.service.CustomerService;

import lombok.AllArgsConstructor;

/*
 *  @Service indica que la clase es uin componente de servicio. SpringBoot registra la clase
 *  en el contexto de la aplicación como un bean de servicio. Esto significa también que la clase
 *  puede ser utilizada en otras clases mediante la inyección de dependencias.
 *  
 *  Los servicios suelen encapsular la lógica del negocio de la aplicación y se utilizar para
 *  realizar operaciones más complejas. Interactuan con el repositorio de datos, llama a otros
 *  servicios, realiza cálculos, filtros, etc.
 *  
 */
@AllArgsConstructor // Para realizar el constructor y se realice la inyección de dependencias
@Service
public class CustomerServiceImpl implements CustomerService {
	
	CustomerRepository customerRepository;

	@Override
	public CustomerDto createCustomer(CustomerDto customerDto) {
		// TODO Verificar si el email existe
		// TODO Verificar que los atributos estén dentro de los parámetros establecido.
		Customer customer = CustomerMapper.mapToCustomer(customerDto);				
		customer.setId(0);
		Customer savedCustomer = customerRepository.save(customer);
		
		return CustomerMapper.mapToCustomerDto(savedCustomer)  ;
	}

	@Override
	public Customer getCustomerById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findCustomerById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customers =  customerRepository.findAll();
		return customers;
	}

	@Override
	public List<CustomerDto> getAllActiveCustomers() {
		List<Customer> customers =  customerRepository.findAllCustomerByActive(true);
		
		// Convertir el listado tipo Customer a un listado CustomerDto
//		List<CustomerDto> customersDto = new ArrayList<>();
//		customers.forEach( customer ->{
//			customersDto.add(   CustomerMapper.mapToCustomerDto(customer) );
//		});
		// Los streams se introduce en Java 8 y permite operar de manera
		// eficiente y concisa en colecciones.
		// Se puede realizar operaciones como: mapeo, ordenación, agrupación, reducción, etc.
		
		List<CustomerDto> customersDto = customers
				.stream()			
				.map( customer-> CustomerMapper.mapToCustomerDto(customer) )
				.collect( Collectors.toList()); // recopila los elementos del stream en una estructura
		                                        // especificada. En este caso se convierte en una colección de tipo List
								
		return customersDto;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(long id) {
		/*
		 *  La clase Optional es una clase contenedora que se utiliza para representar un valor
		 *  que puede ser nulo.
		 */
		Customer existingCustomer = customerRepository.findById(id)
				.orElseThrow( ()-> new IllegalStateException("User does not exist with id " + id) );
		existingCustomer.setActive(false);
		customerRepository.save( existingCustomer );
		
		
	}

}
