package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class TallyAccountpassword implements Serializable {
    private Integer passId;

    private String passPhone;

    private String passTitle;

    private static final long serialVersionUID = 1L;

    public Integer getPassId() {
        return passId;
    }

    public void setPassId(Integer passId) {
        this.passId = passId;
    }

    public String getPassPhone() {
        return passPhone;
    }

    public void setPassPhone(String passPhone) {
        this.passPhone = passPhone;
    }

    public String getPassTitle() {
        return passTitle;
    }

    public void setPassTitle(String passTitle) {
        this.passTitle = passTitle;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", passId=").append(passId);
        sb.append(", passPhone=").append(passPhone);
        sb.append(", passTitle=").append(passTitle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}