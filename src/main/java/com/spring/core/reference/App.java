package com.spring.core.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
		public static void main(String[] args)	{
			ApplicationContext context1 = new ClassPathXmlApplicationContext("com/spring/core/reference/refrenceconfig.xml");
			A temp = (A)context1.getBean("aref");
			System.out.println(temp.getX());
			System.out.println(temp.getOb().getY());
			System.out.println(temp);
		}
}
