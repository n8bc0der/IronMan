package com.ironManSocial.service;

import com.ironManSocial.dao.model.User;
import com.ironManSocial.dto.model.UserDTO;

public interface UserProfileService {
	
	public String save(UserDTO user);
	
	public void updateUser(UserDTO user);
	
	public UserDTO getUser(String username);
	
	public void removeUser(UserDTO user);
	
	public User findUser(String username);
	
}
