package com.orderapp.pharmacy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.orderapp.pharmacy.security.jwt.JwtUtils;

@SpringBootApplication
@EnableConfigurationProperties(JwtUtils.class)
public class PharmacyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharmacyApplication.class, args);
	}

}
