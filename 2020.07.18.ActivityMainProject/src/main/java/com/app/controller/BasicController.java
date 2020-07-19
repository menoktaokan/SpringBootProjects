package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

}
