package com.tutorialspoint.log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	private static Logger log = LogManager.getLogger(MainApp.class);
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/tutorialspoint/log4j/Beans.xml");
		
//		log.info("Going to create HelloWorld obj");
		log.entry("entry MainApp");
		log.trace("Going to create HelloWorld obj");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		obj.getMessage();
		log.error("Didn't do it");
//		log.info("Goint to exit program");
		log.trace("Goint to exit program");
	}

}
