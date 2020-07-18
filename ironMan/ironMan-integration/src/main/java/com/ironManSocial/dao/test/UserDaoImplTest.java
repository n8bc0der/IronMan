package com.ironManSocial.dao.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ironManSocial.dao.UserDao;
import com.ironManSocial.dao.model.User;

public class UserDaoImplTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("daoBeans-config.xml");
		UserDao userDao = (UserDao) context.getBean("userDao");
		
		User user =  new User("milan", "trehan", "milanalpha02", "testPassword", 28, "milanalpha01@gmail.com", "male", new Date(), "mtrehan", new Date(), new ArrayList<>(), new ArrayList<>());
		//String username = userDao.create(user);   // to test for creating a user
		
		//System.out.println("User created with username = " + username);
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 16);
		calendar.set(Calendar.MONTH, 2);
		calendar.set(Calendar.YEAR, 1992);
	
		user.setDob(calendar.getTime());
		userDao.update(user);
		
		User testUserToDelete = new User();
		testUserToDelete.setUserName("testUserName");
		String returnedUserName = userDao.create(testUserToDelete);
		System.out.println("User created with username = " + returnedUserName);
		userDao.delete(testUserToDelete);
		
		String testUsernameForRetrieve = "username10";
		User userRetrieved = userDao.read(testUsernameForRetrieve);
		
		System.out.println("User Retrieved is as follows:");
		System.out.println(userRetrieved);
		
		
		  System.out.println("_______________________");
		  System.out.println("Retrieving and printing all the users in the DB");
		  List<User> usersRetrieved = userDao.readAll();
		  
		  
		  for(User userInList : usersRetrieved) { System.out.println(userInList); }
		 
		
		
		
	}

}
