package com.fusionx.Welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WelcomeApplication {
	@GetMapping("/hello-world")
	public String welcome(){
		return "Welcome to LOIT";
	}


	public static void main(String[] args) {
		SpringApplication.run(WelcomeApplication.class, args);
	}

}
