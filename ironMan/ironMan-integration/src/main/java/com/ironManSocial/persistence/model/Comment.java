package com.ironManSocial.persistence.model;
 
import java.util.Date;
 
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;

 
@Entity
@Table(name="Comment")
public class Comment {
 
  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE)
  @Column(name="COMMENT_ID")
  private long commentID;
 
  @Column(name="COMMENT_CONTENT")
  private String commentContent;
 
  @Column(name="COMMENT_TIME")
  private Date commentTime;
  
  @Column(name="USERSTAMP")
  private String userstamp;
	
  @Column(name="TIMESTAMP")
  private Date timestamp;
  
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