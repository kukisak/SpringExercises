package com.tutorialspoint.javabasedconfig;

public class SpellChecker {

	public void init()
	{
		System.out.println("Init after constructor in SpellChecker");
	}
	
	public void cleanup()
	{
		System.out.println("Cleanup before destruction SpellChecker");
	}
	
	public SpellChecker() 
	{
		System.out.println("Inside Java based config SpellChecker constructor");
	}

	public void checkSpelling()
	{
		System.out.println("Inside Java based config checkSpelling");
		
	}
}
