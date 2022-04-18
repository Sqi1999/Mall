package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TallyStatistics implements Serializable {
    private Integer statisticsId;

    private Integer statisticsUserid;

    private String statisticsName;

    private Integer statisticsKindid;

    private String statisticsRemark;

    private BigDecimal statisticsMoney;

    private Date statisticsTime;

    private static final long serialVersionUID = 1L;

    public Integer getStatisticsId() {
        return statisticsId;
    }

    public void setStatisticsId(Integer statisticsId) {
        this.statisticsId = statisticsId;
    }

    public Integer getStatisticsUserid() {
        return statisticsUserid;
    }

    public void setStatisticsUserid(Integer statisticsUserid) {
        this.statisticsUserid = statisticsUserid;
    }

    public String getStatisticsName() {
        return statisticsName;
    }

    public void setStatisticsName(String statisticsName) {
        this.statisticsName = statisticsName;
    }

    public Integer getStatisticsKindid() {
        return statisticsKindid;
    }

    public void setStatisticsKindid(Integer statisticsKindid) {
        this.statisticsKindid = statisticsKindid;
    }

    public String getStatisticsRemark() {
        return statisticsRemark;
    }

    public void setStatisticsRemark(String statisticsRemark) {
        this.statisticsRemark = statisticsRemark;
    }

    public BigDecimal getStatisticsMoney() {
        return statisticsMoney;
    }

    public void setStatisticsMoney(BigDecimal statisticsMoney) {
        this.statisticsMoney = statisticsMoney;
    }

    public Date getStatisticsTime() {
        return statisticsTime;
    }

    public void setStatisticsTime(Date statisticsTime) {
        this.statisticsTime = statisticsTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", statisticsId=").append(statisticsId);
        sb.append(", statisticsUserid=").append(statisticsUserid);
        sb.append(", statisticsName=").append(statisticsName);
        sb.append(", statisticsKindid=").append(statisticsKindid);
        sb.append(", statisticsRemark=").append(statisticsRemark);
        sb.append(", statisticsMoney=").append(statisticsMoney);
        sb.append(", statisticsTime=").append(statisticsTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}