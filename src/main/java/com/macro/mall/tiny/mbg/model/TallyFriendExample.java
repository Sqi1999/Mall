package com.macro.mall.tiny.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class TallyFriendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TallyFriendExample() {
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

        public Criteria andFriendIdIsNull() {
            addCriterion("friend_id is null");
            return (Criteria) this;
        }

        public Criteria andFriendIdIsNotNull() {
            addCriterion("friend_id is not null");
            return (Criteria) this;
        }

        public Criteria andFriendIdEqualTo(String value) {
            addCriterion("friend_id =", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdNotEqualTo(String value) {
            addCriterion("friend_id <>", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdGreaterThan(String value) {
            addCriterion("friend_id >", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdGreaterThanOrEqualTo(String value) {
            addCriterion("friend_id >=", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdLessThan(String value) {
            addCriterion("friend_id <", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdLessThanOrEqualTo(String value) {
            addCriterion("friend_id <=", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdLike(String value) {
            addCriterion("friend_id like", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdNotLike(String value) {
            addCriterion("friend_id not like", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdIn(List<String> values) {
            addCriterion("friend_id in", values, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdNotIn(List<String> values) {
            addCriterion("friend_id not in", values, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdBetween(String value1, String value2) {
            addCriterion("friend_id between", value1, value2, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdNotBetween(String value1, String value2) {
            addCriterion("friend_id not between", value1, value2, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendUseridIsNull() {
            addCriterion("friend_userid is null");
            return (Criteria) this;
        }

        public Criteria andFriendUseridIsNotNull() {
            addCriterion("friend_userid is not null");
            return (Criteria) this;
        }

        public Criteria andFriendUseridEqualTo(Integer value) {
            addCriterion("friend_userid =", value, "friendUserid");
            return (Criteria) this;
        }

        public Criteria andFriendUseridNotEqualTo(Integer value) {
            addCriterion("friend_userid <>", value, "friendUserid");
            return (Criteria) this;
        }

        public Criteria andFriendUseridGreaterThan(Integer value) {
            addCriterion("friend_userid >", value, "friendUserid");
            return (Criteria) this;
        }

        public Criteria andFriendUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("friend_userid >=", value, "friendUserid");
            return (Criteria) this;
        }

        public Criteria andFriendUseridLessThan(Integer value) {
            addCriterion("friend_userid <", value, "friendUserid");
            return (Criteria) this;
        }

        public Criteria andFriendUseridLessThanOrEqualTo(Integer value) {
            addCriterion("friend_userid <=", value, "friendUserid");
            return (Criteria) this;
        }

        public Criteria andFriendUseridIn(List<Integer> values) {
            addCriterion("friend_userid in", values, "friendUserid");
            return (Criteria) this;
        }

        public Criteria andFriendUseridNotIn(List<Integer> values) {
            addCriterion("friend_userid not in", values, "friendUserid");
            return (Criteria) this;
        }

        public Criteria andFriendUseridBetween(Integer value1, Integer value2) {
            addCriterion("friend_userid between", value1, value2, "friendUserid");
            return (Criteria) this;
        }

        public Criteria andFriendUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("friend_userid not between", value1, value2, "friendUserid");
            return (Criteria) this;
        }

        public Criteria andFriendGroupIsNull() {
            addCriterion("friend_group is null");
            return (Criteria) this;
        }

        public Criteria andFriendGroupIsNotNull() {
            addCriterion("friend_group is not null");
            return (Criteria) this;
        }

        public Criteria andFriendGroupEqualTo(String value) {
            addCriterion("friend_group =", value, "friendGroup");
            return (Criteria) this;
        }

        public Criteria andFriendGroupNotEqualTo(String value) {
            addCriterion("friend_group <>", value, "friendGroup");
            return (Criteria) this;
        }

        public Criteria andFriendGroupGreaterThan(String value) {
            addCriterion("friend_group >", value, "friendGroup");
            return (Criteria) this;
        }

        public Criteria andFriendGroupGreaterThanOrEqualTo(String value) {
            addCriterion("friend_group >=", value, "friendGroup");
            return (Criteria) this;
        }

        public Criteria andFriendGroupLessThan(String value) {
            addCriterion("friend_group <", value, "friendGroup");
            return (Criteria) this;
        }

        public Criteria andFriendGroupLessThanOrEqualTo(String value) {
            addCriterion("friend_group <=", value, "friendGroup");
            return (Criteria) this;
        }

        public Criteria andFriendGroupLike(String value) {
            addCriterion("friend_group like", value, "friendGroup");
            return (Criteria) this;
        }

        public Criteria andFriendGroupNotLike(String value) {
            addCriterion("friend_group not like", value, "friendGroup");
            return (Criteria) this;
        }

        public Criteria andFriendGroupIn(List<String> values) {
            addCriterion("friend_group in", values, "friendGroup");
            return (Criteria) this;
        }

        public Criteria andFriendGroupNotIn(List<String> values) {
            addCriterion("friend_group not in", values, "friendGroup");
            return (Criteria) this;
        }

        public Criteria andFriendGroupBetween(String value1, String value2) {
            addCriterion("friend_group between", value1, value2, "friendGroup");
            return (Criteria) this;
        }

        public Criteria andFriendGroupNotBetween(String value1, String value2) {
            addCriterion("friend_group not between", value1, value2, "friendGroup");
            return (Criteria) this;
        }

        public Criteria andFriendFriidIsNull() {
            addCriterion("friend_friid is null");
            return (Criteria) this;
        }

        public Criteria andFriendFriidIsNotNull() {
            addCriterion("friend_friid is not null");
            return (Criteria) this;
        }

        public Criteria andFriendFriidEqualTo(Integer value) {
            addCriterion("friend_friid =", value, "friendFriid");
            return (Criteria) this;
        }

        public Criteria andFriendFriidNotEqualTo(Integer value) {
            addCriterion("friend_friid <>", value, "friendFriid");
            return (Criteria) this;
        }

        public Criteria andFriendFriidGreaterThan(Integer value) {
            addCriterion("friend_friid >", value, "friendFriid");
            return (Criteria) this;
        }

        public Criteria andFriendFriidGreaterThanOrEqualTo(Integer value) {
            addCriterion("friend_friid >=", value, "friendFriid");
            return (Criteria) this;
        }

        public Criteria andFriendFriidLessThan(Integer value) {
            addCriterion("friend_friid <", value, "friendFriid");
            return (Criteria) this;
        }

        public Criteria andFriendFriidLessThanOrEqualTo(Integer value) {
            addCriterion("friend_friid <=", value, "friendFriid");
            return (Criteria) this;
        }

        public Criteria andFriendFriidIn(List<Integer> values) {
            addCriterion("friend_friid in", values, "friendFriid");
            return (Criteria) this;
        }

        public Criteria andFriendFriidNotIn(List<Integer> values) {
            addCriterion("friend_friid not in", values, "friendFriid");
            return (Criteria) this;
        }

        public Criteria andFriendFriidBetween(Integer value1, Integer value2) {
            addCriterion("friend_friid between", value1, value2, "friendFriid");
            return (Criteria) this;
        }

        public Criteria andFriendFriidNotBetween(Integer value1, Integer value2) {
            addCriterion("friend_friid not between", value1, value2, "friendFriid");
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