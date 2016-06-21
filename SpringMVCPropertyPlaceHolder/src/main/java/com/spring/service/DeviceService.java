package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.DeviceDao;
import com.spring.model.Device;

@Service
public class DeviceService {

	@Autowired
	DeviceDao deviceDao;
	
	public int saveDevice(Device device)
	{
		return deviceDao.insertDevice(device);
	}
}
