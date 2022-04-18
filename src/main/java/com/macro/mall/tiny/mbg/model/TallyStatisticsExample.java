package com.macro.mall.tiny.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TallyStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TallyStatisticsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andStatisticsIdIsNull() {
            addCriterion("statistics_id is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdIsNotNull() {
            addCriterion("statistics_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdEqualTo(Integer value) {
            addCriterion("statistics_id =", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdNotEqualTo(Integer value) {
            addCriterion("statistics_id <>", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdGreaterThan(Integer value) {
            addCriterion("statistics_id >", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("statistics_id >=", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdLessThan(Integer value) {
            addCriterion("statistics_id <", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdLessThanOrEqualTo(Integer value) {
            addCriterion("statistics_id <=", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdIn(List<Integer> values) {
            addCriterion("statistics_id in", values, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdNotIn(List<Integer> values) {
            addCriterion("statistics_id not in", values, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdBetween(Integer value1, Integer value2) {
            addCriterion("statistics_id between", value1, value2, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("statistics_id not between", value1, value2, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsUseridIsNull() {
            addCriterion("statistics_userid is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsUseridIsNotNull() {
            addCriterion("statistics_userid is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsUseridEqualTo(Integer value) {
            addCriterion("statistics_userid =", value, "statisticsUserid");
            return (Criteria) this;
        }

        public Criteria andStatisticsUseridNotEqualTo(Integer value) {
            addCriterion("statistics_userid <>", value, "statisticsUserid");
            return (Criteria) this;
        }

        public Criteria andStatisticsUseridGreaterThan(Integer value) {
            addCriterion("statistics_userid >", value, "statisticsUserid");
            return (Criteria) this;
        }

        public Criteria andStatisticsUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("statistics_userid >=", value, "statisticsUserid");
            return (Criteria) this;
        }

        public Criteria andStatisticsUseridLessThan(Integer value) {
            addCriterion("statistics_userid <", value, "statisticsUserid");
            return (Criteria) this;
        }

        public Criteria andStatisticsUseridLessThanOrEqualTo(Integer value) {
            addCriterion("statistics_userid <=", value, "statisticsUserid");
            return (Criteria) this;
        }

        public Criteria andStatisticsUseridIn(List<Integer> values) {
            addCriterion("statistics_userid in", values, "statisticsUserid");
            return (Criteria) this;
        }

        public Criteria andStatisticsUseridNotIn(List<Integer> values) {
            addCriterion("statistics_userid not in", values, "statisticsUserid");
            return (Criteria) this;
        }

        public Criteria andStatisticsUseridBetween(Integer value1, Integer value2) {
            addCriterion("statistics_userid between", value1, value2, "statisticsUserid");
            return (Criteria) this;
        }

        public Criteria andStatisticsUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("statistics_userid not between", value1, value2, "statisticsUserid");
            return (Criteria) this;
        }

        public Criteria andStatisticsNameIsNull() {
            addCriterion("statistics_name is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsNameIsNotNull() {
            addCriterion("statistics_name is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsNameEqualTo(String value) {
            addCriterion("statistics_name =", value, "statisticsName");
            return (Criteria) this;
        }

        public Criteria andStatisticsNameNotEqualTo(String value) {
            addCriterion("statistics_name <>", value, "statisticsName");
            return (Criteria) this;
        }

        public Criteria andStatisticsNameGreaterThan(String value) {
            addCriterion("statistics_name >", value, "statisticsName");
            return (Criteria) this;
        }

        public Criteria andStatisticsNameGreaterThanOrEqualTo(String value) {
            addCriterion("statistics_name >=", value, "statisticsName");
            return (Criteria) this;
        }

        public Criteria andStatisticsNameLessThan(String value) {
            addCriterion("statistics_name <", value, "statisticsName");
            return (Criteria) this;
        }

        public Criteria andStatisticsNameLessThanOrEqualTo(String value) {
            addCriterion("statistics_name <=", value, "statisticsName");
            return (Criteria) this;
        }

        public Criteria andStatisticsNameLike(String value) {
            addCriterion("statistics_name like", value, "statisticsName");
            return (Criteria) this;
        }

        public Criteria andStatisticsNameNotLike(String value) {
            addCriterion("statistics_name not like", value, "statisticsName");
            return (Criteria) this;
        }

        public Criteria andStatisticsNameIn(List<String> values) {
            addCriterion("statistics_name in", values, "statisticsName");
            return (Criteria) this;
        }

        public Criteria andStatisticsNameNotIn(List<String> values) {
            addCriterion("statistics_name not in", values, "statisticsName");
            return (Criteria) this;
        }

        public Criteria andStatisticsNameBetween(String value1, String value2) {
            addCriterion("statistics_name between", value1, value2, "statisticsName");
            return (Criteria) this;
        }

        public Criteria andStatisticsNameNotBetween(String value1, String value2) {
            addCriterion("statistics_name not between", value1, value2, "statisticsName");
            return (Criteria) this;
        }

        public Criteria andStatisticsKindidIsNull() {
            addCriterion("statistics_kindid is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsKindidIsNotNull() {
            addCriterion("statistics_kindid is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsKindidEqualTo(Integer value) {
            addCriterion("statistics_kindid =", value, "statisticsKindid");
            return (Criteria) this;
        }

        public Criteria andStatisticsKindidNotEqualTo(Integer value) {
            addCriterion("statistics_kindid <>", value, "statisticsKindid");
            return (Criteria) this;
        }

        public Criteria andStatisticsKindidGreaterThan(Integer value) {
            addCriterion("statistics_kindid >", value, "statisticsKindid");
            return (Criteria) this;
        }

        public Criteria andStatisticsKindidGreaterThanOrEqualTo(Integer value) {
            addCriterion("statistics_kindid >=", value, "statisticsKindid");
            return (Criteria) this;
        }

        public Criteria andStatisticsKindidLessThan(Integer value) {
            addCriterion("statistics_kindid <", value, "statisticsKindid");
            return (Criteria) this;
        }

        public Criteria andStatisticsKindidLessThanOrEqualTo(Integer value) {
            addCriterion("statistics_kindid <=", value, "statisticsKindid");
            return (Criteria) this;
        }

        public Criteria andStatisticsKindidIn(List<Integer> values) {
            addCriterion("statistics_kindid in", values, "statisticsKindid");
            return (Criteria) this;
        }

        public Criteria andStatisticsKindidNotIn(List<Integer> values) {
            addCriterion("statistics_kindid not in", values, "statisticsKindid");
            return (Criteria) this;
        }

        public Criteria andStatisticsKindidBetween(Integer value1, Integer value2) {
            addCriterion("statistics_kindid between", value1, value2, "statisticsKindid");
            return (Criteria) this;
        }

        public Criteria andStatisticsKindidNotBetween(Integer value1, Integer value2) {
            addCriterion("statistics_kindid not between", value1, value2, "statisticsKindid");
            return (Criteria) this;
        }

        public Criteria andStatisticsRemarkIsNull() {
            addCriterion("statistics_remark is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsRemarkIsNotNull() {
            addCriterion("statistics_remark is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsRemarkEqualTo(String value) {
            addCriterion("statistics_remark =", value, "statisticsRemark");
            return (Criteria) this;
        }

        public Criteria andStatisticsRemarkNotEqualTo(String value) {
            addCriterion("statistics_remark <>", value, "statisticsRemark");
            return (Criteria) this;
        }

        public Criteria andStatisticsRemarkGreaterThan(String value) {
            addCriterion("statistics_remark >", value, "statisticsRemark");
            return (Criteria) this;
        }

        public Criteria andStatisticsRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("statistics_remark >=", value, "statisticsRemark");
            return (Criteria) this;
        }

        public Criteria andStatisticsRemarkLessThan(String value) {
            addCriterion("statistics_remark <", value, "statisticsRemark");
            return (Criteria) this;
        }

        public Criteria andStatisticsRemarkLessThanOrEqualTo(String value) {
            addCriterion("statistics_remark <=", value, "statisticsRemark");
            return (Criteria) this;
        }

        public Criteria andStatisticsRemarkLike(String value) {
            addCriterion("statistics_remark like", value, "statisticsRemark");
            return (Criteria) this;
        }

        public Criteria andStatisticsRemarkNotLike(String value) {
            addCriterion("statistics_remark not like", value, "statisticsRemark");
            return (Criteria) this;
        }

        public Criteria andStatisticsRemarkIn(List<String> values) {
            addCriterion("statistics_remark in", values, "statisticsRemark");
            return (Criteria) this;
        }

        public Criteria andStatisticsRemarkNotIn(List<String> values) {
            addCriterion("statistics_remark not in", values, "statisticsRemark");
            return (Criteria) this;
        }

        public Criteria andStatisticsRemarkBetween(String value1, String value2) {
            addCriterion("statistics_remark between", value1, value2, "statisticsRemark");
            return (Criteria) this;
        }

        public Criteria andStatisticsRemarkNotBetween(String value1, String value2) {
            addCriterion("statistics_remark not between", value1, value2, "statisticsRemark");
            return (Criteria) this;
        }

        public Criteria andStatisticsMoneyIsNull() {
            addCriterion("statistics_money is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsMoneyIsNotNull() {
            addCriterion("statistics_money is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsMoneyEqualTo(BigDecimal value) {
            addCriterion("statistics_money =", value, "statisticsMoney");
            return (Criteria) this;
        }

        public Criteria andStatisticsMoneyNotEqualTo(BigDecimal value) {
            addCriterion("statistics_money <>", value, "statisticsMoney");
            return (Criteria) this;
        }

        public Criteria andStatisticsMoneyGreaterThan(BigDecimal value) {
            addCriterion("statistics_money >", value, "statisticsMoney");
            return (Criteria) this;
        }

        public Criteria andStatisticsMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("statistics_money >=", value, "statisticsMoney");
            return (Criteria) this;
        }

        public Criteria andStatisticsMoneyLessThan(BigDecimal value) {
            addCriterion("statistics_money <", value, "statisticsMoney");
            return (Criteria) this;
        }

        public Criteria andStatisticsMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("statistics_money <=", value, "statisticsMoney");
            return (Criteria) this;
        }

        public Criteria andStatisticsMoneyIn(List<BigDecimal> values) {
            addCriterion("statistics_money in", values, "statisticsMoney");
            return (Criteria) this;
        }

        public Criteria andStatisticsMoneyNotIn(List<BigDecimal> values) {
            addCriterion("statistics_money not in", values, "statisticsMoney");
            return (Criteria) this;
        }

        public Criteria andStatisticsMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("statistics_money between", value1, value2, "statisticsMoney");
            return (Criteria) this;
        }

        public Criteria andStatisticsMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("statistics_money not between", value1, value2, "statisticsMoney");
            return (Criteria) this;
        }

        public Criteria andStatisticsTimeIsNull() {
            addCriterion("statistics_time is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsTimeIsNotNull() {
            addCriterion("statistics_time is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsTimeEqualTo(Date value) {
            addCriterion("statistics_time =", value, "statisticsTime");
            return (Criteria) this;
        }

        public Criteria andStatisticsTimeNotEqualTo(Date value) {
            addCriterion("statistics_time <>", value, "statisticsTime");
            return (Criteria) this;
        }

        public Criteria andStatisticsTimeGreaterThan(Date value) {
            addCriterion("statistics_time >", value, "statisticsTime");
            return (Criteria) this;
        }

        public Criteria andStatisticsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("statistics_time >=", value, "statisticsTime");
            return (Criteria) this;
        }

        public Criteria andStatisticsTimeLessThan(Date value) {
            addCriterion("statistics_time <", value, "statisticsTime");
            return (Criteria) this;
        }

        public Criteria andStatisticsTimeLessThanOrEqualTo(Date value) {
            addCriterion("statistics_time <=", value, "statisticsTime");
            return (Criteria) this;
        }

        public Criteria andStatisticsTimeIn(List<Date> values) {
            addCriterion("statistics_time in", values, "statisticsTime");
            return (Criteria) this;
        }

        public Criteria andStatisticsTimeNotIn(List<Date> values) {
            addCriterion("statistics_time not in", values, "statisticsTime");
            return (Criteria) this;
        }

        public Criteria andStatisticsTimeBetween(Date value1, Date value2) {
            addCriterion("statistics_time between", value1, value2, "statisticsTime");
            return (Criteria) this;
        }

        public Criteria andStatisticsTimeNotBetween(Date value1, Date value2) {
            addCriterion("statistics_time not between", value1, value2, "statisticsTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}