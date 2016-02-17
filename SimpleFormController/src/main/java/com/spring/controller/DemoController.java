package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.command.Student;

@Controller
public class DemoController {
	
	// this method return a view page on get request
	@RequestMapping(method=RequestMethod.GET,value="register")
	public String showRegisterPage(Model model)
	{
		Student s=new Student("Rajesh","kumarsethi.rajesh@gmail.com");
		model.addAttribute("studentCommandKey", s);
		return "registerView";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="register")
	public String processRegisterPage(@ModelAttribute("studentCommandKey") Student s,Model model)
	{
		String name=s.getName();
		String email=s.getEmail();
		
		String message="You have submitted:<br/> Name: "+name+"<br/> Email: "+email;
		model.addAttribute("messageKey", message);
		return "success";
	}

}
