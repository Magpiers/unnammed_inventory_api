package com.infomanage.login_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infomanage.login_service.DTO.UserDTO;
import com.infomanage.login_service.entity.CustomerDetails;

@RestController
@RequestMapping(value="{contextpath}")
public class LoginServiceController {
	
@Autowired
private CustomerDetails customer;

@Autowired
private UserDTO user;
	
	@GetMapping(path = "/bim/login")
	public String login(String error,Boolean login) {
		if(error != null) {
			return "Your username or password is invalid";
		}
		
    return "You are successfully logged in";
		
	}
	
	@PostMapping(path ="/bim/addcustomer")
	public boolean createCustomer(CustomerDetails customer){
		if(user.setCustomer(customer)) {
			return true;
		}
		else {
		return false;
		}
		
	}

}
