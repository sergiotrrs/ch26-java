package com.generation.app.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.generation.app.entity.Customer;

// STEP 12 Crear la clase que implementa la interfaz UserDetails
public class UserDetailsImpl implements UserDetails {

	private Customer customer;
	

	public UserDetailsImpl(Customer customer) {		
		this.customer = customer;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		
		List<GrantedAuthority> authorities = new ArrayList<>();
		// Por convención los roles se representan como cadenas de texto 
		// que comienzan con el prefijo ROLE_
		// Esto es una convención para distinguir los role de otros
		// tipos de autorizacies o permisos.
		authorities.add(  new SimpleGrantedAuthority("ROLE_ADMIN") );
		//authorities.add(  new SimpleGrantedAuthority("ROLE_CUSTOMER") );
		return authorities;
		
		/*       // TODO leer todos los roles del atributo ROLES o
		         // leer los roles de la tabla role de mi DB
		  		 List<GrantedAuthority> authorities = new ArrayList<>();
		  
		         customer.getRoles().forEach( role->{
			      authorities.add(new SimpleGrantedAuthority( role.getRoleName() )); 
		         });
		         
		          return authorities;		 
		 */
	}

	@Override
	public String getPassword() {
		return customer.getPassword();
	}

	@Override
	public String getUsername() {
		return customer.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return customer.isActive();
	}
	
	public String getFullName() {
		return customer.getFirstName()+ " " + customer.getLastName();
	}

}
