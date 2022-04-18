package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class TallyKind implements Serializable {
    private Integer kindId;

    private String kindName;

    @ApiModelProperty(value = "类别  支出")
    private Integer kindCategoryid;

    @ApiModelProperty(value = "备注")
    private String kindRemark;

    private Integer kindSort;

    private Integer kindUserid;

    @ApiModelProperty(value = "头像")
    private String kindImg;

    private static final long serialVersionUID = 1L;

    public Integer getKindId() {
        return kindId;
    }

    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public Integer getKindCategoryid() {
        return kindCategoryid;
    }

    public void setKindCategoryid(Integer kindCategoryid) {
        this.kindCategoryid = kindCategoryid;
    }

    public String getKindRemark() {
        return kindRemark;
    }

    public void setKindRemark(String kindRemark) {
        this.kindRemark = kindRemark;
    }

    public Integer getKindSort() {
        return kindSort;
    }

    public void setKindSort(Integer kindSort) {
        this.kindSort = kindSort;
    }

    public Integer getKindUserid() {
        return kindUserid;
    }

    public void setKindUserid(Integer kindUserid) {
        this.kindUserid = kindUserid;
    }

    public String getKindImg() {
        return kindImg;
    }

    public void setKindImg(String kindImg) {
        this.kindImg = kindImg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", kindId=").append(kindId);
        sb.append(", kindName=").append(kindName);
        sb.append(", kindCategoryid=").append(kindCategoryid);
        sb.append(", kindRemark=").append(kindRemark);
        sb.append(", kindSort=").append(kindSort);
        sb.append(", kindUserid=").append(kindUserid);
        sb.append(", kindImg=").append(kindImg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}