package com.ysusoftedu.pojo;

import java.util.ArrayList;
import java.util.List;

public class YsPaperQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YsPaperQuestionExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andDbidIsNull() {
            addCriterion("dbid is null");
            return (Criteria) this;
        }

        public Criteria andDbidIsNotNull() {
            addCriterion("dbid is not null");
            return (Criteria) this;
        }

        public Criteria andDbidEqualTo(Integer value) {
            addCriterion("dbid =", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidNotEqualTo(Integer value) {
            addCriterion("dbid <>", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidGreaterThan(Integer value) {
            addCriterion("dbid >", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dbid >=", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidLessThan(Integer value) {
            addCriterion("dbid <", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidLessThanOrEqualTo(Integer value) {
            addCriterion("dbid <=", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidIn(List<Integer> values) {
            addCriterion("dbid in", values, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidNotIn(List<Integer> values) {
            addCriterion("dbid not in", values, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidBetween(Integer value1, Integer value2) {
            addCriterion("dbid between", value1, value2, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidNotBetween(Integer value1, Integer value2) {
            addCriterion("dbid not between", value1, value2, "dbid");
            return (Criteria) this;
        }

        public Criteria andQtyptIsNull() {
            addCriterion("qtypt is null");
            return (Criteria) this;
        }

        public Criteria andQtyptIsNotNull() {
            addCriterion("qtypt is not null");
            return (Criteria) this;
        }

        public Criteria andQtyptEqualTo(Integer value) {
            addCriterion("qtypt =", value, "qtypt");
            return (Criteria) this;
        }

        public Criteria andQtyptNotEqualTo(Integer value) {
            addCriterion("qtypt <>", value, "qtypt");
            return (Criteria) this;
        }

        public Criteria andQtyptGreaterThan(Integer value) {
            addCriterion("qtypt >", value, "qtypt");
            return (Criteria) this;
        }

        public Criteria andQtyptGreaterThanOrEqualTo(Integer value) {
            addCriterion("qtypt >=", value, "qtypt");
            return (Criteria) this;
        }

        public Criteria andQtyptLessThan(Integer value) {
            addCriterion("qtypt <", value, "qtypt");
            return (Criteria) this;
        }

        public Criteria andQtyptLessThanOrEqualTo(Integer value) {
            addCriterion("qtypt <=", value, "qtypt");
            return (Criteria) this;
        }

        public Criteria andQtyptIn(List<Integer> values) {
            addCriterion("qtypt in", values, "qtypt");
            return (Criteria) this;
        }

        public Criteria andQtyptNotIn(List<Integer> values) {
            addCriterion("qtypt not in", values, "qtypt");
            return (Criteria) this;
        }

        public Criteria andQtyptBetween(Integer value1, Integer value2) {
            addCriterion("qtypt between", value1, value2, "qtypt");
            return (Criteria) this;
        }

        public Criteria andQtyptNotBetween(Integer value1, Integer value2) {
            addCriterion("qtypt not between", value1, value2, "qtypt");
            return (Criteria) this;
        }

        public Criteria andYqidIsNull() {
            addCriterion("yqid is null");
            return (Criteria) this;
        }

        public Criteria andYqidIsNotNull() {
            addCriterion("yqid is not null");
            return (Criteria) this;
        }

        public Criteria andYqidEqualTo(Integer value) {
            addCriterion("yqid =", value, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidNotEqualTo(Integer value) {
            addCriterion("yqid <>", value, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidGreaterThan(Integer value) {
            addCriterion("yqid >", value, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yqid >=", value, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidLessThan(Integer value) {
            addCriterion("yqid <", value, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidLessThanOrEqualTo(Integer value) {
            addCriterion("yqid <=", value, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidIn(List<Integer> values) {
            addCriterion("yqid in", values, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidNotIn(List<Integer> values) {
            addCriterion("yqid not in", values, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidBetween(Integer value1, Integer value2) {
            addCriterion("yqid between", value1, value2, "yqid");
            return (Criteria) this;
        }

        public Criteria andYqidNotBetween(Integer value1, Integer value2) {
            addCriterion("yqid not between", value1, value2, "yqid");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andQnumIsNull() {
            addCriterion("qnum is null");
            return (Criteria) this;
        }

        public Criteria andQnumIsNotNull() {
            addCriterion("qnum is not null");
            return (Criteria) this;
        }

        public Criteria andQnumEqualTo(String value) {
            addCriterion("qnum =", value, "qnum");
            return (Criteria) this;
        }

        public Criteria andQnumNotEqualTo(String value) {
            addCriterion("qnum <>", value, "qnum");
            return (Criteria) this;
        }

        public Criteria andQnumGreaterThan(String value) {
            addCriterion("qnum >", value, "qnum");
            return (Criteria) this;
        }

        public Criteria andQnumGreaterThanOrEqualTo(String value) {
            addCriterion("qnum >=", value, "qnum");
            return (Criteria) this;
        }

        public Criteria andQnumLessThan(String value) {
            addCriterion("qnum <", value, "qnum");
            return (Criteria) this;
        }

        public Criteria andQnumLessThanOrEqualTo(String value) {
            addCriterion("qnum <=", value, "qnum");
            return (Criteria) this;
        }

        public Criteria andQnumLike(String value) {
            addCriterion("qnum like", value, "qnum");
            return (Criteria) this;
        }

        public Criteria andQnumNotLike(String value) {
            addCriterion("qnum not like", value, "qnum");
            return (Criteria) this;
        }

        public Criteria andQnumIn(List<String> values) {
            addCriterion("qnum in", values, "qnum");
            return (Criteria) this;
        }

        public Criteria andQnumNotIn(List<String> values) {
            addCriterion("qnum not in", values, "qnum");
            return (Criteria) this;
        }

        public Criteria andQnumBetween(String value1, String value2) {
            addCriterion("qnum between", value1, value2, "qnum");
            return (Criteria) this;
        }

        public Criteria andQnumNotBetween(String value1, String value2) {
            addCriterion("qnum not between", value1, value2, "qnum");
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