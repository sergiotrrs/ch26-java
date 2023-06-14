package com.generation.app.service;

import java.util.List;

import com.generation.app.dto.CustomerDto;
import com.generation.app.entity.Customer;

public interface CustomerService {
	
	/**
	 * Crea un nuevo registro con el cliente indicado
	 * @param customer datos enviados por la solicitud HTTP
	 * @return el registro del cliente con el id asignado por la DB
	 */
	CustomerDto createCustomer(CustomerDto customerDto);
	
	/**
	 * Retornar los datos del cliente por medio de su id
	 * @param id cliente
	 * @return datos del cliente
	 */
	CustomerDto getCustomerById(long id);
	
	/**
	 * Buscar un cliente por medio de su id
	 * @param id cliente
	 * @return datos del cliente
	 */
	Customer findCustomerById(long id);
	
	/**
	 * Obtener todos los registros de los clientes
	 * @return lista de clientes
	 */
	List<Customer> getAllCustomers();
	
	/**
	 * Obtener todos los registros de los clientes activos
	 * @return lista de clientes activos
	 */
	List<CustomerDto> getAllActiveCustomers();
	
	/**
	 * Actualizar el registro con el cliente indicado
	 * @param customer datos enviados por la solicitud HTTP
	 * @return el registro del cliente con los datos modificados
	 */
	CustomerDto updateCustomer(CustomerDto customerDto);
	
	/**
	 * Establece como inactivo al cliente con el id indicado. Field active = false.
	 * @param id cliente
	 */
	void deleteUser(long id);
	

}
