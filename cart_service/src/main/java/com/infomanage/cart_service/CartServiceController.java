package com.infomanage.cart_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infomanage.cart_service.DTO.CartDTO;
import com.infomanage.cart_service.entity.CartDetails;

@RestController
@RequestMapping(value="{contextpath}")
public class CartServiceController {
	
	@Autowired
	private CartDetails cartdetail;
	
	@Autowired
	private CartDTO cart;
	
	@PostMapping(path = "/bim/addItem")
	public String addItem(CartDetails cartdetail) {
		if(cart.setCart(cartdetail)) {
			return "success";
		}else {
			return "false";
		}
		
	}
	
	@PostMapping(path ="/bim/addItem/{itemID}")
	public String updateItem(CartDetails cartdetail,@PathVariable("itemid") String itemID) {
		if(cartdetail.getItemID().equals(itemID)) {
			cart.setCart(cartdetail);
			return "success";
		}
		else {		
		return "Failure";	
		}	
	}

}
