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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ironManSocial.dao.model.User;
import com.ironManSocial.dto.model.UserDTO;
import com.ironManSocial.service.UserProfileService;
import com.ironManSocial.utils.ObjectMapperUtils;

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
		
		User newUser = new User();
		newUser = ObjectMapperUtils.map(userDTO, newUser);
		String username = userProfileService.save(newUser);
		modelMap.addAttribute("username", username);
		return "successfulRegistration";
	
	}
	
	@RequestMapping("validateUsername")
	public @ResponseBody String validateUsername(@RequestParam("username") String username) {
		System.out.println("Validating username!!!!");
		User foundUser = userProfileService.findUser(username);
		String returnMessage = "";
		
		if(foundUser != null ) {
			System.out.println("Oh shit, already taken!");
			returnMessage = "Oh shit, username already taken!";
		}
		return returnMessage;
		
	}
	
	public UserProfileService getUserProfileService() {
		return userProfileService;
	}

	public void setUserProfileService(UserProfileService userProfileService) {
		this.userProfileService = userProfileService;
	}
	
}
