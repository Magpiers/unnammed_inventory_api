package com.infomanage.login_service.DTO;

import org.springframework.beans.factory.annotation.Autowired;

import com.infomanage.login_service.entity.CustomerDetails;

import lombok.Data;

@Data
public class UserDTO {
	
@Autowired
private CustomerDetails customer;

public CustomerDetails getCustomer() {
	return customer;
}

public boolean setCustomer(CustomerDetails customer) {
	this.customer = customer;
	return false;
}


}
