package com.tutorialspoint.aspects.aspectjbased;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Configuration
//@Profile("dev")
@Aspect
public class Logging {

	@Pointcut("execution(* com.tutorialspoint.aspects.aspectjbased.*.*(..))")
	public void selectAll(){};
	
	/**
	 * This is the method which I would like to execute before a selected method.
	 */
	@Before("selectAll()")
	public void beforeAdvice()
	{
		System.out.println("Going to setup student profile.");
	}
	
	/**
	 * This is the method which I would like to execute after the selected method.
	 */
	@After("selectAll()")
	public void afterAdvice()
	{
		System.out.println("Student profile has been setup.");
	}
	
	/**
	 * This is the method which I would like to execute after any method returns.
	 * @param retVal returned outcome from method
	 */
	@AfterReturning(pointcut="selectAll()", returning="retVal")
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
	@AfterThrowing(pointcut="selectAll()", throwing="ex")
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
