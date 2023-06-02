package com.generation.app.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "customers")
public class Customer {
	public static final int MAX_LENGTH = 60;
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int customerId;
	@Column(name="firstname", length= MAX_LENGTH)
	private String firstName;
	@Column(name="lastname", length=MAX_LENGTH)
	private String lastName;
	@Column(name="address", length=45)
	private String address;
	@Column(name="email",nullable = false, unique = true, length= 100 )
	private String email;
}
