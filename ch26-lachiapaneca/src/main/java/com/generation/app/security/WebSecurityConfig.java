package com.generation.app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import lombok.AllArgsConstructor;

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
@AllArgsConstructor
public class WebSecurityConfig {
	
	
	// STEP 13 Inyectar UserDetailsService
	UserDetailsService userDetailsService;
	
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
						authorize
						// STEP 5 Agregar las reglas de autorización para los endpoints
						// Para la url /api/customers/active puede realizarse sin autenticarse
						.requestMatchers(HttpMethod.GET, "/api/products/active").permitAll()
						.requestMatchers("/api/products/**").hasRole("CUSTOMER")
						.requestMatchers("/api/customers/**").hasAnyRole("ADMIN", "SAYAJIN")					
						.anyRequest().authenticated() // Todas las solicitud deben estar autenticadas					
						)                                
				.csrf( csrf -> csrf.disable() ) 			                              
				.httpBasic( withDefaults() ) 
				.build();
		
	}
	
	// SETEP 4 Autenticación en nombre usuario/contraseña almacenada en memoria
//	@Bean
//	UserDetailsService userDetailsService() {
//			UserDetails sergio = User.builder()
//					.username("sergio")
//					.password("{noop}123")
//					.roles("ADMIN", "SAYAJIN")
//					.build();
//			
//			UserDetails puerquito = User.builder()
//					.username("puerquito")
//					.password("{noop}111")
//					.roles("CUSTOMER")
//					.build();
//			
//			UserDetails tigger = User.builder()
//					.username("tigger")
//					.password("{noop}222")
//					.roles("CUSTOMER")
//					.build();
//			return new InMemoryUserDetailsManager( sergio, puerquito, tigger );  
//					
//		}
	
	// STEP 6 Leer los usuarios de las base de datos
	@SuppressWarnings("removal")
	@Bean
	AuthenticationManager authManager(HttpSecurity http) throws Exception {
		
		return http
				// AuthenticationManagerBuilder es utilizado para construir y configurar el AuthManager
				// que es responsable de autenticar las solicitud de los usuarios.
				.getSharedObject( AuthenticationManagerBuilder.class  )
				.userDetailsService( userDetailsService ) // Leer el usuario de la DB
				.passwordEncoder( passwordEncoder()  ) 
				.and()
				.build();		
	}
	
	/*
	 *  STEP 7 crear un bean de BCripPasswordEncoder.
	 *  BCripPasswordEncoder es una implementación de PasswordEncoder proporcionada
	 *  por Spring Security. Se utiliza para codificar y verificar contraseñas utilizando
	 *  el algoritmo de hashing bcrypt.
	 *  El algoritmo incorpora un sal aleatoria por cada contraseña, lo que agrega un capa
	 *  adicional de seguridad.
	 */	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	// STEP 8 obtener una clave encriptada para agregarlo a los usuarios de import.sql
//	public static void main(String[] args) {
//		System.out.println("password: " + new BCryptPasswordEncoder().encode("123") );
//	}
	
	
	

}
