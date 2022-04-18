package com.macro.mall.tiny.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class TallyKindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TallyKindExample() {
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

        public Criteria andKindIdIsNull() {
            addCriterion("kind_id is null");
            return (Criteria) this;
        }

        public Criteria andKindIdIsNotNull() {
            addCriterion("kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andKindIdEqualTo(Integer value) {
            addCriterion("kind_id =", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotEqualTo(Integer value) {
            addCriterion("kind_id <>", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThan(Integer value) {
            addCriterion("kind_id >", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kind_id >=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThan(Integer value) {
            addCriterion("kind_id <", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThanOrEqualTo(Integer value) {
            addCriterion("kind_id <=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdIn(List<Integer> values) {
            addCriterion("kind_id in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotIn(List<Integer> values) {
            addCriterion("kind_id not in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdBetween(Integer value1, Integer value2) {
            addCriterion("kind_id between", value1, value2, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kind_id not between", value1, value2, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindNameIsNull() {
            addCriterion("kind_name is null");
            return (Criteria) this;
        }

        public Criteria andKindNameIsNotNull() {
            addCriterion("kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andKindNameEqualTo(String value) {
            addCriterion("kind_name =", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotEqualTo(String value) {
            addCriterion("kind_name <>", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameGreaterThan(String value) {
            addCriterion("kind_name >", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("kind_name >=", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLessThan(String value) {
            addCriterion("kind_name <", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLessThanOrEqualTo(String value) {
            addCriterion("kind_name <=", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLike(String value) {
            addCriterion("kind_name like", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotLike(String value) {
            addCriterion("kind_name not like", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameIn(List<String> values) {
            addCriterion("kind_name in", values, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotIn(List<String> values) {
            addCriterion("kind_name not in", values, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameBetween(String value1, String value2) {
            addCriterion("kind_name between", value1, value2, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotBetween(String value1, String value2) {
            addCriterion("kind_name not between", value1, value2, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindCategoryidIsNull() {
            addCriterion("kind_categoryid is null");
            return (Criteria) this;
        }

        public Criteria andKindCategoryidIsNotNull() {
            addCriterion("kind_categoryid is not null");
            return (Criteria) this;
        }

        public Criteria andKindCategoryidEqualTo(Integer value) {
            addCriterion("kind_categoryid =", value, "kindCategoryid");
            return (Criteria) this;
        }

        public Criteria andKindCategoryidNotEqualTo(Integer value) {
            addCriterion("kind_categoryid <>", value, "kindCategoryid");
            return (Criteria) this;
        }

        public Criteria andKindCategoryidGreaterThan(Integer value) {
            addCriterion("kind_categoryid >", value, "kindCategoryid");
            return (Criteria) this;
        }

        public Criteria andKindCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kind_categoryid >=", value, "kindCategoryid");
            return (Criteria) this;
        }

        public Criteria andKindCategoryidLessThan(Integer value) {
            addCriterion("kind_categoryid <", value, "kindCategoryid");
            return (Criteria) this;
        }

        public Criteria andKindCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("kind_categoryid <=", value, "kindCategoryid");
            return (Criteria) this;
        }

        public Criteria andKindCategoryidIn(List<Integer> values) {
            addCriterion("kind_categoryid in", values, "kindCategoryid");
            return (Criteria) this;
        }

        public Criteria andKindCategoryidNotIn(List<Integer> values) {
            addCriterion("kind_categoryid not in", values, "kindCategoryid");
            return (Criteria) this;
        }

        public Criteria andKindCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("kind_categoryid between", value1, value2, "kindCategoryid");
            return (Criteria) this;
        }

        public Criteria andKindCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("kind_categoryid not between", value1, value2, "kindCategoryid");
            return (Criteria) this;
        }

        public Criteria andKindRemarkIsNull() {
            addCriterion("kind_remark is null");
            return (Criteria) this;
        }

        public Criteria andKindRemarkIsNotNull() {
            addCriterion("kind_remark is not null");
            return (Criteria) this;
        }

        public Criteria andKindRemarkEqualTo(String value) {
            addCriterion("kind_remark =", value, "kindRemark");
            return (Criteria) this;
        }

        public Criteria andKindRemarkNotEqualTo(String value) {
            addCriterion("kind_remark <>", value, "kindRemark");
            return (Criteria) this;
        }

        public Criteria andKindRemarkGreaterThan(String value) {
            addCriterion("kind_remark >", value, "kindRemark");
            return (Criteria) this;
        }

        public Criteria andKindRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("kind_remark >=", value, "kindRemark");
            return (Criteria) this;
        }

        public Criteria andKindRemarkLessThan(String value) {
            addCriterion("kind_remark <", value, "kindRemark");
            return (Criteria) this;
        }

        public Criteria andKindRemarkLessThanOrEqualTo(String value) {
            addCriterion("kind_remark <=", value, "kindRemark");
            return (Criteria) this;
        }

        public Criteria andKindRemarkLike(String value) {
            addCriterion("kind_remark like", value, "kindRemark");
            return (Criteria) this;
        }

        public Criteria andKindRemarkNotLike(String value) {
            addCriterion("kind_remark not like", value, "kindRemark");
            return (Criteria) this;
        }

        public Criteria andKindRemarkIn(List<String> values) {
            addCriterion("kind_remark in", values, "kindRemark");
            return (Criteria) this;
        }

        public Criteria andKindRemarkNotIn(List<String> values) {
            addCriterion("kind_remark not in", values, "kindRemark");
            return (Criteria) this;
        }

        public Criteria andKindRemarkBetween(String value1, String value2) {
            addCriterion("kind_remark between", value1, value2, "kindRemark");
            return (Criteria) this;
        }

        public Criteria andKindRemarkNotBetween(String value1, String value2) {
            addCriterion("kind_remark not between", value1, value2, "kindRemark");
            return (Criteria) this;
        }

        public Criteria andKindSortIsNull() {
            addCriterion("kind_sort is null");
            return (Criteria) this;
        }

        public Criteria andKindSortIsNotNull() {
            addCriterion("kind_sort is not null");
            return (Criteria) this;
        }

        public Criteria andKindSortEqualTo(Integer value) {
            addCriterion("kind_sort =", value, "kindSort");
            return (Criteria) this;
        }

        public Criteria andKindSortNotEqualTo(Integer value) {
            addCriterion("kind_sort <>", value, "kindSort");
            return (Criteria) this;
        }

        public Criteria andKindSortGreaterThan(Integer value) {
            addCriterion("kind_sort >", value, "kindSort");
            return (Criteria) this;
        }

        public Criteria andKindSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("kind_sort >=", value, "kindSort");
            return (Criteria) this;
        }

        public Criteria andKindSortLessThan(Integer value) {
            addCriterion("kind_sort <", value, "kindSort");
            return (Criteria) this;
        }

        public Criteria andKindSortLessThanOrEqualTo(Integer value) {
            addCriterion("kind_sort <=", value, "kindSort");
            return (Criteria) this;
        }

        public Criteria andKindSortIn(List<Integer> values) {
            addCriterion("kind_sort in", values, "kindSort");
            return (Criteria) this;
        }

        public Criteria andKindSortNotIn(List<Integer> values) {
            addCriterion("kind_sort not in", values, "kindSort");
            return (Criteria) this;
        }

        public Criteria andKindSortBetween(Integer value1, Integer value2) {
            addCriterion("kind_sort between", value1, value2, "kindSort");
            return (Criteria) this;
        }

        public Criteria andKindSortNotBetween(Integer value1, Integer value2) {
            addCriterion("kind_sort not between", value1, value2, "kindSort");
            return (Criteria) this;
        }

        public Criteria andKindUseridIsNull() {
            addCriterion("kind_userid is null");
            return (Criteria) this;
        }

        public Criteria andKindUseridIsNotNull() {
            addCriterion("kind_userid is not null");
            return (Criteria) this;
        }

        public Criteria andKindUseridEqualTo(Integer value) {
            addCriterion("kind_userid =", value, "kindUserid");
            return (Criteria) this;
        }

        public Criteria andKindUseridNotEqualTo(Integer value) {
            addCriterion("kind_userid <>", value, "kindUserid");
            return (Criteria) this;
        }

        public Criteria andKindUseridGreaterThan(Integer value) {
            addCriterion("kind_userid >", value, "kindUserid");
            return (Criteria) this;
        }

        public Criteria andKindUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("kind_userid >=", value, "kindUserid");
            return (Criteria) this;
        }

        public Criteria andKindUseridLessThan(Integer value) {
            addCriterion("kind_userid <", value, "kindUserid");
            return (Criteria) this;
        }

        public Criteria andKindUseridLessThanOrEqualTo(Integer value) {
            addCriterion("kind_userid <=", value, "kindUserid");
            return (Criteria) this;
        }

        public Criteria andKindUseridIn(List<Integer> values) {
            addCriterion("kind_userid in", values, "kindUserid");
            return (Criteria) this;
        }

        public Criteria andKindUseridNotIn(List<Integer> values) {
            addCriterion("kind_userid not in", values, "kindUserid");
            return (Criteria) this;
        }

        public Criteria andKindUseridBetween(Integer value1, Integer value2) {
            addCriterion("kind_userid between", value1, value2, "kindUserid");
            return (Criteria) this;
        }

        public Criteria andKindUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("kind_userid not between", value1, value2, "kindUserid");
            return (Criteria) this;
        }

        public Criteria andKindImgIsNull() {
            addCriterion("kind_img is null");
            return (Criteria) this;
        }

        public Criteria andKindImgIsNotNull() {
            addCriterion("kind_img is not null");
            return (Criteria) this;
        }

        public Criteria andKindImgEqualTo(String value) {
            addCriterion("kind_img =", value, "kindImg");
            return (Criteria) this;
        }

        public Criteria andKindImgNotEqualTo(String value) {
            addCriterion("kind_img <>", value, "kindImg");
            return (Criteria) this;
        }

        public Criteria andKindImgGreaterThan(String value) {
            addCriterion("kind_img >", value, "kindImg");
            return (Criteria) this;
        }

        public Criteria andKindImgGreaterThanOrEqualTo(String value) {
            addCriterion("kind_img >=", value, "kindImg");
            return (Criteria) this;
        }

        public Criteria andKindImgLessThan(String value) {
            addCriterion("kind_img <", value, "kindImg");
            return (Criteria) this;
        }

        public Criteria andKindImgLessThanOrEqualTo(String value) {
            addCriterion("kind_img <=", value, "kindImg");
            return (Criteria) this;
        }

        public Criteria andKindImgLike(String value) {
            addCriterion("kind_img like", value, "kindImg");
            return (Criteria) this;
        }

        public Criteria andKindImgNotLike(String value) {
            addCriterion("kind_img not like", value, "kindImg");
            return (Criteria) this;
        }

        public Criteria andKindImgIn(List<String> values) {
            addCriterion("kind_img in", values, "kindImg");
            return (Criteria) this;
        }

        public Criteria andKindImgNotIn(List<String> values) {
            addCriterion("kind_img not in", values, "kindImg");
            return (Criteria) this;
        }

        public Criteria andKindImgBetween(String value1, String value2) {
            addCriterion("kind_img between", value1, value2, "kindImg");
            return (Criteria) this;
        }

        public Criteria andKindImgNotBetween(String value1, String value2) {
            addCriterion("kind_img not between", value1, value2, "kindImg");
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