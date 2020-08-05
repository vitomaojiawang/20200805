package com.ysusoftedu.controller;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ysusoftedu.pojo.YsPaper;
import com.ysusoftedu.service.IExamService;

@Controller
@RequestMapping("/admin/exam")
public class AdminExamController {
	
	@Resource
	private IExamService examService;
	
	@RequestMapping("/createPaper.do")
	public String createPaper(YsPaper paper,Integer [] groupid,String [] questionBb,String []questionType,String []count,String[] score) {

		int i =examService.insertPaper(null,paper,groupid,questionBb,questionType,count,score);
		
		return "admin/exam/createPaper";
	}

}
