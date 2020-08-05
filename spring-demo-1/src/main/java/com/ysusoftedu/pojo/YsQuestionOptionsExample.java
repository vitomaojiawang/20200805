package com.ysusoftedu.pojo;

import java.util.ArrayList;
import java.util.List;

public class YsQuestionOptionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YsQuestionOptionsExample() {
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

        public Criteria andQuestionOptionIdIsNull() {
            addCriterion("question_option_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdIsNotNull() {
            addCriterion("question_option_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdEqualTo(Integer value) {
            addCriterion("question_option_id =", value, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdNotEqualTo(Integer value) {
            addCriterion("question_option_id <>", value, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdGreaterThan(Integer value) {
            addCriterion("question_option_id >", value, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_option_id >=", value, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdLessThan(Integer value) {
            addCriterion("question_option_id <", value, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_option_id <=", value, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdIn(List<Integer> values) {
            addCriterion("question_option_id in", values, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdNotIn(List<Integer> values) {
            addCriterion("question_option_id not in", values, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdBetween(Integer value1, Integer value2) {
            addCriterion("question_option_id between", value1, value2, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_option_id not between", value1, value2, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andSalisaIsNull() {
            addCriterion("salisa is null");
            return (Criteria) this;
        }

        public Criteria andSalisaIsNotNull() {
            addCriterion("salisa is not null");
            return (Criteria) this;
        }

        public Criteria andSalisaEqualTo(String value) {
            addCriterion("salisa =", value, "salisa");
            return (Criteria) this;
        }

        public Criteria andSalisaNotEqualTo(String value) {
            addCriterion("salisa <>", value, "salisa");
            return (Criteria) this;
        }

        public Criteria andSalisaGreaterThan(String value) {
            addCriterion("salisa >", value, "salisa");
            return (Criteria) this;
        }

        public Criteria andSalisaGreaterThanOrEqualTo(String value) {
            addCriterion("salisa >=", value, "salisa");
            return (Criteria) this;
        }

        public Criteria andSalisaLessThan(String value) {
            addCriterion("salisa <", value, "salisa");
            return (Criteria) this;
        }

        public Criteria andSalisaLessThanOrEqualTo(String value) {
            addCriterion("salisa <=", value, "salisa");
            return (Criteria) this;
        }

        public Criteria andSalisaLike(String value) {
            addCriterion("salisa like", value, "salisa");
            return (Criteria) this;
        }

        public Criteria andSalisaNotLike(String value) {
            addCriterion("salisa not like", value, "salisa");
            return (Criteria) this;
        }

        public Criteria andSalisaIn(List<String> values) {
            addCriterion("salisa in", values, "salisa");
            return (Criteria) this;
        }

        public Criteria andSalisaNotIn(List<String> values) {
            addCriterion("salisa not in", values, "salisa");
            return (Criteria) this;
        }

        public Criteria andSalisaBetween(String value1, String value2) {
            addCriterion("salisa between", value1, value2, "salisa");
            return (Criteria) this;
        }

        public Criteria andSalisaNotBetween(String value1, String value2) {
            addCriterion("salisa not between", value1, value2, "salisa");
            return (Criteria) this;
        }

        public Criteria andQidIsNull() {
            addCriterion("qid is null");
            return (Criteria) this;
        }

        public Criteria andQidIsNotNull() {
            addCriterion("qid is not null");
            return (Criteria) this;
        }

        public Criteria andQidEqualTo(Integer value) {
            addCriterion("qid =", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotEqualTo(Integer value) {
            addCriterion("qid <>", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThan(Integer value) {
            addCriterion("qid >", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThanOrEqualTo(Integer value) {
            addCriterion("qid >=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThan(Integer value) {
            addCriterion("qid <", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThanOrEqualTo(Integer value) {
            addCriterion("qid <=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidIn(List<Integer> values) {
            addCriterion("qid in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotIn(List<Integer> values) {
            addCriterion("qid not in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidBetween(Integer value1, Integer value2) {
            addCriterion("qid between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotBetween(Integer value1, Integer value2) {
            addCriterion("qid not between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andSoptionIsNull() {
            addCriterion("soption is null");
            return (Criteria) this;
        }

        public Criteria andSoptionIsNotNull() {
            addCriterion("soption is not null");
            return (Criteria) this;
        }

        public Criteria andSoptionEqualTo(String value) {
            addCriterion("soption =", value, "soption");
            return (Criteria) this;
        }

        public Criteria andSoptionNotEqualTo(String value) {
            addCriterion("soption <>", value, "soption");
            return (Criteria) this;
        }

        public Criteria andSoptionGreaterThan(String value) {
            addCriterion("soption >", value, "soption");
            return (Criteria) this;
        }

        public Criteria andSoptionGreaterThanOrEqualTo(String value) {
            addCriterion("soption >=", value, "soption");
            return (Criteria) this;
        }

        public Criteria andSoptionLessThan(String value) {
            addCriterion("soption <", value, "soption");
            return (Criteria) this;
        }

        public Criteria andSoptionLessThanOrEqualTo(String value) {
            addCriterion("soption <=", value, "soption");
            return (Criteria) this;
        }

        public Criteria andSoptionLike(String value) {
            addCriterion("soption like", value, "soption");
            return (Criteria) this;
        }

        public Criteria andSoptionNotLike(String value) {
            addCriterion("soption not like", value, "soption");
            return (Criteria) this;
        }

        public Criteria andSoptionIn(List<String> values) {
            addCriterion("soption in", values, "soption");
            return (Criteria) this;
        }

        public Criteria andSoptionNotIn(List<String> values) {
            addCriterion("soption not in", values, "soption");
            return (Criteria) this;
        }

        public Criteria andSoptionBetween(String value1, String value2) {
            addCriterion("soption between", value1, value2, "soption");
            return (Criteria) this;
        }

        public Criteria andSoptionNotBetween(String value1, String value2) {
            addCriterion("soption not between", value1, value2, "soption");
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