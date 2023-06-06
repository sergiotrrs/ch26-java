package com.generation.app.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *  @Component es una anotación genérica que se utiliza
 *  para indicar que la clase es un componente de Spring
 *  y debe ser gestionada por el contenedor de 
 *  inverción de control(IoC).
 *  
 *  @Component se aplica a una clase para que Spring la detecte automáticamente
 *  y la registre como un bean en el contexto de la aplicación.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String address;
	
	
}
