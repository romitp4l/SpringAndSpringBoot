package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/")
	public String getMsg() {
		return "Welcome to Er. Romit Pal first SpringBoot Project" ;
	}
}
