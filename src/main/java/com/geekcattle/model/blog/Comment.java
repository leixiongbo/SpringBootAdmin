package com.geekcattle.model.blog;

import javax.persistence.Table;

@Table(name = "comment")
public class Comment {
    private String id;
    private String commentContent;
    private String commentTime;
    private String commentUserId;
    private String commentArticleId;
    private String commentStatus;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentUserID() {
        return commentUserId;
    }

    public void setCommentUserID(String commentUserID) {
        this.commentUserId = commentUserID;
    }

    public String getCommentArticleID() {
        return commentArticleId;
    }

    public void setCommentArticleID(String commentArticleID) {
        this.commentArticleId = commentArticleID;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }


}
