package com.generation.app.security.jwt;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// STEP 29 Creamos la clase para leer el token que acompaña a la solicitud HTTP
@Component
public class JwtAuthorizationFilter extends OncePerRequestFilter  {

	@Override
	protected void doFilterInternal(
			HttpServletRequest request, 
			HttpServletResponse response, 
			FilterChain filterChain)
			throws ServletException, IOException {
		
		// STEP 30 Leer la cadena del token del encabezado de la solicitud
		String bearerToken = request.getHeader("Authorization");
		
		if ( bearerToken != null && bearerToken.startsWith("Bearer ") ) {
			String token = bearerToken.replace("Bearer ", ""); // Obtenemos el JWT
			
			// verificar la validez del token
			UsernamePasswordAuthenticationToken usernamePAT = JwtTokenUtils.getAuthentication(token); 
						
			// Establecemos la autenticación en el contexto de seguridad de Spring Security
			// En el SecurityContex es donde se alamcena la información de la autenticación
			// y autorización durante la ejecución de la solicitud.
			// La clase SecurityContextHolder accede y manipula el contexto de seguridad.
			SecurityContextHolder.getContext().setAuthentication(usernamePAT);			
		}
		// Se indica que continue con el procesamiento de la solicitud HTTP.
		filterChain.doFilter(request, response);
	}

}
