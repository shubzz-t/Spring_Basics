package com.springSecurity.Controller;

import java.security.Principal;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ViewController {
	@Autowired
	JdbcUserDetailsManager jdbcUserDetailsManager;

	@RequestMapping("/home")
	public String home(Principal principal , Model model ) {
        model.addAttribute("username", principal.getName());
		return "home";
	}

	@RequestMapping("/")
	public String index(Principal principal, Authentication auth , Model m) {
		//GETING THE LOGGED USER NAME USING PRINCIPAL INTERFACE
		String username = principal.getName();
		//GETTING THE LOGGED USER AUTHORITIES USING AUTHENTICATION INTERFACE
		Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
		
		m.addAttribute("username" , username);
		m.addAttribute("authorities", authorities);
		return "index";
	}

	@RequestMapping("/userpage")
	public String userpage() {
		return "userpage";
	}

	@RequestMapping("/adminpage")
	public String adminpage() {
		return "adminpage";
	}

	@RequestMapping("/accessdenied")
	public String accessdenied() {
		return "accessdenied";
	}
	
	@RequestMapping(value = "/delete/{username}")
	public String deleteUser(@PathVariable("username") String username) {
		jdbcUserDetailsManager.deleteUser(username);
		return "login" ;
	}
}
