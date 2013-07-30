package com.tutorialspoint.logging;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/* Log4j property */
	private static Logger log4jLog = Logger.getLogger("com.tutorialspoint.logging");
	
	/* Commons logging property */
	private static Log commonsLoggingLog = LogFactory.getLog(MainApp.class);
	
	public static void main(String[] args) {

		MainApp app = new MainApp();
//		app.loggingViaLog4j();
//		app.loggingViaCommonsLogging();
		app.loggingLog4jConfiguration();
		
	}
	
	public void loggingViaLog4j()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/tutorialspoint/logging/Beans.xml");
		
		log4jLog.setLevel(Level.INFO);
		Logger mainLog = Logger.getLogger("com.tutorialspoint.logging.MainApp");
		mainLog.info("Info mainLog: mgs");
		mainLog.warn("Warn mainLog: mgs");
		log4jLog.setLevel(Level.WARN);
		mainLog.info("Info mainLog: msg2");
		mainLog.warn("Warn mainLog: mgs2");
		log4jLog.setLevel(Level.TRACE);
		
		log4jLog.info("Going to create HelloWorld obj");
		log4jLog.trace("Going to create HelloWorld obj");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		obj.getMessage();
		log4jLog.error("Didn't do it");
		log4jLog.trace("Goint to exit program");
		
	}
	
	public void loggingLog4jConfiguration()
	{
		log4jLog.debug("msg");
		log4jLog.info("msg");
		log4jLog.warn("msg");
		log4jLog.error("msg");
		log4jLog.fatal("msg");
		
	}
	
	public void loggingViaCommonsLogging()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/tutorialspoint/logging/Beans.xml");
		
		commonsLoggingLog.debug("Debug: msg");
		commonsLoggingLog.info("Info: msg");
		commonsLoggingLog.warn("Warn: msg");
		commonsLoggingLog.error("Error: msg");
		commonsLoggingLog.fatal("Fatal: msg");
				
		
		commonsLoggingLog.info("Info: Start logging via commons logging");
		commonsLoggingLog.info("Info: Going to create HelloWorld obj");
//		log.entry("entry MainApp");
		commonsLoggingLog.trace("Trace: Going to create HelloWorld obj");
		commonsLoggingLog.trace("Trace: Going to create HelloWorld obj");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		obj.getMessage();
		commonsLoggingLog.error("Error: Didn't do it");
//		log.info("Goint to exit program");
		commonsLoggingLog.trace("Trace: Goint to exit program");
		
	}

}
