package com.humanbooster.zobi.business;

import java.util.ArrayList;

import javax.enterprise.inject.Model;

@Model
public class Stock {

	ArrayList<Product> stock = new ArrayList<Product>();

	public ArrayList<Product> getStock() {
		return stock;
	}

	public void setStock(ArrayList<Product> stock) {
		this.stock = stock;
	}

	public Stock() {
		super();
		this.stock.add(new Product("Bananes", 100, "C'est trés trés bon !" ));
		this.stock.add(new Product("Herbe", 1000, "Pour manger"));
		this.stock.add(new Product("Viande", 1000, "Pour les carnivores"));
	}
	
	public String goStock()
	{
		return "Stock";
	}
	
}
