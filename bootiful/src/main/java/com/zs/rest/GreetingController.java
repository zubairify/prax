package com.zs.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello and Welcome to Boot Cloud Application";
	}
}
