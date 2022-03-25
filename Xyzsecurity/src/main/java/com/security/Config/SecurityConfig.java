package com.security.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.security.Customized.MyAuthenticationProvider;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	MyAuthenticationProvider myAuthenticationProvider;

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		//auth.inMemoryAuthentication().withUser("Shubham").password("shubz123").roles("Admin");
		
		auth.authenticationProvider(myAuthenticationProvider);
	}

	protected void configure(HttpSecurity http) throws Exception {
       http.authorizeRequests()
       .antMatchers("/" ).permitAll()
       .antMatchers("/home", "/postData", "/mysecurity" , "/getdata").authenticated()
       .and()
       .formLogin().loginPage("/login")
       .and()
       .httpBasic()
       .and()
       .logout()
       .logoutUrl("/logout_perform");
       
     // http.csrf().disable();
       }
}
