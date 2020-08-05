package com.ysusoftedu.pojo;

public class YsQuestionOptions {
    private Integer questionOptionId;

    private String salisa;

    private Integer qid;

    private String soption;

    public Integer getQuestionOptionId() {
        return questionOptionId;
    }

    public void setQuestionOptionId(Integer questionOptionId) {
        this.questionOptionId = questionOptionId;
    }

    public String getSalisa() {
        return salisa;
    }

    public void setSalisa(String salisa) {
        this.salisa = salisa == null ? null : salisa.trim();
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getSoption() {
        return soption;
    }

    public void setSoption(String soption) {
        this.soption = soption == null ? null : soption.trim();
    }
}