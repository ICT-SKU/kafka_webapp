package com.kafkick.ict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkickApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkickApplication.class, args);
		System.out.println("test yo");
	}

}
