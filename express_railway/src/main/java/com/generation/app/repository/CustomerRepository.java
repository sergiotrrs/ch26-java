package com.generation.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.generation.app.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	// Buscar por el correo electrónico
		Optional<Customer> findByEmail(String email);
}
