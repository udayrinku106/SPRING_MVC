package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.command.Student;
import com.spring.service.IDemoService;

@Controller
public class DemoController {

	@Autowired
	private IDemoService demoService;

	// this method return a view page on get request
	@RequestMapping(method = RequestMethod.GET, value = "register")
	public String showRegisterPage(Model model) {
		Student s = new Student("Rajesh", "kumarsethi.rajesh@gmail.com");
		model.addAttribute("studentCommandKey", s);
		return "registerView";
	}

	// performs insert operation
	@RequestMapping(method = RequestMethod.POST, value = "register")
	public String processRegisterPage(
			@ModelAttribute("studentCommandKey") Student s, Model model) {
		String name = s.getName();
		String email = s.getEmail();

		
		
		int result=  demoService.save(s);
		
		
		String message = "You have submitted:<br/> Name: " + name
				+ "<br/> Email: " + email;
		model.addAttribute("messageKey", message);
		return "success";
	}

	// gets all data
	@RequestMapping(method = RequestMethod.GET, value = "list")
	public String getAllData(Model model) {
		List<Student> studentsList = demoService.loadAll();
		model.addAttribute("students", studentsList);
		return "listAll";
	}

	// performs delete operation
	@RequestMapping(method = RequestMethod.GET, value = "delete-{id}-student")
	public String deleteStudentById(@PathVariable("id") int id, Model model) {
		demoService.delete(id);
		return "redirect:list";
	}

	

	// gets a single student by id, so that we can edit
	@RequestMapping(method = RequestMethod.GET, value = "edit-{id}-student")
	public String getStudentById(@PathVariable("id") int id, Model model) {
		Student s = demoService.getStudentByID(id);
		model.addAttribute("studentCommandKey", s);
		return "registerView";
	}

	@RequestMapping(method = RequestMethod.POST, value = "edit-{id}-student")
	public String updateStudent(
			@ModelAttribute("studentCommandKey") Student s, Model model) {
		String name = s.getName();
		String email = s.getEmail();

		
		
		int result= demoService.update(s);
		
		
		String message = "You have updated with:<br/> Name: " + name
				+ "<br/> Email: " + email;
		model.addAttribute("messageKey", message);
		return "success";
	}
	

}
