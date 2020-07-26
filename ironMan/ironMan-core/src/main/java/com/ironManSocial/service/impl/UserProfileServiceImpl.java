package com.ironManSocial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ironManSocial.dao.UserDao;
import com.ironManSocial.dao.model.User;
import com.ironManSocial.dto.model.UserDTO;
import com.ironManSocial.service.UserProfileService;

@Service
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	UserDao userDao;
	
	@Transactional
	public String save(UserDTO user) {
		
		System.out.println(" SERVICE IS WORKING:: SAVING USER");
		return userDao.create(user);
		
	}

	@Transactional
	public void updateUser(UserDTO user) {
		userDao.update(user);
	}

	
	public User getUser(String username) {
		return userDao.readUser(username);
	}

	@Transactional
	public void removeUser(UserDTO user) {
		userDao.delete(user);
	}

	public UserDTO findUser(String username) {
		return null;
	}

 
}
