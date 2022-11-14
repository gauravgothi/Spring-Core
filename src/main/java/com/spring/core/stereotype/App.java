package com.spring.core.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/core/stereotype/config.xml");
		Student student= context.getBean("student", Student.class);
		System.out.println(student);
	}

}
