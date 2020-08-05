package com.ysusoftedu.pojo;

import java.util.ArrayList;
import java.util.List;

public class YsCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YsCodeExample() {
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusnameIsNull() {
            addCriterion("statusName is null");
            return (Criteria) this;
        }

        public Criteria andStatusnameIsNotNull() {
            addCriterion("statusName is not null");
            return (Criteria) this;
        }

        public Criteria andStatusnameEqualTo(String value) {
            addCriterion("statusName =", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotEqualTo(String value) {
            addCriterion("statusName <>", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameGreaterThan(String value) {
            addCriterion("statusName >", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameGreaterThanOrEqualTo(String value) {
            addCriterion("statusName >=", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLessThan(String value) {
            addCriterion("statusName <", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLessThanOrEqualTo(String value) {
            addCriterion("statusName <=", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLike(String value) {
            addCriterion("statusName like", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotLike(String value) {
            addCriterion("statusName not like", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameIn(List<String> values) {
            addCriterion("statusName in", values, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotIn(List<String> values) {
            addCriterion("statusName not in", values, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameBetween(String value1, String value2) {
            addCriterion("statusName between", value1, value2, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotBetween(String value1, String value2) {
            addCriterion("statusName not between", value1, value2, "statusname");
            return (Criteria) this;
        }

        public Criteria andQtypeIsNull() {
            addCriterion("qtype is null");
            return (Criteria) this;
        }

        public Criteria andQtypeIsNotNull() {
            addCriterion("qtype is not null");
            return (Criteria) this;
        }

        public Criteria andQtypeEqualTo(Integer value) {
            addCriterion("qtype =", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotEqualTo(Integer value) {
            addCriterion("qtype <>", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeGreaterThan(Integer value) {
            addCriterion("qtype >", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("qtype >=", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeLessThan(Integer value) {
            addCriterion("qtype <", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeLessThanOrEqualTo(Integer value) {
            addCriterion("qtype <=", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeIn(List<Integer> values) {
            addCriterion("qtype in", values, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotIn(List<Integer> values) {
            addCriterion("qtype not in", values, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeBetween(Integer value1, Integer value2) {
            addCriterion("qtype between", value1, value2, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("qtype not between", value1, value2, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypenameIsNull() {
            addCriterion("qtypeName is null");
            return (Criteria) this;
        }

        public Criteria andQtypenameIsNotNull() {
            addCriterion("qtypeName is not null");
            return (Criteria) this;
        }

        public Criteria andQtypenameEqualTo(String value) {
            addCriterion("qtypeName =", value, "qtypename");
            return (Criteria) this;
        }

        public Criteria andQtypenameNotEqualTo(String value) {
            addCriterion("qtypeName <>", value, "qtypename");
            return (Criteria) this;
        }

        public Criteria andQtypenameGreaterThan(String value) {
            addCriterion("qtypeName >", value, "qtypename");
            return (Criteria) this;
        }

        public Criteria andQtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("qtypeName >=", value, "qtypename");
            return (Criteria) this;
        }

        public Criteria andQtypenameLessThan(String value) {
            addCriterion("qtypeName <", value, "qtypename");
            return (Criteria) this;
        }

        public Criteria andQtypenameLessThanOrEqualTo(String value) {
            addCriterion("qtypeName <=", value, "qtypename");
            return (Criteria) this;
        }

        public Criteria andQtypenameLike(String value) {
            addCriterion("qtypeName like", value, "qtypename");
            return (Criteria) this;
        }

        public Criteria andQtypenameNotLike(String value) {
            addCriterion("qtypeName not like", value, "qtypename");
            return (Criteria) this;
        }

        public Criteria andQtypenameIn(List<String> values) {
            addCriterion("qtypeName in", values, "qtypename");
            return (Criteria) this;
        }

        public Criteria andQtypenameNotIn(List<String> values) {
            addCriterion("qtypeName not in", values, "qtypename");
            return (Criteria) this;
        }

        public Criteria andQtypenameBetween(String value1, String value2) {
            addCriterion("qtypeName between", value1, value2, "qtypename");
            return (Criteria) this;
        }

        public Criteria andQtypenameNotBetween(String value1, String value2) {
            addCriterion("qtypeName not between", value1, value2, "qtypename");
            return (Criteria) this;
        }

        public Criteria andExamstatusIsNull() {
            addCriterion("examStatus is null");
            return (Criteria) this;
        }

        public Criteria andExamstatusIsNotNull() {
            addCriterion("examStatus is not null");
            return (Criteria) this;
        }

        public Criteria andExamstatusEqualTo(Integer value) {
            addCriterion("examStatus =", value, "examstatus");
            return (Criteria) this;
        }

        public Criteria andExamstatusNotEqualTo(Integer value) {
            addCriterion("examStatus <>", value, "examstatus");
            return (Criteria) this;
        }

        public Criteria andExamstatusGreaterThan(Integer value) {
            addCriterion("examStatus >", value, "examstatus");
            return (Criteria) this;
        }

        public Criteria andExamstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("examStatus >=", value, "examstatus");
            return (Criteria) this;
        }

        public Criteria andExamstatusLessThan(Integer value) {
            addCriterion("examStatus <", value, "examstatus");
            return (Criteria) this;
        }

        public Criteria andExamstatusLessThanOrEqualTo(Integer value) {
            addCriterion("examStatus <=", value, "examstatus");
            return (Criteria) this;
        }

        public Criteria andExamstatusIn(List<Integer> values) {
            addCriterion("examStatus in", values, "examstatus");
            return (Criteria) this;
        }

        public Criteria andExamstatusNotIn(List<Integer> values) {
            addCriterion("examStatus not in", values, "examstatus");
            return (Criteria) this;
        }

        public Criteria andExamstatusBetween(Integer value1, Integer value2) {
            addCriterion("examStatus between", value1, value2, "examstatus");
            return (Criteria) this;
        }

        public Criteria andExamstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("examStatus not between", value1, value2, "examstatus");
            return (Criteria) this;
        }

        public Criteria andExamstaunameIsNull() {
            addCriterion("examStauName is null");
            return (Criteria) this;
        }

        public Criteria andExamstaunameIsNotNull() {
            addCriterion("examStauName is not null");
            return (Criteria) this;
        }

        public Criteria andExamstaunameEqualTo(String value) {
            addCriterion("examStauName =", value, "examstauname");
            return (Criteria) this;
        }

        public Criteria andExamstaunameNotEqualTo(String value) {
            addCriterion("examStauName <>", value, "examstauname");
            return (Criteria) this;
        }

        public Criteria andExamstaunameGreaterThan(String value) {
            addCriterion("examStauName >", value, "examstauname");
            return (Criteria) this;
        }

        public Criteria andExamstaunameGreaterThanOrEqualTo(String value) {
            addCriterion("examStauName >=", value, "examstauname");
            return (Criteria) this;
        }

        public Criteria andExamstaunameLessThan(String value) {
            addCriterion("examStauName <", value, "examstauname");
            return (Criteria) this;
        }

        public Criteria andExamstaunameLessThanOrEqualTo(String value) {
            addCriterion("examStauName <=", value, "examstauname");
            return (Criteria) this;
        }

        public Criteria andExamstaunameLike(String value) {
            addCriterion("examStauName like", value, "examstauname");
            return (Criteria) this;
        }

        public Criteria andExamstaunameNotLike(String value) {
            addCriterion("examStauName not like", value, "examstauname");
            return (Criteria) this;
        }

        public Criteria andExamstaunameIn(List<String> values) {
            addCriterion("examStauName in", values, "examstauname");
            return (Criteria) this;
        }

        public Criteria andExamstaunameNotIn(List<String> values) {
            addCriterion("examStauName not in", values, "examstauname");
            return (Criteria) this;
        }

        public Criteria andExamstaunameBetween(String value1, String value2) {
            addCriterion("examStauName between", value1, value2, "examstauname");
            return (Criteria) this;
        }

        public Criteria andExamstaunameNotBetween(String value1, String value2) {
            addCriterion("examStauName not between", value1, value2, "examstauname");
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