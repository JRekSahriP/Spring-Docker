package com.springdocker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/test")
	public String test() {
		return "Hello Docker";
	}
	
	@GetMapping("/{text}")
	public String text(@PathVariable String text) {
		return text;
	}
	
}
