package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.command.Student;
import com.spring.service.DemoService;

@Controller
public class DemoController {

	@Autowired
	private DemoService demoService;

	// this method return a view page on get request
	@RequestMapping(method = RequestMethod.GET, value = "register")
	public String showRegisterPage(Model model) {
		Student s = new Student("Rajesh", "kumarsethi.rajesh@gmail.com");
		model.addAttribute("studentCommandKey", s);
		return "registerView";
	}

	@RequestMapping(method = RequestMethod.POST, value = "register")
	public String processRegisterPage(
			@ModelAttribute("studentCommandKey") Student s, Model model) {
		String name = s.getName();
		String email = s.getEmail();

		demoService.save(s);
		String message = "You have submitted:<br/> Name: " + name
				+ "<br/> Email: " + email;
		model.addAttribute("messageKey", message);
		return "success";
	}

	@RequestMapping(method = RequestMethod.GET, value = "list")
	public String getAllData(Model model) {
		List<Student> studentsList = demoService.loadAll();
		model.addAttribute("students", studentsList);
		return "listAll";
	}

}
