package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication                                               
public class SecureLinkBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureLinkBankApplication.class, args);
		System.out.println("Welcome to Securelink bank");
	}

}
