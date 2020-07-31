package com.ironManSocial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginContoller {
	
	@RequestMapping("/login*")
	public String showLoginPage() {
		return "login";
	}
	

	@RequestMapping("/recoverPassword")
	public String login() {
		return null;	
	}


}
