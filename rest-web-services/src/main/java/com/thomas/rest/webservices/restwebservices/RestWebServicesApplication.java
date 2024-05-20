package com.thomas.rest.webservices.restwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thomas.rest.webservices.restwebservices.user.UserDaoService;

@SpringBootApplication
public class RestWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestWebServicesApplication.class, args);
	}

}
