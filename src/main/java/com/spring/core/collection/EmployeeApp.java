package com.spring.core.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EmployeeApp {
	public static void main(String[] args) {
		
			System.out.println( "Hello World!" );
        
			ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/collection/collectionconfig.xml");
			Employee employee1 = (Employee)context.getBean("employee1");
			System.out.println(employee1.getName());
			System.out.println(employee1.getPhones());
			System.out.println(employee1.getAddresses());
			System.out.println(employee1.getCourses());
			System.out.println(employee1.getProps());
			
			
	}

}
