package com.chuxin.pojo;

import java.io.Serializable;
import java.util.Date;

public class Reply implements Serializable {
    private Integer id;

    private Integer commentId;

    private Integer replyObjectiveId;

    private String type;

    private String replyContent;

    private Integer replyUserId;

    private String spareOne;

    private String spareTwo;

    private Date replyTime;

    public Reply() {
    }

    public Reply(Integer id, Integer commentId, Integer replyObjectiveId, String type, String replyContent, Integer replyUserId, String spareOne, String spareTwo, Date replyTime) {
        this.id = id;
        this.commentId = commentId;
        this.replyObjectiveId = replyObjectiveId;
        this.type = type;
        this.replyContent = replyContent;
        this.replyUserId = replyUserId;
        this.spareOne = spareOne;
        this.spareTwo = spareTwo;
        this.replyTime = replyTime;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", commentId=" + commentId +
                ", replyObjectiveId=" + replyObjectiveId +
                ", type='" + type + '\'' +
                ", replyContent='" + replyContent + '\'' +
                ", replyUserId=" + replyUserId +
                ", spareOne='" + spareOne + '\'' +
                ", spareTwo='" + spareTwo + '\'' +
                ", replyTime=" + replyTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getReplyObjectiveId() {
        return replyObjectiveId;
    }

    public void setReplyObjectiveId(Integer replyObjectiveId) {
        this.replyObjectiveId = replyObjectiveId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }

    public Integer getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(Integer replyUserId) {
        this.replyUserId = replyUserId;
    }

    public String getSpareOne() {
        return spareOne;
    }

    public void setSpareOne(String spareOne) {
        this.spareOne = spareOne == null ? null : spareOne.trim();
    }

    public String getSpareTwo() {
        return spareTwo;
    }

    public void setSpareTwo(String spareTwo) {
        this.spareTwo = spareTwo == null ? null : spareTwo.trim();
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }
}