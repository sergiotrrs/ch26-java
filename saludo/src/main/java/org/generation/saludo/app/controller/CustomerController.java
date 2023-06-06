package org.generation.saludo.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.generation.saludo.app.entity.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * Por convención el nombre de los endpoints deben ser sustantivos en plural
 */

@RestController
@RequestMapping("api/customers") // http://localhost:8080/api/saludo
public class CustomerController {
	
	@GetMapping //http://localhost:8080/api/customers
	public List<Customer> getCustomers() {
		List<Customer> customers = new ArrayList<>();
		
		customers.add(new Customer(1, "Pato", "Donald"));
		customers.add(new Customer(2, "Michaell", "Sirius"));
		customers.add(new Customer(3, "Angélica", "Vázquez"));
				
		return customers;		
	}
	

	/*
	 * GetMapping con Path Variable
	 * PathVariable vincula un valor de una variable de la URL a un parámetro del método.
	 *  Permite capturar valores dinámicos presentes en la URL y utilizarlos en el método
	 */
	@GetMapping("{id}/{first_name}/{last_name}")  //http://localhost:8080/api/customers/1/Pato/Donald
	public Customer customerPathVariable(
			@PathVariable int id, 
			@PathVariable("first_name") String firstName, 
			@PathVariable("last_name") String lastName 
			) {
		return new Customer(id, firstName, lastName);
	}
	
	/*
	 * Request Param
	 * Vincula los paámetros de una solicitud HTTP con los parámetros del método.
	 * Permite extraer los valores de los parámetros de consulta(query parameters).
	 * Si no se proporcionan los valores se genera la excepción MissingServletRequestParameterException
	 */
	@GetMapping("query") //http://localhost:8080/api/customers/query?id=1&first_name=pato&last_name=Donald
	public Customer customerRequestVariable( 
			@RequestParam int id, 
			@RequestParam(value="first_name", required = false) String firstName, 
			@RequestParam(value="last_name", defaultValue="Stranger") String lastName
			) {
		return new Customer(id, firstName, lastName);
	}
	
}
