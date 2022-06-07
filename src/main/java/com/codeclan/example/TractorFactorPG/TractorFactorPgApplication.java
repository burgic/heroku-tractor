package com.codeclan.example.TractorFactorPG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.codeclan.example.TractorFactorPG"})
public class TractorFactorPgApplication {

	public static void main(String[] args) {
		SpringApplication.run(TractorFactorPgApplication.class, args);
	}

}
