package com.ysusoftedu.pojo.vo;

import java.util.List;

import com.ysusoftedu.pojo.YsQuestion;
import com.ysusoftedu.pojo.YsQuestionOptions;
import com.ysusoftedu.pojo.YsQuestionWithBLOBs;

public class YsQuestionVo extends YsQuestionWithBLOBs{

	private List<YsQuestionOptions> options;
	
	public void setOptions(List<YsQuestionOptions> options) {
		this.options = options;
	}
	public List<YsQuestionOptions> getOptions() {
		return this.options;
	}
	
}
