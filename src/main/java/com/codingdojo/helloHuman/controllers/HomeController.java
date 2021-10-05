package com.codingdojo.helloHuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

// Create an app that will render a page with either a default value of "human" or with the name provided in the URL query string.

// Can you include a "last_name" as a parameter and print out both the first and last names?

public class HomeController {
	@RequestMapping("/")
	public String greetings(@RequestParam(value="firstName", required=false) String firstName, @RequestParam(value="lastName", required=false) String lastName) {
		if (firstName == null) {
			return "Hello Human!\n Welcome to SpringBoot.";
		}
		return "Hello " + firstName + " " + lastName + "!\nWelcome to SpringBoot.";
	}

}
