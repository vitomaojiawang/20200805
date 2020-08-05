package com.ysusoftedu.intercepet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
@Component
public class LoginIntercepect implements HandlerInterceptor{
	/**
	 * 处理器执行后视图返回后执行此方法
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 在执行后但是还没有返回视图前执行此方法
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 调用处理器前执行的方法
	 */
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
//		HttpSession session = arg0.getSession();
//		if(session.getAttribute("admin")==null) {
//			String contextPath = arg0.getContextPath();
//			
//			arg1.sendRedirect(contextPath+"/html/admin/login.html");
//			return false;
//		}
		System.out.println("这是登录拦截器.........");
		
		return true;
		
	}

}
