package com.spring.core.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/spel/config.xml");
		SpELDemo d1 = context.getBean("demo",SpELDemo.class);		
		System.out.println(d1);
		
	

	}
}
