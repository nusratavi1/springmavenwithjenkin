package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "/")
	public String sayHello() {
		return "Welcome to Spring boot with AWS using EC2 instnace created Nusrat";
	}
}