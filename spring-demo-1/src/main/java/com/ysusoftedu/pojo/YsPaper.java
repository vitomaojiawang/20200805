package com.ysusoftedu.pojo;

public class YsPaper {
    private Integer paperId;

    private String paperName;

    private Integer adminid;

    private Integer status;

    private String starttime;

    private String endtime;

    private Integer paperMinute;

    private String showScoretime;

    private Integer totalScore;

    private String remark;

    private String qorder;

    private String postdate;

    private String paperStatus;

    private String paperState;

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName == null ? null : paperName.trim();
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public Integer getPaperMinute() {
        return paperMinute;
    }

    public void setPaperMinute(Integer paperMinute) {
        this.paperMinute = paperMinute;
    }

    public String getShowScoretime() {
        return showScoretime;
    }

    public void setShowScoretime(String showScoretime) {
        this.showScoretime = showScoretime == null ? null : showScoretime.trim();
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getQorder() {
        return qorder;
    }

    public void setQorder(String qorder) {
        this.qorder = qorder == null ? null : qorder.trim();
    }

    public String getPostdate() {
        return postdate;
    }

    public void setPostdate(String postdate) {
        this.postdate = postdate == null ? null : postdate.trim();
    }

    public String getPaperStatus() {
        return paperStatus;
    }

    public void setPaperStatus(String paperStatus) {
        this.paperStatus = paperStatus == null ? null : paperStatus.trim();
    }

    public String getPaperState() {
        return paperState;
    }

    public void setPaperState(String paperState) {
        this.paperState = paperState == null ? null : paperState.trim();
    }
}