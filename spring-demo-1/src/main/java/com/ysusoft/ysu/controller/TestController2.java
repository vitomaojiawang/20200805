package com.ysusoft.ysu.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test2")
public class TestController2 {

	@RequestMapping("/test.do")
	@ResponseBody
	public String test() {
		
		return "hello spring boot";
	}
	
	
	

	
	
}
