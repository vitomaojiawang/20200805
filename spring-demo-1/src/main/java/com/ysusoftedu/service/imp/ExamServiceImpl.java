package com.ysusoftedu.service.imp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysusoftedu.dao.YsExamDetailMapper;
import com.ysusoftedu.dao.YsPaperMapper;
import com.ysusoftedu.dao.YsPaperQuestionMapper;
import com.ysusoftedu.dao.YsPaperUsergroupMapper;
import com.ysusoftedu.dao.YsQuestionMapper;
import com.ysusoftedu.pojo.YsExamDetail;
import com.ysusoftedu.pojo.YsPaper;
import com.ysusoftedu.pojo.YsPaperQuestion;
import com.ysusoftedu.pojo.YsPaperUsergroup;
import com.ysusoftedu.pojo.YsQuestion;
import com.ysusoftedu.pojo.YsQuestionWithBLOBs;
import com.ysusoftedu.pojo.vo.YsPaperVo;
import com.ysusoftedu.service.IExamService;
import com.ysusoftedu.util.QuestionUtil;
@Service
public class ExamServiceImpl implements IExamService{
	
	@Autowired
	private YsPaperMapper paperMapper;
	@Autowired
	private YsExamDetailMapper examMapper;
	@Autowired
	private YsPaperUsergroupMapper groupMapper;
	@Autowired
	private YsQuestionMapper qMapper;
	@Autowired
	private YsPaperQuestionMapper pqMapper;
	
	

	@Override
	public List<YsPaper> selectPaperByGroupId(int groupId,int userId) {
		// TODO Auto-generated method stub
		return paperMapper.selectPaperByGroupId(groupId,userId);
	}

	@Override
	public YsPaperVo selectPaperById(int id) {
		// TODO Auto-generated method stub
		return paperMapper.selectPaperById(id);
	}

	@Override
	public int subPaper(Map<String, Object> map) {
		int k = 0;
		List<Map<String, Object>> objs = (List<Map<String, Object>>)map.get("questions");
		for (int i = 0; i < objs.size(); i++) {
			YsExamDetail exam = new YsExamDetail();
			exam.setPid(Integer.parseInt(map.get("paperId").toString()));
			exam.setQid(Integer.parseInt((objs.get(i)).get("qid").toString()));
			exam.setQtype(Integer.parseInt((objs.get(i)).get("qtype").toString()));
			exam.setUserAnswer((String)(objs.get(i)).get("ans"));
			exam.setUid((Integer)map.get("userId"));
			k= k + examMapper.insertSelective(exam);
		
		}
		
		
		return k;
	}

	@Override
	public void autoPaperScore() {
		
		//
		Date now = new Date();
		Calendar cal = Calendar.getInstance();//计算时间
		cal.setTime(now);
		cal.add(Calendar.MINUTE, 10);
		Date after = cal.getTime();//获取当前时间10分钟之后的时间
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		paperMapper.autoPaper(sdf.format(now), sdf.format(after));
		
	}

	@Override
	public int insertPaper(Integer adminId, YsPaper paper, Integer[] groupid, String[] questionBb,
			String[] questionType, String[] count, String[] score) {
			
		//插入试卷
		paper.setAdminid(adminId);
		int i = paperMapper.insertSelective(paper);
		//插入试卷和用户组
		for (int j = 0; j < groupid.length; j++) {
			YsPaperUsergroup record = new YsPaperUsergroup();
			record.setPaperid(paper.getPaperId());
			record.setUsergroupid(groupid[j]);
			i = i +groupMapper.insertSelective(record);
		}
		//插入试题
		
		for (int j = 0; j < score.length; j++) {
			//
			List<Integer> list = qMapper.selectQId(questionBb[j], questionType[j]);
			List<Integer> qlist = QuestionUtil.getQuestionId(list, Integer.parseInt(count[j]));
		
			YsPaperQuestion record = new YsPaperQuestion();
			record.setPid(paper.getPaperId());
			record.setScore(Integer.parseInt(score[j]));
			record.setQtypt(Integer.parseInt(questionType[j]));
			record.setDbid(Integer.parseInt(questionBb[j]));
			
			for (int k = 0; k < qlist.size(); k++) {
				record.setYqid(qlist.get(k));
				i = i +pqMapper.insertSelective(record);
			}
			
			
		}
		
		
		return i;
	}

}
