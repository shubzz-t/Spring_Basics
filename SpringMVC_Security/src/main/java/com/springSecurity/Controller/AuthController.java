package com.springSecurity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springSecurity.Config.BasicOP;
import com.springSecurity.Entities.userDaoJdbc;


@Controller
public class AuthController {
	@Autowired
	BasicOP op;

	@Autowired
	JdbcUserDetailsManager jdbcUserDetailsManager;

	@Autowired
	PasswordEncoder encoder;

	@RequestMapping("/customlogin")
	public String customlogin() {
		return "login";
	}

	@RequestMapping("/signupform")
	public String signupform(@ModelAttribute("usr") userDaoJdbc user) {
		return "signup";
	}

	//JDBC USER CREATION INBUILT METHOD OF SPRING SECURITY
	@RequestMapping(path = "/signupdata", method = RequestMethod.POST)
	public String signupdata(@ModelAttribute("usr") userDaoJdbc user, BindingResult result) {
		String encodedpass = encoder.encode(user.getPassword());
		user.setPassword(encodedpass);

		UserDetails newuser = User.withUsername(user.getUsername()).password(user.getPassword()).authorities("User")
				.build();
		jdbcUserDetailsManager.createUser(newuser);
		System.out.println(user);
		return "redirect:/customlogin";
	}
	
	
//	//CUSTOMIZED DATABASE CODE FOR WITH HIBERNATE 
//	@RequestMapping(path = "/signupdata", method = RequestMethod.POST)
//	public String signupdata(@ModelAttribute("usr") users user, BindingResult result) {
//		String encodedpass = encoder.encode(user.getPassword());
//		user.setPassword(encodedpass);
//		authorities a = new authorities();
//		a.setUsername(user);
//		a.setAuthority("User");
//		op.save(user);
//		op.save(a);
//		System.out.println(user);
//		return "redirect:/customlogin";
//	}
}
