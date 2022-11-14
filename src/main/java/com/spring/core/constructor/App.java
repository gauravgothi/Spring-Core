package com.spring.core.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args)	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/core/constructor/constructorconfig.xml");
		Person p = (Person)context.getBean("person");
		System.out.println(p);
	}
}
