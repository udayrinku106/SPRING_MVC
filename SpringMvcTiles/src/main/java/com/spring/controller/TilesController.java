package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TilesController {
		
	@RequestMapping("home")
	public String homePage()
	{
		return "tiles.home";
	}
	
	@RequestMapping("about")
	public String aboutPage()
	{
		return "tiles.aboutus";
	}
	
	@RequestMapping("contact")
	public String contactPage()
	{
		return "tiles.contact";
	}
}
