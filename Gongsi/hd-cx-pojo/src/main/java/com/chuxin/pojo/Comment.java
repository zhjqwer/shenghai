package com.chuxin.pojo;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    private Integer id;

    private String type;

    private Integer commentObjective;

    private String commentContent;

    private Integer commentUser;

    private Integer serviceScore;

    private String spareOne;

    private String spareTwo;

    private Date commentTime;

    public Comment() {
    }

    public Comment(Integer id, String type, Integer commentObjective, String commentContent, Integer commentUser, Integer serviceScore, String spareOne, String spareTwo, Date commentTime) {
        this.id = id;
        this.type = type;
        this.commentObjective = commentObjective;
        this.commentContent = commentContent;
        this.commentUser = commentUser;
        this.serviceScore = serviceScore;
        this.spareOne = spareOne;
        this.spareTwo = spareTwo;
        this.commentTime = commentTime;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", commentObjective=" + commentObjective +
                ", commentContent='" + commentContent + '\'' +
                ", commentUser=" + commentUser +
                ", serviceScore=" + serviceScore +
                ", spareOne='" + spareOne + '\'' +
                ", spareTwo='" + spareTwo + '\'' +
                ", commentTime=" + commentTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getCommentObjective() {
        return commentObjective;
    }

    public void setCommentObjective(Integer commentObjective) {
        this.commentObjective = commentObjective;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Integer getCommentUser() {
        return commentUser;
    }

    public void setCommentUser(Integer commentUser) {
        this.commentUser = commentUser;
    }

    public Integer getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(Integer serviceScore) {
        this.serviceScore = serviceScore;
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

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}