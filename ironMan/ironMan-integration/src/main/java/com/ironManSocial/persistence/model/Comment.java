package com.ironManSocial.persistence.model;
 
import java.util.Date;
 
import javax.persistence.Id;
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