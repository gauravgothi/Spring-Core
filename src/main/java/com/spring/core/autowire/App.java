package com.spring.core.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/core/autowire/config.xml");
		Employee emp=context.getBean("emp",Employee.class);
		System.out.println(emp);
	}
}
