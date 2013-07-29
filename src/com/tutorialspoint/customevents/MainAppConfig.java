package com.tutorialspoint.customevents;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainAppConfig {

	@Bean
	public CustomEventHandler customEventHandler()
	{
		System.out.println("Inside customEventHandler MainAppConfig");
		return new CustomEventHandler();
	}
	
	@Bean
	public CustomEventPublisher customEventPublisher()
	{
		System.out.println("Inside customEventPublisher MainAppConfig");
		return new CustomEventPublisher();
	}
	
}
