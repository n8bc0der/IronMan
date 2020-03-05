package com.ironManSocial.persistence.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="Post")
public class Post {
	
	/* Instance Variable Declaration */
	
	@Id
	@Column(name="POST_ID")
	private long postID;
	
	@Column(name="POST_SUBJECT")
	private String postSubject;			/* In future, remove if not needed */
	
	@Column(name="POST_DESCRIPTION")
	private String postDescription;
	
	@Column(name="POST_TIME")
	private Date postTime;
	
	@Column(name="USER_STAMP")
	private String userStamp;
	
	@Column(name="TIME_STAMP")
	private Date timeStamp;
	
	private User user;
	
	private Collection<Comment> postComment = new ArrayList<Comment>();

	
	/* Default Constructor */
	
	public Post() {
		
	}
	
	
	/* Parameterized Constructor */
	
	public Post(long postID, String postSubject, String postDescription, Date postTime, String userStamp, Date timeStamp) {
		
		this.postID = postID;
		this.postSubject = postSubject;
		this.postDescription = postDescription;
		this.postTime = postTime;
		this.userStamp = userStamp;
		this.timeStamp = timeStamp;
	}
	
	/* Getter & Setter for Instance Variables */
	
	public long getPostID() {
		return postID;
	}

	public void setPostID(long postID) {
		this.postID = postID;
	}

	public String getPostSubject() {
		return postSubject;
	}

	public void setPostSubject(String postSubject) {
		this.postSubject = postSubject;
	}

	public String getPostDescription() {
		return postDescription;
	}

	public void setPostDescription(String postDescription) {
		this.postDescription = postDescription;
	}

	public Date getPostTime() {
		return postTime;
	}

	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	public String getUserStamp() {
		return userStamp;
	}


	public void setUserStamp(String userStamp) {
		this.userStamp = userStamp;
	}


	public Date getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}


	public Collection<Comment> getPostComment() {
		return postComment;
	}

	public void setPostComment(Collection<Comment> postComment) {
		this.postComment = postComment;
	}

}