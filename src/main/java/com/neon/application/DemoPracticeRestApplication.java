package com.neon.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@Configuration
@EnableWebMvc
@ComponentScan({"com.neon.*"})

@SpringBootApplication  (scanBasePackages={ "com.neon.dao"})
					 
public class DemoPracticeRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPracticeRestApplication.class, args);
	}

}
