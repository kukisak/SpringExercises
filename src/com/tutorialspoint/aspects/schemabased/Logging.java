package com.tutorialspoint.aspects.schemabased;

public class Logging {

	/**
	 * This is the method which I would like to execute before a selected method.
	 */
	public void beforeAdvice()
	{
		System.out.println("Going to setup student profile.");
	}
	
	/**
	 * This is the method which I would like to execute after the selected method.
	 */
	public void afterAdvice()
	{
		System.out.println("Student profile has been setup.");
	}
	
	/**
	 * This is the method which I would like to execute after any method returns.
	 * @param retVal returned outcome from method
	 */
	public void afterReturningAdvice(Object retVal)
	{
		if (retVal instanceof String)
		{
			System.out.println("Returning: " + retVal);
		}
		else
		{

			System.out.println("Returning: " + retVal.toString());
		}
	}
	
	/**
	 * This is the method which I would like to execute after method when any exception raised.
	 * @param ex
	 */
	public void afterThrowingAdvice(IllegalArgumentException ex)
	{
		System.out.println("There has been an exception: " + ex.toString());
	}
	
	/**
	 * This is the method which I would like to execute around method.
	 */
	public void aroundAdvice()
	{
		System.out.println("Around Student profile setup.");
	}
	
}
