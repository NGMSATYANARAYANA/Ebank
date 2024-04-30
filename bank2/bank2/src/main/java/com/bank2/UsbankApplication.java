package com.bank2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsbankApplication.class, args);
		System.out.println("Application");
	}

}
