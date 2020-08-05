package com.ysusoftedu.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ysusoftedu.pojo.YsUser;
import com.ysusoftedu.service.IUserService;
import com.ysusoftedu.util.JsonResult;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@ResponseBody
	@RequestMapping("/login.do")
	public JsonResult login(String name,String pwd,HttpSession session) {
		JsonResult jr = new JsonResult();
		YsUser user = userService.login(name, pwd);
		
		if(user!=null) {
			session.setAttribute("user", user);
			jr.setCode(200);
			jr.setMsg("登录成功");
			return jr;
		}
		jr.setCode(400);
		jr.setMsg("登录失败");
		return jr;
	}
	
	@ResponseBody
	@RequestMapping("/exit.do")
	public JsonResult exit(HttpSession session) {
		JsonResult jr = new JsonResult();
		session.invalidate();
		return jr;
	}
	
	@RequestMapping("/imgupload.do")
	public String imgupload(MultipartFile file,@Value("#{config['imgPath']}")String imgPath,@Value("#{config['picshow']}")String showPic,Model model) {
		
		String fileName =System.currentTimeMillis()+ file.getOriginalFilename();
		
		try {
			file.transferTo(new File(imgPath+fileName));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String path = showPic+fileName;//插入数据库的了路径
		model.addAttribute("img",path);
		
		return "user/self/img";
	}
	
}
