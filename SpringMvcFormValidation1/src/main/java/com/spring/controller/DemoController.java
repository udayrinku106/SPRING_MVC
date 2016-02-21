package com.spring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.Student;

@Controller
public class DemoController {

	@RequestMapping(value="login",method=RequestMethod.GET)
	public String loginView(Model model)
	{
		model.addAttribute("loginStudentForm", new Student());
		return "login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String processLogin(@ModelAttribute("loginStudentForm") @Valid Student s,BindingResult result,Model model)
	{
		if(result.hasErrors())
			return "login";
		
		model.addAttribute("student", s);
		return "success";
	}
	
}
