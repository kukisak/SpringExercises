package com.tutorialspoint;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean {
// it is recommended to define init and destroy methods in XML file which allows more flexibility
	private String message;
	private String message1;

	public void getMessage() {
		System.out.println("World message: " + this.message);
	}

	public void setMessage(String message) 
	{
		this.message = message;
	}

	public void getMessage1() 
	{
		System.out.println("World message1: " + this.message1);
	}

	public void setMessage1(String message1) 
	{
		this.message1 = message1;
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("Init for HelloWorld bean via InitializingBean interface");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy for HelloWorld bean via DisposableBean interface");
	}
	
	
}
