package com.project_pet.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class
 *
 * @author Dobaev Arseniy
 */
@SpringBootApplication
@EnableAutoConfiguration
public class ProjectPetAuthApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjectPetAuthApplication.class, args);
	}

}
