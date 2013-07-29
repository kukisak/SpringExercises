package com.tutorialspoint.events;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class MainAppConfig {

	@Bean
	public HelloEvent helloEvent()
	{
		HelloEvent hello = new HelloEvent();
		hello.setMessage("Moje Event message");
		return hello;
	}
	
	@Bean
	public CStartEventHandler cstartEventHandler()
	{
		return new CStartEventHandler();
	}
	
	@Bean
	public CStopEventHandler cstopEventHandler()
	{
		return new CStopEventHandler();
	}
}
