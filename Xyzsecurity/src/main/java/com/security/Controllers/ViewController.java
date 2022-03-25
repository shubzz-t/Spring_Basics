package com.security.Controllers;

import java.security.Principal;
import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/home")
	public String home(Principal principal  , Authentication authentication , Model model )
	{
		String username = principal.getName();
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		model.addAttribute("username", username);
		model.addAttribute("authority" , authorities);
		return "home";
	}
	
	@RequestMapping("/mysecurity")
	public String security()
	{
		return "mysecurity";
	}
	
	@RequestMapping(value = "/postData", method = RequestMethod.POST)
	@ResponseBody
	public String postData(@RequestParam("name") String name, @RequestParam("password") String password) {
		System.out.println(name + "  " + password);
		return name + " SAVED ";
	}
	
	@RequestMapping(value = "/getdata/{name}", method = RequestMethod.GET)
	@ResponseBody
	public String getdata(@PathVariable("name")String name) {
		System.out.println(name);
		return name + " SAVED ";
	}
	
}
