package com.ironManSocial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ironManSocial.service.UserProfileService;

@Controller
public class UserController {
	
	@Autowired
	private UserProfileService userProfileService;
	
	@RequestMapping("/registrationPage")
	public ModelAndView showRegistrationPage() {
		
		System.out.println("OMG!!! I AM WORKING");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userRegistration");
		
		return modelAndView;	
	}
	
	

	public UserProfileService getUserProfileService() {
		return userProfileService;
	}

	public void setUserProfileService(UserProfileService userProfileService) {
		this.userProfileService = userProfileService;
	}
	
}
