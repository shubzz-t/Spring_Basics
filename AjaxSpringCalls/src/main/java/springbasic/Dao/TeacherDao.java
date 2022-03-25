package springbasic.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springbasic.Entity.Teacher;

@Repository
public class TeacherDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	public void insertData(Teacher t) {
		hibernateTemplate.save(t);
	}

	public List<Teacher> allData() {
		List<Teacher> tList = hibernateTemplate.loadAll(Teacher.class);
		return tList;
	}

	public Teacher getData(int id) {
		Teacher teacher = hibernateTemplate.get(Teacher.class, id);
		return teacher;
	}
	
	@Transactional
	public void update(Teacher t) {
		hibernateTemplate.update(t);
	}

	@Transactional
	public void deletedata(int id)
	{
		 Teacher teacher = hibernateTemplate.get(Teacher.class, id);
		 hibernateTemplate.delete(teacher);
	}
}
