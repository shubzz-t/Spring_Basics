package com.springmvc_db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc_db.model.User;
import com.springmvc_db.service.UserService;

@Controller
public class ViewController {
	@Autowired
	private UserService userService;
	

	@RequestMapping("/home")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/contactprocess")
	public String contactProcess(@RequestParam("name") String name , @RequestParam("email") String email ,Model model)
	{
		System.out.println("CONTROLLER");
		User user = new User(name , email);
		userService.createAndSave(user);
		model.addAttribute("user", user);
		return "success";
	}
}
