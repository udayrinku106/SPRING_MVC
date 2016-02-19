package com.spring.repository;

import java.util.List;

import com.spring.command.Student;

public interface IDemoDao {

	public int save(Student s);

	public List<Student> loadAll();

	public int delete(int id);

	public Student getStudentByID(int id);
	
	public int update(Student s);
}
