package com.spring.core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Chips {
	private String flavour;
	private double price;
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Chips() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Chips [flavour=" + flavour + ", price=" + price + "]";
	}
	@PostConstruct
	public void start()	{
		System.out.println("Eating Chips of flavour tomato");
	}
	
	@PreDestroy
	public void end()	{
		System.out.println("Dispose the wrapper");
	}
}
