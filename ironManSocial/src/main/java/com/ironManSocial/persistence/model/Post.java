package com.ironManSocial.persistence.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Post {
	
	/* Instance Variable Declaration */
	
	private long postID;
	
	private String postSubject;			/* In future, remove if not needed */
	
	private String postDescription;
	
	private Date postTime;
	
	private User user;
	
	private Collection<Comment> postComment = new ArrayList<Comment>();

	
	/* Default Constructor */
	
	public Post() {
		
	}
	
	
	/* Parameterized Constructor */
	
	public Post(long postID, String postSubject, String postDescription, Date postTime) {
		
		this.postID = postID;
		this.postSubject = postSubject;
		this.postDescription = postDescription;
		this.postTime = postTime;
	}
	
	/* Getter & Setter for Instance Variables */
	
	public long getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
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

	public Collection<Comment> getPostComment() {
		return postComment;
	}

	public void setPostComment(Collection<Comment> postComment) {
		this.postComment = postComment;
	}

}
