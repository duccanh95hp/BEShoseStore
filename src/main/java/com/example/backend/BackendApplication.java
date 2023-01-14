package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication()
public class BackendApplication {
//	exclude={SecurityAutoConfiguration.class}
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
