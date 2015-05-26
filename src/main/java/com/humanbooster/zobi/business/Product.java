package com.humanbooster.zobi.business;

import javax.enterprise.inject.Model;

@Model
public class Product {

	String name;
	int quantity;
	String info;
	
	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Product(String name, int quantity, String info) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.info = info;
	}
	
	public void majQuantity(int paramQuantity)
	{
		quantity += paramQuantity;
	}
}