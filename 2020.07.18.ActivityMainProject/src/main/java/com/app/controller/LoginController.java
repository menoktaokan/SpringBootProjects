package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/loginForm")
	public String showLogin() {
		return "custom-login";
	}
	
	@GetMapping("/accessDenied")
	public String accessDenied() {
		return "access-denied";
	}

}
