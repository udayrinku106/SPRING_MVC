package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.command.Student;
import com.spring.repository.IDemoDao;

@Service
public class DemoService implements IDemoService {
	
	@Autowired
	private IDemoDao demoDao;
	
	public int save(Student s)
	{
		return demoDao.save(s);
	}
	
	public List<Student> loadAll()
	{
		return demoDao.loadAll();
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return demoDao.delete(id);
	}

	public Student getStudentByID(int id) {
		// TODO Auto-generated method stub
		return demoDao.getStudentByID(id);
	}

	public int update(Student s) {
		// TODO Auto-generated method stub
		return demoDao.update(s);
	}
}
