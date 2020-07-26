package com.ironManSocial.dao;

import java.util.List;

import com.ironManSocial.dao.model.User;

public interface UserDao {

	 String create(User user);
	 
	 void update(User user);
	 
	 void delete(User user);
	 
	 User readUser(String username);
	 
	 List<User> readAllUsers();
	 
	 User findUser(String username);
	 
}
