package com.zt.wechat;

import com.zt.wechat.model.Comment;
import com.zt.wechat.model.User;

import java.util.Date;

public class Comment_User {
    private String id;//评论ID

    private String user;//用户ID

    private String comment;

    private Date time;

    private String picture;

    private String url;

    private String avatar;

    private String name;

    private String sessionKey;

    public void setUser(User user) {
        this.user = user.getId();
        this.name = user.getName();
        this.avatar = user.getAvatar();
        this.sessionKey = user.getSessionKey();
    }

    public void setComment(Comment comment) {
        this.id = comment.getId();
        this.comment = comment.getComment();
        this.picture = comment.getPicture();
        this.time = comment.getTime();
        this.url = comment.getUrl();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }
}
