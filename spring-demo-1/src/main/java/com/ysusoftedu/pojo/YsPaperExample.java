package com.ysusoftedu.pojo;

import java.util.ArrayList;
import java.util.List;

public class YsPaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YsPaperExample() {
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

        public Criteria andPaperIdIsNull() {
            addCriterion("paper_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(Integer value) {
            addCriterion("paper_id =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(Integer value) {
            addCriterion("paper_id <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(Integer value) {
            addCriterion("paper_id >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_id >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(Integer value) {
            addCriterion("paper_id <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("paper_id <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<Integer> values) {
            addCriterion("paper_id in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<Integer> values) {
            addCriterion("paper_id not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(Integer value1, Integer value2) {
            addCriterion("paper_id between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_id not between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperNameIsNull() {
            addCriterion("paper_name is null");
            return (Criteria) this;
        }

        public Criteria andPaperNameIsNotNull() {
            addCriterion("paper_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaperNameEqualTo(String value) {
            addCriterion("paper_name =", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotEqualTo(String value) {
            addCriterion("paper_name <>", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThan(String value) {
            addCriterion("paper_name >", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThanOrEqualTo(String value) {
            addCriterion("paper_name >=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThan(String value) {
            addCriterion("paper_name <", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThanOrEqualTo(String value) {
            addCriterion("paper_name <=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLike(String value) {
            addCriterion("paper_name like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotLike(String value) {
            addCriterion("paper_name not like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameIn(List<String> values) {
            addCriterion("paper_name in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotIn(List<String> values) {
            addCriterion("paper_name not in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameBetween(String value1, String value2) {
            addCriterion("paper_name between", value1, value2, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotBetween(String value1, String value2) {
            addCriterion("paper_name not between", value1, value2, "paperName");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNull() {
            addCriterion("adminid is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("adminid is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(Integer value) {
            addCriterion("adminid =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Integer value) {
            addCriterion("adminid <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Integer value) {
            addCriterion("adminid >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminid >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Integer value) {
            addCriterion("adminid <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("adminid <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Integer> values) {
            addCriterion("adminid in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Integer> values) {
            addCriterion("adminid not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Integer value1, Integer value2) {
            addCriterion("adminid between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("adminid not between", value1, value2, "adminid");
            return (Criteria) this;
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

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("starttime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("starttime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("endtime like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("endtime not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andPaperMinuteIsNull() {
            addCriterion("paper_minute is null");
            return (Criteria) this;
        }

        public Criteria andPaperMinuteIsNotNull() {
            addCriterion("paper_minute is not null");
            return (Criteria) this;
        }

        public Criteria andPaperMinuteEqualTo(Integer value) {
            addCriterion("paper_minute =", value, "paperMinute");
            return (Criteria) this;
        }

        public Criteria andPaperMinuteNotEqualTo(Integer value) {
            addCriterion("paper_minute <>", value, "paperMinute");
            return (Criteria) this;
        }

        public Criteria andPaperMinuteGreaterThan(Integer value) {
            addCriterion("paper_minute >", value, "paperMinute");
            return (Criteria) this;
        }

        public Criteria andPaperMinuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_minute >=", value, "paperMinute");
            return (Criteria) this;
        }

        public Criteria andPaperMinuteLessThan(Integer value) {
            addCriterion("paper_minute <", value, "paperMinute");
            return (Criteria) this;
        }

        public Criteria andPaperMinuteLessThanOrEqualTo(Integer value) {
            addCriterion("paper_minute <=", value, "paperMinute");
            return (Criteria) this;
        }

        public Criteria andPaperMinuteIn(List<Integer> values) {
            addCriterion("paper_minute in", values, "paperMinute");
            return (Criteria) this;
        }

        public Criteria andPaperMinuteNotIn(List<Integer> values) {
            addCriterion("paper_minute not in", values, "paperMinute");
            return (Criteria) this;
        }

        public Criteria andPaperMinuteBetween(Integer value1, Integer value2) {
            addCriterion("paper_minute between", value1, value2, "paperMinute");
            return (Criteria) this;
        }

        public Criteria andPaperMinuteNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_minute not between", value1, value2, "paperMinute");
            return (Criteria) this;
        }

        public Criteria andShowScoretimeIsNull() {
            addCriterion("show_scoretime is null");
            return (Criteria) this;
        }

        public Criteria andShowScoretimeIsNotNull() {
            addCriterion("show_scoretime is not null");
            return (Criteria) this;
        }

        public Criteria andShowScoretimeEqualTo(String value) {
            addCriterion("show_scoretime =", value, "showScoretime");
            return (Criteria) this;
        }

        public Criteria andShowScoretimeNotEqualTo(String value) {
            addCriterion("show_scoretime <>", value, "showScoretime");
            return (Criteria) this;
        }

        public Criteria andShowScoretimeGreaterThan(String value) {
            addCriterion("show_scoretime >", value, "showScoretime");
            return (Criteria) this;
        }

        public Criteria andShowScoretimeGreaterThanOrEqualTo(String value) {
            addCriterion("show_scoretime >=", value, "showScoretime");
            return (Criteria) this;
        }

        public Criteria andShowScoretimeLessThan(String value) {
            addCriterion("show_scoretime <", value, "showScoretime");
            return (Criteria) this;
        }

        public Criteria andShowScoretimeLessThanOrEqualTo(String value) {
            addCriterion("show_scoretime <=", value, "showScoretime");
            return (Criteria) this;
        }

        public Criteria andShowScoretimeLike(String value) {
            addCriterion("show_scoretime like", value, "showScoretime");
            return (Criteria) this;
        }

        public Criteria andShowScoretimeNotLike(String value) {
            addCriterion("show_scoretime not like", value, "showScoretime");
            return (Criteria) this;
        }

        public Criteria andShowScoretimeIn(List<String> values) {
            addCriterion("show_scoretime in", values, "showScoretime");
            return (Criteria) this;
        }

        public Criteria andShowScoretimeNotIn(List<String> values) {
            addCriterion("show_scoretime not in", values, "showScoretime");
            return (Criteria) this;
        }

        public Criteria andShowScoretimeBetween(String value1, String value2) {
            addCriterion("show_scoretime between", value1, value2, "showScoretime");
            return (Criteria) this;
        }

        public Criteria andShowScoretimeNotBetween(String value1, String value2) {
            addCriterion("show_scoretime not between", value1, value2, "showScoretime");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNull() {
            addCriterion("total_score is null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNotNull() {
            addCriterion("total_score is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreEqualTo(Integer value) {
            addCriterion("total_score =", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotEqualTo(Integer value) {
            addCriterion("total_score <>", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThan(Integer value) {
            addCriterion("total_score >", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_score >=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThan(Integer value) {
            addCriterion("total_score <", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThanOrEqualTo(Integer value) {
            addCriterion("total_score <=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIn(List<Integer> values) {
            addCriterion("total_score in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotIn(List<Integer> values) {
            addCriterion("total_score not in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreBetween(Integer value1, Integer value2) {
            addCriterion("total_score between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("total_score not between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andQorderIsNull() {
            addCriterion("qorder is null");
            return (Criteria) this;
        }

        public Criteria andQorderIsNotNull() {
            addCriterion("qorder is not null");
            return (Criteria) this;
        }

        public Criteria andQorderEqualTo(String value) {
            addCriterion("qorder =", value, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderNotEqualTo(String value) {
            addCriterion("qorder <>", value, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderGreaterThan(String value) {
            addCriterion("qorder >", value, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderGreaterThanOrEqualTo(String value) {
            addCriterion("qorder >=", value, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderLessThan(String value) {
            addCriterion("qorder <", value, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderLessThanOrEqualTo(String value) {
            addCriterion("qorder <=", value, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderLike(String value) {
            addCriterion("qorder like", value, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderNotLike(String value) {
            addCriterion("qorder not like", value, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderIn(List<String> values) {
            addCriterion("qorder in", values, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderNotIn(List<String> values) {
            addCriterion("qorder not in", values, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderBetween(String value1, String value2) {
            addCriterion("qorder between", value1, value2, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderNotBetween(String value1, String value2) {
            addCriterion("qorder not between", value1, value2, "qorder");
            return (Criteria) this;
        }

        public Criteria andPostdateIsNull() {
            addCriterion("postdate is null");
            return (Criteria) this;
        }

        public Criteria andPostdateIsNotNull() {
            addCriterion("postdate is not null");
            return (Criteria) this;
        }

        public Criteria andPostdateEqualTo(String value) {
            addCriterion("postdate =", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotEqualTo(String value) {
            addCriterion("postdate <>", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateGreaterThan(String value) {
            addCriterion("postdate >", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateGreaterThanOrEqualTo(String value) {
            addCriterion("postdate >=", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateLessThan(String value) {
            addCriterion("postdate <", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateLessThanOrEqualTo(String value) {
            addCriterion("postdate <=", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateLike(String value) {
            addCriterion("postdate like", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotLike(String value) {
            addCriterion("postdate not like", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateIn(List<String> values) {
            addCriterion("postdate in", values, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotIn(List<String> values) {
            addCriterion("postdate not in", values, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateBetween(String value1, String value2) {
            addCriterion("postdate between", value1, value2, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotBetween(String value1, String value2) {
            addCriterion("postdate not between", value1, value2, "postdate");
            return (Criteria) this;
        }

        public Criteria andPaperStatusIsNull() {
            addCriterion("paper_status is null");
            return (Criteria) this;
        }

        public Criteria andPaperStatusIsNotNull() {
            addCriterion("paper_status is not null");
            return (Criteria) this;
        }

        public Criteria andPaperStatusEqualTo(String value) {
            addCriterion("paper_status =", value, "paperStatus");
            return (Criteria) this;
        }

        public Criteria andPaperStatusNotEqualTo(String value) {
            addCriterion("paper_status <>", value, "paperStatus");
            return (Criteria) this;
        }

        public Criteria andPaperStatusGreaterThan(String value) {
            addCriterion("paper_status >", value, "paperStatus");
            return (Criteria) this;
        }

        public Criteria andPaperStatusGreaterThanOrEqualTo(String value) {
            addCriterion("paper_status >=", value, "paperStatus");
            return (Criteria) this;
        }

        public Criteria andPaperStatusLessThan(String value) {
            addCriterion("paper_status <", value, "paperStatus");
            return (Criteria) this;
        }

        public Criteria andPaperStatusLessThanOrEqualTo(String value) {
            addCriterion("paper_status <=", value, "paperStatus");
            return (Criteria) this;
        }

        public Criteria andPaperStatusLike(String value) {
            addCriterion("paper_status like", value, "paperStatus");
            return (Criteria) this;
        }

        public Criteria andPaperStatusNotLike(String value) {
            addCriterion("paper_status not like", value, "paperStatus");
            return (Criteria) this;
        }

        public Criteria andPaperStatusIn(List<String> values) {
            addCriterion("paper_status in", values, "paperStatus");
            return (Criteria) this;
        }

        public Criteria andPaperStatusNotIn(List<String> values) {
            addCriterion("paper_status not in", values, "paperStatus");
            return (Criteria) this;
        }

        public Criteria andPaperStatusBetween(String value1, String value2) {
            addCriterion("paper_status between", value1, value2, "paperStatus");
            return (Criteria) this;
        }

        public Criteria andPaperStatusNotBetween(String value1, String value2) {
            addCriterion("paper_status not between", value1, value2, "paperStatus");
            return (Criteria) this;
        }

        public Criteria andPaperStateIsNull() {
            addCriterion("paper_state is null");
            return (Criteria) this;
        }

        public Criteria andPaperStateIsNotNull() {
            addCriterion("paper_state is not null");
            return (Criteria) this;
        }

        public Criteria andPaperStateEqualTo(String value) {
            addCriterion("paper_state =", value, "paperState");
            return (Criteria) this;
        }

        public Criteria andPaperStateNotEqualTo(String value) {
            addCriterion("paper_state <>", value, "paperState");
            return (Criteria) this;
        }

        public Criteria andPaperStateGreaterThan(String value) {
            addCriterion("paper_state >", value, "paperState");
            return (Criteria) this;
        }

        public Criteria andPaperStateGreaterThanOrEqualTo(String value) {
            addCriterion("paper_state >=", value, "paperState");
            return (Criteria) this;
        }

        public Criteria andPaperStateLessThan(String value) {
            addCriterion("paper_state <", value, "paperState");
            return (Criteria) this;
        }

        public Criteria andPaperStateLessThanOrEqualTo(String value) {
            addCriterion("paper_state <=", value, "paperState");
            return (Criteria) this;
        }

        public Criteria andPaperStateLike(String value) {
            addCriterion("paper_state like", value, "paperState");
            return (Criteria) this;
        }

        public Criteria andPaperStateNotLike(String value) {
            addCriterion("paper_state not like", value, "paperState");
            return (Criteria) this;
        }

        public Criteria andPaperStateIn(List<String> values) {
            addCriterion("paper_state in", values, "paperState");
            return (Criteria) this;
        }

        public Criteria andPaperStateNotIn(List<String> values) {
            addCriterion("paper_state not in", values, "paperState");
            return (Criteria) this;
        }

        public Criteria andPaperStateBetween(String value1, String value2) {
            addCriterion("paper_state between", value1, value2, "paperState");
            return (Criteria) this;
        }

        public Criteria andPaperStateNotBetween(String value1, String value2) {
            addCriterion("paper_state not between", value1, value2, "paperState");
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