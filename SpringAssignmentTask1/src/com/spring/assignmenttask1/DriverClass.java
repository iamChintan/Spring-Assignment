package com.spring.assignmenttask1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("appContext.xml");
		
		JavaLanguage language = context.getBean("Framework", JavaLanguage.class);
		
		System.out.println(language.learningJava()); 
		System.out.println(language.learningPython()); 
		
		context.close();

	}

}
