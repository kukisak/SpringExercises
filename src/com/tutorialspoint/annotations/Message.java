package com.tutorialspoint.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;

public class Message {

	private String message;

	@Required
	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() 
	{
		System.out.println("Your message: " + this.message);
	}
	
	@PostConstruct
	public void postInit()
	{
		System.out.println("Message is going through post Init");
	}
	
	@PreDestroy
	public void preDestroy()
	{
		System.out.println("Message is going through pre Destroy");
	}
	
	
	
}
