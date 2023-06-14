package com.generation.app.security.jwt;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

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
	
	
}
