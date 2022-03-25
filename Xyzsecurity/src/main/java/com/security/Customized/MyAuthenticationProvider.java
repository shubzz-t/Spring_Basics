package com.security.Customized;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.security.Daos.UserDao;
import com.security.Entities.Employee;

@Component
public class MyAuthenticationProvider implements AuthenticationProvider {
	@Autowired
	UserDao userDao;
	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String name = authentication.getName();
		String password = authentication.getCredentials().toString();

		Employee user = userDao.getUser(name);

		if (user != null) {
			boolean matches = passwordEncoder.matches(password, user.getPassword());
			if (matches) {
				ArrayList<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
				roles.add(new SimpleGrantedAuthority(user.getRole()));
				System.out.println("ZALAY BG AUTHENTICATE " + name);
				return new UsernamePasswordAuthenticationToken(name, password, roles);
			} else {
				System.out.println("MATCH NHI ZALA");
				throw new BadCredentialsException("INCORRECT USERNAME/PASSWORD");
			}
		} else {
			System.out.println("DATABASE MDHECH NHIYE");
			throw new BadCredentialsException("NO SUCH USER FOUND...");
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
