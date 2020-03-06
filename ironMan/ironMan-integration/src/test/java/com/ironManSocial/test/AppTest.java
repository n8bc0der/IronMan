package com.ironManSocial.test;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ironManSocial.persistence.model.User;

public class AppTest {

	/*
	 * public static void createDatabaseConnection() {
	 * 
	 * String jdbcUrl = "jdbc:mysql://localhost:3306/ironmansocial?useSSL=false";
	 * String user = "root"; String password = "root1234";
	 * 
	 * try {
	 * 
	 * System.out.println("Connecting to Database : " + jdbcUrl);
	 * 
	 * Connection con = DriverManager.getConnection(jdbcUrl,user,password);
	 * 
	 * System.out.println("Connection successful");
	 * 
	 * }catch(Exception e) { e.printStackTrace(); }
	 * 
	 * }
	 */

	public static void testEntityTables() {

		User user = new User();
		user.setFirstName("Milan");
		user.setLastName("Trehan");
		user.setUserEmail("milanalpha01@gmail.com");
		user.setUserName("milantrehan");
		user.setGender("Male");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();

		session.close();

		// testing getting a object from DB

		user = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = (User) session.get(User.class, "milantrehan");
		System.out.println("Name of the person is " + user.getFirstName() + " " + user.getLastName());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		createDatabaseConnection();

		testEntityTables();		
	}
}
