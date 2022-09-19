package com.myboot.playground.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello Folks...This is Shivaa";
		
	}
	@GetMapping("/hello/one")
	public String helloCloud() {
		return "Hello Cloud";
	}

}
