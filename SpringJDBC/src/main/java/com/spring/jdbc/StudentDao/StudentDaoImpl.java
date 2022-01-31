package com.spring.jdbc.StudentDao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {
	JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		String sql = "INSERT INTO Student(name , address) VALUES( ? , ?)";
		int r = jdbcTemplate.update(sql, student.getName(), student.getAddress());
		return r;
	}

	@Override
	public int update(Student student) {
		String sql = "UPDATE Student set name=? WHERE id=?";
		int r = jdbcTemplate.update(sql, "Shanoor", student.getId());
		return r;
	}

	@Override
	public int delete(Student student) {
		String sql = "DELETE FROM Student WHERE id=?";
		int r = jdbcTemplate.update(sql, student.getId());
		return r;
	}

	public StudentDaoImpl() {

	}
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Student getStudent(Student student) {
		String sql = "SELECT * FROM Student WHERE id=?";
		RowMapper<Student> rowMapper = new RowMapperImp();
		Student s = jdbcTemplate.queryForObject(sql, rowMapper, student.getId());
		return s;
	}

	@Override
	public List<Student> getData() {
		List<Student> list = new ArrayList<Student>();
		RowMapper<Student> rowMapper = new RowMapperImp();
		String sql = "SELECT * FROM Student";
		list = jdbcTemplate.query(sql, rowMapper );
		return list;
	}

}
