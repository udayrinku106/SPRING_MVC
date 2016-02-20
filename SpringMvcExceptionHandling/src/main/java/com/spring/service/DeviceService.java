package com.spring.service;

import org.springframework.stereotype.Service;

import com.spring.execptions.DeviceNotFoundException;
import com.spring.execptions.UnknownException;

@Service
public class DeviceService {
	
	public String findDeviceName(int id)
	{
		if(id < 10)
		{
			throw new DeviceNotFoundException("Please Enter Device Id more than 10 ");
		}
		if(id > 10 && id < 20)
		{
			throw new UnknownException("It is a generic exception");
		}
		return "Device-Name For ID"+id;
	}

}
