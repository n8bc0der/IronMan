package com.ironManSocial.dao.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ironManSocial.dao.UserDao;
import com.ironManSocial.dao.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public String create(User user) {
		
		String userId = (String) hibernateTemplate.save(user);
		return userId;
	}

	@Override
	public void update(User user) {
		hibernateTemplate.update(user);
	}

	@Override
	public void delete(User user) {
		hibernateTemplate.delete(user);
	}

	@Override
	public User readUser(String username) {
		return hibernateTemplate.get(User.class, username);
	}

	@Override
	public List<User> readAllUsers() {
		 return hibernateTemplate.loadAll(User.class);
	}

	@Override
	public User findUser(String username) {
		
		User foundUser = (User) hibernateTemplate.get(User.class, username);
		
		if(foundUser != null) {
			return foundUser;
		}
		
		return null;
	}

}
