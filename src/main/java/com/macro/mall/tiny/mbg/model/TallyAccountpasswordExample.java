package com.macro.mall.tiny.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class TallyAccountpasswordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TallyAccountpasswordExample() {
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

        public Criteria andPassIdIsNull() {
            addCriterion("pass_id is null");
            return (Criteria) this;
        }

        public Criteria andPassIdIsNotNull() {
            addCriterion("pass_id is not null");
            return (Criteria) this;
        }

        public Criteria andPassIdEqualTo(Integer value) {
            addCriterion("pass_id =", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdNotEqualTo(Integer value) {
            addCriterion("pass_id <>", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdGreaterThan(Integer value) {
            addCriterion("pass_id >", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pass_id >=", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdLessThan(Integer value) {
            addCriterion("pass_id <", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdLessThanOrEqualTo(Integer value) {
            addCriterion("pass_id <=", value, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdIn(List<Integer> values) {
            addCriterion("pass_id in", values, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdNotIn(List<Integer> values) {
            addCriterion("pass_id not in", values, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdBetween(Integer value1, Integer value2) {
            addCriterion("pass_id between", value1, value2, "passId");
            return (Criteria) this;
        }

        public Criteria andPassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pass_id not between", value1, value2, "passId");
            return (Criteria) this;
        }

        public Criteria andPassPhoneIsNull() {
            addCriterion("pass_phone is null");
            return (Criteria) this;
        }

        public Criteria andPassPhoneIsNotNull() {
            addCriterion("pass_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPassPhoneEqualTo(String value) {
            addCriterion("pass_phone =", value, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneNotEqualTo(String value) {
            addCriterion("pass_phone <>", value, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneGreaterThan(String value) {
            addCriterion("pass_phone >", value, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("pass_phone >=", value, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneLessThan(String value) {
            addCriterion("pass_phone <", value, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneLessThanOrEqualTo(String value) {
            addCriterion("pass_phone <=", value, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneLike(String value) {
            addCriterion("pass_phone like", value, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneNotLike(String value) {
            addCriterion("pass_phone not like", value, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneIn(List<String> values) {
            addCriterion("pass_phone in", values, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneNotIn(List<String> values) {
            addCriterion("pass_phone not in", values, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneBetween(String value1, String value2) {
            addCriterion("pass_phone between", value1, value2, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassPhoneNotBetween(String value1, String value2) {
            addCriterion("pass_phone not between", value1, value2, "passPhone");
            return (Criteria) this;
        }

        public Criteria andPassTitleIsNull() {
            addCriterion("pass_title is null");
            return (Criteria) this;
        }

        public Criteria andPassTitleIsNotNull() {
            addCriterion("pass_title is not null");
            return (Criteria) this;
        }

        public Criteria andPassTitleEqualTo(String value) {
            addCriterion("pass_title =", value, "passTitle");
            return (Criteria) this;
        }

        public Criteria andPassTitleNotEqualTo(String value) {
            addCriterion("pass_title <>", value, "passTitle");
            return (Criteria) this;
        }

        public Criteria andPassTitleGreaterThan(String value) {
            addCriterion("pass_title >", value, "passTitle");
            return (Criteria) this;
        }

        public Criteria andPassTitleGreaterThanOrEqualTo(String value) {
            addCriterion("pass_title >=", value, "passTitle");
            return (Criteria) this;
        }

        public Criteria andPassTitleLessThan(String value) {
            addCriterion("pass_title <", value, "passTitle");
            return (Criteria) this;
        }

        public Criteria andPassTitleLessThanOrEqualTo(String value) {
            addCriterion("pass_title <=", value, "passTitle");
            return (Criteria) this;
        }

        public Criteria andPassTitleLike(String value) {
            addCriterion("pass_title like", value, "passTitle");
            return (Criteria) this;
        }

        public Criteria andPassTitleNotLike(String value) {
            addCriterion("pass_title not like", value, "passTitle");
            return (Criteria) this;
        }

        public Criteria andPassTitleIn(List<String> values) {
            addCriterion("pass_title in", values, "passTitle");
            return (Criteria) this;
        }

        public Criteria andPassTitleNotIn(List<String> values) {
            addCriterion("pass_title not in", values, "passTitle");
            return (Criteria) this;
        }

        public Criteria andPassTitleBetween(String value1, String value2) {
            addCriterion("pass_title between", value1, value2, "passTitle");
            return (Criteria) this;
        }

        public Criteria andPassTitleNotBetween(String value1, String value2) {
            addCriterion("pass_title not between", value1, value2, "passTitle");
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