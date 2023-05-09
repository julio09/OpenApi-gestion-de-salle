package com.example.devestack.devstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class DevstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevstackApplication.class, args);
	}

}
