package com.ysusoftedu.pojo;

public class YsPaperQuestion {
    private Integer pid;

    private Integer dbid;

    private Integer qtypt;

    private Integer yqid;

    private Integer score;

    private Integer orderid;

    private String qnum;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getDbid() {
        return dbid;
    }

    public void setDbid(Integer dbid) {
        this.dbid = dbid;
    }

    public Integer getQtypt() {
        return qtypt;
    }

    public void setQtypt(Integer qtypt) {
        this.qtypt = qtypt;
    }

    public Integer getYqid() {
        return yqid;
    }

    public void setYqid(Integer yqid) {
        this.yqid = yqid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getQnum() {
        return qnum;
    }

    public void setQnum(String qnum) {
        this.qnum = qnum == null ? null : qnum.trim();
    }
}