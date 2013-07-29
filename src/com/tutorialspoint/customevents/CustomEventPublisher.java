package com.tutorialspoint.customevents;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;
	private String name;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		System.out.println("Inside setApplicationEventPublisher CustomEventPublisher");
		this.publisher = publisher;
	}
	
	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		System.out.println("Inside setName CustomEventPublisher");
		this.name = name;
	}

	public void publish()
	{
		CustomEvent ce = new CustomEvent(this);
		publisher.publishEvent(ce);
	}

}
