package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ysusoftedu.intercepet.LoginIntercepect;
@Configuration
public class MvcIntercepetConfig implements WebMvcConfigurer{

	@Autowired
	private LoginIntercepect loginIntercepet;
	
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {//向项目中添加拦截器的方法
		registry.addInterceptor(loginIntercepet).addPathPatterns("/**").excludePathPatterns("/admin/user/login.do");
		
	
	}
	
}
