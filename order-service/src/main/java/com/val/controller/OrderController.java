package com.val.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class OrderController {
	
	@Value("${sample.message}")
	private String message;
	
	@GetMapping
	public String getMessageFromConfigServer() {
		return "Hi---"+message;
	}

}
