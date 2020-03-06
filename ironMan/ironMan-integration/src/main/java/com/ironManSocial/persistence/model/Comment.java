package com.ironManSocial.persistence.model;
 
import java.util.Date;
 
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

 
@Entity
@Table(name="Comment")
public class Comment {
 
  @Id
  @Column(name="COMMENT_ID")
  private long commentID;
 
  @Column(name="COMMENT_CONTENT")
  private String commentContent;
 
  @Column(name="COMMENT_TIME")
  private Date commentTime;
  
  @Column(name="USER_STAMP")
  private String userStamp;
	
  @Column(name="TIME_STAMP")
  private Date timeStamp;
  
  @ManyToOne()
  private User user;
 
  private Post post;
 
 
  /* Default Constructor */
 
  public Comment() {
    super();
  }
 
  /* Parameterized Constructor */
 
  public Comment(long commentID, String commentContent, Date commentTime, String userStamp, Date timeStamp) {
    super();
    this.commentID = commentID;
    this.commentContent = commentContent;
    this.commentTime = commentTime;
    this.userStamp = userStamp;
    this.timeStamp = timeStamp;
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
}