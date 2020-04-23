package com.ironManSocial.dto.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import com.ironManSocial.dao.model.Comment;
import com.ironManSocial.dao.model.Post;

public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = -4700882345494097060L;

	/* Instance Variable declaration */
	// @SequenceGenerator(initialValue= 1, name="user_sequence")
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	// "user_sequence")

	long userId;

	private String firstName;

	private String lastName;

	private String userName;

	private String userPassword;

	private int userAge;

	private String userEmail;

	private String gender;

	private Date dob;

	private String userstamp;

	private Date createdDate;

	private Date timestamp;

	private Date lastModifiedTimestamp;

	private Collection<Post> posts = new ArrayList<Post>();

	private Collection<Comment> comments = new ArrayList<Comment>();

	/* Default constructor */
	public UserDTO() {

	}

	/* Setters & Getters for instance variables */

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", userPassword=" + userPassword + ", userAge=" + userAge + ", userEmail=" + userEmail
				+ ", gender=" + gender + ", dob=" + dob + ", userstamp=" + userstamp + ", createdDate=" + createdDate
				+ ", timestamp=" + timestamp + ", lastModifiedTimestamp=" + lastModifiedTimestamp + ", posts=" + posts
				+ ", comments=" + comments + "]";
	}

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

}
