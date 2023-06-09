package com.generation.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.app.entity.Customer;
import com.generation.app.repository.CustomerRepository;
import com.generation.app.service.CustomerService;

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
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO crear Cliente

		return null;
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
	public List<Customer> getAllActiveCustomers() {
		List<Customer> customers =  customerRepository.findAllCustomerByActive(true);
		return customers;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		
	}

}
