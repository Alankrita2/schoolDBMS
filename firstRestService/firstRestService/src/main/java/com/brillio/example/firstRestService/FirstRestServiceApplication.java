package com.brillio.example.firstRestService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FirstRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstRestServiceApplication.class, args);
	}

}
