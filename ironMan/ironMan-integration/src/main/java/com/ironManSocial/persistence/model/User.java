package com.ironManSocial.persistence.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Column;

/*Basic User Class*/

@Entity//(name="USER")
@Table(name="USER")
public class User {

	/* Instance Variable declaration */
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="USER_ID")
	long userId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Id
	@Column(name="USER_NAME")
	private String userName;

	@Column(name="USER_PASSWORD")
	private String userPassword;

	@Column(name="USER_AGE")
	private int userAge;

	@Column(name="USER_EMAIL")
	private String userEmail;

	@Column(name="GENDER")
	private String gender;
	
	@Column(name="DOB")
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Column(name="USERSTAMP")
	private String userstamp;
	
	@Column(name="TIMESTAMP")
	private Date timestamp;
	
	@OneToMany(mappedBy="user")
	@Cascade(CascadeType.ALL)
	private Collection<Post> posts = new ArrayList<Post>();
	
	
	@OneToMany(mappedBy="user")
	@Cascade(CascadeType.ALL)
	private Collection<Comment> comments = new ArrayList<Comment>();

	/* Default constructor */
	public User() {

	}

	/* User parameterized constructor Creation */

	public User(String firstName, String lastName, String userName, String userPassword, int userAge,
			String userEmail, String gender, Date dob, String userstamp, Date timestamp, Collection<Post> posts,
			Collection<Comment> comments) {
		
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userAge = userAge;
		this.userEmail = userEmail;
		this.gender = gender;
		this.dob = dob;
		this.userstamp = userstamp;
		this.timestamp = timestamp;
		this.posts = posts;
		this.comments = comments;
	}

	/* Setters & Getters for instance variables */
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String getUserStamp() {
		return userstamp;
	}

	public void setUserStamp(String userstamp) {
		this.userstamp = userstamp;
	}

	public Date getTimeStamp() {
		return timestamp;
	}

	public void setTimeStamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Collection<Post> getPosts() {
		return posts;
	}

	public void setPosts(Collection<Post> posts) {
		this.posts = posts;
	}

	public Collection<Comment> getComments() {
		return comments;
	}

	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}
}