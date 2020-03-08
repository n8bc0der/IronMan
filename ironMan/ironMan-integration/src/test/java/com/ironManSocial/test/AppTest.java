package com.ironManSocial.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ironManSocial.persistence.model.Comment;
import com.ironManSocial.persistence.model.Post;
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
		//User user = new User(firstName, lastName, userName, userPassword, userAge, userEmail, gender, dob, userstamp, timestamp, posts, comments);
	
		User user = new User();	
		user.setFirstName("Milan");
		user.setLastName("Trehan");
		user.setUserEmail("milanalpha01@gmail.com");
		user.setUserName("milantrehan");
		user.setGender("Male");
		user.setTimeStamp(new Date());
		user.setDob(new GregorianCalendar(1992, Calendar.MARCH, 16).getTime());
		
		Post post = new Post();
		post.setPostSubject("My First Post");
		post.setUserStamp("mtrehan");
		post.setPostDescription("This will be my first post for this app");
		post.setTimeStamp(new Date());
		post.setPostTime(new Date());
		post.setUser(user);
		
		Comment comment1 = new Comment();
		comment1.setCommentTime(new Date());
		comment1.setCommentContent("What a nice post!!");
		comment1.setTimeStamp(new Date());
		comment1.setUserStamp("mtrehan");
		
		comment1.setUser(user);
		comment1.setPost(post);
		
		Comment comment2 = new Comment();
		comment2.setCommentTime(new Date());
		comment2.setCommentContent("What a great post!!");
		comment2.setTimeStamp(new Date());
		comment2.setUserStamp("mtrehan");
		
		comment2.setUser(user);
		comment2.setPost(post);
		
		post.getPostComments().add(comment1);
		post.getPostComments().add(comment2);
		
		user.getPosts().add(post);
		user.getComments().add(comment1);
		user.getComments().add(comment2);

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
		
		Comment fetchComment = (Comment)session.get(Comment.class, 2L);
		System.out.println("Comment content is:" + fetchComment.getCommentContent());
		session.getTransaction().commit();
		session.close();
		
		//TODO: Create a new user named Ankit with two posts - each post should have at least one comment
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		createDatabaseConnection();

		//uncomment to test:
		
	   //testEntityTables();		
	}
}
