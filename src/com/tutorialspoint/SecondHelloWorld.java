package com.tutorialspoint;


public class SecondHelloWorld {

	private String message;

	public void getMessage() {
		System.out.println("Your message: " + this.message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init()
	{
		System.out.println("Init for SecondHelloWorld bean");
	}
	
	public void destroy()
	{
		System.out.println("Destroy for SecondHelloWorld bean");
	}
}
