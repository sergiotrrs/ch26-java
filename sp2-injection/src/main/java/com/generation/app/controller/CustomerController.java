package com.generation.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.app.model.Customer;

/*
 * La inyección de dependencias es un patrón de diseño que permite
 * la creación de objetos y la gestión de sus dependencias de manera
 * automática.
 * 
 * En lugar de crear los objetos directamente, la inyección de dependencias
 * se encarga de proporcionar las dependencias necesarias a través de un
 * contenedor de inversión de control.
 * 
 * La responsabilidad de crear y administrar los objetos se delega la contenedor
 * de Spring.
 */

@RestController
@RequestMapping("api/customers")
public class CustomerController {
	
	/*
	 *  @Autowired se usa para inyectar una dependencia.
	 *  Spring busca un objeto compatible en el contexto
	 *  de la aplicación y lo inyecta.
	 */
	@Autowired
	Customer customer;
	
	@GetMapping //localhost:8080/api/customers
	public Customer getCustomerById() {
		customer.setId(10);
		customer.setFirstName("Pato");
		customer.setLastName("Donald");
		customer.setEmail("pato@google.com");
		
		return customer;
	}

}
