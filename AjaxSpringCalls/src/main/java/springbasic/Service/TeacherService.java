package springbasic.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbasic.Dao.TeacherDao;
import springbasic.Entity.Teacher;

@Service
public class TeacherService {
	@Autowired
	TeacherDao teacherDao;

	public void insertData(Teacher t) {
		teacherDao.insertData(t);
	}

	public List<Teacher> allData() {
		return teacherDao.allData();
	}

	public Teacher getData(int id) {
		return teacherDao.getData(id);
	}

	public void update(Teacher t) {
		teacherDao.update(t);
	}

	public void deletedata(int id)
	{
		 teacherDao.deletedata(id);
	}
}
