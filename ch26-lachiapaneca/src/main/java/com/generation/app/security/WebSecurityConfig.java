package com.generation.app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

/*
 *  @Configuration indica que una clase es una configuración de Spring.
 *  La clase se puede utilizar para definir y configurar un bean de Spring,
 *  así como para realizar otras configuraciones necesarias en la aplicación.
 *  Puede contener métodos anotas con @Bean que devuelven objetos que se registran
 *  como beans de Spring en el contexto de la aplicación.
 *  
 *  @EnableWebSecurity se utiliza para habilitar la seguridad web
 *  en una aplicación de Spring y permite personalizar la configuración de
 *  seguridad mediante una clase de configuración personalizada.
 *  
 */

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	// STEP 1 realizar configuraciones personalizadas del filterChain
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		// STEP 2 probar deshabilitar la seguridad
/*		return http
				.authorizeHttpRequests( authorize ->
						authorize.anyRequest().permitAll() // Cualquier solicitud es permitida						
						)                                  // No tiene que estar autenticada.
				.csrf( csrf -> csrf.disable() ) // Deshabilita la protección CSRF 
				                               //( Coross-Site Request Forgery).
				.httpBasic( withDefaults() ) // Habilita la autenticación básica.
				.build();
				*/
		
		// SETP 3 Configurar las reglas de autorización para las diferentes solicitudes HTTP
		return http
				.authorizeHttpRequests( authorize ->
						authorize.anyRequest().authenticated() // Todas las solicitud deben estar autenticadas					
						)                                
				.csrf( csrf -> csrf.disable() ) 			                              
				.httpBasic( withDefaults() ) 
				.build();
		
	}
	
	

}
