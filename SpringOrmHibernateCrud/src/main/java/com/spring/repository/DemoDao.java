package com.spring.repository;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.command.Student;

@Repository
public class DemoDao implements IDemoDao {

	private HibernateTemplate hibernateTemplate;

	// getter for hibernateTemplate
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	// setter for hibernateTemplate
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public int save(Student s) {
		System.out.println("save");
		return (Integer) hibernateTemplate.save(s);
	}

	public List<Student> loadAll() {
		System.out.println("load all data");
		return hibernateTemplate.loadAll(Student.class);
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		System.out.println("delete by id");
		Query query = hibernateTemplate.getSessionFactory().openSession()
				.createQuery("delete from Student where id =" + id);
		return query.executeUpdate();

	}

	public Student getStudentByID(int id) {
		// TODO Auto-generated method stub
		System.out.println("get student by id");
		return hibernateTemplate.get(Student.class, id);
	}

	public int update(Student s) {
		// TODO Auto-generated method stub
		System.out.println("update");
		Query query = hibernateTemplate
				.getSessionFactory()
				.openSession()
				.createQuery(
						"update Student set name=:name,email=:email where id=:id");
		query.setString("name", s.getName());
		query.setString("email", s.getEmail());
		query.setInteger("id", s.getId());

		return query.executeUpdate();

	}
}
