package com.generation.app.security.jwt;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;

// STEP 25 Clase que generará el token JWT y también servirá para verificar
@Slf4j
@Component
public class JwtTokenUtils {

//	private final static String ACCESS_TOKEN_SECRET = "74bcc5886e12ebb8b47ec6fd16709ba2";
	private static String ACCESS_TOKEN_SECRET;
	private final static long ACCESS_TOKEN_VALIDITY_SECONDS = 300; // 5 minutos
    
    @Value("${TOKENKEY}")
    public void setAcessTokenSecret(String tokenKey) {
    	ACCESS_TOKEN_SECRET = tokenKey;
    }
		
	// STEP 26 Crear el JWT
	public static String createToken(String name, String email,  Collection<? extends GrantedAuthority> authorities ) {
		log.info(ACCESS_TOKEN_SECRET);
		long expirationTime = ACCESS_TOKEN_VALIDITY_SECONDS * 1000;
		Date expirationDate = new Date(System.currentTimeMillis() + expirationTime);
		
		// Convertir la clave secreta en un objeto SecretKey
	    SecretKey key = Keys.hmacShaKeyFor(ACCESS_TOKEN_SECRET.getBytes(StandardCharsets.UTF_8));
		
		Map<String, Object> extra = new HashMap<>();
		extra.put("name", name);
		extra.put("cohorte", "26");
		extra.put("roles", authorities);
		
		return Jwts
				.builder()
				.setSubject(email) // identifica al propietario del token
				.setExpiration(expirationDate)
				.addClaims(extra) //  agrega información adicional al token
				// firmar el token JWT utilizando el algoritmo de firma HS256 (HMAC-SHA256).
				.signWith(key, SignatureAlgorithm.HS256) 
				.compact(); // realiza la serialización y codificación del token JWT
							// en su formato compacto, listo para ser transmitido o almacenado.
	}
	
	// STEP 31 Validar el token recibido en la solicitud HTTP
	public static UsernamePasswordAuthenticationToken getAuthentication(String token) {
		// Convertir la clave secreta en un objeto SecretKey
	    SecretKey key = Keys.hmacShaKeyFor(ACCESS_TOKEN_SECRET.getBytes(StandardCharsets.UTF_8));
	    
	    try {
		Claims claims = Jwts
				.parserBuilder()
				.setSigningKey(  key  ) // Verificar la integridad del token
				.build()
				.parseClaimsJws( token ) // Valida el token indicado
				.getBody();
		
		String email = claims.getSubject();

		// Leer los roles del token
		List< Map<String, String>> authoritiesList =  (List<Map<String, String>>) claims.get("roles");
		
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		for ( Map<String, String> authorityMap : authoritiesList ) {
			String authority = authorityMap.get( "authority" ); // Obtener la autorización / Rol.
			authorities.add( new SimpleGrantedAuthority(authority) ); // Agregar el rol 			
		}
		
		UsernamePasswordAuthenticationToken userAuth = new UsernamePasswordAuthenticationToken
				(email,  null, authorities);
		log.info( userAuth.toString() );
		return userAuth;
		
	    } catch ( JwtException e ) {
	    	System.out.println(e);
	    	// throw new nombreExcepción("Se hunde el barco, aiuda")
	    	return null;
	    }
	    
	}
	
	
}
