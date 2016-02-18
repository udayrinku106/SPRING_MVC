package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.command.Student;
import com.spring.repository.DemoDao;

@Service
public class DemoService {
	
	@Autowired
	private DemoDao demoDao;
	
	public int save(Student s)
	{
		return demoDao.save(s);
	}
	
	public List<Student> loadAll()
	{
		return demoDao.loadAll();
	}
}
