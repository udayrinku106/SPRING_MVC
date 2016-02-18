package com.spring.repository;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.command.Student;

@Repository
public class DemoDao {

	private HibernateTemplate hibernateTemplate;
	
	// getter for hibernateTemplate
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	// setter for hibernateTemplate
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public int save(Student s)
	{
		return (Integer) hibernateTemplate.save(s);
	}
	
	public List<Student> loadAll()
	{
		return hibernateTemplate.loadAll(Student.class);
	}
}
