package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Device;
import com.spring.service.DeviceService;

@Controller
public class DeviceController {

	@Autowired
	DeviceService deviceService;

	@RequestMapping("/create-device.htm")
	public ModelAndView createDevice(Device device) {
		ModelAndView mav = new ModelAndView();

		deviceService.saveDevice(device);
		mav.addObject("response", new Device());
		mav.setViewName("success");

		return mav;
	}
}
