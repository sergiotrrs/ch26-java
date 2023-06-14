package com.generation.app.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.generation.app.entity.Customer;
import com.generation.app.repository.CustomerRepository;

//STEP 09 Crear la implementación de la interfaz UserDetailsService
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	CustomerRepository customerRepository;
	
	
	// STEP 10 Leer el usuario de la solicitud HTTP de la DB
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Customer customer = customerRepository.findByEmail(email)
				.orElseThrow( ()-> new UsernameNotFoundException("User not found with email " + email));
		
		
		return  new UserDetailsImpl( customer  ); 
	}
	
	

}
