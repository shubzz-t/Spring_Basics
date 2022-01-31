package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entities.User;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("THIS IS THE HOME CONTROLLER");
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	// MODEL
	@RequestMapping("/model")
	public String model(Model model) {
		model.addAttribute("name", "CHECKING MODEL");
		return "model";
	}

	// MODEL AND VIEW
	@RequestMapping("/modelandview")
	public ModelAndView modelandview() {
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("name", "CHECKING MODEL AND VIEW");
		mAndV.setViewName("modelandview");
		return mAndV;
	}

	@RequestMapping("/contact")
	public String processd() {
		return "contact";
	}

	// USING REQUEST PARAM AND POST
	@RequestMapping(path = "/using_req_param", method = RequestMethod.POST)
	public String usingreqParam(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		return "processed_using_req_param";
	}

	@RequestMapping(path = "/using_model_attr", method = RequestMethod.POST)
	public String usingModelAttr(@ModelAttribute User user , Model model ) {
		return "processed_using_model_attr";
	}

}
