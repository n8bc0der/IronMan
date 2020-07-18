package com.ironManSocial.dao.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Column;

/*Basic User Class*/

@Entity
@Table(name = "USER")
public class User {

	/* Instance Variable declaration */
	// @SequenceGenerator(initialValue= 1, name="user_sequence")
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	// "user_sequence")

	@Column(name = "USER_ID", columnDefinition = "serial", insertable = false, updatable = false, unique = true, nullable = false)
	long userId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Id
	@Column(name = "USERNAME")
	private String userName;

	@Column(name = "USER_PASSWORD")
	private String userPassword;

	@Column(name = "USER_AGE")
	private int userAge;

	@Column(name = "USER_EMAIL")
	private String userEmail;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "DOB")
	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name = "USERSTAMP")
	private String userstamp;

	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "TIMESTAMP")
	private Date timestamp;

	@Column(name = "LAST_MODIFIED_TIMESTAMP")
	private Date lastModifiedTimestamp;
 
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user")  // adding fetch type eager to fix  org.hibernate.LazyInitializationException: failed to lazily initialize a collection of role when retrieving a user
	@Fetch(value = FetchMode.SUBSELECT)
	@Cascade(CascadeType.ALL)
	private Collection<Post> posts = new ArrayList<Post>();

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user")  // adding fetch type eager to fix  org.hibernate.LazyInitializationException: failed to lazily initialize a collection of role when retrieving a user
	@Cascade(CascadeType.ALL)
	@Fetch(value = FetchMode.SUBSELECT)
	private Collection<Comment> comments = new ArrayList<Comment>();

	/* Default constructor */
	public User() {

	}

	/* User parameterized constructor Creation */

	public User(String firstName, String lastName, String userName, String userPassword, int userAge, String userEmail,
			String gender, Date dob, String userstamp, Date timestamp, Collection<Post> posts,
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

	public String getUserstamp() {
		return userstamp;
	}

	public void setUserstamp(String userstamp) {
		this.userstamp = userstamp;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Date getLastModifiedTimestamp() {
		return lastModifiedTimestamp;
	}

	public void setLastModifiedTimestamp(Date lastModifiedTimestamp) {
		this.lastModifiedTimestamp = lastModifiedTimestamp;
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
	

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", userPassword=" + userPassword + ", userAge=" + userAge + ", userEmail=" + userEmail
				+ ", gender=" + gender + ", dob=" + dob + ", userstamp=" + userstamp + ", createdDate=" + createdDate
				+ ", timestamp=" + timestamp + ", lastModifiedTimestamp=" + lastModifiedTimestamp + ", posts=" + posts
				+ ", comments=" + comments + "]";
	}

}
