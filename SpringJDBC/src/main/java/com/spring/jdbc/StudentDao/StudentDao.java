package com.spring.jdbc.StudentDao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	
	public int update(Student student);
	
	public int delete(Student student);
	
	public Student getStudent(Student student);
	public List<Student> getData();
	

}
