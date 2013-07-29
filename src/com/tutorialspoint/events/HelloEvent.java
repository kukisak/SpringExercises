package com.tutorialspoint.events;

public class HelloEvent {

	private String message;

	public void getMessage() {
		System.out.println("Your HelloEvent message is: " + this.message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
