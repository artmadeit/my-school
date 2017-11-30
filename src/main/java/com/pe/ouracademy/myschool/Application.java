package com.pe.ouracademy.myschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	protected Application() {
		// for sonar lint
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
