package com.ysusoftedu.pojo.vo;

import java.util.List;

import com.ysusoftedu.pojo.YsCode;

public class YsCodeVo extends YsCode{

	private List<YsQuestionVo> questions;
	
	public void setQuestions(List<YsQuestionVo> questions) {
		this.questions = questions;
		
	}
	
	public List<YsQuestionVo> getQuestions() {
		return this.questions;
		
	}
}
