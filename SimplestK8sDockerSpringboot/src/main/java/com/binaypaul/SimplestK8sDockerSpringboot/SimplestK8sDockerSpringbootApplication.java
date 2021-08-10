package com.binaypaul.SimplestK8sDockerSpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class SimplestK8sDockerSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplestK8sDockerSpringbootApplication.class, args);
	}

	@GetMapping("amilucky")
	public String getAmILucky() {
		Random random = new Random();
		return random.nextBoolean() ? "Its a lucky day..!" : "Hard luck today..!";
	}
}
