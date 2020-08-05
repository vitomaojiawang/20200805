package com.ysusoftedu.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ysusoftedu.pojo.vo.YsCodeVo;
import com.ysusoftedu.pojo.vo.YsPaperVo;
import com.ysusoftedu.pojo.vo.YsQuestionVo;

public class QuestionUtil {
	
	
	public static YsPaperVo  randomQuestion(YsPaperVo paper) {
		
		//随机顺序
		if("1".equals(paper.getQorder())) {
			
			List<YsCodeVo> codes = paper.getCodes();
			
			for (int i = 0; i < codes.size(); i++) {
				
				List<YsQuestionVo> list = codes.get(i).getQuestions();
				Collections.shuffle(list);
				
				codes.get(i).setQuestions(list);
				
			}
			
			paper.setCodes(codes);
		}
		
		return paper;
	}

	
	public static List<Integer> getQuestionId(List<Integer> list,int count) {
		List<Integer> qList = new ArrayList<Integer>();
		if(list.size()<=count) {
			return list;
		}else {
			
			for (int i = 0; i < count; i++) {
				int idx = (int)(System.currentTimeMillis()%list.size());
				qList.add(list.remove(idx));
				
			}
			
			
			return qList;
		}
		
		
		
		
	}
	
	
}
