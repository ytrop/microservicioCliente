package com.example.prueba.clientemicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class PruebaClientemicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaClientemicroApplication.class, args);
	}

}
