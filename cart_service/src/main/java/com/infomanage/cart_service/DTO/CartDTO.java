package com.infomanage.cart_service.DTO;

import org.springframework.beans.factory.annotation.Autowired;

import com.infomanage.cart_service.entity.CartDetails;

import lombok.Data;

@Data
public class CartDTO {
	
	@Autowired
	private CartDetails cart;

	public CartDetails getCart() {
		return cart;
	}

	public boolean setCart(CartDetails cart) {
		this.cart = cart;
		return false;
	}
	
	

}
