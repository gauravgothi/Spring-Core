package com.spring.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean  {
	private double price;
	private Object sout;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//init
		System.out.println("Taking the Pepsi : init");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Empty the bottle Pepsi : destroy");
	}
	
	
}
