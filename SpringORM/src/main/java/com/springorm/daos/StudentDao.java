package com.springorm.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.tool.schema.internal.StandardUniqueKeyExporter;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.entities.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}

	//SELECT
	public Student select(Student student) {
		Student student2 = hibernateTemplate.get(Student.class, student.getId());
		return student2;
	}
	
	//SELECT ALL
	public List<Student> selectall() {
		List<Student> list = hibernateTemplate.loadAll(Student.class);
		return list;
	}
	
	//UPDATE
	@Transactional
	public void update(Student student)
	{
		Student student1 = hibernateTemplate.get(Student.class, student.getId());
		student1.setName(student.getName());
		student1.setAddress(student.getAddress());
		hibernateTemplate.update(student1);
		System.out.println("DONE");
	}
	
	@Transactional
	public void delete(Student student) {
		Student student1 = hibernateTemplate.get(Student.class, student.getId());
	   hibernateTemplate.delete(student1);
	}

}
