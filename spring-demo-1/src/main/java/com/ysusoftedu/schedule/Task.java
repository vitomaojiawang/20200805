package com.ysusoftedu.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ysusoftedu.service.IExamService;

@Component
public class Task {

	@Autowired
	private IExamService examService;
	
	//@Scheduled(cron="0 0/10 * * * ?")
	@Scheduled(cron="*/10 * * * * *")
	public void pageScore() {
		//
	//	examService.autoPaperScore();
	}
	
	
}
