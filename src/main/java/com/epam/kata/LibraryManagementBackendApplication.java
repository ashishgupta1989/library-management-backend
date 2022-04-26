package com.epam.kata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class LibraryManagementBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementBackendApplication.class, args);
	}

}
