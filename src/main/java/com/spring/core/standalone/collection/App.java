package com.spring.core.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/core/standalone/collection/config.xml");
		Person person1 = (Person)context.getBean("person1");
		System.out.println(person1.getFriends());
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println(person1.getFeesStructure());
		System.out.println(person1.getFeesStructure().getClass().getName());
	}

}
