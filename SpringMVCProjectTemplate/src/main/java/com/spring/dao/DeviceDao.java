package com.spring.dao;

import org.springframework.stereotype.Repository;

import com.app.query.DeviceQueryBuilder;
import com.spring.model.Device;

@Repository
public class DeviceDao {

	public int insertDevice(Device device)
	{
		String query=DeviceQueryBuilder.INSERT_DEVICE;
		// use above jdbc query
		return 0;
	}
}
