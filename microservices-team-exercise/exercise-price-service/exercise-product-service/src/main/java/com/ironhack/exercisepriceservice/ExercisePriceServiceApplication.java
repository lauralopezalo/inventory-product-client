package com.ironhack.exercisepriceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class ExercisePriceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercisePriceServiceApplication.class, args);
	}

}
