package com.ysusoft.ysu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ysusoftedu.service.IUserService;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private IUserService userService;
	
	
	@RequestMapping("/test.do")
	@ResponseBody
	public String test() {
		userService.insertUsers();
		System.out.println(123);
		return "hello spring boot";
	}
	
	@RequestMapping("/thyTest.do")
	public String thyTest(Model model) {
		String name = "zhangsan";
		model.addAttribute("name", "zhangsan");
		
		return "testView/test.html";
		
	}
	
	
}
