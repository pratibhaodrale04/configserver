package com.val.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping
	public String getMessageFromConfigServer() {
		return "Hi";
	}

}
