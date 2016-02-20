package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.service.DeviceService;

@Controller
public class DeviceController {

	@Autowired
	private DeviceService deviceService;
	@RequestMapping("/device-{id}")
	public String getDevicePage(@PathVariable int id) {
		String page = "";
		
		deviceService.findDeviceName(id);
		
		
		page = "home";
		return page;
	}
	
}
