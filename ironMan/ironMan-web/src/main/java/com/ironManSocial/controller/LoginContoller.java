package com.ironManSocial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginContoller {
	
	@RequestMapping("/login")
	public ModelAndView login() {
		
		//TODO:Add code that performs operations related to login
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("homePage");
		return modelAndView;
	}

}
