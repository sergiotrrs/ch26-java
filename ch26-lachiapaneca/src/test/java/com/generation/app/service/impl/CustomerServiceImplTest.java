package com.generation.app.service.impl;



import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.generation.app.dto.CustomerDto;
import com.generation.app.entity.Customer;
import com.generation.app.repository.CustomerRepository;

/*
 *  Mockito es una biblioteca de pruebas unitarias
 *  que se utiliza para simular objetos y comportamiento
 *  de pruebas unitarias.
 *  
 *  Proporciona una forma sencilla y flexible de crear objetos
 *  simulados(mocks) que se utilizan como sustitutos de los obejtos
 *  reales en las pruebas.
 *  
 *  En este ejercicio se simulará el objeto customerRepository
 *  Para que entregue el valor que necesita el servicio de getCustomerById
 *  de las clase CustomerService.
 */


// Lo siguiente inicializará automáticamente los objetos mock y
// las anotaciones de Mockito en la clase prueba
@ExtendWith(MockitoExtension.class)
class CustomerServiceImplTest {

	// Crea un objeto mock de una clase o interfaz determinada.
	// Este objeto mock puede ser utilizado para simular el
	// comportamiento de la clase o interfaz durante
	// la ejecución de la prueba unitaria.
	@Mock
	private CustomerRepository customerRepository;
	
	// Inyectar automáticamente los objetos mocks en la clase bajo prueba.
	@InjectMocks
	private CustomerServiceImpl customerService;
	
	private Customer customer = new Customer();

	
	// El método debe ejecutarse antes de cada prueba unitaria.
	@BeforeEach
	public void init() {		
		customer.setId(2);
		customer.setFirstName("Christopher");
		customer.setLastName("Robin");
		customer.setEmail("robin@gmail.com");
		customer.setAddress("Bosque de los 100 acres");			
		customer.setActive(true);
		customer.setPassword("abandonaamigos123%");
		customer.setCreateAt( Timestamp.from(Instant.now()));
	}
	
	@Test
	void getCustomerByIdTest() {
		
		long id = 2L;
		// Definir el comportamiento esperado de un mock.
		// Qué va a realizar el obejto simulado?
		Mockito.when( customerRepository.findById(id) )
			.thenReturn( Optional.of( customer ));
		
		// Invoca al método a probar
		CustomerDto customerDto = customerService.getCustomerById(id);
		// Realizar las comparaciones
		Assertions.assertEquals( customer.getId() , customerDto.getId(), "Id" );
		Assertions.assertEquals( customer.getFirstName() , customerDto.getFirstName(), "FirstName" );
		Assertions.assertEquals( customer.getLastName() , customerDto.getLastName(), "LastName" );
		Assertions.assertEquals( customer.getEmail() , customerDto.getEmail(), "Email" );
		Assertions.assertEquals( customer.getAddress() , customerDto.getAddress(), "Address" );		
		Assertions.assertEquals( "***" , customerDto.getPassword(), "Password" );		
		
	}
	
	

}
