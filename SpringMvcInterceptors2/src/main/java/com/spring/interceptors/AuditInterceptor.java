package com.spring.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AuditInterceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out
				.println("**afterCompletion()-AuditInterceptor:before rendering to view from controller--irrespective of url pattern");
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		System.out
				.println("**postHandle()-AuditInterceptor:after executing controller - irrespective of url patern");

	}

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		System.out
				.println("**preHandle()-AuditInterceptor:before executing controller - irrespective of url patern");
		return true;
	}

}
