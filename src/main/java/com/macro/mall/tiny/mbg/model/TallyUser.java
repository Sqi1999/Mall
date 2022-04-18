package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TallyUser implements Serializable {
    private String userId;

    private String userName;

    private String userSex;

    private String userPhone;

    private String userWx;

    private Integer userAppleid;

    private String userImg;

    private Date userTime;

    @ApiModelProperty(value = "最后一次登录ip")
    private String userIp;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserWx() {
        return userWx;
    }

    public void setUserWx(String userWx) {
        this.userWx = userWx;
    }

    public Integer getUserAppleid() {
        return userAppleid;
    }

    public void setUserAppleid(Integer userAppleid) {
        this.userAppleid = userAppleid;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public Date getUserTime() {
        return userTime;
    }

    public void setUserTime(Date userTime) {
        this.userTime = userTime;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userSex=").append(userSex);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userWx=").append(userWx);
        sb.append(", userAppleid=").append(userAppleid);
        sb.append(", userImg=").append(userImg);
        sb.append(", userTime=").append(userTime);
        sb.append(", userIp=").append(userIp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}