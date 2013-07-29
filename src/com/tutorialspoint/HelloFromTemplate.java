package com.tutorialspoint;

public class HelloFromTemplate {

	private String message = null;
	private String message1 = null;
	private String message2 = null;
	
	public void getMessage() 
	{
		System.out.println("Message from template: " + message);
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void getMessage1() 
	{
		System.out.println("Message1 from template: " + message1);
	}
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	public void getMessage2() 
	{
		System.out.println("Message2 from template: " + message2);
	}
	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	
}
