package com.springSecurity.CustomizedDaos;

import com.springSecurity.CustomizedEntities.Customer;

public interface MyCustomerDAO{
	
	 Customer CustomerfindCustomerByCustomername(String username);

}
