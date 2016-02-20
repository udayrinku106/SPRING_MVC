package com.spring.execptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class AppExceptionHandler {
	@ExceptionHandler(DeviceNotFoundException.class)
	public ModelAndView DeviceNotFoundHandlerMethod(DeviceNotFoundException ex) {
		ErrorInfo eInfo=new ErrorInfo(404, "DEVICE_NOT_FOUND", "Device not found in the database", "google.co.in");
		ModelAndView model=new ModelAndView();
		model.addObject("error", eInfo);
		model.setViewName("error");
		return model;
	}
	
	@ExceptionHandler(Throwable.class)
	public ModelAndView defaultAppExceptionHandlerMethod(Throwable ex) {
		ErrorInfo eInfo=new ErrorInfo(500, "GENERIC_EXCEPTION", "Some Unknown Error Occured While Processin Your Request! Please Contact Support. 1800 102 444", "google.co.in");
		ModelAndView model=new ModelAndView();
		model.addObject("error", eInfo);
		model.setViewName("error");
		return model;
	}
	
}
