package com.apigateway.bankservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayBankServiceApplication {

	public static void main(String[] args) {
		System.out.println("Started-----");
		SpringApplication.run(ApiGatewayBankServiceApplication.class, args);
	}

}
