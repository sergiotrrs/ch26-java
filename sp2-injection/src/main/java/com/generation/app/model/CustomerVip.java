package com.generation.app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Qualifier("customerVip")
public class CustomerVip extends Customer {
	{
		log.info("Se inicializa CustomerVip");
	}
	
	@Override
	public void setFirstName(String name) {
		super.setFirstName("$ " + name + "$");
	}

}
