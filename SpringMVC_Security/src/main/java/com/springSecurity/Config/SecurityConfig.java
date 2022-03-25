package com.springSecurity.Config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.springSecurity.CustomizedClasses.MyCustomerDetailsServiceImpl;
import com.springSecurity.CustomizedClasses.MyFilter;

@EnableWebSecurity(debug = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	PasswordEncoder encoder;
	@Autowired
	DataSource datasource;
	
	@Autowired
	MyCustomerDetailsServiceImpl myCustomerDetailsServiceImpl;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		
		//STORING INTO SERVER
		
		// MANUAL USER REGISTRATION FOR LOGIN TESTING IN SERVER MEMORY IE inMemoryAuthentication()
//		auth.inMemoryAuthentication().withUser("shubham")
//				.password("$2a$10$HTgurx4Ns9T8NK7DDINFSeckRKr0LdHu3h8x/Ag4.bcDbxDwVzrx.") // shubz123
//				.roles("admin");
 
		
		//USING USER CLASS CONSTRUCTOR
//		ArrayList<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
//		GrantedAuthority role1 = new SimpleGrantedAuthority("Admin");
//		GrantedAuthority role2 = new SimpleGrantedAuthority("User");
//		roles.add(role1);
//		roles.add(role2);
//		User user = new User("Paul", "paul", roles);
//		InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager();
//		inMemoryUserDetailsManager.createUser(user);
//		auth.userDetailsService(inMemoryUserDetailsManager);
		
		
		//(USER CLASS BUILD() ) USING THE BUILD METHOD OF USER CLASS
//		InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
//		UserDetails userdavid = User.withUsername("David").password("david123").roles("Admin" , "User").build();
//		userDetailsManager.createUser(userdavid);
//		auth.userDetailsService(userDetailsManager);
		
		
		
		
		//FOR DATABASE CHECKING
		//ONLY SIGNUP AND LOGIN FORM CUSTOMIZED, INTERNAL ALL EVEN DATABASE TABLES SPRING DEFAULT
//				auth.jdbcAuthentication().dataSource(datasource).passwordEncoder(encoder);    //FOR DATABASE
				
		//USING CUSTOMIZED DATABASE TABLES AND CRUD USING SPRING DEFAULT
				//for this we have changed the database and commented all hibernate annotated classes
//		auth.jdbcAuthentication().dataSource(datasource)
//		.usersByUsernameQuery("select username,password,enabled from customer where username = ?")
//		.authoritiesByUsernameQuery("select username,authority from customer where username = ?")
//		.passwordEncoder(encoder);
		
		auth.userDetailsService(myCustomerDetailsServiceImpl).passwordEncoder(encoder);
				
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.addFilterAfter(new MyFilter(), BasicAuthenticationFilter.class)
		.authorizeRequests()
		.antMatchers("/home").authenticated()
		.antMatchers("/welcome").authenticated()
		.antMatchers("/").authenticated()
		.antMatchers("/adminpage").hasAuthority("Admin")
		.antMatchers("/userpage").hasAuthority("User")
		.and()
		.formLogin()
		.loginPage("/customlogin")
		.and()
		.httpBasic()
		.and()
		.exceptionHandling().accessDeniedPage("/accessdenied")
		.and()
		.logout();
	}
}
