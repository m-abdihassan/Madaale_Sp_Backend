package com.example.MadaaleSp_MS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class MadaaleSp_MS {

	public static void main(String[] args) {
		SpringApplication.run(MadaaleSp_MS.class, args);
	}

}
