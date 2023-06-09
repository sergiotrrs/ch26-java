package com.generation.app.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class CustomerDto {
	
	private long id;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String password;

}
