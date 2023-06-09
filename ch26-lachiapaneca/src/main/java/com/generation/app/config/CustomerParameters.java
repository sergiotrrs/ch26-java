package com.generation.app.config;

public interface CustomerParameters {
	
	int FIRSTNAME_MIN_LENGTH = 2;
	int FIRSTNAME_MAX_LENGTH = 60;

	int LASTNAME_MIN_LENGTH = 2;
	int LASTNAME_MAX_LENGTH = 60;

	int ADDRESS_MIN_LENGTH = 0;
	int ADDRESS_MAX_LENGTH = 100;
	
	int EMAIL_MIN_LENGTH = 2;
	int EMAIL_MAX_LENGTH = 100;
	
	int PASSWORD_MIN_LENGTH = 8;
	int PASSWORD_MAX_LENGTH = 150;

}
