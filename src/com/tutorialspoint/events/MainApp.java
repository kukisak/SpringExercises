package com.tutorialspoint.events;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MainApp app = new MainApp();
		app.testEventHandling();
	}
	
	public void testEventHandling()
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(MainAppConfig.class);
		ctx.refresh();
		
		ctx.start();
		
		HelloEvent hello = (HelloEvent) ctx.getBean(HelloEvent.class);
		hello.getMessage();
		
		ctx.stop();
		
	}

}
