package com.tutorialspoint.customevents;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MainApp app = new MainApp();
		app.testCustomEvent();
	}
	
	public void testCustomEvent()
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(MainAppConfig.class);
		ctx.refresh();
		
		System.out.println("Before getBean CustomEventPublisher");
		CustomEventPublisher cep = (CustomEventPublisher) ctx.getBean(CustomEventPublisher.class);
		System.out.println("After getBean CustomEventPublisher");
		cep.publish();
		cep.publish();
	}

}
