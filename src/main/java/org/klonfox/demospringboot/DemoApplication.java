package org.klonfox.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class DemoApplication {
	Product prd = new Product();

	@RequestMapping("/")
	String home() {
		return "Welcome to the Demo Springboot Application, there are some nice methods to call";
	}
	@RequestMapping("/getName")
	String getName() {
		return "Hello World " + prd.getName();
	}
	@RequestMapping("/setName")
	void setName(String name) {
		prd.setName(name);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
