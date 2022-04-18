package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class TallyFriend implements Serializable {
    private String friendId;

    private Integer friendUserid;

    private String friendGroup;

    private Integer friendFriid;

    private static final long serialVersionUID = 1L;

    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }

    public Integer getFriendUserid() {
        return friendUserid;
    }

    public void setFriendUserid(Integer friendUserid) {
        this.friendUserid = friendUserid;
    }

    public String getFriendGroup() {
        return friendGroup;
    }

    public void setFriendGroup(String friendGroup) {
        this.friendGroup = friendGroup;
    }

    public Integer getFriendFriid() {
        return friendFriid;
    }

    public void setFriendFriid(Integer friendFriid) {
        this.friendFriid = friendFriid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", friendId=").append(friendId);
        sb.append(", friendUserid=").append(friendUserid);
        sb.append(", friendGroup=").append(friendGroup);
        sb.append(", friendFriid=").append(friendFriid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}