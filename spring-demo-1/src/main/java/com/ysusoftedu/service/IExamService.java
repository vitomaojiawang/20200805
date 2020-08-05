package com.ysusoftedu.service;

import java.util.List;
import java.util.Map;

import com.ysusoftedu.pojo.YsPaper;
import com.ysusoftedu.pojo.vo.YsPaperVo;

public interface IExamService {
	
	List<YsPaper> selectPaperByGroupId(int groupId,int userId);
	
	YsPaperVo selectPaperById(int id);
	
	
	int subPaper(Map<String, Object> map);
	
	/**
	 * 自动阅卷的方法
	 */
	void autoPaperScore();
	
	
	/**
	 * 创建测试
	 * @param adminId 创建试卷的管理员id
	 * @param paper
	 * @param groupid
	 * @param questionBb
	 * @param questionType
	 * @param count
	 * @param score
	 * @return
	 */
	int insertPaper(Integer adminId,YsPaper paper,Integer [] groupid,String [] questionBb,String []questionType,String []count,String[] score);
}
