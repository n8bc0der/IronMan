package com.ironManSocial.dao.model;
 
import java.util.Date;
 
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;

 
@Entity
@Table(name="Comment")
public class Comment {
 
  @Id
  @SequenceGenerator(initialValue= 1, name="comment_sequence")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_sequence")
  @Column(name="COMMENT_ID")
  private long commentID;
 
  @Column(name="COMMENT_CONTENT")
  private String commentContent;
 
  @Column(name="COMMENT_TIME")
  private Date commentTime;
  
  @Column(name="USERSTAMP")
  private String userstamp;
  
  @Column(name="CREATED_DATE")
  private Date createdDate;
  
  @Column(name="TIMESTAMP")
  private Date timestamp;
  
  @Column(name="LAST_MODIFIED_TIMESTAMP")
  private Date lastModifiedTimestamp;
  
  @ManyToOne
  @JoinColumn(name="USERNAME")
  private User user;
 
  @ManyToOne
  @JoinColumn(name="POST_ID")
  private Post post;
 
 
  /* Default Constructor */
 
  public Comment() {
    super();
  }
 
  /* Parameterized Constructor */
 
  public Comment( String commentContent, Date commentTime, String userstamp, Date timestamp, User user,
		Post post) {
	super();
	this.commentContent = commentContent;
	this.commentTime = commentTime;
	this.userstamp = userstamp;
	this.timestamp = timestamp;
	this.user = user;
	this.post = post;
  }

	@Override
public String toString() {
	return "Comment [commentID=" + commentID + ", commentContent=" + commentContent + ", commentTime=" + commentTime
			+ ", userstamp=" + userstamp + ", createdDate=" + createdDate + ", timestamp=" + timestamp
			+ ", lastModifiedTimestamp=" + lastModifiedTimestamp + ", user=" + user + ", post=" + post + "]";
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

	public Date getTimeStamp() {
		return timestamp;
	}

	public void setTimeStamp(Date timestamp) {
		this.timestamp = timestamp;
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

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}