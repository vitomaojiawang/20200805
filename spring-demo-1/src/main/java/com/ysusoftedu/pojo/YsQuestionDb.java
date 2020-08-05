package com.ysusoftedu.pojo;

public class YsQuestionDb {
    private Integer questionDbId;

    private String dname;

    private String remark;

    private Integer adminid;

    private String status;

    private Integer states;

    public Integer getQuestionDbId() {
        return questionDbId;
    }

    public void setQuestionDbId(Integer questionDbId) {
        this.questionDbId = questionDbId;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }
}