package com.ironManSocial.persistence.model;

import java.util.Date;

import javax.persistence.Id;

public class Comment {

	@Id
	private long commentID;
	
	private String commentContent;
	
	private Date commentTime;
	
	private User user;
	
	private Post post;

	
	/* Default Constructor */
	
	public Comment() {
		super();
	}

	/* Parameterized Constructor */
	
	public Comment(long commentID, String commentContent, Date commentTime) {
		super();
		this.commentID = commentID;
		this.commentContent = commentContent;
		this.commentTime = commentTime;
	}

	public long getCommentID() {
		return commentID;
	}

	public void setCommentID(long commentID) {
		this.commentID = commentID;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Date getCommentTime() {
		return commentTime;
	}

	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
}
