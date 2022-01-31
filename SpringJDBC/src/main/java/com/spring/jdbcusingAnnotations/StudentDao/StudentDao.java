package com.spring.jdbcusingAnnotations.StudentDao;

import java.util.List;
import com.spring.jdbcusingAnnotations.entities.Student;


public interface StudentDao {
	public int insert(Student student);
	
	public int update(Student student);
	
	public int delete(Student student);
	
	public Student getStudent(Student student);
	
	public List<Student> getData();
	

}
