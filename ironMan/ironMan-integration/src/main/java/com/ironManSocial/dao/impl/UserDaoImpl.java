package com.ironManSocial.dao.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional
	public String create(User user) {
		
		String userId = (String) hibernateTemplate.save(user);
		return userId;
	}

	@Override
	@Transactional
	public void update(User user) {
		hibernateTemplate.update(user);
	}

	@Override
	@Transactional
	public void delete(User user) {
		hibernateTemplate.delete(user);
	}

	@Override
	@Transactional
	public User read(String username) {
		return hibernateTemplate.get(User.class, username);
	}

	@Override
	@Transactional
	public List<User> readAll() {
		 return hibernateTemplate.loadAll(User.class);
	}

}
