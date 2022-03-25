package com.spring.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.project.Service.UserService;
import com.spring.project.entity.Users;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String list(Model model) {
		List<Users> list = userService.getAll();
		model.addAttribute("list", list);
		return "index";
	}

	@RequestMapping("/update/{id}")
	public String updatepage(@PathVariable("id") int id, Model model) {
		Users user = userService.getSingle(id);
		model.addAttribute("user", user);
		return "updatepage";
	}

	@RequestMapping(path = "/updatedata", method = RequestMethod.POST)
	public String updateData(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("email") String email, Model model) {

		Users user = new Users(id, name, email);
		userService.update(user);
		return "redirect:/";
	}

	@RequestMapping(path = "/insertdata")
	public String insertpage() {
		return "insert";
	}

	@RequestMapping(path = "/inserted", method = RequestMethod.POST)
	public String insertData(@RequestParam("name") String name, @RequestParam("email") String email, Model model) {
		Users user = new Users(name, email);
		userService.save(user);
		return "redirect:/";
	}
	
	@RequestMapping(path = "/delete/{id}")
	public String delete(@PathVariable("id") int id , Model model) {
		userService.delete(id);
		return "redirect:/";
	}
}
