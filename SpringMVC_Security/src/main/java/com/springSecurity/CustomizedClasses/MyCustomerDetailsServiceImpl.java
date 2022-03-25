package com.springSecurity.CustomizedClasses;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springSecurity.CustomizedDaos.MyCustomerDAOImpl;
import com.springSecurity.CustomizedEntities.Customer;

@Service
public class MyCustomerDetailsServiceImpl implements UserDetailsService {
	@Autowired
	MyCustomerDAOImpl myCustomerDAOImpl;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Customer customer = myCustomerDAOImpl.CustomerfindCustomerByCustomername(username);
		if (customer == null) {
			throw new UsernameNotFoundException(username + " NO SUCH USER EXISTS....");
		}

//		UserDetails user1 = User.withUsername(customer.getUsername()).password(customer.getPassword())
//				.authorities(customer.getAuthority()).build();
		ArrayList<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		GrantedAuthority role1 = new SimpleGrantedAuthority(customer.getAuthority());
		authorities.add(role1);
		UserDetails user1 = new User(customer.getUsername(), customer.getPassword(), authorities);
		return user1;
	}

}
