package com.spring.core.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
		public static void main(String[] args) {
			
			//AbstractApplicationContex provide additional method registerShutdownHook() that ensure destroy method call before exit
			
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/lifecycle/config.xml");
			Samosa samosa1 = (Samosa)context.getBean("samosa1");
			System.out.println(samosa1);
			context.registerShutdownHook(); //ensure to call destroy method
			
			System.out.println("-------------------");
			Pepsi pepsi1 = (Pepsi)context.getBean("pepsi1");
			System.out.println(pepsi1);
			System.out.println("In this sceniro no need of change in config file for init and destroy\n interface ensure this");
			
			System.out.println("-------------------");
			Chips chips1= (Chips)context.getBean("chips1");
			System.out.println(chips1);
			
			
		}
}
