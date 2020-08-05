package com.ysusoftedu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ysusoftedu.pojo.YsUser;
import com.ysusoftedu.service.IUserService;
import com.ysusoftedu.util.JsonResult;
import com.ysusoftedu.util.SSHUtil;

@Controller
@RequestMapping("/admin/user")
public class AdminUserController {

	@Autowired
	private IUserService userService;
	@ResponseBody
	@RequestMapping("/userList.do")
	public JsonResult userList(YsUser user,@RequestParam(defaultValue="1")int currpage,@RequestParam(defaultValue="10")int pagesize){
		JsonResult jr = new JsonResult();
		
		PageHelper.startPage(currpage,pagesize);
		List<YsUser> users = userService.selectAllUsers(user);
		PageInfo pageInfo = new PageInfo(users);
		
		jr.setData(pageInfo);
		
		
		return jr;
	}
	

	@RequestMapping("/upload.do")
	public String upload(MultipartFile file,Model model) {
		
		String path = SSHUtil.upload(file, "sp_"+System.currentTimeMillis());
		model.addAttribute("path", path);
		
		return "user/course/courseplay";
		
	}
	
	
	
	
	
}
