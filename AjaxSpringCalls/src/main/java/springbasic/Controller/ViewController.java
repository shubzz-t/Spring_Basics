package springbasic.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import springbasic.Entity.Teacher;
import springbasic.Service.TeacherService;

@Controller
public class ViewController {
	@Autowired
	TeacherService teacherService;

	@RequestMapping("home")
	public String home(Model m) {
		List<Teacher> tList = new ArrayList<Teacher>();
		tList = teacherService.allData();
		m.addAttribute("tlist", tList);
		return "index";
	}

	@RequestMapping("insertdata")
	public String viewInsert() {
		return "insert";
	}

	@RequestMapping(path = "inserted", method = RequestMethod.POST)
	public String insertData(@RequestParam("name") String name, @RequestParam("email") String email) {
		Teacher t = new Teacher(name, email);
		teacherService.insertData(t);
		return "redirect:/home";
	}

	@RequestMapping("update/{id}")
	public String setUpdatePage(@PathVariable("id") int id, Model m) {
		Teacher teacher = teacherService.getData(id);
		m.addAttribute("teacher", teacher);
		return "updatepage";
	}

	@RequestMapping(path = "updatedata", method = RequestMethod.POST)
	public String updatingData(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("email") String email, Model m) {
		Teacher teacher = new Teacher(id, name, email);
		teacherService.update(teacher);
		return "redirect:/home";
	}

	@RequestMapping("delete/{id}")
	public String delete(@PathVariable("id") int id) {
		teacherService.deletedata(id);
		return "redirect:/home";
	}

	@RequestMapping("asach")
	public String basic() {
		return "asach";
	}

	// GET USING SEPERATE DATA
//	@RequestMapping(value = "getData", method = RequestMethod.GET)
//	@ResponseBody
//	public String getData(@RequestParam("tid") int tid, Model m) {
//		Teacher teacher = teacherService.getData(tid);
//		m.addAttribute("teacher", teacher);
//		return teacher.getName();
//	}

	// GET USING DATA COMBINED WITH URL
	@RequestMapping(value = "getData/{tid}", method = RequestMethod.GET)
	@ResponseBody
	public String getData(@PathVariable("tid") int tid, Model m) {
		Teacher teacher = teacherService.getData(tid);
		m.addAttribute("teacher", teacher);
		return teacher.getName();
	}

	@RequestMapping(value = "postData", method = RequestMethod.POST)
	@ResponseBody
	public String postData(@RequestParam("tname") String name, @RequestParam("temail") String email) {
		Teacher teacher = new Teacher(name, email);
		teacherService.insertData(teacher);
		return teacher.getName() + " SAVED ";
	}

}
