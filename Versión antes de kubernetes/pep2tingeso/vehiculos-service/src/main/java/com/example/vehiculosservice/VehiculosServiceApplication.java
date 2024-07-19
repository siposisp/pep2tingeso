package com.example.vehiculosservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VehiculosServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiculosServiceApplication.class, args);
	}

}
