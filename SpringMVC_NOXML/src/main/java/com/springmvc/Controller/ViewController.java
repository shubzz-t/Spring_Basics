package com.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("home")
	public String homepage() {
		return "home";
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

}
