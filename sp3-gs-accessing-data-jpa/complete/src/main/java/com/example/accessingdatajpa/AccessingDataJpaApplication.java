package com.example.accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

	private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataJpaApplication.class);
	}

	/*
	 * @Bean se utilizas para indicar que un método en una clase de Spring
	 * devuelve un objeto que debe ser administrado por el contenedor de Spring
	 * 
	 * Cuando se utiliza @Bean en un método, Spring se encarga de llamar a ese método 
	 * y registrar el objeto devuelto en el contexto de la aplicación como un bean. 
	 * Este bean estará disponible para su inyección de dependencias en otras 
	 * partes de la aplicación.
	 * 
	 * CommandLineRunner
	 * es una interfaz funcional proporcionada por Spring Boot que define un método run()
	 * que se ejecuta una vez que se haya iniciado completamente el 
	 * contexto de la aplicación de Spring. Esta interfaz se utiliza comúnmente 
	 * para ejecutar tareas de inicialización o configuración al inicio de la aplicación.
	 * 
	 * La ejecución de CommandLineRunner ocurren después de que se hayan configurado todos 
	 * los componentes y se haya inicializado el contexto de la aplicación de Spring. 
	 * Esto asegura que los beans y las dependencias estén disponibles y listos para 
	 * su uso cuando se ejecute la lógica en el método run().
	 */
	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new Customer("Jack", "Bauer"));
			repository.save(new Customer("Chloe", "O'Brian"));
			repository.save(new Customer("Kim", "Bauer"));
			repository.save(new Customer("David", "Palmer"));
			repository.save(new Customer("Michelle", "Dessler"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Customer customer = repository.findById(1L);
			log.info("Customer found with findById(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			// 	log.info(bauer.toString());
			// }
			log.info("");
		};
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
