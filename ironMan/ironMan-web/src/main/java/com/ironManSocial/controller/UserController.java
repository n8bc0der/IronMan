package com.ironManSocial.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ironManSocial.dto.model.UserDTO;
import com.ironManSocial.service.UserProfileService;

@Controller
public class UserController {
	
	@Autowired
	private UserProfileService userProfileService;
	
	
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
	 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	 dateFormat.setLenient(false);
	 webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	 }
	
	
	@RequestMapping("/registrationPage*")
	public String showRegistrationPage() {
		
		System.out.println("OMG!!! I AM WORKING");
		return "userRegistration";	
	}
	
	@RequestMapping(value="registerUser.html",  method =RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") UserDTO userDTO, ModelMap modelMap) {
		
		System.out.println(userDTO);
		//String username = userProfileService.save(userDto);
		//modelMap.addAttribute("username", username);
		return "successFullRegistration";
	
	}
	
	
	public UserProfileService getUserProfileService() {
		return userProfileService;
	}

	public void setUserProfileService(UserProfileService userProfileService) {
		this.userProfileService = userProfileService;
	}
	
}
