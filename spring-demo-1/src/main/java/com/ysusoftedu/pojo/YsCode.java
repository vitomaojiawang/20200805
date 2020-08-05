package com.ysusoftedu.pojo;

public class YsCode {
    private Integer status;

    private String statusname;

    private Integer qtype;

    private String qtypename;

    private Integer examstatus;

    private String examstauname;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname == null ? null : statusname.trim();
    }

    public Integer getQtype() {
        return qtype;
    }

    public void setQtype(Integer qtype) {
        this.qtype = qtype;
    }

    public String getQtypename() {
        return qtypename;
    }

    public void setQtypename(String qtypename) {
        this.qtypename = qtypename == null ? null : qtypename.trim();
    }

    public Integer getExamstatus() {
        return examstatus;
    }

    public void setExamstatus(Integer examstatus) {
        this.examstatus = examstatus;
    }

    public String getExamstauname() {
        return examstauname;
    }

    public void setExamstauname(String examstauname) {
        this.examstauname = examstauname == null ? null : examstauname.trim();
    }
}