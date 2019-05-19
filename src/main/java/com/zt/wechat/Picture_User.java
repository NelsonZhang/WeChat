package com.zt.wechat;

import com.zt.wechat.model.Picture;
import com.zt.wechat.model.User;

import java.util.Date;

public class Picture_User {
    private String id; //图片ID

    private String user;//用户ID

    private Date time;

    private String province;

    private String url;

    private Integer upnum;

    private String city;

    private Integer readingnum;

    private String avatar;

    private String name;

    private String sessionKey;

    public void setPicture(Picture picture) {
        this.id = picture.getId();
        this.time = picture.getTime();
        this.city = picture.getCity();
        this.province = picture.getProvince();
        this.readingnum = picture.getReadingnum();
        this.upnum = picture.getUpnum();
        this.url = picture.getUrl();
    }

    public void setUser(User user) {
        this.user = user.getId();
        this.name = user.getName();
        this.avatar = user.getAvatar();
        this.sessionKey = user.getSessionKey();
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getUpnum() {
        return upnum;
    }

    public void setUpnum(Integer upnum) {
        this.upnum = upnum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getReadingnum() {
        return readingnum;
    }

    public void setReadingnum(Integer readingnum) {
        this.readingnum = readingnum;
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
