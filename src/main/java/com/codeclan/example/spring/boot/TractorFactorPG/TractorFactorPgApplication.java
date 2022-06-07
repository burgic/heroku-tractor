package com.codeclan.example.spring.boot.TractorFactorPG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.codeclan.example.spring.boot.TractorFactorPG"})
public class TractorFactorPgApplication {

	public static void main(String[] args) {
		SpringApplication.run(TractorFactorPgApplication.class, args);
	}

}
