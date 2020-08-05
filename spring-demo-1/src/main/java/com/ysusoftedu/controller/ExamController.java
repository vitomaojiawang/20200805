package com.ysusoftedu.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ysusoftedu.pojo.YsPaper;
import com.ysusoftedu.pojo.YsUser;
import com.ysusoftedu.pojo.vo.YsPaperVo;
import com.ysusoftedu.service.IExamService;
import com.ysusoftedu.util.JsonResult;
import com.ysusoftedu.util.QuestionUtil;

@Controller
@RequestMapping("/user/exam")
public class ExamController {

	@Autowired
	private IExamService examService;
	
	
	/**
	 * @return
	 */
	@RequestMapping("/examlist.do")
	public String examlist(HttpSession session,Model model) {
		YsUser user = (YsUser)session.getAttribute("user");
		List<YsPaper> papers =examService.selectPaperByGroupId(user.getGid(),user.getUserId());
		model.addAttribute("papers", papers);
		return "user/exam/examPage";
	}
	
	@RequestMapping("/examDetail.do")
	public String examDetail(Integer id,HttpSession session,Model model) {
		YsUser user = (YsUser)session.getAttribute("user");
		
		YsPaperVo papervo = examService.selectPaperById(id);
		papervo.setUser(user);
		
		
		model.addAttribute("papervo", QuestionUtil.randomQuestion(papervo));
		
		return "user/exam/examDetail";
		
		
	}
	@ResponseBody
	@RequestMapping("/subPaper.do")
	public JsonResult subPaper(@RequestBody Map<String, Object> map,HttpSession session) {
		YsUser user = (YsUser)session.getAttribute("user");
		map.put("userId", user.getUserId());
		JsonResult jr = new JsonResult();
		int i = examService.subPaper(map);
		
		if(i>0) {
			jr.setCode(200);
			jr.setMsg("提交成功");
		}else {
			jr.setCode(400);
			jr.setMsg("网络异常，稍后再试");
		}
		return jr;
	}
	
	
}
