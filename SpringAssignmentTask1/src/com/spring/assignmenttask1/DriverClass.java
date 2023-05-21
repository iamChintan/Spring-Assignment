package com.spring.assignmenttask1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		JavaLanguage language = context.getBean("Framework", JavaLanguage.class);
		
		language.learningJava();
		
		context.close();

	}

}
