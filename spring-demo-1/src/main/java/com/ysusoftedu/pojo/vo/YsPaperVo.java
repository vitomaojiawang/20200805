package com.ysusoftedu.pojo.vo;

import java.util.List;

import com.ysusoftedu.pojo.YsPaper;
import com.ysusoftedu.pojo.YsUser;

public class YsPaperVo extends YsPaper{
	private YsUser user;
	private List<YsCodeVo> codes;
	
	
	public void setUser(YsUser user) {
		this.user = user;
	}
	public YsUser getUser() {
		return this.user ;
	}
	
	public void setCodes(List<YsCodeVo> codes) {
		this.codes = codes;
	}
	
	public List<YsCodeVo> getCodes() {
		return this.codes;
	}	
	
}
