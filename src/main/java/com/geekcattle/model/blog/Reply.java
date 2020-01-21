package com.geekcattle.model.blog;

import javax.persistence.Table;

@Table(name = "reply")
public class Reply {
    private String id;

    private String replyUserId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReplyUserID() {
        return replyUserId;
    }

    public void setReplyUserID(String replyUserID) {
        this.replyUserId = replyUserID;
    }

    public String getReplyArticleID() {
        return replyArticleId;
    }

    public void setReplyArticleID(String replyArticleID) {
        this.replyArticleId = replyArticleID;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime;
    }

    public String getReplyStatus() {
        return replyStatus;
    }

    public void setReplyStatus(String replyStatus) {
        this.replyStatus = replyStatus;
    }

    private String replyArticleId;
    private String replyContent;
    private String replyTime;
    private String replyStatus;


}
