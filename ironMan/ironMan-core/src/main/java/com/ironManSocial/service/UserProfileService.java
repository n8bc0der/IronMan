package com.ironManSocial.service;

import com.ironManSocial.dao.model.User;

public interface UserProfileService {
	
	public String save(User user);
	
	public void updateUser(User user);
	
	public User getUser(String username);
	
	public void removeUser(User user);
	
	public User findUser(String username);
	
}
