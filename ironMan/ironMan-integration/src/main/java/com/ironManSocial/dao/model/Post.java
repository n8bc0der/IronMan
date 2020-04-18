package com.ironManSocial.persistence.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Post")
public class Post {

	/* Instance Variable Declaration */

	@Id
	@SequenceGenerator(initialValue = 1, name = "post_sequence")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_sequence")
	@Column(name = "POST_ID")
	private long postID;

	@Column(name = "POST_SUBJECT")
	private String postSubject; /* In future, remove if not needed */

	@Column(name = "POST_DESCRIPTION")
	private String postDescription;

	@Column(name = "POST_TIME")
	private Date postTime;

	@Column(name = "USERSTAMP")
	private String userstamp;

	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "TIMESTAMP")
	private Date timestamp;

	@Column(name = "LAST_MODIFIED_TIMESTAMP")
	private Date lastModifiedTimestamp;

	@ManyToOne
	@JoinColumn(name = "USERNAME")
	private User user;

	@OneToMany(mappedBy = "post")
	private Collection<Comment> postComments = new ArrayList<Comment>();

	/* Default Constructor */

	public Post() {

	}
	/* Parameterized Constructor */

	public Post(String postSubject, String postDescription, Date postTime, String userstamp, Date timestamp, User user,
			Collection<Comment> postComments) {
		super();
		this.postSubject = postSubject;
		this.postDescription = postDescription;
		this.postTime = postTime;
		this.userstamp = userstamp;
		this.timestamp = timestamp;
		this.user = user;
		this.postComments = postComments;
	}

	/* Getter & Setter for Instance Variables */

	@Override
	public String toString() {
		return "Post [postID=" + postID + ", postSubject=" + postSubject + ", postDescription=" + postDescription
				+ ", postTime=" + postTime + ", userstamp=" + userstamp + ", createdDate=" + createdDate
				+ ", timestamp=" + timestamp + ", lastModifiedTimestamp=" + lastModifiedTimestamp + ", user=" + user
				+ ", postComments=" + postComments + "]";
	}

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
		return userstamp;
	}

	public void setUserStamp(String userStamp) {
		this.userstamp = userStamp;
	}

	public Date getTimeStamp() {
		return timestamp;
	}

	public void setTimeStamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Collection<Comment> getPostComments() {
		return postComments;
	}

	public void setPostComments(Collection<Comment> postComments) {
		this.postComments = postComments;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}