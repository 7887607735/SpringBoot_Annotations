package com.SpringBootAnnotations.SpringBootAnnotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAnnotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationsApplication.class, args);
		System.err.println("Started");
	}

}
