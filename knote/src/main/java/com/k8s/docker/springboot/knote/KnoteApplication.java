package com.k8s.docker.springboot.knote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KnoteApplication {

	public static void main(String[] args) {
		System.out.println("Hi");
		SpringApplication.run(KnoteApplication.class, args);
	}

}
