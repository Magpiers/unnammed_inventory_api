package com.infomanage.cart_service.entity;

import javax.persistence.Entity;

import org.springframework.context.annotation.Configuration;

@Entity
@Configuration
public class CartDetails {
private String itemID;
private String salesCartID;
private String invoiceID;
public String getItemID() {
	return itemID;
}
public void setItemID(String itemID) {
	this.itemID = itemID;
}
public String getSalesCartID() {
	return salesCartID;
}
public void setSalesCartID(String salesCartID) {
	this.salesCartID = salesCartID;
}
public String getInvoiceID() {
	return invoiceID;
}
public void setInvoiceID(String invoiceID) {
	this.invoiceID = invoiceID;
}
}
