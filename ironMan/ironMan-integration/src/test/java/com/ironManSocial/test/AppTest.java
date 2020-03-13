package com.ironManSocial.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

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
	public static SessionFactory sessionFactory;
	
	static
	{
		sessionFactory = new Configuration().configure().buildSessionFactory();
		
	}
	
	//populates tables with data of one user with realistic data
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
		user.setLastModifiedTimestamp(new Date());
		user.setCreatedDate(new GregorianCalendar(1992, Calendar.JANUARY, 10).getTime());
		user.setUserstamp("mtrehan");
		
		Post post = new Post();
		post.setPostSubject("My First Post");
		post.setUserStamp("mtrehan");
		post.setPostDescription("This will be my first post for this app");
		post.setTimeStamp(new Date());
		post.setPostTime(new Date());
		post.setCreatedDate(new GregorianCalendar(1992, Calendar.MARCH, 10).getTime());
		post.setLastModifiedTimestamp(new Date());
		post.setUser(user);
		
		Comment comment1 = new Comment();
		comment1.setCommentTime(new Date());
		comment1.setCommentContent("What a nice post!!");
		comment1.setTimestamp(new Date());
		comment1.setUserstamp("mtrehan");
		comment1.setCreatedDate(new GregorianCalendar(1992, Calendar.FEBRUARY, 11).getTime());
		comment1.setLastModifiedTimestamp(new Date());
		
		comment1.setUser(user);
		comment1.setPost(post);
		
		Comment comment2 = new Comment();
		comment2.setCommentTime(new Date());
		comment2.setCommentContent("What a great post!!");
		comment2.setTimestamp(new Date());
		comment2.setUserstamp("mtrehan");
		comment2.setCreatedDate(new Date());
		comment2.setLastModifiedTimestamp(new Date());
		
		comment2.setUser(user);
		comment2.setPost(post);
		
		post.getPostComments().add(comment1);
		post.getPostComments().add(comment2);
		
		user.getPosts().add(post);
		user.getComments().add(comment1);
		user.getComments().add(comment2);

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
	
	
	//#17: populates tables with dummy data
	public static void fillTables() {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		//adding 10 dummy users with posts and comments
		for(int i=1; i<=10; i++) {
			
			User user = new User();	
			user.setFirstName("User");
			user.setLastName("" + i);
			user.setUserEmail("user_"+i+ "@gmail.com");
			user.setUserName("username"+i);
			user.setGender("Male");
			user.setTimeStamp(new Date());
			user.setCreatedDate(new GregorianCalendar(2020, Calendar.JANUARY, i).getTime());
			user.setLastModifiedTimestamp(new Date());
			user.setDob(new GregorianCalendar(1992, Calendar.MARCH, i).getTime());
			user.setUserstamp("user"+i);
			
			Post post = new Post();
			post.setPostSubject("My"+i+"th"+ "Post");
			post.setUserStamp("user"+i);
			post.setPostDescription("This will be my " + i +" test post for this app");
			post.setTimeStamp(new Date());
			post.setPostTime(new Date());
			post.setCreatedDate(new GregorianCalendar(2020, Calendar.JANUARY, i).getTime());
			post.setLastModifiedTimestamp(new Date());
			post.setUser(user);
			
			Comment comment1 = new Comment();
			comment1.setCommentTime(new Date());
			comment1.setCommentContent("@user"+i+"What a nice post!!");
			comment1.setTimestamp(new Date());
			comment1.setCreatedDate(new GregorianCalendar(2020, Calendar.JANUARY, i).getTime());
			comment1.setLastModifiedTimestamp(new Date());
			comment1.setUserstamp("user"+i);
			
			comment1.setUser(user);
			comment1.setPost(post);
			
			Comment comment2 = new Comment();
			comment2.setCommentTime(new Date());
			comment2.setCommentContent("@user"+i+ "What a great post!!");
			comment2.setTimestamp(new Date());
			comment2.setUserstamp("user"+i);
			comment2.setCreatedDate(new GregorianCalendar(2020, Calendar.JANUARY, i).getTime());
			comment2.setLastModifiedTimestamp(new Date());
			
			
			comment2.setUser(user);
			comment2.setPost(post);
			
			post.getPostComments().add(comment1);
			post.getPostComments().add(comment2);
			
			user.getPosts().add(post);
			user.getComments().add(comment1);
			user.getComments().add(comment2);
			
			session.save(user);
		}
		
		session.getTransaction().commit();
		session.close();
	}
	
	public static void getDetails(long startingIndex, long numberOfRecords) {
			
				Session session = sessionFactory.getCurrentSession();
				
				session.beginTransaction();
				
				session.createQuery("from User where user_id = :startingIndex");
				
				try{
					
				  //Using placeholder in the query for post class
					
					String sql = "select postDescription from Post p" + 
									" where p.postID>:id and p.postID<:id1";
					
					Query query = session.createQuery(sql);
					
					query.setParameter("id", startingIndex);
					
					query.setParameter("id1", numberOfRecords + startingIndex);

					List<Post> user1 = query.getResultList();
					
					System.out.println("Post is : " + user1);
					
					
				  //Fetching Username from Starting Index : startingIdex to Number Of Records : numberOfRecords
					
					String userQuery = "Select userName from User";
					
					Query query1 = session.createQuery(userQuery).setFirstResult((int) startingIndex).setMaxResults((int) numberOfRecords);
					
					List<User> user2 = query1.getResultList();
					
					System.out.println("User details : " + user2);
			
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				finally {
					session.close();
				}
		

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		//	createDatabaseConnection();

		//uncomment to test:
		
		//adds data to tables with a user's info and comments 
		//testEntityTables();
		
		//TODO: for ANKIT:  add code to testEntityTables() method add one more user with comments and post - see method's body for description
		
		//#17: populate tables with dummy data
		fillTables();
		
		getDetails(3L, 4L);
	}
}
